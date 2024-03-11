package com.example.demo.orm.jpa;

import java.util.Random;
import java.util.UUID;

public class InMemoryUniqueIdGenerator implements UniqueIdGenerator<Long>{
    public InMemoryUniqueIdGenerator() {
    }
    public Long getNextUniqueId(){
        Random random = new Random();
        return random.nextLong(10);
    }
}
