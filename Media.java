package br.com.rpires;

import java.util.Scanner;

public class Media {

    public static void main (String args[]) {

        Scanner s = new Scanner(System.in);

        System.out.println("---------Programa de avaliação-----------");
        System.out.println("Digite sua Primeira nota:");
        int nota1 = Integer.parseInt(s.next());
        System.out.println("Digite sua Segunda nota:");
        int nota2 = Integer.parseInt(s.next());
        System.out.println("Digite sua Terceira nota:");
        int nota3 = Integer.parseInt(s.next());
        System.out.println("Digite sua Quarta nota:");
        int nota4 = Integer.parseInt(s.next());
        int media = (nota1+nota2+nota3+nota4)/4;
        System.out.println("Sua media foi: " + media);

        if (media >=7){
            System.out.println("Parabéns, você foi Aprovado!!");
        } else if (media >=5) {
            System.out.println("Atenção, você ficou de recuperação.");
        } else {
                System.out.println("Você foi Reprovado!");
            }
        }
}


