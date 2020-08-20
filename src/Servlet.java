
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/SE")
public class Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;


    public Servlet() {
        System.out.println("LifecycleServlet 생성!!");
    }

    public void init(ServletConfig config) throws ServletException {
        System.out.println("init test 호출!!");
    }


    public void destroy() {
        System.out.println("destroy 호출!!");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>form</title></head>");
        out.println("<body><h1>doget방식</h1>");
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        out.println("이름 : " + name + "<br>");
        out.println("나이 : " + age + "<br>");
        out.println("<br>");
        out.println("<br>");
        Enumeration<String> headerNames = request.getHeaderNames();
        while(headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            String headerValue = request.getHeader(headerName);
            out.println(headerName + " : " + headerValue + " <br> ");
        }
        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<html><head></head><body>");
        out.println("<h1> doPost방식</h1>");
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        out.println("이름 : " + name + "<br>");
        out.println("나이 : " + age + "<br>");
        out.println("<br>");
        out.println("<br>");
        Enumeration<String> headerNames = request.getHeaderNames();
        while(headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            String headerValue = request.getHeader(headerName);
            out.println(headerName + " : " + headerValue + " <br> ");
        }
        out.println("</body></html>");
    }

//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("service 호출!!");
//	}
//

}
