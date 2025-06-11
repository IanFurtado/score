package scoreA3;

public class Main {
    public static void main(String[] args) {
        score2 cliente = new score2();

        cliente.pagamentoEmDia();
        cliente.debitoAutomatico();
        cliente.investimentoBanco();
        cliente.receberSalario();

        
        cliente.simularAnosPassados(3); 


        cliente.aplicarDecaimento();
        System.out.println("Score após decaimentos: " + cliente.getScore());
    }
}
