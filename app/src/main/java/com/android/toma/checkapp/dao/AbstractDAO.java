package com.android.toma.checkapp.dao;

import java.util.List;

public interface AbstractDAO<T> {
    T save (T item);
    void delete(T item);
    void saveAll(List<T> list);
    void deleteAll(List<T> list);
    List<T> getAll();
    T getById(long id);
}
