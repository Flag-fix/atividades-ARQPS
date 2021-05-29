package br.com.ifpr.atividade;

import java.util.Scanner;

import br.com.ifpr.atividade.model.Agenda;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Agenda ag = new Agenda();
		 Scanner sc = new Scanner(System.in);

	        while(true) {
	            while(true) {
	                System.out.println("##-- Seja Bem Vindo ao Sistema de Agenda--##\n\n");
	                System.out.println("|-----------------------------------------------------------------|");
	                System.out.println("| 1 >>> Cadastro uma Agenda Nova				                  |");
	                System.out.println("| 2 >>> Buscar Contatos da Agenda por Nome                        |");
	                System.out.println("| 3 >>> Remover Contato    										  |");
	                System.out.println("| 5 >>> Sair                                                      |");
	                System.out.println("|-----------------------------------------------------------------|");
	                int opcao = sc.nextInt();
	                switch(opcao) {
	                case 1:
            			System.out.println("Insira um Nome: ");
            			String nome = sc.next();
            			System.out.println("Insira um N�mero: ");
            			String numero= sc.next();
            			System.out.println("Insira um Email: ");
            			String email= sc.next();
            			ag.inserir(nome, numero, email);
	                    break;
	                case 2:
	                    System.out.println("Informe Um Nome a Ser Pesquisado");
            			String nomesearch = sc.next();
	                    ag.buscarPorNome(nomesearch);
	                    break;
	                case 3:
	                	System.out.println("Informe Um Nome a Ser Pesquisado");
            			String nomeRemove = sc.next();
	                    ag.removerContato(nomeRemove);
	                    break;
	                case 4:
	                    System.out.println("Teste 4");
	                    break;
	                case 5:
	                    System.out.println("\n At� Logo! ;-)");
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("\nOp��o Inv�lida!\n\n");
	                }
	            }
	        }

	}

}
