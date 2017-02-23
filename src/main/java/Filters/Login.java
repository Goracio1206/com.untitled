package Filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * This filter is for check if user has active session.
 * If not user will be sent to main page. If has request and response will be sent to next step.
 *
 * @author Vitalii N
 * @version 0.1
 */

public class Login extends BaseFilter {


    @Override
    void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpSession userSession = request.getSession(false);
        if (userSession != null && !userSession.isNew()){
            chain.doFilter(request, response);
        }
        else {
            response.sendRedirect("/index.jsp");
        }
    }
}
