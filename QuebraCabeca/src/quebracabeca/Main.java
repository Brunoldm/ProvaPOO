
package quebracabeca;

public class Main {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(3, 3);

        // Criar bordas
        Borda vazio = new Borda("vazio");
        Borda dente = new Borda("dente");
        Borda encaixe = new Borda("encaixe");

        // Criar peças
        Peca peca1 = new Peca(vazio, dente, encaixe, vazio);
        Peca peca2 = new Peca(encaixe, vazio, vazio, dente);
        Peca peca3 = new Peca(vazio, encaixe, vazio, dente);
        Peca peca4 = new Peca(encaixe, encaixe, vazio, vazio); 
        Peca peca5 = new Peca(vazio, vazio, encaixe, encaixe);
        
        // Adicionar peças ao tabuleiro
        tabuleiro.adicionarPeca(0, 0, peca1);
        tabuleiro.adicionarPeca(0, 1, peca2);
        tabuleiro.adicionarPeca(1, 0, peca3);
        tabuleiro.adicionarPeca(1, 1, peca4);
        tabuleiro.adicionarPeca(1, 2, peca5);
        // Exibir tabuleiro
        tabuleiro.exibirTabuleiro();
    }
}

