
/** *********************************************************************
 * Module:  Author.java
 * Author:  trand
 * Purpose: Defines the Class Author
 ********************************************************************** */

import java.util.*;

/**
 * @pdOid 6bfe81da-c821-4c7b-9b4c-e66a1efcd66d
 */
public class Author {

    /**
     * @pdOid 33bcf0dc-6b8e-477b-b8a3-8c69db48d0d3
     */
    private String authorID;
    /**
     * @pdOid 9f6ab8cb-6f1b-4dc9-8b59-afeb5c994e50
     */
    private String fullName;
    /**
     * @pdOid 15b50041-c994-4fdb-bf18-6701fc3617ab
     */
    private Date yearOfBirth;
    /**
     * @pdOid ba8b3110-c305-45d5-8929-a6fc46a48a5e
     */
    private String homeTown;

    public Author() {
    }

    public Author(String authorID, String fullName, Date yearOfBirth, String homeTown) {
        this.authorID = authorID;
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
        this.homeTown = homeTown;
    }

    public String getAuthorID() {
        return authorID;
    }

    public void setAuthorID(String authorID) {
        this.authorID = authorID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Date yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

}
