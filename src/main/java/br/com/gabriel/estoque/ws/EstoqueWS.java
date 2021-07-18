package br.com.gabriel.estoque.ws;

import br.com.gabriel.estoque.modelo.item.Item;
import br.com.gabriel.estoque.modelo.item.ItemDao;

import javax.jws.WebService;
import java.util.List;

@WebService
public class EstoqueWS {

    private final ItemDao dao = new ItemDao();

    public List<Item> getItens() {

        System.out.println("Chamando getItens()");
        return dao.todosItens();
    }
}
