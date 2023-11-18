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

@WebServlet("/AdicionarPedidoServlet")
public class AdicionarPedidoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String data = request.getParameter("data");
        int id_entrada = Integer.parseInt(request.getParameter("id_entrada"));
        int id_principal = Integer.parseInt(request.getParameter("id_principal"));
        int id_sobremesa = Integer.parseInt(request.getParameter("id_sobremesa"));

        try {
            Class.forName("org.hsqldb.jdbc.JDBCDriver");
            Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/banco", "SA", "");
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO Pedido (data, id_entrada, id_principal, id_sobremesa) VALUES (?, ?, ?, ?)");
            pstmt.setString(1, data);
            pstmt.setInt(2, id_entrada);
            pstmt.setInt(3, id_principal);
            pstmt.setInt(4, id_sobremesa);
            pstmt.executeUpdate();
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}