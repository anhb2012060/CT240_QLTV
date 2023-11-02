
/** *********************************************************************
 * Module:  BookType.java
 * Author:  trand
 * Purpose: Defines the Class BookType
 ********************************************************************** */

import java.util.*;

/**
 * @pdOid 1451a6ea-ab7d-46a5-b4d2-2ae8b2fecf61
 */
public class BookType {

    /**
     * @pdOid 39e95d04-941b-412c-abce-2c63cf0c4912
     */
    private String bookTypeID;
    /**
     * @pdOid e4ff7295-21e1-4b19-8b84-e3d64e8134cc
     */
    private String typeName;

    public BookType() {
    }

    public BookType(String bookTypeID, String typeName) {
        this.bookTypeID = bookTypeID;
        this.typeName = typeName;
    }

    public String getBookTypeID() {
        return bookTypeID;
    }

    public void setBookTypeID(String bookTypeID) {
        this.bookTypeID = bookTypeID;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

}
