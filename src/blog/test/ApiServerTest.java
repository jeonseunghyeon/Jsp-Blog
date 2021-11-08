package blog.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test")
public class ApiServerTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ApiServerTest() {
        super();

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String food = request.getParameter("food");
		String method = request.getParameter("method");
		
		int result = 1;
		PrintWriter out = response.getWriter();
		
		if(result == 1) {
			out.print("{\"food\": "+food+", \"method\":"+method+"}");
		}else {
			out.print("{\"error\":  \"fail\"}");
		}
	
		
		out.flush();
	}

}
