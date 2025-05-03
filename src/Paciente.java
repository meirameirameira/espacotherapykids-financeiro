public class Paciente {
    private String nome;
    private Sessao fono;
    private Sessao to;

    public Paciente(String nome, Sessao fono, Sessao to) {
        this.nome = nome;
        this.fono = fono;
        this.to = to;
    }

    public void exibirInformacoes() {
        System.out.println("\nPaciente: " + nome);

        System.out.println("\nInformações da Fono");
        System.out.println(" Valor da sessão: R$" + fono.getPreco());
        System.out.println(" Horas de sessão: " + fono.getHoras());
        System.out.println(" Valor Total: R$" + fono.calcularTotal());
        System.out.println(" Valor do reembolso: R$" + fono.calcularReembolso());
        System.out.println(" Sessões para Nota Fiscal: " + fono.calcularNF());

        System.out.println("----------------------------------");

        System.out.println("\nInformações da TO");
        System.out.println(" Valor da sessão: R$" + to.getPreco());
        System.out.println(" Horas de sessão: " + to.getHoras());
        System.out.println(" Valor Total: R$" + to.calcularTotal());
        System.out.println(" Valor reembolso: R$" + to.calcularReembolso());
        System.out.println(" Sessões para Nota Fiscal: " + to.calcularNF());

        System.out.println("----------------------------------");
    }
}