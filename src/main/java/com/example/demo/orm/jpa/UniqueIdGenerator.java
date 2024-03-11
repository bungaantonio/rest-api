package com.example.demo.orm.jpa;

public interface UniqueIdGenerator<T>{
    T getNextUniqueId();
}
