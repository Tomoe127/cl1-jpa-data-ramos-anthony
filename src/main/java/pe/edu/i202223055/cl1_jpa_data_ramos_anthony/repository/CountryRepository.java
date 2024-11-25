package pe.edu.i202223055.cl1_jpa_data_ramos_anthony.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.i202223055.cl1_jpa_data_ramos_anthony.entity.Country;


public interface CountryRepository extends CrudRepository<Country, String> {

}
