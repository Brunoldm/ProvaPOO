
package quebracabeca;

import java.util.ArrayList;

public class Tabuleiro {
    private Peca[][] tabuleiro;
    private int linhas;
    private int colunas;

    public Tabuleiro(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.tabuleiro = new Peca[linhas][colunas];
    }

    public boolean adicionarPeca(int linha, int coluna, Peca peca) {
        if (linha < 0 || coluna < 0 || linha >= linhas || coluna >= colunas) {
            System.out.println("Posição inválida.");
            return false;
        }
        if (tabuleiro[linha][coluna] != null) {
            System.out.println("Já existe uma peça nessa posição.");
            return false;
        }

        // Verificar encaixes
        boolean encaixa = true;
        if (linha > 0 && tabuleiro[linha - 1][coluna] != null) {
            encaixa &= tabuleiro[linha - 1][coluna].encaixaCom(peca, "baixo");
        }
        if (linha < linhas - 1 && tabuleiro[linha + 1][coluna] != null) {
            encaixa &= tabuleiro[linha + 1][coluna].encaixaCom(peca, "cima");
        }
        if (coluna > 0 && tabuleiro[linha][coluna - 1] != null) {
            encaixa &= tabuleiro[linha][coluna - 1].encaixaCom(peca, "direita");
        }
        if (coluna < colunas - 1 && tabuleiro[linha][coluna + 1] != null) {
            encaixa &= tabuleiro[linha][coluna + 1].encaixaCom(peca, "esquerda");
        }

        if (!encaixa) {
            System.out.println("A peca nao encaixa nessa posicao.");
            return false;
        }

        tabuleiro[linha][coluna] = peca;
        return true;
    }

    public void exibirTabuleiro() {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (tabuleiro[i][j] != null) {
                    System.out.print("[P] ");
                } else {
                    System.out.print("[ ] ");
                }
            }
            System.out.println();
        }
    }
}
