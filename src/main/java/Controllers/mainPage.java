package Controllers;

import Dao.Exceptions.DaoSysytemException;
import Dao.Exceptions.NoSuchUserException;
import Dao.Impl.SearchUserDao;
import Dao.UserDao;
import Entity.UserN;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Admin on 3/21/2017.
 */
public class mainPage extends HttpServlet {
    private static final String PAGE_OK = "main.jsp";
    private static final String PAGE_ERROR = "error.jsp";

    UserDao userDao = new SearchUserDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        UserN user = null;
        try{
            user = userDao.selectUser(login, password);
            System.out.println(user);
        }catch (NoSuchUserException | DaoSysytemException | SQLException e){
            e.printStackTrace();
        }

        response.getWriter().write(user.getId() + "  " + user.getEmail());

        request.setAttribute("user", user);
        request.getRequestDispatcher(PAGE_OK).forward(request, response);
     }
}
