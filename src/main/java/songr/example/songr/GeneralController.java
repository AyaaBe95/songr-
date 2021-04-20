package songr.example.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class GeneralController {



    @GetMapping("/hello")
    public String showHelloWorld(){
        return "helloworld.html";
    }

    @GetMapping("/capitalize/{word}")
    public String showTemplate(Model m, @PathVariable("word") String word){
        m.addAttribute("word", word);
        return "template.html";
    }
}
