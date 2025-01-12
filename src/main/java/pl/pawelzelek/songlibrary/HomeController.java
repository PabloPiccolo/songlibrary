package pl.pawelzelek.songlibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

@Autowired
        SongsController songsController;



    String songsname ="wodokdowkdowkowkdow";



    @GetMapping("/home")
    public String home(Model model){
       model.addAttribute("item",new Song2(songsController.jedenS()));
        return  "home";
    }







}
