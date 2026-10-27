package aluno;

public class Atividade2 {

	public static void main(String[] args) {
		MaquinaRefrigerante maquina = new MaquinaRefrigerante(10);
		System.out.println("-nova compra");
		maquina.comprar(2, 10.00);
		
		System.out.println("compra 2");
		maquina.comprar(4, 15.00);
		
		maquina.exibirEstado();

	}

}
