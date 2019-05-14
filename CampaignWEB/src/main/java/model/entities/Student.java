package model.entities;

/**
 * POJO student class
 * @author Илья Корчан
 * @version 1.1
 */
public class Student implements Rated{
    private String name;
    private String surname;
    private double averageMark;
    private boolean privileges;
    private int additionalMark;

    public Student(String name, String surname, double averageMark, boolean privileges, int additionalMark) {
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

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
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

    @Override
    public Double getRatingMark() {
        return averageMark + additionalMark;
    }

    @Override
    public boolean isPrivileges() {
        return privileges;
    }
}
