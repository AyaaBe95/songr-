package songr.example.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongController {

    @Autowired
    SongRepository songRepository;
    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/songs")
    public String getOneDirector(Model m) {
        List<Song> songs = songRepository.findAll();
        m.addAttribute("song", songs);
        return "songs.html";
    }


    @PostMapping("/songs")
    public String addSong(Model m , @RequestParam(value="title")String title,
                          @RequestParam(value="length")int length,
                          @RequestParam(value="trackNumber")int trackNumber,
                          @RequestParam(value="Album")Album album){
        Song song = new Song(title,length,trackNumber,album);
        songRepository.save(song);
        Album a = albumRepository.findById(album.getId()).get();
        m.addAttribute("songs", a.songs);
        return "songs.html";
    }

    @GetMapping("/albums/{id}")
    public  String getOneAlbum(@PathVariable int id, Model m) {
        Album a = albumRepository.findById(id).get();
        m.addAttribute("album", a);
        return "oneAlbum.html";
    }
    @GetMapping("/albums/{id}/songs")
    public  String getSongsAlbum(@PathVariable int id, Model m) {
        Album a = albumRepository.findById(id).get();
        m.addAttribute("album", a);
        return "oneAlbum.html";
    }

    @PostMapping("/albums/{id}/songs")
    public RedirectView addSong(Model m ,@PathVariable int id,
                          @RequestParam(value="title")String title,
                          @RequestParam(value="length")int length,
                          @RequestParam(value="trackNumber")int trackNumber) {
        Album album = albumRepository.findById(id).get();
        Song song = new Song(title, length, trackNumber,album);
        songRepository.save(song);
        Album a = albumRepository.findById(album.getId()).get();
        m.addAttribute("songs", a.songs);
        return new RedirectView("/songs");
    }



}
