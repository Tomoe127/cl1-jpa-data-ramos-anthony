package pe.edu.i202223055.cl1_jpa_data_ramos_anthony.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "city")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String district;
    private Integer population;

    @ManyToOne
    @JoinColumn(name = "countryCode")
    private Country countryCode;
}
