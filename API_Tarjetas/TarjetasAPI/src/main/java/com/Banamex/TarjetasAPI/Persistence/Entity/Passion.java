package com.Banamex.TarjetasAPI.Persistence.Entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "passion")
public class Passion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPassion")
    private Integer idPassion;
    @Column(name = "passion_name")
    private String passionName;

    @OneToMany(mappedBy = "passion")
    private List<Card> card;

    public Integer getIdPassion() {
        return idPassion;
    }

    public void setIdPassion(Integer idPassion) {
        this.idPassion = idPassion;
    }

    public String getPassionName() {
        return passionName;
    }

    public void setPassionName(String passionName) {
        this.passionName = passionName;
    }

    public List<Card> getCard() {
        return card;
    }

    public void setCard(List<Card> card) {
        this.card = card;
    }
}
