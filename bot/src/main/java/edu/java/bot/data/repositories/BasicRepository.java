package edu.java.bot.data.repositories;

import java.util.Optional;

public interface BasicRepository<T, I> {

    public Optional<T> findById(I id);

    public void save(T object);

    public void deleteById(I id);

}
