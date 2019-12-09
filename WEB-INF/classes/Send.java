import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MessageDAO;
import model.Message;

@WebServlet("/Send")
public class Send extends HttpServlet {

	private static final long serialVersionUID = 1788156328072745445L;

	public void init() throws ServletException {
		super.init();
	}

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		String mail = req.getParameter("mail");
		String subject = req.getParameter("subject");
		String msg = req.getParameter("msg");
		try {
			new MessageDAO().create(new Message(0, name, mail, subject, msg));
		} catch (SQLException e) {
			// Auto-generated catch block
			e.printStackTrace();
		}
		res.sendRedirect("index.html");
	}

	public void destroy() {
	}
}