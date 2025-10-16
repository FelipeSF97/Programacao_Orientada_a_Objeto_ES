public class Quadrado {
    private final double comprimento;
    public enum Cor {BRANCO, CINZA, VERMELHO, VERDE, AZUL, AMARELO};
    private final Cor cor;

    public Quadrado(double comprimento, Cor cor){
        this.comprimento = comprimento;
        this.cor = cor;
    }
     public double getComprimento() {
        return comprimento;
    }
    public Cor getCor() {
        return cor;
    }
    public double getArea() {
        return comprimento * comprimento;
    }
    public double getPerimetro() {
        return 4 * comprimento;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Quadrado");
        sb.append("\nComprimento do lado: ").append(getComprimento());
        sb.append("\nCor:").append(getCor());
        sb.append("\nArea").append(getArea());
        sb.append("\nPerímetro").append(getPerimetro());
        return sb.toString();
    }
}

