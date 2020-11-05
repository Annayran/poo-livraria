package livraria.testes;

import livraria.Autor;
import livraria.produtos.Livro;
import livraria.produtos.LivroFisico;

public class CadastroDeLivros {

	public static void main(String[] args) {

		/**
		 * Instanciação do objeto da classe livro
		 */
		Autor autor = new Autor();
		autor.setNome("Tolkien J.R.R");
		autor.setEmail("emailinformado@gmail.com");
		autor.setCpf("123.456.789-10");

		Livro livro = new LivroFisico(autor);
		livro.setNome("O senhor dos Anéis");
		livro.setDescricao("O retorno do rei");
		livro.setValor(59.90);
		livro.setIsbn("978-85-66250-46-6");

		/**
		 * Aqui mostra que o livro pertence a este autor instanciado no objeto Então o
		 * livro é atribuido (sett) ao autor.
		 */
		livro.mostrarDetalhes();

		Autor outroAutor = new Autor();
		outroAutor.setNome("Rowling J.K");
		outroAutor.setEmail("emailinformado@gmail.com");
		outroAutor.setCpf("123.456.789-12");

		Livro outroLivro = new LivroFisico(outroAutor);
		outroLivro.setNome("Harry Potter");
		outroLivro.setDescricao("Prisoneiro de Azkaban 3");
		outroLivro.setValor(59.90);
		outroLivro.setIsbn("978-85-66250-22-0");

		outroLivro.mostrarDetalhes();
	}

}
