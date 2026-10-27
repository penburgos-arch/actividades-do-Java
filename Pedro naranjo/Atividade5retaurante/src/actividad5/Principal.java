package actividad5;

public class Principal {

	public static void main(String[] args) {
      
        Pedido pedido1 = new Pedido("Pedro");

       
        pedido1.adicionarLanches(2);
        pedido1.adicionarLanches(1);

     
        pedido1.exibirPedido();

        
        pedido1.finalizarPedido();

        
        pedido1.adicionarLanches(1);

        
        pedido1.exibirPedido();
    }



	}


