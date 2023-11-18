package br.com.Menu.Prato;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdicionarPratoServlet")
public class AdicionarPratoServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String ingredientes = request.getParameter("ingredientes");
		String tipo_prato = request.getParameter("tipo_prato");

		try {
			Class.forName("org.hsqldb.jdbc.JDBCDriver");
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/banco", "SA", "");
			PreparedStatement pstmt = conn
					.prepareStatement("INSERT INTO Prato (nome, ingredientes, tipo_prato) VALUES (?, ?, ?)");
			pstmt.setString(1, nome);
			pstmt.setString(2, ingredientes);
			pstmt.setString(3, tipo_prato);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
