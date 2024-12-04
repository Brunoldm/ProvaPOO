
package quebracabeca;

public class Borda {
    private String tipo; 

    public Borda(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean encaixaCom(Borda outraBorda) {
        // Define as regras de encaixe
        if (this.tipo.equals("vazio") || outraBorda.getTipo().equals("vazio")) {
            return false; // Bordas vazias não encaixa
        }
        return this.tipo.equals("encaixe") && outraBorda.getTipo().equals("dente") ||
               this.tipo.equals("dente") && outraBorda.getTipo().equals("encaixe");
    }
}

