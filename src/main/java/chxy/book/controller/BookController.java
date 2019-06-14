package chxy.book.controller;

import chxy.book.bean.Book;
import chxy.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author hs
 * @date 2019/6/14 - 14:28
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/bookList")
    public String bookList(Model model){
        List<Book> bookList = bookService.bookList();
        model.addAttribute("bookList",bookList);
        return "bookList";
    }

    @RequestMapping("/deleteBook")
    public String deleteBook(Integer id){
        bookService.deleteBook(id);
        return "redirect:/bookList";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Book book){
        bookService.updateBook(book);
        return "redirect:/bookList";
    }

    @RequestMapping("/insertBook")
    public String insertBook(Book book){
        bookService.insertBook(book);
        return "redirect:/bookList";
    }

    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(Integer id,Model model){
        Book book = bookService.getBookById(id);
        model.addAttribute("book",book);
        return "updateBook";
    }

}
