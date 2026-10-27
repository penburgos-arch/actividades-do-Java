package pedro;

public class Principal {

	public static void main(String[] args) {
		
		Cofrinho meuCofrinho = new Cofrinho("Pedro", 500.00);
		
		meuCofrinho.Depositar(100.00);
		meuCofrinho.Depositar(200.00);
		meuCofrinho.Sacar(50.00);
		meuCofrinho.Exibir();

	}

}
