package com.Banamex.TarjetasAPI.Persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "tarjeta")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tarjeta")
    @JsonIgnore
    private Integer idTarjeta;

    @Column(name = "nombre_tarjeta")
    private String nombreTarjeta;

    @Column(name = "id_edad")
    @JsonIgnore
    private Integer idAge;

    @Column(name = "id_passion")
    @JsonIgnore
    private Integer idPassion;

    @Column(name = "id_salary")
    @JsonIgnore
    private Integer idSalary;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_passion", insertable = false,updatable = false)
    private Passion passion;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_edad", insertable = false,updatable = false)
    private Age age;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_salary", insertable = false,updatable = false)
    private Salary salary;

    public Integer getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(Integer idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getNombreTarjeta() {
        return nombreTarjeta;
    }

    public void setNombreTarjeta(String nombreTarjeta) {
        this.nombreTarjeta = nombreTarjeta;
    }

    public Integer getIdAge() {
        return idAge;
    }

    public void setIdAge(Integer idAge) {
        this.idAge = idAge;
    }

    public Integer getIdPassion() {
        return idPassion;
    }

    public void setIdPassion(Integer idPassion) {
        this.idPassion = idPassion;
    }

    public Integer getIdSalary() {
        return idSalary;
    }

    public void setIdSalary(Integer idSalary) {
        this.idSalary = idSalary;
    }

    public Passion getPassion() {
        return passion;
    }

    public void setPassion(Passion passion) {
        this.passion = passion;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }
}
