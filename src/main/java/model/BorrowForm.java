
/** *********************************************************************
 * Module:  BorrowForm.java
 * Author:  trand
 * Purpose: Defines the Class BorrowForm
 ********************************************************************** */

import java.util.*;

/**
 * @pdOid 1f0f467c-0ffc-425b-8537-2c310dbbdcf5
 */
public class BorrowForm {

    /**
     * @pdOid f2d7dffa-e455-4aa0-b342-4fd4521838de
     */
    private String borrowFormID;
    /**
     * @pdOid baf16642-c04f-4a7d-b72e-4196e2dc8914
     */
    private String librarianID;
    /**
     * @pdOid 12d340e9-60e1-4893-acfe-69dec82bf168
     */
    private String studentID;

    public BorrowForm() {
    }

    public BorrowForm(String borrowFormID, String librarianID, String studentID) {
        this.borrowFormID = borrowFormID;
        this.librarianID = librarianID;
        this.studentID = studentID;
    }

    public String getBorrowFormID() {
        return borrowFormID;
    }

    public void setBorrowFormID(String borrowFormID) {
        this.borrowFormID = borrowFormID;
    }

    public String getLibrarianID() {
        return librarianID;
    }

    public void setLibrarianID(String librarianID) {
        this.librarianID = librarianID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

}
