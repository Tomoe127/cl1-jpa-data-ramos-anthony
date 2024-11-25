package pe.edu.i202223055.cl1_jpa_data_ramos_anthony;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.i202223055.cl1_jpa_data_ramos_anthony.entity.Country;
import pe.edu.i202223055.cl1_jpa_data_ramos_anthony.repository.CountryRepository;

import java.util.Arrays;
import java.util.Optional;

@SpringBootApplication
public class Cl1JpaDataRamosAnthonyApplication implements CommandLineRunner {

	@Autowired
	private CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Cl1JpaDataRamosAnthonyApplication.class, args);
	}



	@Override
	public void run(String... args) throws Exception {


		countryRepository.findById("ARG").ifPresentOrElse(
				country -> {
					System.out.println("Lenguajes hablados en Argentina:");
					country.getCountryLanguages().forEach(language ->
							System.out.println(language.getLanguage())
					);
				},
				() -> {
					System.out.println("No se encontró Argentina. Mostrando lenguajes hablados en Perú:");
					countryRepository.findById("PER").ifPresent(peru ->
							peru.getCountryLanguages().forEach(language ->
									System.out.println(language.getLanguage())
							)
					);
				}
		);

//		Iterable<String> countryIdsToDelete = Arrays.asList("COL", "ARG");
//
//		countryRepository.deleteAllById(countryIdsToDelete);
//
//		System.out.println("Países eliminados con éxito: " + countryIdsToDelete);

	}
}
