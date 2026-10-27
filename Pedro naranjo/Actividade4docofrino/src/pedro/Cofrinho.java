package pedro;

public class Cofrinho {
	private String nome;
	private double saldo;
	private double metaEconomica;

	public Cofrinho(String nome, double metaEconomica) {
		this.nome = nome;
		this.saldo = 0.00;
		this.metaEconomica = metaEconomica;
	}

	public void Depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		} else {
			System.out.println("nao pode ser iserido um valor negativo");
		}
	}

	public void Sacar(double retirar) {
		if (retirar < 0) {
			System.out.println("nao pode ser retirado valores negativos");
		} else if (this.saldo < retirar) {
			System.out.println("saldo insuficiente");
		} else {
			this.saldo -= retirar;
		}
	}

	public void MetaEconomica(double meta) {
		if (meta < 0) {
			System.out.println("nao pode ter de meta valores negativo");
		} else {
			this.metaEconomica = meta;
		}
	}

	public void Exibir() {
		double falta = this.metaEconomica - this.saldo;
		if (falta < 0) {
			falta = 0;
		}
		System.out.println("nome do cofrinho:" + this.nome);
		System.out.println("este é seu saldo" + this.saldo);
		System.out.println("isso e o quanto falta para alcançar sua meta" + falta);

	}

}
