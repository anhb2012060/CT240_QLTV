
/** *********************************************************************
 * Module:  BorrowFormDetails.java
 * Author:  trand
 * Purpose: Defines the Class BorrowFormDetails
 ********************************************************************** */

import java.util.*;

/**
 * @pdOid 38d76767-562f-4fcd-946d-d0e04a92a999
 */
public class BorrowFormDetails {

    /**
     * @pdOid c618c894-396b-4f5f-92d7-65551a46eebb
     */
    private String bookID;
    /**
     * @pdOid 549118ca-c20b-4e8c-9ab1-61604b53fa67
     */
    private String borrowFormID;
    /**
     * @pdOid f6712d14-7649-47be-be50-79f5a7a52e78
     */
    private Date bookBorrowingDay;
    /**
     * @pdOid 98cc50d7-de52-484f-92c3-93fe282dcb08
     */
    private Date bookBorrowingReturn;
    /**
     * @pdOid 40ae9812-014a-4e6a-881b-b70c6d23a4af
     */
    private boolean status;

    public BorrowFormDetails() {
    }

    public BorrowFormDetails(String bookID, String borrowFormID, Date bookBorrowingDay, Date bookBorrowingReturn, boolean status) {
        this.bookID = bookID;
        this.borrowFormID = borrowFormID;
        this.bookBorrowingDay = bookBorrowingDay;
        this.bookBorrowingReturn = bookBorrowingReturn;
        this.status = status;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBorrowFormID() {
        return borrowFormID;
    }

    public void setBorrowFormID(String borrowFormID) {
        this.borrowFormID = borrowFormID;
    }

    public Date getBookBorrowingDay() {
        return bookBorrowingDay;
    }

    public void setBookBorrowingDay(Date bookBorrowingDay) {
        this.bookBorrowingDay = bookBorrowingDay;
    }

    public Date getBookBorrowingReturn() {
        return bookBorrowingReturn;
    }

    public void setBookBorrowingReturn(Date bookBorrowingReturn) {
        this.bookBorrowingReturn = bookBorrowingReturn;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
