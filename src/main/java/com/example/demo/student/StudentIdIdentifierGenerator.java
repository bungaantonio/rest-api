package com.example.demo.student;

import com.example.demo.student.infrastructure.jpa.AbstractLongEntityIdIdentifierGenerator;

public class StudentIdIdentifierGenerator extends AbstractLongEntityIdIdentifierGenerator<StudentId> {

    @Override
    protected StudentId createEntityId(long seqValue) {
        return new StudentId(seqValue);
    }

}
