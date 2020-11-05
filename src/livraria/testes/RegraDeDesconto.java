package livraria.testes;

import livraria.Autor;
import livraria.produtos.Ebook;
import livraria.produtos.Livro;
import livraria.produtos.MiniLivro;

public class RegraDeDesconto {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo");
		
		Livro livro = new MiniLivro(autor);
		livro.setValor(39.90);
		
		if (!livro.aplicaDesconto(0.3)) {
			System.out.println("Desconto não pode ser maior do que 30%");
		} else {
			System.out.println("Valor com desconto: R$" + livro.getValor());
		}
		
		Ebook ebook = new Ebook(autor);
		ebook.setValor(29.90);
		
		if (!ebook.aplicaDesconto(0.3)) {
			System.out.println("Desconto no ebook não pode ser maior do que 15%");
		} else {
			System.out.println("Valor do ebook com desconto : R$" + ebook.getValor());
		}
	}
}
