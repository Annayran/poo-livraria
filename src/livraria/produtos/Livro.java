package livraria.produtos;

import livraria.Autor;
import livraria.exception.AutorNuloException;

/**
 * Colocamos o Livro como classe abstrata. Somente vira abstrata quando planeja
 * a hieraquia e herança da sua classe.
 * 
 * Pode ser bastrata sem nenhum método abstrato. Apos tornar abstrata, nenhum
 * código poderá mais instanciá-la. Ao declarar um método abstrato, precisa
 * tornar a classe abstrata também. Pode ter métodos abstratos ou não
 * (concretos) Toda classe filha(subclasse) precisa implementar os métodos
 * abstratos da classe pai (superclasse). A não ser que seja abstrata
 * 
 * @author Casa
 *
 */
public abstract class Livro implements Produto {

	/**
	 * PAGINA 71 Recebem o nome de atributos, por irem no escopo da classe. ISBN (um
	 * numero de identificação, International Standard Book Number.
	 * 
	 * Visibilidade dos atributos foi alterada de padrão para private Ninguém mais
	 * além da própria classe conseguirá acessar e modificar este valor
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
	 * classe como atributo, processo chamado de composição.
	 */
	private Autor Autor;

	public Livro(Autor autor) {
		if(autor == null) {
			throw new AutorNuloException("O autor do livro não pode ser nulo");
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
	 * Método que define um comportamento para a classe Não se retorna nada, apenas
	 * executando instruções do método. Void é uma palavra resrvada indica que o
	 * método não tem retorno.
	 */
	public void mostrarDetalhes() {
		System.out.println("Mostrando detalhes do livro");
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("ISBN: " + isbn);

		System.out.println("\n");

		if (this.temAutor()) {
			Autor.mostrarDetalhes();
		}
		System.out.println("--");
	}

	/**
	 * Usarmos a palavra this para mostra que é um atributo da classe this evita
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
