package aluno;

public class MaquinaRefrigerante {

    private int quantidadeEstoque;
    private double preco;
    private double dinheiroArrecadado;

  
    public MaquinaRefrigerante(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = 4.50;
        this.dinheiroArrecadado = 0.0;
    }

    
    public void comprar(int quantidade, double valorPago) {

        
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida.");
            return;
        }

       
        if (quantidade > quantidadeEstoque) {
            System.out.println("Estoque insuficiente.");
            return;
        }

       
        double total = quantidade * preco;

       
        if (valorPago < total) {
            System.out.println("Dinheiro insuficiente.");
            return;
        }

        
        quantidadeEstoque -= quantidade;
        dinheiroArrecadado += total;

        
        double troco = valorPago - total;

        System.out.printf("Compra realizada!%n");
        System.out.printf("Total: R$ %.2f%n", total);
        System.out.printf("Troco: R$ %.2f%n", troco);
    }

   
    public void reporEstoque(int quantidade) {

        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para reposição.");
            return;
        }

        quantidadeEstoque += quantidade;

        System.out.println("Estoque atualizado!");
    }

   
    public void exibirEstado() {
        System.out.println("\n--- Estado da Máquina ---");
        System.out.println("Estoque: " + quantidadeEstoque);
        System.out.printf("Dinheiro arrecadado: R$ %.2f%n",
                          dinheiroArrecadado);
    }
}
