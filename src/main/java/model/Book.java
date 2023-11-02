
/** *********************************************************************
 * Module:  Book.java
 * Author:  trand
 * Purpose: Defines the Class Book
 ********************************************************************** */

import java.util.*;

/**
 * @pdOid 3bc345cb-ce6e-4b4d-99b4-8658477b1345
 */
public class Book {

    /**
     * @pdOid fd3e0973-cd31-4fe2-8a5f-8d21c1efff50
     */
    private String bookID;
    /**
     * @pdOid f54b34e9-725c-4a20-8dec-1112bcc4b4d2
     */
    private String bookName;
    /**
     * @pdOid 9e2471ab-48e9-432f-8dd4-df5c2e28450c
     */
    private Date publis;
    /**
     * @pdOid a4c3c4db-7f2f-4b3c-8b5e-91848288e00d
     */
    private String language;
    /**
     * @pdOid b8637e49-bcd7-4db0-8b5f-d24e8285cb51
     */
    private int quantity;
    /**
     * @pdOid b2360676-b73d-4a38-bc61-14a040f14d19
     */
    private String bookTypeID;

    public Book() {
    }

    public Book(String bookID, String bookName, Date publis, String language, int quantity, String bookTypeID) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.publis = publis;
        this.language = language;
        this.quantity = quantity;
        this.bookTypeID = bookTypeID;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Date getPublis() {
        return publis;
    }

    public void setPublis(Date publis) {
        this.publis = publis;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBookTypeID() {
        return bookTypeID;
    }

    public void setBookTypeID(String bookTypeID) {
        this.bookTypeID = bookTypeID;
    }

}
