package livraria.produtos;

public interface Promocional {

	boolean aplicaDesconto(double porcentagem);
	
	default boolean aplicaDescontoDe10Porcento() {
		return aplicaDesconto(0.1);
	}
}
