/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gui;

/**
 *
 * @author Teknik JMS
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class Student {
    // Implementasi kelas Student
}

class Course {
    // Implementasi kelas Course
}

class Enrollment {
    // Implementasi kelas Enrollment
}

public class StudentRegistrationSystemGUI extends JFrame {
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<Enrollment> enrollments = new ArrayList<>();

    private JTextArea studentList, courseList, enrollmentList;

    public StudentRegistrationSystemGUI() {
        setTitle("Sistem Pendaftaran Siswa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Implementasi GUI untuk manajemen siswa (analog dengan contoh sebelumnya)
        // ...

        // Implementasi GUI untuk manajemen kursus (analog dengan contoh sebelumnya)
        // ...

        // Implementasi GUI untuk manajemen pendaftaran (analog dengan contoh sebelumnya)
        // ...

        // Implementasi GUI untuk pembuatan transkrip
        JButton generateTranscriptButton = new JButton("Buat Transkrip");
        generateTranscriptButton.setBounds(20, 400, 150, 25);
        add(generateTranscriptButton);

        JTextArea transcriptArea = new JTextArea();
        transcriptArea.setBounds(20, 430, 540, 150);
        transcriptArea.setEditable(false);
        add(transcriptArea);

        generateTranscriptButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Logika pembuatan transkrip
                StringBuilder transcriptData = new StringBuilder();
                for (Enrollment enrollment : enrollments) {
                    transcriptData.append("Siswa: ").append(enrollment.getStudent().getName())
                            .append(", Kursus: ").append(enrollment.getCourse().getCourseName())
                            .append("\n");
                }
                transcriptArea.setText(transcriptData.toString());
            }
        });

        setSize(600, 620);
        setLayout(null);
        setVisible(true);
    }

    // Metode-metode lainnya untuk manajemen siswa, kursus, dan pendaftaran
    // ...

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StudentRegistrationSystemGUI());
    }
}

