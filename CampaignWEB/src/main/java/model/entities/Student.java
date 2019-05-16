package model.entities;

import java.math.BigDecimal;

/**
 * POJO student class
 * @author Илья Корчан
 * @version 1.2
 */
public class Student implements Rateable{
    private String name;
    private String surname;
    private BigDecimal averageMark;
    private boolean privileges;
    private int additionalMark;

    public Student(String name, String surname, BigDecimal averageMark, boolean privileges, int additionalMark) {
        this.name = name;
        this.surname = surname;
        this.averageMark = averageMark;
        this.privileges = privileges;
        this.additionalMark = additionalMark;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BigDecimal getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = BigDecimal.valueOf(averageMark);
    }

    public void setPrivileges(boolean privileges) {
        this.privileges = privileges;
    }

    public int getAdditionalMark() {
        return additionalMark;
    }

    public void setAdditionalMark(int additionalMark) {
        this.additionalMark= additionalMark;
    }

    public boolean isPrivileges() {
        return privileges;
    }
}
