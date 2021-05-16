
package Clinica;

import java.util.Scanner;

public class Principal {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ColecaoPaciente cadast = new ColecaoPaciente();
        int opcao=0;
        do {
            System.out.println("...................MENU...................");
            System.out.println("Digite 1 para Cadastrar o Paciente:");
            System.out.println("Digite 2 para Listar o Paciente:");
            System.out.println("Digite 3 para Encontrar o Paciente:"); 
            System.out.println("..........................................");
            opcao=teclado.nextInt();
            switch(opcao){

                case 0: 
                    System.out.println("THE END");
                    break;
                case 1:
                    Paciente op = new Paciente();

                    System.out.println("Digite o nome:");
                    op.setNome(teclado.next());
                    System.out.println("Digite o RG:");
                    op.setRg(teclado.next());

                    System.out.println("Digite a idade:");
                    op.setIdade(teclado.next());
             
                    cadast.cadastrarPaciente(op);
                 break;
                 
                case 2:
                    System.out.println("............LISTA............"); 
                    cadast.listarPaciente();
                    break;
                case 3:
                    System.out.println("Digite a posição do paciente: ");
                    int posicao = teclado.nextInt();
                    cadast.procurarPaciente(posicao);
                    
                 
         
             }
        }while (opcao!=0);
    }
}