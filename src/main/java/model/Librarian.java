
/** *********************************************************************
 * Module:  Librarian.java
 * Author:  trand
 * Purpose: Defines the Class Librarian
 ********************************************************************** */

import java.util.*;

/**
 * @pdOid b0219080-7ef0-44a0-b485-b049cf10818e
 */
public class Librarian{

    /**
     * @pdOid 0c2df197-06c6-4f50-951a-b77a9ed6d2e3
     */
    private String librarianID;
    /**
     * @pdOid a94b74a8-0f17-46ef-a28c-485ce1e7bae3
     */
    private String username;
    /**
     * @pdOid bd0551aa-1fa2-4945-92a7-566949726e95
     */
    private String password;
    /**
     * @pdOid 4b261d86-db2e-48d8-9ff0-aee977dc65a1
     */
    private String phoneNumber;

    /**
     * @pdOid af8f6dc5-b9bd-4c6c-a1a1-49da5a96e222
     */
    private String personID;
    /**
     * @pdOid e02d4759-c7c7-4ba3-af7c-34c8cf9d4c2b
     */
    private String fullName;
    /**
     * @pdOid 5ccf7461-0482-4015-8790-c772dcb7506d
     */
    private Date yearOfBirth;
    /**
     * @pdOid f6643dc2-7ebc-4f53-a568-7b246a4f0be7
     */
    private String address;
    /**
     * @pdOid e2eab03c-1fbd-4ae2-b1d2-f11763108c8f
     */
    private String sex;

    public Librarian() {
    }

    public Librarian(String librarianID, String username, String password, String phoneNumber, String personID, String fullName, Date yearOfBirth, String address, String sex) {
        this.librarianID = librarianID;
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.personID = personID;
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.sex = sex;
    }

    public String getLibrarianID() {
        return librarianID;
    }

    public void setLibrarianID(String librarianID) {
        this.librarianID = librarianID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}
