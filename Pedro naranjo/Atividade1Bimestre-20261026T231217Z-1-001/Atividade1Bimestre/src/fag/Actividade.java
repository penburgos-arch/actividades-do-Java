package fag;

public class Actividade {

	public static void main(String[] args) {
		Estacionamento veiculo = new Estacionamento("ABC-1234","COROLLA");
		veiculo.adicionarTempo(20);
		veiculo.calcularValor();
		veiculo.exibirResumo();
		Estacionamento veiculo1 = new Estacionamento("DEF-456","Honda civic");
		veiculo1.adicionarTempo(10);
		veiculo1.calcularValor();
		veiculo1.exibirResumo();
		Estacionamento veiculo2 = new Estacionamento("WER-789","peugeot205");
		veiculo2.adicionarTempo(-10);
		veiculo2.calcularValor();
		veiculo2.exibirResumo();
	}

}
