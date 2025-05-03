public class Sessao {
    private double preco;
    private int horas;
    private double reembolsoInformado;

    public Sessao(double preco, int horas, double reembolsoInformado) {
        this.preco = preco;
        this.horas = horas;
        this.reembolsoInformado = reembolsoInformado;
    }

    public double calcularTotal() {
        return preco * horas;
    }

    public double calcularReembolso() {
        return reembolsoInformado;
    }

    public int calcularNF() {
        return (int) Math.ceil(calcularTotal() / reembolsoInformado);
    }

    public double getPreco() { return preco; }
    public int getHoras() { return horas; }
    public double getReembolsoInformado() { return reembolsoInformado; }
}