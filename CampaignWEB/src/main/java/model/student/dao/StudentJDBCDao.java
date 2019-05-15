package model.student.dao;

import model.services.Rated;
import model.services.RatedStudent;
import model.entities.Student;
import view.StringConstants;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for fetching data about students from MySQL database
 * @author Илья Корчан
 * @version 1.1
 */
public class StudentJDBCDao implements StudentDAO, StringConstants {
    @Override
    public List<Rated> getAll() {
        List<Rated> allRated = new ArrayList<>();


        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(GET_ALL_STUDENTS_QUERY)) {
            ResultSet results = statement.executeQuery();

            while(results.next()) {
                String name = results.getString(1);
                String surname = results.getString(2);
                int averageMark = results.getInt(3);
                boolean privileges = results.getBoolean(4);
                int additionalMark = results.getInt(5);

                Student student = new Student(name, surname, BigDecimal.valueOf(averageMark), privileges, additionalMark);
                Rated ratedStudent = new RatedStudent(student);
                allRated.add(ratedStudent);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return allRated;
    }

    public Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
