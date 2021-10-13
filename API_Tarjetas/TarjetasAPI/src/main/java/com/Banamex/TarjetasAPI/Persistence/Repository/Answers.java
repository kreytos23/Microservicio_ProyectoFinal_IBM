package com.Banamex.TarjetasAPI.Persistence.Repository;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Answers {
    @NotNull(message = "No puede estar vacia la Actvidad")
    @NotBlank(message = "No puede estar vacia la Actvidad")
    private String activity;

    @NotNull(message = "No puede estar vacia la Edad")
    @Min(value = 18, message = "Debes ser mayor de edad")
    private Integer age;

    @NotNull(message = "No puede estar vacio el Salario")
    @Min(value = 7000, message = "Debes tener un ingreso mayor a 6999")
    private Integer salary;

    public Answers(String activity, Integer edad, Integer salary) {
        this.activity = activity;
        this.age = edad;
        this.salary = salary;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
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
