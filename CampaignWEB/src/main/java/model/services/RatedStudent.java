package model.services;

import model.entities.Rateable;
import model.entities.Student;

import java.math.BigDecimal;

/**
 * Class, that build object for rating creating
 * @author Илья Корчан
 * @version 1.2
 */
public class RatedStudent implements Rated {
    private Rateable student;
    private BigDecimal ratingMark;

    public RatedStudent(Student student) {
        this.student = student;
    }

    public BigDecimal countRatingMark() {
        ratingMark = BigDecimal.valueOf(student.getAverageMark().doubleValue() + student.getAdditionalMark());
        return getRatingMark();
    }

    public BigDecimal getRatingMark() {
        return ratingMark;
    }

    public Rateable getStudent() {
        return student;
    }


}
