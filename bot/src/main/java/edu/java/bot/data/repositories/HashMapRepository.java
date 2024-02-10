package edu.java.bot.data.repositories;

import edu.java.bot.data.annotations.Id;
import edu.java.bot.data.exceptions.IncorrectIdFieldsAmountException;
import edu.java.bot.data.exceptions.NotVisibleMethodException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class HashMapRepository<T, I> implements BasicRepository<T, I> {

    protected static final Logger LOGGER = LogManager.getLogger();
    protected static final Long HASH_MAP_SIZE = (long) Math.pow(10, 18);

    protected Map<I, T> database = new HashMap<>();

    @Override
    public Optional<T> findById(I id) {
        T object = database.get(id);
        if (object == null) {
            return Optional.empty();
        }

        return Optional.of(object);
    }

    @Override
    public void save(T object) {
        I id = getIdFromObject(object);
        database.put(id, object);
    }

    @Override
    public void deleteById(I id) {
        database.put(id, null);
    }

    private I getIdFromObject(T object) {
        var objectClass = object.getClass();
        String idFieldName = getIdFieldName(objectClass);
        String idFieldGetterName = getGetterMethodName(idFieldName);

        try {
            var idGetter = objectClass.getMethod(idFieldGetterName);
            return (I) idGetter.invoke(object);
        } catch (NoSuchMethodException | IllegalAccessException exception) {
            throw new NotVisibleMethodException(
                STR."There is no public getter method (\{idFieldGetterName}) in class \{objectClass.getName()}}"
            );
        } catch (InvocationTargetException exception) {
            throw new RuntimeException(exception);
        }
    }

    private String getIdFieldName(Class<?> objectClass) {
        var fields = objectClass.getDeclaredFields();

        var idFields = Arrays.stream(fields).filter(field -> field.isAnnotationPresent(Id.class)).toList();
        if (idFields.size() != 1) {
            throw new IncorrectIdFieldsAmountException(
                STR."\{objectClass} must have only one id field. Current idFilelds amount: \{idFields.size()} "
            );
        }
        var idField = idFields.getFirst();

        return idField.getName();
    }

    private String getGetterMethodName(String fieldName) {
        return "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
    }
}
