package br.com.Menu.Prato;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RemoverPratoServlet")
public class RemoverPratoServlet extends HttpServlet {
    // A anotação @WebServlet mapeia este servlet para a URL "/RemoverPratoServlet".

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Este método é chamado quando uma solicitação HTTP GET é feita para o servlet.

        // Obtém o ID do prato a ser removido a partir dos parâmetros da solicitação.
        int id = Integer.parseInt(request.getParameter("id"));

        // Cria uma instância de "PratoService" para realizar operações relacionadas a pratos.
        PratoService pratoService = new PratoService();

        // Chama o método "removerPrato" para remover o prato com o ID especificado.
        pratoService.removerPrato(id);

        // Redireciona o usuário de volta para a página de listagem de pratos após a remoção.
        response.sendRedirect("listPratos.jsp");
    }
}
