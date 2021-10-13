package com.Banamex.TarjetasAPI.Domain.Service;

import com.Banamex.TarjetasAPI.Persistence.Repository.Answers;
import com.Banamex.TarjetasAPI.Persistence.Entity.Card;

import java.util.List;

public interface CardsServiceInter {
    List<Card> getCardsService(Answers answers);
}
