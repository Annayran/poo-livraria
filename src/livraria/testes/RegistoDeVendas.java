package livraria.testes;

import java.util.List;

import livraria.Autor;
import livraria.CarrinhoDeCompras;
import livraria.produtos.Ebook;
import livraria.produtos.LivroFisico;
import livraria.produtos.Produto;

public class RegistoDeVendas {

	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.setNome("Tolkien J.R.R");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("O Senhor dos Anéis");
		fisico.setValor(59.90);
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("O senhor dos Anéis");
		ebook.setValor(29.90);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		if(fisico.aplicaDescontoDe10Porcento()) {
			System.out.println("Valor agora é: R$ " + fisico.getValor());
		}
		
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);
		
		System.out.println("Total " + carrinho.getTotal());
		
		List<Produto> produtos = carrinho.getProdutos();
		
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
	}

}
