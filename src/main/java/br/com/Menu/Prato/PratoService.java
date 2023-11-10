package br.com.Menu.Prato;
import java.util.ArrayList;
import java.util.List;

public class PratoService {
    // Lista em memória para armazenar os pratos.
    private static List<Prato> listaPratos = new ArrayList<>();

    // Variável para rastrear o próximo ID a ser atribuído a um prato.
    private static int proximoId = 1;

    // Método para adicionar um prato à lista em memória.
    public Prato adicionarPrato(Prato prato) {
        // Define o ID do prato com o próximo ID disponível e incrementa o próximo ID.
        prato.setId(proximoId++);
        // Adiciona o prato à lista de pratos.
        listaPratos.add(prato);
        return prato; // Retorna o prato com o ID atribuído.
    }

    // Método para editar um prato na lista em memória.
    public boolean editarPrato(Prato prato) {
        for (int i = 0; i < listaPratos.size(); i++) {
            if (listaPratos.get(i).getId() == prato.getId()) {
                listaPratos.set(i, prato); // Substitui o prato existente pelo novo.
                return true; // Indica que a edição foi bem-sucedida.
            }
        }
        return false; // Retorna false se o prato não foi encontrado para edição.
    }

    // Método para remover um prato da lista em memória com base no ID.
    public boolean removerPrato(int id) {
        for (Prato prato : listaPratos) {
            if (prato.getId() == id) {
                listaPratos.remove(prato); // Remove o prato da lista.
                return true; // Indica que a remoção foi bem-sucedida.
            }
        }
        return false; // Retorna false se o prato não foi encontrado para remoção.
    }

    // Método para listar todos os pratos na lista em memória.
    public List<Prato> listarPratos() {
        return listaPratos; // Retorna a lista completa de pratos.
    }
}
