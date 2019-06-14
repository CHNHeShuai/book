package chxy.book.mapper;

import chxy.book.bean.Book;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author hs
 * @date 2019/6/14 - 14:17
 */
@Mapper
public interface BookMapper {
    @Select("select * from book where id = #{id}")
    public Book getBookById(Integer id);
    @Select("select * from book")
    public List<Book> bookList();
    @Update("update book set name=#{name},classroom=#{classroom},teacher=#{teacher},maxnumber=#{maxnumber} where id=#{id}")
    public void updateBook(Book book);
    @Delete("delete from book where id=#{id}")
    public void deleteBook(Integer id);
    @Insert("insert into book(name,classroom,teacher,maxnumber) values (#{name},#{classroom},#{teacher},#{maxnumber})")
    public void insertBook(Book book);
}
