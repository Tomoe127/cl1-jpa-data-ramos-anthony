package pe.edu.i202223055.cl1_jpa_data_ramos_anthony.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "countrylanguage")
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(CountryLanguageId.class)
public class CountryLanguage {

    @Id
    @ManyToOne
    @JoinColumn(name = "countryCode")
    private Country countryCode;

    @Id
    private String language;
    private String isOfficial;
    private Integer percentage;
}
