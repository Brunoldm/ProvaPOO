
package quebracabeca;

public class Peca {
    private Borda topo;
    private Borda direita;
    private Borda baixo;
    private Borda esquerda;

    public Peca(Borda topo, Borda direita, Borda baixo, Borda esquerda) {
        this.topo = topo;
        this.direita = direita;
        this.baixo = baixo;
        this.esquerda = esquerda;
    }

    public Borda getTopo() {
        return topo;
    }

    public Borda getDireita() {
        return direita;
    }

    public Borda getBaixo() {
        return baixo;
    }

    public Borda getEsquerda() {
        return esquerda;
    }

    public boolean encaixaCom(Peca outraPeca, String direcao) {
        switch (direcao) {
            case "direita":
                return this.direita.encaixaCom(outraPeca.getEsquerda());
            case "esquerda":
                return this.esquerda.encaixaCom(outraPeca.getDireita());
            case "cima":
                return this.topo.encaixaCom(outraPeca.getBaixo());
            case "baixo":
                return this.baixo.encaixaCom(outraPeca.getTopo());
            default:
                return false;
        }
    }
}
