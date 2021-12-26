package gov.pjc.api;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import gov.pjc.api.entity.Album;
import gov.pjc.api.entity.Artista;
import gov.pjc.api.repository.AlbumRepository;
import gov.pjc.api.repository.ArtistaRespository;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner {

	@Autowired
	private ArtistaRespository artistaRespository;

	@Autowired
	private AlbumRepository albumRespository;

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Artista a1 = new Artista("Serj tankian");
		Artista a2 = new Artista("Mike Shinoda ");
		artistaRespository.saveAll(Arrays.asList(a1, a2));

		Album alb1 = new Album("Harakiri", a1);
		Album alb2 = new Album("Black Blooms", a1);
		Album alb3 = new Album("The Rough Dog", a1);
		Album alb4 = new Album("The Rising Tied", a2);
		Album alb5 = new Album("Post Traumatic", a2);
		Album alb6 = new Album("Post Traumatic EP", a2);
		Album alb7 = new Album("Where'd You Go", a2);

		albumRespository.saveAll(Arrays.asList(alb1, alb2, alb3, alb4, alb5, alb6, alb7));
	}

}
