package aluno;

public class Actividade3 {

	public static void main(String[] args) {
		Time time1 = new Time("Flamengo");
		Time time2 = new Time("palmeiras");
		
		time1.RegistrarVictoria();
		time1.RegistrarVictoria();
		time1.RegistrarDerrota();
		time1.RegistrarDerrota();
		
		time2.RegistrarVictoria();
		time2.RegistrarEmpate();
		time2.RegistrarDerrota();
		time2.RegistrarDerrota();
		
		
		time1.Exibirresultados();
		time2.Exibirresultados();
		
		System.out.println("CLASIFICAÇAO");
		
		if(time1.getPontos() > time2.getPontos()) {
			System.out.println(time1.getNome() + "esta na frente");
		}else if(time1.getPontos()< time2.getPontos()) {
			System.out.println(time2.getNome() + "esta na frente");
		}else {
			System.out.println("o jogo esta em empate");
		}
	}

}
