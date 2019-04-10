package by.testejb.servlet;

import by.testejb.entity.User;
import by.testejb.service.UserEJB;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/newuser")
public class UserServlet extends HttpServlet {

    @EJB
    private UserEJB userEJB;

//    public static void main(String[] args) {
//            int a=2,b=3;
//            if (a++<2 && ++b>0)
//                System.out.println (a*b);//12 and 8
//            System.out.println (a+""+b);// 3 and 2 ' ' 4
//
//    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/new_user.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        User user = new User(Long.valueOf(id), name, password);
        userEJB.saveUser(user);
        resp.sendRedirect("/");
    }
}
