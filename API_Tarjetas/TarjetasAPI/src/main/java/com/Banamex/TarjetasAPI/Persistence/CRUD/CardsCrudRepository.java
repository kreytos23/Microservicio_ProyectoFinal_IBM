package com.Banamex.TarjetasAPI.Persistence.CRUD;

import com.Banamex.TarjetasAPI.Persistence.Entity.Card;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CardsCrudRepository extends CrudRepository<Card, Integer> {
    @Query(value = "SELECT id_tarjeta, nombre_tarjeta, id_edad, id_actividad, id_salary FROM tarjeta " +
            "JOIN activity ON activity.id_activity = tarjeta.id_actividad " +
            "JOIN rangoedad ON rangoedad.id_rango = tarjeta.id_edad " +
            "JOIN montlysalary ON montlysalary.id_montly_salary = tarjeta.id_salary " +
            "WHERE activity_name = ?  AND rango_inferior <= ? AND rango_superior >= ? AND inferior_salary <= ? " +
            "AND superior_salary >= ? ;", nativeQuery = true)
    List<Card> getCards (String activity, Integer ageI, Integer ageS, Integer salaryI, Integer salaryS);

}
