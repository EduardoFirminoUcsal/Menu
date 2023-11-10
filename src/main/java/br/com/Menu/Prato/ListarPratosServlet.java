package br.com.Menu.Prato;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ListarPratosServlet")
public class ListarPratosServlet extends HttpServlet {
    // A anotação @WebServlet mapeia este servlet para a URL "/ListarPratosServlet".

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Este método é chamado quando uma solicitação HTTP GET é feita para o servlet.

        // Crie uma instância de "PratoService" para realizar operações relacionadas a pratos.
        PratoService pratoService = new PratoService();

        // Chame o método "listarPratos" para obter a lista de pratos do banco de dados.
        List<Prato> pratos = pratoService.listarPratos();

        // Defina um atributo "pratos" na solicitação para passar a lista de pratos para a página JSP.
        request.setAttribute("pratos", pratos);

        // Encaminhe a solicitação para a página "listPratos.jsp", onde a lista de pratos será exibida.
        request.getRequestDispatcher("listPratos.jsp").forward(request, response);
    }
}
