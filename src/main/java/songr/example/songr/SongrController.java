package songr.example.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SongrController {

    @Autowired
    AlbumRepository albumRepository;


    @GetMapping("/albums")
    public String getAlbums(Model m){
        m.addAttribute("albums" ,albumRepository.findAll());
        return "albums.html";
    }

    @GetMapping("/addAlbums")
    public String getAddAlbumView(){
        return "addAlbums.html";
    }

    @PostMapping("/albums")
    public RedirectView addAlbum(@RequestParam(value="title")String title,
                                 @RequestParam(value="artist")String artist,
                                 @RequestParam(value="songCount")int songCount,
                                 @RequestParam(value="length")int length,
                                 @RequestParam(value="imageUrl")String imageUrl){
        Album album = new Album(title,artist,songCount,length,imageUrl);
        albumRepository.save(album);
        return new RedirectView("/albums");

    }


}
