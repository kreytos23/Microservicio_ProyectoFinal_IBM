package com.Banamex.TarjetasAPI.Persistence.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "rangoedad")
public class Age {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rango")
    private Integer idRange;
    @Column(name = "rango_inferior")
    private Integer rangeInf;
    @Column(name = "rango_superior")
    private Integer rangeSup;

    @OneToMany(mappedBy = "age")
    private List<Card> card;

    public Integer getIdRange() {
        return idRange;
    }

    public void setIdRange(Integer idRange) {
        this.idRange = idRange;
    }

    public Integer getRangeInf() {
        return rangeInf;
    }

    public void setRangeInf(Integer rangeInf) {
        this.rangeInf = rangeInf;
    }

    public Integer getRangeSup() {
        return rangeSup;
    }

    public void setRangeSup(Integer rangeSup) {
        this.rangeSup = rangeSup;
    }

    public List<Card> getCard() {
        return card;
    }

    public void setCard(List<Card> card) {
        this.card = card;
    }
}
