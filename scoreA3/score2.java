package scoreA3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class score2 {
    protected int score;
    private LocalDate dataCriacao;
    
    
    private class RegistroAcao {
        String tipo;
        int pontos;
        LocalDate data;

        RegistroAcao(String tipo, int pontos) {
            this.tipo = tipo;
            this.pontos = pontos;
            this.data = LocalDate.now();
        }
    }

    private List<RegistroAcao> historico = new ArrayList<>();

    public score2() {
        this.score = 0;
        this.dataCriacao = LocalDate.now();
    }

    public score2(int score) {
        this.score = score;
        this.dataCriacao = LocalDate.now();
    }

    
    public void pagamentoEmDia() {
        historico.add(new RegistroAcao("pagamentoEmDia", 50));
        score += 50;
    }

    public void debitoAutomatico() {
        historico.add(new RegistroAcao("debitoAutomatico", 100));
        score += 100;
    }

    public void contaAtivado1Ano() {
        historico.add(new RegistroAcao("contaAtivado1Ano", 200));
        score += 200;
    }

    public void investimentoBanco() {
        historico.add(new RegistroAcao("investimentoBanco", 150));
        score += 150;
    }

    public void receberSalario() {
        historico.add(new RegistroAcao("receberSalario", 250));
        score += 250;
    }

    public void semEstorno() {
        historico.add(new RegistroAcao("semEstorno", 200));
        score += 200;
    }

    public void atlCadastro() {
        historico.add(new RegistroAcao("atlCadastro", 50));
        score += 50;
    }

    public void fidelidade() {
        historico.add(new RegistroAcao("fidelidade", 100));
        score += 100;
    }

    
    public void aplicarDecaimento() {
        score = 0; 
        LocalDate hoje = LocalDate.now();

        for (RegistroAcao acao : historico) {
            long anos = ChronoUnit.YEARS.between(acao.data, hoje);
            double valor = acao.pontos;

            switch (acao.tipo) {
                case "pagamentoEmDia":
                case "debitoAutomatico":
                case "fidelidade":
                    valor *= Math.pow(0.9, anos); 
                    break;
                case "investimentoBanco":
                    if (anos > 2) {
                        long anosDecaindo = anos - 2;
                        valor *= Math.pow(0.9, anosDecaindo);
                    }
                    break;
                case "atlCadastro":
                    if (anos >= 1) valor = 0; 
                    break;
                case "semEstorno":
                    // 
                    break;
                case "receberSalario":
                    
                    break;
                case "contaAtivado1Ano":
                    
                    break;
            }

            score += (int) valor;
        }
    }

    public void simularAnosPassados(int anos) {
        for (RegistroAcao acao : historico) {
        acao.data = acao.data.minusYears(anos);
    }
}

    
    public void registrarEstorno() {
        historico.removeIf(acao -> acao.tipo.equals("semEstorno"));
    }

    
    public void pararReceberSalario() {
        historico.removeIf(acao -> acao.tipo.equals("receberSalario"));
    }

    public int getScore() {
        return score;
    }
}
