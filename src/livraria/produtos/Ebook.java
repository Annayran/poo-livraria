package livraria.produtos;

import livraria.Autor;

/**
 * Ebook(subclasse) esta herdando tudo que esta na classe Livro (superclasse).
 * Regra: Somente pode gerdader diretamente de uma classe pai
 * Ou seja, somente a classe que esta extendendo.
 * @author Casa
 *
 */
public class Ebook extends Livro implements Promocional{
	
	private String waterMark;
	
	/**
	 * 
	 */
	@Override
	public boolean aplicaDesconto(double porcentagem) {
		if (porcentagem > 0.15) {
			return false;
		}
		double desconto = this.getValor() + porcentagem;
		this.setValor(this.getValor() - desconto);
		return true;
	}

	/**
	 * super é para delegar a responsabilidade para a superclasse que tem comportamento bem definido
	 * @param autor
	 */
	public Ebook(Autor autor) {
		super(autor);
	}
	
	public String getWaterMark() {
		return waterMark;
	}

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	
	@Override
	public String toString() {
		return "Eu sou um Ebook";
	}
	
}
