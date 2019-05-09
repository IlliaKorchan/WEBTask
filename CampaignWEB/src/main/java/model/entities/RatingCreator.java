package model.entities;

import model.student.dao.StudentFactoryDAO;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Class for rating processing
 * @author Илья Корчан
 * @version 1.0
 */
public class RatingCreator {
    List<Student> allStudents;

    public List<Student> getRating() {
        allStudents = StudentFactoryDAO.getInstance().getStudentDAO().getAll();
        return createRating(allStudents);
    }

    public List<Student> createRating(List<Student>students) {
        List<Student>rating = students.stream().sorted((s1, s2) -> (s1.isPrivileges() != s2.isPrivileges()) ?
                                                         Boolean.compare(s2.isPrivileges(), s1.isPrivileges()) :
                                                         s2.getRatingMark().compareTo(s1.getRatingMark()))
                                               .collect(Collectors.toList());
        return rating;
    }
}
