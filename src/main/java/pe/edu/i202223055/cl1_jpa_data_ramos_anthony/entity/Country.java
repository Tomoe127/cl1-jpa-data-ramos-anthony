package pe.edu.i202223055.cl1_jpa_data_ramos_anthony.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Table(name = "country")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Country {

    @Id
    @Column(name = "Code")
    private String code;
    @Column(name = "Name")
    private String name;
    @Column(name = "Continent")
    private String continent;
    @Column(name = "Region")
    private String region;
    @Column(name = "SurfaceArea")
    private Double surfaceArea;
    @Column(name = "IndepYear")
    private Integer indepYear;
    @Column(name = "Population")
    private Integer population;
    @Column(name = "LifeExpectancy")
    private Double lifeExpectancy;
    @Column(name = "GNP")
    private Double gnp;
    @Column(name = "GNPOld")
    private Double gnpOld;
    @Column(name = "LocalName")
    private String localName;
    @Column(name = "GovernmentForm")
    private String governmentForm;
    @Column(name = "HeadOfState")
    private String headOfState;
    @Column(name = "Capital")
    private Integer capital;
    @Column(name = "Code2")
    private String code2;

    @OneToMany(mappedBy = "countryCode", cascade =  CascadeType.REMOVE, fetch = FetchType.EAGER)
    private List<City> city;

    @OneToMany(mappedBy = "countryCode", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private List<CountryLanguage> countryLanguages;


}
