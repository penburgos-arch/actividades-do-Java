
package actividad5;

public class Pedido {

    private String cliente;
    private int quantidadeLanches;
    private double precoLanche;
    private double taxaEntrega;
    private boolean status;

  
    public Pedido(String nomeCliente) {
        this.cliente = nomeCliente;
        this.quantidadeLanches = 0;
        this.precoLanche = 18.00;
        this.taxaEntrega = 7.00;
        this.status = false;
    }

    
    public void adicionarLanches(int quantidade) {

        if (this.status) {
            System.out.println("Seu pedido ja foi finalizado.");

        } else if (quantidade <= 0) {
            System.out.println("Quantidade invalida.");

        } else {
            this.quantidadeLanches += quantidade;
            System.out.println(quantidade + " lanche(s) adicionado(s).");
        }
    }

    public double calcularTotal() {

        double subtotal = this.quantidadeLanches * this.precoLanche;

        if (this.quantidadeLanches >= 3) {
            subtotal = subtotal - (subtotal * 0.10);
        }

    
        double total = subtotal + this.taxaEntrega;

        return total;
    }

   
    public void finalizarPedido() {

        if (this.status) {
            System.out.println("O pedido ja foi finalizado.");
        } else {
            this.status = true;
            System.out.println("Pedido finalizado com sucesso!");
        }
    }

 
    public void exibirPedido() {

        System.out.println("RESUMO DO PEDIDO ");
        System.out.println("Cliente: " + this.cliente);
        System.out.println("Quantidade de lanches: " + this.quantidadeLanches);
        System.out.printf("Preco por lanche: R$ %.2f%n", this.precoLanche);
        System.out.printf("Taxa de entrega: R$ %.2f%n", this.taxaEntrega);
        System.out.printf("Total do pedido: R$ %.2f%n", calcularTotal());

        if (this.status) {
            System.out.println("Status: Finalizado");
        } else {
            System.out.println("Status: Em aberto");
        }
    }
}
