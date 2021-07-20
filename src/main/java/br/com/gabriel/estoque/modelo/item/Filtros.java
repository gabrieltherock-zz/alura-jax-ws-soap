package br.com.gabriel.estoque.modelo.item;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement()
@XmlAccessorType(XmlAccessType.FIELD)
public class Filtros {

	@XmlElement(name="filtro")
	private List<Filtro> filtros;

	//construtores

	public List<Filtro> getLista() {
		return filtros;
	}

}
