package unCrude;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Principal {
	
	static Scanner scan = new Scanner(System.in);
	static List<Helado> helado = new ArrayList<Helado>();

	public static void main(String[] args) {
		MostrarMenu();
		
	}

	public static void MostrarMenu() {
		int EscolhadoUs = 0;
		do {
			System.out.println("\n=====menu de sorvetes=====");
			System.out.println("Selecione uma opção a seguir: ");
			System.out.println("1 - Cadastrar sorvetes");
			System.out.println("2 - Visualizar estoque de sorvetes");
			System.out.println("3 - Apagar info de sorvete");
			System.out.println("4 - Alterar info de sorvete");
			System.out.println("0 - Sair");
			EscolhadoUs = scan.nextInt();
			scan.nextLine();
			validarEscolha(EscolhadoUs);
		} while (EscolhadoUs != 0);
		
	}

	public static void validarEscolha(int escolhadoUs) {
		switch(escolhadoUs) {
		case 1:{
			cadrastrarSorvete();
			break;
		}
		case 2:{
			visualizarhelados();
			break;
		}
		case 3:{
			apagarSorvete();
			break;
		}
		case 4:{
			alterarSorvete();
			break;
		}
		}
	}

	public static void alterarSorvete() {
		visualizarhelados();
		if(helado.isEmpty()) {
			return;
		}
		System.out.println("Digite o numero que deseja alterar:");
		int escolha = scan.nextInt() - 1;
		scan.nextLine();
		if(escolha >=helado.size() || escolha < 0) {
			System.out.println("Opçao invalida");
			return;
		}
		Helado sorvete = helado.get(escolha);
		System.out.println("1- nome do sorvete");
		System.out.println("2- preço");
		System.out.println("3- quantidade");
		System.out.println("0- sair");
		int opcao = scan.nextInt();
		scan.nextLine();
		switch(opcao ) {
		case 1:{
			System.out.println("digite um novo sabor:");
			sorvete.setSabor(scan.nextLine());
			System.out.println("Sabor alterado com sucesso");
			break;
		}
		case 2: {
		    System.out.println("Digite o novo preço:");
		    double novoPreco = scan.nextDouble();
		    scan.nextLine();

		    if (novoPreco <= 0) {
		        System.out.println("Preço inválido!");
		    } else {
		        sorvete.setPreco(novoPreco);
		        System.out.println("Preço alterado com sucesso!");
		    }

		    break;
		}
		case 3:{
			System.out.println("Digite a nova quantidade:");
			int novaQuantidade = scan.nextInt();
			scan.nextLine();
			if(novaQuantidade <= 0) {
				System.out.println("quantidade invalida");
			}else {
				sorvete.setQuantidade(novaQuantidade);
				System.out.println("quantidade alterada com sucesso");
			}
			break;
		}
		case 0:{
			System.out.println("voltando ao mune principal...");
			break;
		}
		default: {
			System.out.println("opçao invalida");
			break;
		}
		}
	}

	public static void apagarSorvete() {
		visualizarhelados();
		if(helado.isEmpty()) {
			return;
		}
		System.out.println("digite um noumero do sorvete que deseja apagar");
		int escolha = scan.nextInt() - 1;
		scan.nextLine();
		
		if(escolha>=helado.size() || escolha <0) {
			System.out.println("opçao invalida");
			return;
		}
		System.out.println("deseja remover:" + helado.get(escolha).getSabor());
		System.out.println("1- sim");
		System.out.println("2- nao");
		int confirmar = scan.nextInt();
		scan.nextLine();
		if (confirmar == 1) {
		    helado.remove(escolha);
		    System.out.println("Sorvete removido com sucesso!");
		} else {
		    System.out.println("Remoção cancelada.");
		}
	}

	public static void visualizarhelados() {
		if(helado.isEmpty()) {
			System.out.println("Nenhum helado cadrastrado");
			return;
		}
		System.out.println();
		System.out.println("=======MENU=======");
		System.out.println();
		for(int i = 0;i < helado.size();i++) {
			Helado sorvete =  helado.get(i);
			System.out.println("numero:" + (i + 1));
			System.out.println(sorvete.getSabor());
			System.out.println("preço: " + sorvete.getPreco());
			System.out.println("quantidade: " + sorvete.getQuantidade());
		}
	}

	public static void cadrastrarSorvete() {
		Helado novoHelado = new Helado();
		
		System.out.println("Cadraste um sabor");
		novoHelado.setSabor(scan.nextLine());
		
		for (Helado forhelado : helado) {
		    if (forhelado.getSabor().equalsIgnoreCase(novoHelado.getSabor())) {
		        System.out.println("Este producto ya fue registrado");
		        return;
		    }
		}
		
		System.out.println("Entre com o valor deste sorvete");
		novoHelado.setPreco(scan.nextDouble());
		scan.nextLine();
		if(novoHelado.getPreco()<=0) {
			System.out.println("O preço do produto nao pode ser menor que zero!");
			System.out.println("por favor ingrese o preço certo na proxima tentativa");
			return;
		}
		
		System.out.println("Entre com a quantidade");
		novoHelado.setQuantidade(scan.nextInt());
		scan.nextLine();
		if(novoHelado.getQuantidade()<=0) {
			System.out.println("A quantidade nao pode ser menor a zero");
			System.out.println("por favor ingrese a quantidade certa na proxima tentativa");
			return;
		}
		
		helado.add(novoHelado);
		System.out.println("sorvete cadrastrado com sucesso");
	}

}
