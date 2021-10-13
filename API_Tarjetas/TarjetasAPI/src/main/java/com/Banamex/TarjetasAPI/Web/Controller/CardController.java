package com.Banamex.TarjetasAPI.Web.Controller;

import com.Banamex.TarjetasAPI.Domain.Service.CardsServiceInter;
import com.Banamex.TarjetasAPI.Persistence.Repository.Answers;
import com.Banamex.TarjetasAPI.Persistence.Entity.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cards")
public class CardController {

    @Autowired
    private CardsServiceInter cardsServiceInter;

    @GetMapping("/cardOption")
    public ResponseEntity<List<Card>> saludo(@RequestBody @Valid Answers answers){
        return new ResponseEntity<>(cardsServiceInter.getCardsService(answers), HttpStatus.OK);
    }
}
