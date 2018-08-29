package cn.itcast.model.params;

import cn.itcast.model.Book;

import java.util.Date;

public class BookParams {
    private Book book;

    private Integer book_id;

    private String book_name;

    private String book_writer;

    private Date book_year;

    private String book_press;

    private String commodity_type;

    private Integer commodity_id;

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name == null ? null : book_name.trim();
    }

    public String getBook_writer() {
        return book_writer;
    }

    public void setBook_writer(String book_writer) {
        this.book_writer = book_writer == null ? null : book_writer.trim();
    }

    public Date getBook_year() {
        return book_year;
    }

    public void setBook_year(Date book_year) {
        this.book_year = book_year;
    }

    public String getBook_press() {
        return book_press;
    }

    public void setBook_press(String book_press) {
        this.book_press = book_press == null ? null : book_press.trim();
    }

    public String getCommodity_type() {
        return commodity_type;
    }

    public void setCommodity_type(String commodity_type) {
        this.commodity_type = commodity_type == null ? null : commodity_type.trim();
    }

    public Integer getCommodity_id() {
        return commodity_id;
    }

    public void setCommodity_id(Integer commodity_id) {
        this.commodity_id = commodity_id;
    }


    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}