package controller.servlet;

import model.services.Rated;
import model.services.RatingCreator;
import model.services.StudentRatingCreator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.List;

import static view.StringConstants.INDEX;
import static view.StringConstants.TIME_FORMAT;

/**
 * Main Servlet
 * @author Илья Корчан
 * @version 1.2
 */
public class StudentRateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF8");

        LocalDate date = LocalDateTime.now().toLocalDate();
        String currentDate = date.format(DateTimeFormatter.ofPattern(TIME_FORMAT));

        RatingCreator creator = new StudentRatingCreator();
        List<Rated> students = creator.getRating();

        req.setAttribute("currentDate", currentDate);
        req.setAttribute("students", students);

        req.getRequestDispatcher(INDEX).forward(req, resp);
    }
}
