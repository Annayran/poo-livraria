package livraria.produtos;

import livraria.Autor;
import livraria.exception.AutorNuloException;

/**
 * Colocamos o Livro como classe abstrata. Somente vira abstrata quando planeja
 * a hieraquia e heran�a da sua classe.
 * 
 * Pode ser bastrata sem nenhum m�todo abstrato. Apos tornar abstrata, nenhum
 * c�digo poder� mais instanci�-la. Ao declarar um m�todo abstrato, precisa
 * tornar a classe abstrata tamb�m. Pode ter m�todos abstratos ou n�o
 * (concretos) Toda classe filha(subclasse) precisa implementar os m�todos
 * abstratos da classe pai (superclasse). A n�o ser que seja abstrata
 * 
 * @author Casa
 *
 */
public abstract class Livro implements Produto {

	/**
	 * PAGINA 71 Recebem o nome de atributos, por irem no escopo da classe. ISBN (um
	 * numero de identifica��o, International Standard Book Number.
	 * 
	 * Visibilidade dos atributos foi alterada de padr�o para private Ningu�m mais
	 * al�m da pr�pria classe conseguir� acessar e modificar este valor
	 * 
	 * set (atribuir) atribuir valores para o get (pegar) retornar ou pegar estes
	 * valores
	 */
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;

	/**
	 * Pode-se adicionar na classe um atributo criado. Uma classe pode ter outra
	 * classe como atributo, processo chamado de composi��o.
	 */
	private Autor Autor;

	public Livro(Autor autor) {
		if(autor == null) {
			throw new AutorNuloException("O autor do livro n�o pode ser nulo");
		}
		this.Autor = autor;
		this.isbn = "000-00-00000-00-0";
	}

	public Livro() {
	}

	boolean temAutor() {
		return this.Autor != null;
	}

	/**
	 * M�todo que define um comportamento para a classe N�o se retorna nada, apenas
	 * executando instru��es do m�todo. Void � uma palavra resrvada indica que o
	 * m�todo n�o tem retorno.
	 */
	public void mostrarDetalhes() {
		System.out.println("Mostrando detalhes do livro");
		System.out.println("Nome: " + nome);
		System.out.println("Descri��o: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("ISBN: " + isbn);

		System.out.println("\n");

		if (this.temAutor()) {
			Autor.mostrarDetalhes();
		}
		System.out.println("--");
	}

	/**
	 * Usarmos a palavra this para mostra que � um atributo da classe this evita
	 * problemas de ambiguidade e deixa claro que faz parte desta classe
	 */
	public boolean aplicaDesconto(double porcentagem) {
		return false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return Autor;
	}

	public void setAutor(Autor autor) {
		Autor = autor;
	}

	@Override
	public int compareTo(Produto outro) {
		if(this.getValor() < outro.getValor()) {
			return -1;
		}
		if(this.getValor() > outro.getValor()) {
			return 1;
		}
		return 0;
	}
	
}
