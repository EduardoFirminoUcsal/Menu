<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.io.PrintWriter" %>

<%
    String jdbcUrl = "jdbc:hsqldb:hsql://localhost/banco";
    String user = "SA";
    String password = "";
    Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
%>

<!DOCTYPE html>
<html>
<head>
    <title>metodos</title>
</head>
<body>

<%
    try {
        
        try (PreparedStatement pratoStatement = connection.prepareStatement("INSERT INTO Prato (nome, ingredientes, tipo_prato) VALUES (?, ?, ?)")) {
            pratoStatement.setString(1, "Salada");
            pratoStatement.setString(2, "Alface, Tomate, Cenoura");
            pratoStatement.setString(3, "entrada");
            pratoStatement.executeUpdate();
        }

        // Consultar pratos
        try (Statement consultaPratos = connection.createStatement();
             ResultSet resultSetPratos = consultaPratos.executeQuery("SELECT * FROM Prato")) {
            while (resultSetPratos.next()) {
                out.println("ID: " + resultSetPratos.getInt("id") + ", Nome: " + resultSetPratos.getString("nome") + ", Tipo: " + resultSetPratos.getString("tipo_prato") + "<br>");
            }
        }

        // Inserir pedido
        try (PreparedStatement pedidoStatement = connection.prepareStatement("INSERT INTO Pedido (data, id_entrada, id_principal, id_sobremesa) VALUES (?, ?, ?, ?)")) {
            pedidoStatement.setString(1, "2023-01-01");
            pedidoStatement.setInt(2, 1);
            pedidoStatement.setInt(3, 2);
            pedidoStatement.setInt(4, 3);
            pedidoStatement.executeUpdate();
        }

        // Consultar pedidos
        try (Statement consultaPedidos = connection.createStatement();
             ResultSet resultSetPedidos = consultaPedidos.executeQuery("SELECT * FROM Pedido")) {
            while (resultSetPedidos.next()) {
                out.println("ID: " + resultSetPedidos.getInt("id") + ", Data: " + resultSetPedidos.getString("data") + "<br>");
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
       
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
%>

</body>
</html>
