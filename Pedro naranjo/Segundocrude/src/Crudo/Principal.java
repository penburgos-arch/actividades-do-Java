package Crudo;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	static Scanner scan = new Scanner(System.in);
	static List<Carros> carro = new ArrayList<Carros>();

	public static void main(String[] args) {
	Mostrarmenu();

	}

	private static void Mostrarmenu() {
		int escolhaUsuario = 0;
		do {
		System.out.println("=====MENU=====");
		System.out.println("1- Cadrastrar carro");
		System.out.println("2- mostrar estoque");
		System.out.println("3- Eliminar carros");
		System.out.println("4- alterar carros");
		System.out.println("0- sair");
		escolhaUsuario = scan.nextInt(escolhaUsuario);
		scan.nextLine();
		validarEscolha(escolhaUsuario);
		}while(escolhaUsuario != 0 );
	}

	private static void validarEscolha(int escolhaUsuario) {
		switch(escolhaUsuario){
		case 1:{
			cadrastrarCarro();
			break;
		}
		case 2:{
			visualizarcarros();
			break;
		}
		case 3:{
			eliminarCarro();
			break;
		}
		case 4:{
			alterarCarro();
			break;
		}
		
		}
	}

	public static void alterarCarro() {
		visualizarcarros();
		if(carro.isEmpty()) {
			System.out.println("nao tem carros cadrastrados");
			return;
		}
		System.out.println("digite o numero do carro que deseje alterar");
		int escolha = scan.nextInt() - 1;
		scan.nextLine();
		
		if(escolha > carro.size() || escolha < 0) {
			System.out.println("Opcao invalida");
			return;
		}
		Carros Acarro = carro.get(escolha);
		System.out.println("1- marca");
		System.out.println("2- modelo");
		System.out.println("3- ano");
		System.out.println("4- quantidade");
		System.out.println("0- sair");
		int opcao = scan.nextInt();
		scan.nextLine();
		switch(opcao) {
		case 1:{
			System.out.println("digite o novo nome da marca");
			Acarro.setMarca(scan.nextLine());
			System.out.println("nova marca registrada");
			break;
		}
		case 2:{
			System.out.println("digite o novo nome da modelo");
			Acarro.setModelo(scan.nextLine());
			break;
		}
		case 3:{
			System.out.println("digite o novo ano");
			int novoano = scan.nextInt();
			scan.nextLine();
			if(novoano <= 1500 || novoano > 2026 ) {
				System.out.println("ano invalido");
			}else {
				Acarro.setAno(novoano);
				System.out.println("novo ano alterado");
			}
			break;
		}
		case 4:{
			System.out.println("digite a nova quantidade");
			int novaquant = scan.nextInt();
			scan.nextLine();
			if(novaquant <= 0) {
				System.out.println("quantidade errada");
			}else {
				Acarro.setQuantidade(novaquant);
				System.out.println("quantidade alterada");
			}
			break;
		}
		case 0:{
			System.out.println("voltando ao menu..");
			break;
		}
		default: {
			System.out.println("opçao invalida");
			break;
		}
		}
		
	}

	private static void eliminarCarro() {
		visualizarcarros();
		if(carro.isEmpty()) {
			System.out.println("nao tem carros cadrastrados");
			return;
		}
		System.out.println("digite o numero que queira apagar");
		int escolha = scan.nextInt() - 1;
		scan.nextLine();
		if(escolha > carro.size() || escolha <0) {
			System.out.println("numero digitado invalido");
			return;
		}
		System.out.println("deseja eliminar: " + carro.get(escolha).getMarca());
		System.out.println("do modelo: " + carro.get(escolha).getModelo());
		System.out.println("1- SIM");
		System.out.println("2- NAO");
		int confirmar = scan.nextInt();
		scan.nextLine();
		if(confirmar == 1) {
			carro.remove(confirmar);
			System.out.println("carro eliminado com sucesso");
		}else {
			System.out.println("O carro nao foi removido");
		}
	}

	public static void visualizarcarros() {
		
		if(carro.isEmpty()) {
			System.out.println("nenhum carro cadrastrado");
			return;
		}
		System.out.println(" ");
		System.out.println("======MENU======");
		System.out.println(" ");
		for(int i = 0;i < carro.size();i++) {
			Carros vcarro = carro.get(i);
			System.out.println("numero: " + (i + 1));
			System.out.println("Marca: " + vcarro.getMarca());
			System.out.println("Modelo: " + vcarro.getModelo());
			System.out.println("ano: " + vcarro.getAno());
			System.out.println("quantidade: " + vcarro.getQuantidade());
		}
	}

	public static void cadrastrarCarro() {
		Carros novocarro = new Carros();
		System.out.println("insira a marca do carro");
		novocarro.setMarca(scan.nextLine());
		System.out.println("insira o modelo do carro");
		novocarro.setModelo(scan.nextLine());
		
		for(Carros carrofor : carro) {
			if(carrofor.getModelo().equalsIgnoreCase(novocarro.getModelo())) {
				System.out.println("este modelo ya foi cadrastrado!");
				return;
			}
		}
		System.out.println("insira o ano do carro");
		novocarro.setAno(scan.nextInt());
		scan.nextLine();
		if(novocarro.getAno()<= 1500) {
			System.out.println("o ano do carro é muito baixo");
			return;
		}else if(novocarro.getAno() >= 2026) {
			System.out.println("O nao do carro é muito alta!");
			return;
		}
		System.out.println("entre com a quantidade de carros");
		novocarro.setQuantidade(scan.nextInt());
		scan.nextLine();
		if(novocarro.getQuantidade()<=0) {
			System.out.println("quantidade errada");
			return;
		}
		carro.add(novocarro);
		System.out.println("carro cadrastrado com sucesso");
	}
	

}
