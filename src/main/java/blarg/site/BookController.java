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
        List<Book> bookList = new ArrayList<>();
        
        Book book1 = new Book();
        book1.setTitle("War of the Worlds");
        book1.setAuthor("H G Wells");
        book1.setColor("red");
        
        Book book2 = new Book();
        book2.setTitle("Of Mice and Men");
        book2.setAuthor("John Steinbeck");
        book2.setColor("lightblue");
        
        bookList.add(book1);
        bookList.add(book2);
        model.addAttribute("books", bookList);
        return "books";
    }
    
}
