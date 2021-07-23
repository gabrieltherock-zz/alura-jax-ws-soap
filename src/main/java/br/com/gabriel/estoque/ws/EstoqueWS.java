package br.com.gabriel.estoque.ws;

import br.com.gabriel.estoque.modelo.item.Filtro;
import br.com.gabriel.estoque.modelo.item.Filtros;
import br.com.gabriel.estoque.modelo.item.Item;
import br.com.gabriel.estoque.modelo.item.ItemDao;
import br.com.gabriel.estoque.modelo.item.ListaItens;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.ResponseWrapper;
import java.util.List;

@WebService
public class EstoqueWS {

    private final ItemDao dao = new ItemDao();

    @WebMethod(operationName="todosOsItens")
    @WebResult(name="itens")
    @ResponseWrapper(localName = "itens")
    public ListaItens getItens(@WebParam(name="filtros") Filtros filtros) {
        System.out.println("Chamando getItens()");
        List<Filtro> lista = filtros.getLista();
        List<Item> itensResultado = dao.todosItens(lista);
        return new ListaItens(itensResultado);
    }
}
