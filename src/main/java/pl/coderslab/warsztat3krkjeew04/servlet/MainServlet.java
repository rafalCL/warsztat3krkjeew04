package pl.coderslab.warsztat3krkjeew04.servlet;

import pl.coderslab.warsztat3krkjeew04.dao.SolutionDao;
import pl.coderslab.warsztat3krkjeew04.model.Solution;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class MainServlet extends HttpServlet {
    private int numberSolutions;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.numberSolutions = 1;
        try {
            this.numberSolutions = Integer.parseInt(config.getInitParameter("number-solutions"));
        } catch (NumberFormatException e){
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SolutionDao solutionDao = new SolutionDao();
        List<Solution> solutions = solutionDao.findRecent(this.numberSolutions);
        request.setAttribute("solutions", solutions);

        request.getRequestDispatcher("/main.jsp").forward(request, response);
    }
}
