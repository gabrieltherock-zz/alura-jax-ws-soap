package br.com.gabriel.estoque.cliente;

public class Main {

    public static void main(String[] args) {
        EstoqueWS cliente = new EstoqueWSService().getEstoqueWSPort();

        Filtros filtros = new Filtros();

        Filtro filtro = new Filtro();
        filtro.setNome("IPhone");
        filtro.setTipo(TipoItem.CELULAR);

        filtros.getFiltro().add(filtro);

        ListaItens lista = cliente.todosOsItens(filtros);

        System.out.println(lista);
    }
}
