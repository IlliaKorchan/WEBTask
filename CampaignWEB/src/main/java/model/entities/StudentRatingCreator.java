package model.entities;

import model.student.dao.StudentFactoryDAO;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Class for rating processing
 * @author Илья Корчан
 * @version 1.1
 */
public class StudentRatingCreator implements RatingCreator {
    List<Rated> allRated;

    public List<Rated> getRating() {
        allRated = StudentFactoryDAO.getInstance().getStudentDAO().getAll();
        return createRating(allRated);
    }

    public List<Rated> createRating(List<Rated>students) {
        List<Rated>rating = students.stream().sorted((s1, s2) -> (s1.isPrivileges() != s2.isPrivileges()) ?
                                                         Boolean.compare(s2.isPrivileges(), s1.isPrivileges()) :
                                                         s2.getRatingMark().compareTo(s1.getRatingMark()))
                                               .collect(Collectors.toList());
        return rating;
    }
}
