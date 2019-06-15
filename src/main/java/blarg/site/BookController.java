package blarg.site;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author cymrucoder
 */
@Controller
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping("/books")
    public String books(Model model) {
        Iterable<Book> bookList = bookRepository.findAll();
        model.addAttribute("books", bookList);
        return "books";
    }

}
