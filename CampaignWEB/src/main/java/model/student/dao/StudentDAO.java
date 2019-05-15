package model.student.dao;

import model.services.Rated;
import java.util.List;

/**
 * DAO implementation interface
 * @author Илья Корчан
 * @version 1.1
 */

public interface StudentDAO {
    List<Rated> getAll();
}
