package model.student.dao;

/**
 * Student factory interface
 * @author Илья Корчан
 * @version 1.0
 */
@FunctionalInterface
public interface FactoryDAO {
    StudentDAO getStudentDAO();
}
