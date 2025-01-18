package com.nextstep.studentform.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.nextstep.studentform.databaseconnection.DatabaseConnection;
import com.nextstep.studentform.model.Student;

public abstract class StudentServiceImpl implements StudentService {
    PreparedStatement ps = null;

    // Inserts a new student record into the database
    @Override
    public void saveStudent(Student student) {
        String sql = "insert into student_info(name, date_of_birth, gender, contact_number, email, address, faculty, course_name) values (?,?,?,?,?,?,?,?)";
        try {
            ps = DatabaseConnection.getConnection().prepareStatement(sql);
            ps.setString(1, student.getName()); // Set student name
            ps.setString(2, student.getDateOfBirth()); // Set student date of birth
            ps.setString(3, student.getGender()); // Set student gender
            ps.setLong(4, student.getContactNumber()); // Set student contact number
            ps.setString(5, student.getEmail()); // Set student email
            ps.setString(6, student.getAddress()); // Set student address
            ps.setString(7, student.getFaculty()); // Set student faculty
            ps.setString(8, student.getCourse()); // Set student course name
        } catch (Exception e) {
            System.out.println(e); // Log any exceptions that occur during the operation
        }
    }

    // Retrieves a list of all students from the database
    @Override
    public List<Student> getStudents() {
        String sql = "select * from student_info";
        List<Student> studentList = new ArrayList<>();
        try {
            ps = DatabaseConnection.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt("id")); // Set student ID
                student.setName(rs.getString("name")); // Set student name
                student.setDateOfBirth(rs.getString("date_of_birth")); // Set date of birth
                student.setGender(rs.getString("gender")); // Set gender
                student.setContactNumber(rs.getLong("contact_number")); // Set contact number
                student.setEmail(rs.getString("email")); // Set email
                student.setAddress(rs.getString("address")); // Set address
                student.setFaculty(rs.getString("faculty")); // Set faculty
                student.setCourse(rs.getString("course_name")); // Set course name
                studentList.add(student); // Add student to the list
            }
        } catch (Exception e) {
            System.out.println(e); // Log any exceptions that occur during the operation
        }
        return studentList; // Return the list of students
    }

    // Deletes a student record from the database by student ID
    @Override
    public void deleteStudentById(int id) {
        String sql = "delete from student_info where id = ?";
        try {
            ps = DatabaseConnection.getConnection().prepareStatement(sql);
            ps.setInt(1, id); // Set student ID for deletion
            ps.executeQuery(); // Execute the delete query
        } catch (Exception e) {
            System.out.println(e); // Log any exceptions that occur during the operation
        }
    }

    // Updates an existing student record in the database
    @Override
    public void updateStudent(Student student) {
        String sql = "update student_info set name=?, date_of_birth=?, gender=?, contact_number=?, email=?, address=?, faculty=?, course_name=? where id=?";
        try {
            ps = DatabaseConnection.getConnection().prepareStatement(sql);
            ps.setString(1, student.getName()); // Set student name
            ps.setString(2, student.getDateOfBirth()); // Set student date of birth
            ps.setString(3, student.getGender()); // Set student gender
            ps.setLong(4, student.getContactNumber()); // Set student contact number
            ps.setString(5, student.getEmail()); // Set student email
            ps.setString(6, student.getAddress()); // Set student address
            ps.setString(7, student.getFaculty()); // Set student faculty
            ps.setString(8, student.getCourse()); // Set student course name
            ps.executeQuery(); // Execute the update query
        } catch (Exception e) {
            System.out.println(e); // Log any exceptions that occur during the operation
        }
    }

    // Searches for students by name in the database
    @Override
    public List<Student> searchStudentByName(String name) {
        List<Student> studentList = new ArrayList<>();
        String sql = "select * from student_info where name like ?";
        try {
            ps = DatabaseConnection.getConnection().prepareStatement(sql);
            ps.setString(1, "%" + name + "%"); // Set name search query with wildcard
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt("id")); // Set student ID
                student.setName(rs.getString("name")); // Set student name
                student.setDateOfBirth(rs.getString("date_of_birth")); // Set student date of birth
                student.setGender(rs.getString("gender")); // Set student gender
                student.setContactNumber(rs.getLong("contact_number")); // Set student contact number
                student.setEmail(rs.getString("email")); // Set student email
                student.setAddress(rs.getString("address")); // Set student address
                student.setFaculty(rs.getString("faculty")); // Set student faculty
                student.setCourse(rs.getString("course_name")); // Set student course name
                studentList.add(student); // Add student to the list
            }
        } catch (Exception e) {
            System.out.println(e); // Log any exceptions that occur during the operation
        }
        return studentList; // Return the list of students matching the search
    }
}
