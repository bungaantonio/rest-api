package com.example.demo.student.infrastructure.jpa;

public interface Entity<T extends EntityId> {

    T getId();

}
