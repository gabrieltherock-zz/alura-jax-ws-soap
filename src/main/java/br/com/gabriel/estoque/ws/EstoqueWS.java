package br.com.gabriel.estoque.ws;

import br.com.gabriel.estoque.modelo.item.Item;
import br.com.gabriel.estoque.modelo.item.ItemDao;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import java.util.List;

@WebService
public class EstoqueWS {

    private final ItemDao dao = new ItemDao();

    @WebMethod(operationName="todosOsItens")
    @WebResult(name="item")
    @ResponseWrapper(localName="itens")
    @RequestWrapper(localName="listaItens")
    public List<Item> getItens() {
        System.out.println("Chamando getItens()");
        return dao.todosItens();
    }
}
