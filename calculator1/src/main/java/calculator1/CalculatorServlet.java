package calculator1;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


       
	@WebServlet("/calculator")
	public class CalculatorServlet extends HttpServlet {
	    private static final long serialVersionUID = 1L;

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        // パラメーターの取得
	        String number = request.getParameter("number");
	        String operator = request.getParameter("operator");
	        String clear = request.getParameter("clear");
	        String calculate = request.getParameter("calculate");
	        String reset = request.getParameter("reset"); // リセットボタンの追加

	        // 表示用の変数の取得
	        String display = request.getParameter("display");
	        if (display == null) {
	            display = "";
	        }

	        // クリアボタンが押された場合、表示をクリア
	        if (clear != null && clear.equals("true")) {
	            display = "";
	        } else if (number != null) {
	            // 数字ボタンが押された場合、表示に数字を追加
	            display += number;
	        } else if (operator != null) {
	            // 演算子ボタンが押された場合、表示に演算子を追加
	            display += operator;
	        } else if (calculate != null && calculate.equals("true")) {
	            // 計算ボタンが押された場合、数式を評価
	            display = evaluateExpression(display);
	        } else if (reset != null && reset.equals("true")) { // リセットボタンが押された場合、表示をクリア
	            display = "";
	        }

	        // 計算結果をリクエスト属性に設定してJSPに転送
	        request.setAttribute("result", display);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/calculator.jsp");
	        dispatcher.forward(request, response);
	    }

	    private String evaluateExpression(String expression) {
	        try {
	            // 計算の実装
	            return String.valueOf(eval(expression));
	        } catch (Exception e) {
	            return "エラー";
	        }
	    }

	    private double eval(final String expression) {
	        // 数式の評価を行うメソッド
	        // (ここでは簡易的な実装を使用している)
	        // ...
	        return 0.0;
	    }
	}
