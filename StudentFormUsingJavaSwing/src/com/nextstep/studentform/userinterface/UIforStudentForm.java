package com.nextstep.studentform.userinterface;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.toedter.calendar.JDateChooser; // Ensure the import is here
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;

public class UIforStudentForm extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField studentNameTextField;
    private JDateChooser dateChooser;
    private JTextField textFieldStudentContactNumber;
    private JTextField textFieldStudentEmail;
    private JTextField textFieldStudentAddress;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIforStudentForm frame = new UIforStudentForm();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public UIforStudentForm() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 311, 370);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel studentFormLabel = new JLabel("Student Form:");
        studentFormLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        studentFormLabel.setBounds(64, 11, 129, 22);
        contentPane.add(studentFormLabel);

        JLabel studentNameLabel = new JLabel("Full Name :");
        studentNameLabel.setBounds(10, 44, 53, 14);
        contentPane.add(studentNameLabel);

        JLabel studentDateOfBirthLabel = new JLabel("Date of Birth : ");
        studentDateOfBirthLabel.setBounds(10, 70, 71, 14);
        contentPane.add(studentDateOfBirthLabel);

        JLabel studentGenderLabel = new JLabel("Gender : ");
        studentGenderLabel.setBounds(10, 95, 45, 14);
        contentPane.add(studentGenderLabel);

        JLabel studentContactNumberLabel = new JLabel("Contact no. : ");
        studentContactNumberLabel.setBounds(10, 120, 67, 14);
        contentPane.add(studentContactNumberLabel);

        JLabel studentEmailLabel = new JLabel("Email : ");
        studentEmailLabel.setBounds(10, 145, 34, 14);
        contentPane.add(studentEmailLabel);

        JLabel studentAddressLabel = new JLabel("Address : ");
        studentAddressLabel.setBounds(10, 170, 49, 14);
        contentPane.add(studentAddressLabel);

        JLabel studentFacultyLabel = new JLabel("Faculty : ");
        studentFacultyLabel.setBounds(10, 195, 45, 14);
        contentPane.add(studentFacultyLabel);

        JLabel studentCourseNameLabel = new JLabel("Course : ");
        studentCourseNameLabel.setBounds(10, 220, 44, 14);
        contentPane.add(studentCourseNameLabel);

        JButton submitBtn = new JButton("Submit");
        submitBtn.setBounds(215, 297, 65, 23);
        contentPane.add(submitBtn);

        studentNameTextField = new JTextField();
        studentNameTextField.setBounds(74, 44, 206, 20);
        contentPane.add(studentNameTextField);
        studentNameTextField.setColumns(10);

        dateChooser = new JDateChooser();
        dateChooser.setDateFormatString("yyyy/MM/dd");
        dateChooser.setBounds(91, 67, 94, 20);
        contentPane.add(dateChooser);

        JRadioButton rdbtnStudentMale = new JRadioButton("Male");
        rdbtnStudentMale.setBounds(64, 91, 47, 23);
        contentPane.add(rdbtnStudentMale);

        JRadioButton rdbtnStudentFemale = new JRadioButton("Female");
        rdbtnStudentFemale.setBounds(113, 91, 59, 23);
        contentPane.add(rdbtnStudentFemale);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(rdbtnStudentMale);
        genderGroup.add(rdbtnStudentFemale);

        textFieldStudentContactNumber = new JTextField();
        textFieldStudentContactNumber.setBounds(87, 117, 129, 20);
        contentPane.add(textFieldStudentContactNumber);
        textFieldStudentContactNumber.setColumns(10);

        textFieldStudentEmail = new JTextField();
        textFieldStudentEmail.setBounds(54, 142, 226, 20);
        contentPane.add(textFieldStudentEmail);
        textFieldStudentEmail.setColumns(10);

        textFieldStudentAddress = new JTextField();
        textFieldStudentAddress.setBounds(64, 167, 216, 20);
        contentPane.add(textFieldStudentAddress);
        textFieldStudentAddress.setColumns(10);

        JComboBox<String> comboBoxStudentFaculty = new JComboBox<String>();
        comboBoxStudentFaculty.setBounds(54, 191, 118, 22);
        comboBoxStudentFaculty.addItem("Science");
        comboBoxStudentFaculty.addItem("Arts");
        comboBoxStudentFaculty.addItem("Commerce");
        contentPane.add(comboBoxStudentFaculty);

        JComboBox<String> comboBoxStudentCourse = new JComboBox<String>();
        comboBoxStudentCourse.setBounds(54, 216, 118, 22);
        comboBoxStudentCourse.addItem("BCA");
        comboBoxStudentCourse.addItem("MCA");
        comboBoxStudentCourse.addItem("BBA");
        contentPane.add(comboBoxStudentCourse);

        submitBtn.addActionListener(e -> {
            String name = studentNameTextField.getText();
            String contact = textFieldStudentContactNumber.getText();
            String email = textFieldStudentEmail.getText();
            String address = textFieldStudentAddress.getText();
            String gender = rdbtnStudentMale.isSelected() ? "Male" : "Female";
            String faculty = (String) comboBoxStudentFaculty.getSelectedItem();
            String course = (String) comboBoxStudentCourse.getSelectedItem();
            // Add form submission logic here
        });
    }
}
