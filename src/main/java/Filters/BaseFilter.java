package Filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * This filter is Base for all filters. Made to simply work with HttpServletRequest/Response classes.
 * @version 0.1
 * @author Vitalii Nedzelskyi
 */

@WebFilter(filterName = "BaseFilter")
public abstract class BaseFilter implements Filter {
    public void destroy() {
        /*NOP*/
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        doFilter((HttpServletRequest) req, (HttpServletResponse) resp, chain);
    }
    /**
     * This is abstract method. Need to be Override to not cast variables in all filters
     */
    abstract void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws ServletException, IOException;

    public void init(FilterConfig config) throws ServletException {
        /*NOP*/
    }

}
