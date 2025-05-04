import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o nome do paciente: ");
        String nome = sc.nextLine();

        int op;
        Sessao fono = null;
        Sessao to = null;

        do {
            System.out.println("\nEscolha uma opção: \n1-Fono \n2-TO \n3-ABA \n4-Exibir Informações \n0-Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\nDados de Fono:");
                    System.out.print(" Valor da sessão: R$");
                    double fonoPreco = sc.nextDouble();
                    System.out.print(" Horas de sessão: ");
                    int fonoHoras = sc.nextInt();
                    System.out.print(" Valor do reembolso: R$");
                    double fonoReembolso = sc.nextDouble();

                    fono = new Sessao(fonoPreco, fonoHoras, fonoReembolso);
                    System.out.println("\nInformações da Fono:");
                    System.out.println(" Valor da sessão: R$" + fono.getPreco());
                    System.out.println(" Horas de sessão: " + fono.getHoras());
                    System.out.println(" Valor Total: R$" + fono.calcularTotal());
                    System.out.println(" Valor do reembolso: R$" + fono.calcularReembolso());
                    System.out.println(" Sessões para Nota Fiscal: " + fono.calcularNF());

                    break;
                case 2:
                    System.out.println("\nDados de TO:");
                    System.out.print(" Valor da sessão: R$");
                    double toPreco = sc.nextDouble();
                    System.out.print(" Horas de sessão: ");
                    int toHoras = sc.nextInt();
                    System.out.print(" Valor do reembolso: R$");
                    double toReembolso = sc.nextDouble();

                    to = new Sessao(toPreco, toHoras, toReembolso);
                    System.out.println("\nInformações da TO:");
                    System.out.println(" Valor da sessão: R$" + to.getPreco());
                    System.out.println(" Horas de sessão: " + to.getHoras());
                    System.out.println(" Valor Total: R$" + to.calcularTotal());
                    System.out.println(" Valor reembolso: R$" + to.calcularReembolso());
                    System.out.println(" Sessões para Nota Fiscal: " + to.calcularNF());

                    break;
                case 3:
                    System.out.println("Indisponível no momento.");

                    break;
                case 4:
                    if (fono != null && to != null) {
                        Paciente paciente = new Paciente(nome, fono, to);
                        paciente.exibirInformacoes();
                    } else {
                        System.out.println("Você precisa preencher as sessões de Fono e TO antes.");
                    }

                    break;
                case 0:
                    System.out.println("Finalizando programa.");

                    break;
            }
           }while (op != 0);
                sc.close();
    }
}
