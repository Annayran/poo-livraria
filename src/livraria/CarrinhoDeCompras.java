package livraria;

import java.util.ArrayList;

import livraria.produtos.Produto;

public class CarrinhoDeCompras {

	private double total;
	private ArrayList<Produto> produtos;

	public CarrinhoDeCompras() {
		this.produtos = new ArrayList<>();
	}

	public void adiciona(Produto produto) {
		this.produtos.add(produto);
	}

	public void remove(int posicao) {
		this.produtos.remove(posicao);
	}

	public double getTotal() {
		return total;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
}
