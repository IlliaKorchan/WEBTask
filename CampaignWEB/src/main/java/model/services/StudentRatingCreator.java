package model.services;

import model.student.dao.StudentFactoryDAO;
import java.util.List;

/**
 * Class for rating processing
 * @author Илья Корчан
 * @version 1.2
 */
public class StudentRatingCreator implements RatingCreator {
    public List<Rated> getRating() {
        List<Rated> allRated = StudentFactoryDAO.getInstance().getStudentDAO().getAll();
        allRated.forEach(Rated::countRatingMark);
        return allRated;
    }
}
