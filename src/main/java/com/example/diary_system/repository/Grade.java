package com.example.diary_system.repository;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "grades")
public class Grade {
    @Id
    private Long id;
    private String subject;
    private Long studentId;
    private Long teacherId;
    private int grade;
    private LocalDate dateOfGrade;

    public Grade(Long id, String subject, Long studentId, Long teacherId, int grade, LocalDate dateOfGrade) {
        this.id = id;
        this.subject = subject;
        this.studentId = studentId;
        this.teacherId = teacherId;
        this.grade = grade;
        this.dateOfGrade = dateOfGrade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public LocalDate getDateOfGrade() {
        return dateOfGrade;
    }

    public void setDateOfGrade(LocalDate dateOfGrade) {
        this.dateOfGrade = dateOfGrade;
    }
}