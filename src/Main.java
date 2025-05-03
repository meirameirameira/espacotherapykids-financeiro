import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o nome do paciente: ");
        String nome = sc.nextLine();

        System.out.println("\nDados de Fono");
        System.out.print(" Valor da sessão: R$");
        double fonoPreco = sc.nextDouble();
        System.out.print(" Horas de sessão: ");
        int fonoHoras = sc.nextInt();
        System.out.print(" Valor do reembolso: R$");
        double fonoReembolso = sc.nextDouble();

        Sessao fono = new Sessao(fonoPreco, fonoHoras, fonoReembolso);
        System.out.println("\nInformações da Fono");
        System.out.println(" Valor da sessão: R$" + fono.getPreco());
        System.out.println(" Horas de sessão: " + fono.getHoras());
        System.out.println(" Valor Total: R$" + fono.calcularTotal());
        System.out.println(" Valor do reembolso: R$" + fono.calcularReembolso());
        System.out.println(" Sessões para Nota Fiscal: " + fono.calcularNF());

        System.out.println("----------------------------------");

        System.out.println("\nDados de TO");
        System.out.print(" Valor da sessão: R$");
        double toPreco = sc.nextDouble();
        System.out.print(" Horas de sessão: ");
        int toHoras = sc.nextInt();
        System.out.print(" Valor do reembolso: R$");
        double toReembolso = sc.nextDouble();

        Sessao to = new Sessao(toPreco, toHoras, toReembolso);
        System.out.println("\nInformações da TO");
        System.out.println(" Valor da sessão: R$" + to.getPreco());
        System.out.println(" Horas de sessão: " + to.getHoras());
        System.out.println(" Valor Total: R$" + to.calcularTotal());
        System.out.println(" Valor reembolso: R$" + to.calcularReembolso());
        System.out.println(" Sessões para Nota Fiscal: " + to.calcularNF());

        System.out.println("----------------------------------");

        Paciente paciente = new Paciente(nome, fono, to);
        paciente.exibirInformacoes();

        //Paciente paciente = new Paciente(nome, fono, to);
    }
}
