package pe.edu.i202223055.cl1_jpa_data_ramos_anthony.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountryLanguageId {

    private String countryCode;
    private String language;
}
