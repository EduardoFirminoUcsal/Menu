package br.com.Menu.Prato;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/EditarPratoServlet")
public class EditarPratoServlet extends HttpServlet {
    // A anotação @WebServlet mapeia este servlet para a URL "/EditarPratoServlet".

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Este método é chamado quando uma solicitação HTTP POST é feita para o servlet.

        // Obtenha os parâmetros enviados pelo formulário HTML.
        int id = Integer.parseInt(request.getParameter("id"));
        String nome = request.getParameter("nome");
        String ingredientes = request.getParameter("ingredientes");
        String tipo = request.getParameter("tipo");

        // Crie um objeto "Prato" com os dados recebidos do formulário.
        Prato prato = new Prato(id, nome, ingredientes, tipo);

        // Crie uma instância de "PratoService" para realizar operações relacionadas a pratos.
        PratoService pratoService = new PratoService();

        // Chame o método "editarPrato" para editar o prato no banco de dados.
        pratoService.editarPrato(prato);

        // Redirecione o usuário para a página de listagem de pratos após a operação de edição.
        response.sendRedirect("listPratos.jsp");
    }
}
