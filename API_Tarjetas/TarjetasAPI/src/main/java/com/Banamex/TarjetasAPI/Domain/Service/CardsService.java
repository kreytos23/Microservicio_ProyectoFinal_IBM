package com.Banamex.TarjetasAPI.Domain.Service;

import com.Banamex.TarjetasAPI.Persistence.CRUD.CardsCrudRepository;
import com.Banamex.TarjetasAPI.Persistence.Repository.Answers;
import com.Banamex.TarjetasAPI.Persistence.Entity.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardsService implements CardsServiceInter{

    @Autowired
    private CardsCrudRepository cardsCrudRepository;

    @Override
    public List<Card> getCardsService(Answers answers){
        return  cardsCrudRepository.getCards(
                answers.getActivity(),answers.getAge(),answers.getAge(),
                answers.getSalary(),answers.getSalary());
    }
}
