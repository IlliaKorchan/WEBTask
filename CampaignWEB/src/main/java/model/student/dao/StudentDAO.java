package model.student.dao;

import model.entities.Student;
import java.util.List;

/**
 * DAO implementation interface
 * @author Илья Корчан
 * @version 1.0
 */
@FunctionalInterface
public interface StudentDAO {
    List<Student> getAll();
}
