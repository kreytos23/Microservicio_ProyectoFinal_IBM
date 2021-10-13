package com.Banamex.TarjetasAPI.Persistence.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "montlysalary")
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_montly_salary")
    private Integer idMontlySalary;
    @Column(name = "inferior_salary")
    private Integer salaryInf;
    @Column(name = "superior_salary")
    private Integer salarySup;

    @OneToMany(mappedBy = "salary")
    private List<Card> card;

    public Integer getIdMontlySalary() {
        return idMontlySalary;
    }

    public void setIdMontlySalary(Integer idMontlySalary) {
        this.idMontlySalary = idMontlySalary;
    }

    public Integer getSalaryInf() {
        return salaryInf;
    }

    public void setSalaryInf(Integer salaryInf) {
        this.salaryInf = salaryInf;
    }

    public Integer getSalarySup() {
        return salarySup;
    }

    public void setSalarySup(Integer salarySup) {
        this.salarySup = salarySup;
    }

    public List<Card> getCard() {
        return card;
    }

    public void setCard(List<Card> card) {
        this.card = card;
    }
}
