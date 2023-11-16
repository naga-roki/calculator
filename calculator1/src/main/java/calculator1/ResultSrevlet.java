
package calculator1;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResultSrevlet
 */
public class ResultSrevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@WebServlet("/ResultServlet")
	public class ResultServlet extends HttpServlet {
	    private static final long serialVersionUID = 1L;

	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        // 計算結果をリクエストから取得
	        String result = request.getParameter("result");

	        // リクエストに計算結果をセット
	        request.setAttribute("result", result);

	        // result.jspにフォワード
	        String view = "/WEB-INF/views/list.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(view);
			dispatcher.forward(request, response);
	    }
	}
}