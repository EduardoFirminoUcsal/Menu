<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>metodos</title>
</head>
<body>

<!-- Formulário para adicionar prato -->
<form action="AdicionarPratoServlet" method="post">
    <input type="text" name="nome" placeholder="Nome do Prato">
    <input type="text" name="ingredientes" placeholder="Ingredientes">
    <input type="text" name="tipo_prato" placeholder="Tipo de Prato">
    <input type="submit" value="Adicionar Prato">
</form>

<!-- Formulário para listar pratos -->
<form action="ListarPratosServlet" method="get">
    <input type="submit" value="Listar Pratos">
</form>

<!-- Formulário para adicionar pedido -->
<form action="AdicionarPedidoServlet" method="post">
    <input type="text" name="data" placeholder="Data">
    <input type="text" name="id_entrada" placeholder="ID da Entrada">
    <input type="text" name="id_principal" placeholder="ID do Prato Principal">
    <input type="text" name="id_sobremesa" placeholder="ID da Sobremesa">
    <input type="submit" value="Adicionar Pedido">
</form>

<!-- Formulário para listar pedidos -->
<form action="ListarPedidosServlet" method="get">
    <input type="submit" value="Listar Pedidos">
</form>

</body>
</html>