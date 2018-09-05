package getBytes_fun;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetBytes
 */
//@WebServlet("/GetBytes")
public class GetBytes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String val = request.getParameter("name");
		try {
			byte[] byteData = val.getBytes("ISO_8859_1");
//			ISO_8859_1からUTF-8に変換
			val = new String(byteData, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
