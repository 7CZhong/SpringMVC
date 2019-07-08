package com.itlike.domain;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Pet {
    private String name;
    private Integer id;

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
