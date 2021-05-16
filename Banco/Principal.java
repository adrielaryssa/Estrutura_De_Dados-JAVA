package Banco;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayConta c = new ArrayConta();
        int opcao=0;
        do {
            System.out.println("...................MENU...................");
            System.out.println("Digite 1 para cadastrar a conta");
            System.out.println("Digite 2 para Listar as contas");
            System.out.println("Digite 3 para Encontrar a conta pelo nome:"); 
            System.out.println("..........................................");
            opcao=teclado.nextInt();
            switch(opcao){

                case 0: 
                    System.out.println("THE END");
                    break;
                case 1:
                    int nconta;
                    System.out.println("Quantas contas?");
                    nconta = teclado.nextInt();
                    for(int cont=  0; cont<nconta; cont++){
                    Conta x = new Conta();
                    String nome;
                    double valor;

                    System.out.println("Digite o nome:");
                    nome = teclado.next();
                    x.setNome(nome);
                    
                    System.out.println("Digite o valor:");
                    valor = teclado.nextDouble();
                    x.setValor(valor);
                    c.adicionar(nome, valor);
                    }
                    break;

                 
                case 2:
                    System.out.println("............LISTA............"); 
                    c.listar();
                    break;
                case 3:
                    
                    System.out.println("Digite o nome do titular: ");
                    Conta p = (Conta)c.procurarNome(teclado.next());
                    
                    System.out.println("Nome: " +p.getNome() + "\nValor:" +p.getValor());
                    break;

             }
        }while (opcao!=0);
    }
}