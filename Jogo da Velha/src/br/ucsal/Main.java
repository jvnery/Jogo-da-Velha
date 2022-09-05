package br.ucsal;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JogoDaVelha main = new JogoDaVelha();
        String posicao;
        int valida = 0, Jogadas = 0;
        
        while(true){
            System.out.println("====== JOGO DA VELHA ======");
            main.Mostrar();
            
            do{
                System.out.println("Jogador 1, informe uma posicao: ");
                posicao = sc.next();
                while(!main.Valido(posicao)){
                    System.out.println("Jogada inválida!");
                    System.out.println("Jogador 1, informe uma posicao: ");
                    posicao = sc.next();
                    valida = 0;
                }
                main.Jogada(posicao, "X");
                valida = 1;
                
            }while(valida == 0);
            
            Jogadas++;
            valida = 0;
            main.Mostrar();
            if(!main.Ganhou(Jogadas).equals("null")){
                break;
            }
            
            
            do{
                System.out.println("Jogador 2, informe uma posicao: ");
                posicao = sc.next();
                while(!main.Valido(posicao)){
                    System.out.println("Jogada inválida!");
                    System.out.println("Jogador 2, informe uma posicao: ");
                    posicao = sc.next();
                    valida = 0;
                }
                main.Jogada(posicao, "O");
                valida = 1;
                
            }while(valida == 0);
            
            Jogadas++;
            valida = 0;
            main.Mostrar();
            if(!main.Ganhou(Jogadas).equals("null")){
                break;
            }
            
        }
        System.out.println("O "+main.Ganhou(Jogadas)+ " venceu!");
    }
}
