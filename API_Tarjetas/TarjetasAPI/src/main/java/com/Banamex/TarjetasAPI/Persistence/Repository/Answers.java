package com.Banamex.TarjetasAPI.Persistence.Repository;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Answers {
    @NotNull(message = "Your passion cannot be empty")
    @NotBlank(message = "Your passion cannot be empty")
    private String passion;

    @NotNull(message = "Your age cannot be empty")
    @Min(value = 18, message = "You must be over 18 years old")
    private Integer age;

    @NotNull(message = "Your salary cannot be empty")
    @Min(value = 7000, message = "You must have a salary greater than $7,000")
    private Integer salary;

    public Answers(String passion, Integer edad, Integer salary) {
        this.passion = passion;
        this.age = edad;
        this.salary = salary;
    }

    public String getPassion() {
        return passion;
    }

    public void setPassion(String passion) {
        this.passion = passion;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer edad) {
        this.age = edad;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
