package com.emo.studenttrackerbackend.model;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private boolean isMinor;
    private LocalDate birthday;
    private LocalDate dateSignedUp;
    private LocalDate lastDateAttended;
    private LocalDate dateDuesLastPaid;
    private String rank;

    @ManyToOne
    @JoinColumn(name = "parent_id", referencedColumnName = "id")
    private Parent parent; // Optional: Only if the student is a minor

    public Student(Long id, String firstName, String lastName, boolean isMinor, LocalDate birthday, LocalDate dateSignedUp, LocalDate lastDateAttended, LocalDate dateDuesLastPaid, String rank, Parent parent) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isMinor = isMinor;
        this.birthday = birthday;
        this.dateSignedUp = dateSignedUp;
        this.lastDateAttended = lastDateAttended;
        this.dateDuesLastPaid = dateDuesLastPaid;
        this.rank = rank;
        this.parent = parent;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isMinor() {
        return isMinor;
    }

    public void setMinor(boolean minor) {
        isMinor = minor;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDate getDateSignedUp() {
        return dateSignedUp;
    }

    public void setDateSignedUp(LocalDate dateSignedUp) {
        this.dateSignedUp = dateSignedUp;
    }

    public LocalDate getLastDateAttended() {
        return lastDateAttended;
    }

    public void setLastDateAttended(LocalDate lastDateAttended) {
        this.lastDateAttended = lastDateAttended;
    }

    public LocalDate getDateDuesLastPaid() {
        return dateDuesLastPaid;
    }

    public void setDateDuesLastPaid(LocalDate dateDuesLastPaid) {
        this.dateDuesLastPaid = dateDuesLastPaid;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

}
