package com.Banamex.TarjetasAPI.Persistence.Entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "activity")
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_activity")
    private Integer idActivity;
    @Column(name = "activity_name")
    private String activityName;

    @OneToMany(mappedBy = "activity")
    private List<Card> card;

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public List<Card> getCard() {
        return card;
    }

    public void setCard(List<Card> card) {
        this.card = card;
    }
}
