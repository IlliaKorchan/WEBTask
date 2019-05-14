package view;

/**
 * Interface, that contains String constants
 * @author Илья Корчан
 * @version 1.1
 */
public interface StringConstants {
    String INDEX = "/WEB-INF/view/index.jsp";
    String URL = "jdbc:mysql://localhost:3306/student_rating?useSSL=false&serverTimezone=UTC";
    String LOGIN = "root";
    String PASSWORD = "root";
    String GET_ALL_STUDENTS_QUERY = "SELECT student_name, student_surname, student_average_mark," +
                                     " student_privileges, student_additional_mark FROM student";
    String TIME_FORMAT = "dd-MM-yyyy";
}
