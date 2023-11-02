
/** *********************************************************************
 * Module:  Student.java
 * Author:  trand
 * Purpose: Defines the Class Student
 ********************************************************************** */

import java.util.*;

/**
 * @pdOid f2462775-b90a-4885-94ff-ca1f4e50f026
 */
public class Student{

    /**
     * @pdOid 5a977577-15c0-4c8e-b2e7-32fadc98f508
     */
    private String studentID;

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

    public Student() {
    }

    public Student(String studentID, String personID, String fullName, Date yearOfBirth, String address, String sex) {
        this.studentID = studentID;
        this.personID = personID;
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.sex = sex;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
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
