package edu.java.bot.data.repositories;

import java.util.Optional;

public interface BasicRepository<T, I> {

    Optional<T> findById(I id);

    void save(T object);

    void deleteById(I id);

}
