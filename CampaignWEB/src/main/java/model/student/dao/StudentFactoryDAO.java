package model.student.dao;

import java.util.Optional;

/**
 * Student factory class
 * @author Илья Корчан
 * @version 1.0
 */
public class StudentFactoryDAO implements FactoryDAO {
    private static Optional<FactoryDAO> factory = Optional.ofNullable(null);

    private StudentFactoryDAO() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static FactoryDAO getInstance() {
        if (!factory.isPresent()) {
            synchronized (StudentFactoryDAO.class) {
                if (!factory.isPresent()) {
                    factory = Optional.of(new StudentFactoryDAO());
                }
            }
        }
        return factory.get();
    }

        @Override
        public StudentDAO getStudentDAO () {
            return new StudentJDBCDao();
        }
    }
