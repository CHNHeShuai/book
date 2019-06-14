package chxy.book.service;

import chxy.book.bean.Book;
import chxy.book.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hs
 * @date 2019/6/14 - 14:25
 */
@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;
    public Book getBookById(Integer id){
        return bookMapper.getBookById(id);
    }

    public List<Book> bookList(){
       return bookMapper.bookList();
    }
    public void updateBook(Book book){
        bookMapper.updateBook(book);
    }
    public void deleteBook(Integer id){
        bookMapper.deleteBook(id);
    }
    public void insertBook(Book book){
        bookMapper.insertBook(book);
    }
}
