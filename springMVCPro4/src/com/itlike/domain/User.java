package com.itlike.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.util.Arrays;

@Getter@Setter
public class User {
    @NotBlank(message = "姓名不能为空")
    private String name;
    @NotNull(message = "年龄不能为空")
    @Max(value = 200, message = "年龄不正确")
    private Integer age;
    private Integer gender;
    private String[] hobby;
    private Pet pet;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", hobby=" + Arrays.toString(hobby) +
                ", pet=" + pet +
                '}';
    }
}
