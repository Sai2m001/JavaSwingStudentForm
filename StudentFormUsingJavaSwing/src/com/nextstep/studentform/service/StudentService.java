package com.nextstep.studentform.service;

import com.nextstep.studentform.model.Student;
import java.util.*;

/**
 * StudentService interface defines the contract for operations related to student management.
 * It provides methods for saving, retrieving, deleting, updating, and searching students.
 * Each method is designed to interact with a data source (e.g., a database) to perform CRUD operations.
 */
public interface StudentService {

    /**
     * Saves a new student or updates an existing student in the data source.
     * 
     * @param student The student object to be saved or updated.
     */
    public void saveStudent(Student student);

    /**
     * Retrieves a list of all students from the data source.
     * 
     * @return A List containing all student objects.
     */
    public List<Student> getStudents();

    /**
     * Deletes a student by their unique ID from the data source.
     * 
     * @param id The unique ID of the student to be deleted.
     */
    public void deleteStudentById(int id);

    /**
     * Updates the details of an existing student in the data source.
     * 
     * @param student The student object containing updated information.
     */
    public void updateStudent(Student student);

    /**
     * Searches for students by their name in the data source.
     * 
     * @param name The name of the student to search for.
     * @return A List containing students whose name matches the provided name.
     */
    public List<Student> searchStudentByName(String name);
}
