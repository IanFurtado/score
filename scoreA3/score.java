package scoreA3;

public class score {
    protected int score;

    public score (int score) {
        this.score = score;
    }

    public String pix () {
        if (score >= 700) {
            return "Pix aprovado";
        } else if (score < 700 && score >= 500){
            return "Pix  aprovado ALERTA nível de score baixo";
        } else if (score < 500 && score >= 400) {
            return "Pix retido para análise manual";
        } else {
            return "Pix bloqueado";
        }
    }

    public void pagamentoEmDia () {
        score += 50;
    }

    public void debitoAutomatico () {
        score += 100;
    }

    public void contaAtivado1Ano () {
        score += 200;
    }

    public void investimentoBanco () {
        score += 150;
    }

    public void receberSalario () {
        score += 250;
    }

    public void semEstorno () {
        score += 200;
    }

    public void atlCadastro () {
        score += 50;
    }

    public void fidelidade () {
        score += 100;
    }

    public void denuncia () {
        score -= 500;
    }

    public void cpfInconsistente () {
        score -= 300;
    }

    public void transacaoSuspeita () {
        score -= 100;
    }

    public void comportamentoAtipico () {
        score -= 150;
    }

    public void semAutentificacao () {
        score -= 50;
    }

    public void atraso() {
        score -= 150;
    }

    public void cancelamentoDebitoAutomatico () {
        score -= 100;
    }

    public void contaInativa6Meses () {
        score -= 200;
    }

    public void historicoEstorno () {
        score -= 250;
    }
}
