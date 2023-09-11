package com.example.demo.isp.service;

import com.example.demo.isp.entity.Entity;

public interface PersistenceService<T extends Entity> {
    public void save(T entity);

    public void delete(T entity);

    public T findById(Long id);
}
