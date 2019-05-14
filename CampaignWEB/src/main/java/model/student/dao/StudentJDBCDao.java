package model.student.dao;

import model.entities.Student;
import view.StringConstants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for fetching data from MySQL database
 * @author Илья Корчан
 * @version 1.0
 */
public class StudentJDBCDao implements StudentDAO, StringConstants {
    @Override
    public List<Student> getAll() {
        List<Student> allStudents = new ArrayList<>();


        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(GET_ALL_STUDENTS_QUERY)) {
            ResultSet results = statement.executeQuery();

            while(results.next()) {
                String name = results.getString(1);
                String surname = results.getString(2);
                int averageMark = results.getInt(3);
                boolean privileges = results.getBoolean(4);
                int additionalMark = results.getInt(5);

                Student student = new Student(name, surname, averageMark, privileges, additionalMark);
                allStudents.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return allStudents;
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
