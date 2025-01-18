package com.nextstep.studentform.userinterface;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import com.nextstep.studentform.model.Student;
import com.nextstep.studentform.service.StudentService;
import com.nextstep.studentform.service.StudentServiceImpl;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

public class UIforStudentDetailTable extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textFieldSearchStudent;
    private JTable tableStudentDetails;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIforStudentDetailTable frame = new UIforStudentDetailTable();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public UIforStudentDetailTable() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 803, 446);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        textFieldSearchStudent = new JTextField();
        textFieldSearchStudent.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String name = textFieldSearchStudent.getText();
                if (name != null && !name.isEmpty()) {
                    searchDataInTable(name);
                } else {
                    loadTableData();
                }
            }
        });
        textFieldSearchStudent.setBounds(642, 11, 135, 20);
        contentPane.add(textFieldSearchStudent);
        textFieldSearchStudent.setColumns(10);

        JLabel lblSearchStudent = new JLabel("Search");
        lblSearchStudent.setBounds(599, 14, 33, 14);
        contentPane.add(lblSearchStudent);

        tableStudentDetails = new JTable();
        String columnNames[] = {"ID", "Name", "Date Of Birth", "Gender", "Contact", "Email", "Address", "Faculty", "Course"};
        DefaultTableModel defaultTableModel = new DefaultTableModel(columnNames, 0);
        tableStudentDetails.setModel(defaultTableModel);
        
        JScrollPane scrollPaneStudent = new JScrollPane(tableStudentDetails);
        scrollPaneStudent.setBounds(10, 61, 767, 272);
        contentPane.add(scrollPaneStudent);

        JButton btnDelete = new JButton("Delete");
        btnDelete.setBounds(714, 373, 63, 23);
        contentPane.add(btnDelete);

        JButton btnEdit = new JButton("Edit");
        btnEdit.setBounds(653, 373, 51, 23);
        contentPane.add(btnEdit);

        JButton btnAdd = new JButton("Add");
        btnAdd.setBounds(592, 373, 51, 23);
        contentPane.add(btnAdd);
    }

    private void loadTableData() {
        StudentService studentService = new StudentServiceImpl();
        List<Student> studentList = studentService.getStudents();
        DefaultTableModel tableModel = (DefaultTableModel) tableStudentDetails.getModel();
        tableModel.setRowCount(0);
        for (Student student : studentList) {
            tableModel.addRow(new Object[]{
                student.getId(),
                student.getName(),
                student.getDateOfBirth(),
                student.getGender(),
                student.getContactNumber(),
                student.getEmail(),
                student.getAddress(),
                student.getFaculty(),
                student.getCourse(),
            });
        }
    }

    private void searchDataInTable(String name) {
        StudentService studentService = new StudentServiceImpl();
        List<Student> studentList = studentService.searchStudentByName(name);
        DefaultTableModel tableModel = (DefaultTableModel) tableStudentDetails.getModel();
        tableModel.setRowCount(0);
        for (Student student : studentList) {
            tableModel.addRow(new Object[]{
                student.getId(),
                student.getName(),
                student.getDateOfBirth(),
                student.getGender(),
                student.getContactNumber(),
                student.getEmail(),
                student.getAddress(),
                student.getFaculty(),
                student.getCourse(),
            });
        }
    }
}
