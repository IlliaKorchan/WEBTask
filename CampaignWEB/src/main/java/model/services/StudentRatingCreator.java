package model.services;

import model.student.dao.StudentFactoryDAO;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Class for rating processing
 * @author Илья Корчан
 * @version 1.1
 */
public class StudentRatingCreator implements RatingCreator {

    public List<Rated> getRating() {
        List<Rated> allRated = StudentFactoryDAO.getInstance().getStudentDAO().getAll();
        return createRating(allRated);
    }

    public List<Rated> createRating(List<Rated>students) {
        return students.stream().sorted((s1, s2) -> (s1.isPrivileges() != s2.isPrivileges()) ?
                                                         Boolean.compare(s2.isPrivileges(), s1.isPrivileges()) :
                                                         s2.countAndGetRatingMark().compareTo(s1.countAndGetRatingMark()))
                                               .collect(Collectors.toList());

    }
}
