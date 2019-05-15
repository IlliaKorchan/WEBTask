package model.services;

import model.entities.Student;

import java.math.BigDecimal;


public class RatedStudent implements Rated {
    private Student student;
    private BigDecimal ratingMark;

    public RatedStudent(Student student) {
        this.student = student;
    }

    public BigDecimal countAndGetRatingMark() {
        ratingMark = BigDecimal.valueOf(student.getAverageMark().doubleValue() + student.getAdditionalMark());
        return getRatingMark();
    }

    @Override
    public boolean isPrivileges() {
        return student.isPrivileges();
    }

    public BigDecimal getRatingMark() {
        return ratingMark;
    }

    public Student getStudent() {
        return student;
    }
}
