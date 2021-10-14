package com.Banamex.TarjetasAPI.Persistence.CRUD;

import com.Banamex.TarjetasAPI.Persistence.Entity.Card;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CardsCrudRepository extends CrudRepository<Card, Integer> {
    @Query(value = "SELECT id_tarjeta, nombre_tarjeta, id_edad, id_passion, id_salary FROM tarjeta " +
            "JOIN passion ON passion.idPassion = tarjeta.id_passion " +
            "JOIN rangoedad ON rangoedad.id_rango = tarjeta.id_edad " +
            "JOIN montlysalary ON montlysalary.id_montly_salary = tarjeta.id_salary " +
            "WHERE passion_name = ?  AND rango_inferior <= ? AND rango_superior >= ? AND inferior_salary <= ? " +
            "AND superior_salary >= ? ;", nativeQuery = true)
    List<Card> getCards (String passion, Integer ageI, Integer ageS, Integer salaryI, Integer salaryS);

}
