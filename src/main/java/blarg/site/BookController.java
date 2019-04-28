package blarg.site;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author cymrucoder
 */
@Controller
public class BookController {

    @GetMapping("/books")
    public String books(Model model) {
        List<String> bookList = new ArrayList<>();
        bookList.add("War of the Worlds");
        bookList.add("Slaughterhouse Five");
        model.addAttribute("books", bookList);
        return "books";
    }
    
}
