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
        book1.setColor("aliceblue");
        book1.setFontColor("#696969");
        book1.setYearPublished(1897);
        book1.setQuote("No one would have believed in the last years of the nineteenth century that this world was being watched keenly and closely by intelligences greater than man's and yet as mortal as this own.");
        
        Book book2 = new Book();
        book2.setTitle("Of Mice and Men");
        book2.setAuthor("John Steinbeck");
        book2.setColor("whitesmoke");
        book2.setFontColor("#67809f");
        book2.setYearPublished(1937);
        book2.setQuote("Nobody never gets to heaven and nobody gets no land!");
        
        bookList.add(book1);
        bookList.add(book2);       
        
        model.addAttribute("books", bookList);
        return "books";
    }
    
}
