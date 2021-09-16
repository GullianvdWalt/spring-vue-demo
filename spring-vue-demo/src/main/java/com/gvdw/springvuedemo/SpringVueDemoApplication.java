package com.gvdw.springvuedemo;

import com.gvdw.springvuedemo.models.Artist;
import com.gvdw.springvuedemo.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

@SpringBootApplication
public class SpringVueDemoApplication implements CommandLineRunner {

	private final ArtistService artistService;

	@Autowired
	public SpringVueDemoApplication(ArtistService artistService) {
		this.artistService = artistService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringVueDemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Date date = new Date();
		for(int i = 0; i < 1000; i++){
			String name = "name" + i + 0;
			String surname = "surname" + i + 0;
			Artist artist = Artist.builder().name(name).surname(surname).alias(randomString()).startDate(date).build();
			artistService.saveArtist(artist);
		}
	}

	public String randomString(){
		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 10;
		Random random = new Random();
		return random.ints(leftLimit, rightLimit + 1)
				.limit(targetStringLength)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				.toString();
	}
}
