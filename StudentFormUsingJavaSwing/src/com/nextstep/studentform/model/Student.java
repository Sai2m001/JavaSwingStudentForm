package com.nextstep.studentform.model;

/**
 * The Student class represents a student with various attributes like ID, name,
 * address, gender, email, faculty, course, date of birth, and contact number.
 * It provides getter and setter methods for each attribute to allow access and modification.
 */
public class Student {

    // Instance variables representing student attributes
    private int id;                // Unique identifier for the student
    private String name;           // Name of the student
    private String address;        // Address of the student
    private String gender;         // Gender of the student
    private String email;          // Email address of the student
    private String faculty;        // Faculty the student belongs to
    private String course;         // Course the student is enrolled in
    private String dateOfBirth;    // Date of birth of the student
    private long contactNumber;    // Contact number of the student
    
    // Getter and Setter methods for each attribute
    
    /**
     * Gets the date of birth of the student.
     * 
     * @return The date of birth of the student in string format.
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the date of birth of the student.
     * 
     * @param dateOfBirth The date of birth to set for the student.
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Gets the unique ID of the student.
     * 
     * @return The ID of the student.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the unique ID for the student.
     * 
     * @param id The ID to set for the student.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the name of the student.
     * 
     * @return The name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the student.
     * 
     * @param name The name to set for the student.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the address of the student.
     * 
     * @return The address of the student.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of the student.
     * 
     * @param address The address to set for the student.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the gender of the student.
     * 
     * @return The gender of the student.
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the gender of the student.
     * 
     * @param gender The gender to set for the student.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Gets the email of the student.
     * 
     * @return The email address of the student.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email of the student.
     * 
     * @param email The email address to set for the student.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the faculty the student belongs to.
     * 
     * @return The faculty of the student.
     */
    public String getFaculty() {
        return faculty;
    }

    /**
     * Sets the faculty of the student.
     * 
     * @param faculty The faculty to set for the student.
     */
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    /**
     * Gets the course the student is enrolled in.
     * 
     * @return The course of the student.
     */
    public String getCourse() {
        return course;
    }

    /**
     * Sets the course the student is enrolled in.
     * 
     * @param course The course to set for the student.
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * Gets the contact number of the student.
     * 
     * @return The contact number of the student.
     */
    public long getContactNumber() {
        return contactNumber;
    }

    /**
     * Sets the contact number of the student.
     * 
     * @param contactNumber The contact number to set for the student.
     */
    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }
}
