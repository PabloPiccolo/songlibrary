package pl.pawelzelek.songlibrary;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class SongsController {

    @Autowired
    SongRepository songRepository;



    @GetMapping("/test")
    public int test(){
        return 1;
    }

    @GetMapping("/home2")
    public List<Song> getSongName() {
        return songRepository.getSongName();

    }

    //dodana metoda

    public  String jedenS(){
        return getSongName().get(1).getName();
    }


    @GetMapping("/songs")
    public List<Song> getAll(){
    return songRepository.getAll();

    }

    @PostMapping("/songss")
    public int add (@RequestBody List<Song> songs){
      return songRepository.savee(songs);
    }
}
