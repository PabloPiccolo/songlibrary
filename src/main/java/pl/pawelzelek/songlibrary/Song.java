package pl.pawelzelek.songlibrary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor



public class Song {
    public int id;
    public String name;
    public int rating;

}
