package pl.pawelzelek.songlibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SonglibraryApplication {

	public static void main(String[] args) {

		SpringApplication.run(SonglibraryApplication.class, args);

//		SongsController songsController = new SongsController();
//		System.out.println(songsController.getSongName().get(1).getName());
	}


}
