package pl.pawelzelek.songlibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SongRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;



    public List<Song> getAll(){
        return jdbcTemplate.query("SELECT id, name, rating  FROM songs",
                BeanPropertyRowMapper.newInstance(Song.class));

    }

    public List<Song>getSongName(){
        return jdbcTemplate.query("SELECT name FROM songs",
                BeanPropertyRowMapper.newInstance(Song.class));
    }


    public int savee(List<Song> songs) {
        songs.forEach(song->jdbcTemplate
                .update("INSERT INTO songs(name,rating) Values(?,?)",
                        song.getName(), song.getRating()
                ));
        return 1;
    }

}
