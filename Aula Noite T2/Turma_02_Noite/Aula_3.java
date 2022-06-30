package Turma_02_Noite;

import java.util.Scanner;
// Faça um programa que 
//solicite a base e altura de um retângulo e informe sua área e perímetro.
public class Aula_3 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        boolean cafe;
        boolean xicara;
        // Soma: +
        // Subtração: -
        // Divisão: /
        // Multiplicação: *
        // Resto da divisão: %
        
        // Estruturas Condicionais

        //Switch case = Estrutura de casos
        int num = 0;

        System.out.println("Tarefas do dia a dia");
        System.out.println("Diga um numero de 1 a 3 e descubra sua tarefa: \t");
        num = input.nextInt();

        switch(num){
            case 1:
                System.out.println("Tomar banho");
                break;  
                
            case 2:
                System.out.println("Lavar o pé");
                break;

            case 3:
                System.out.println("Beber café");
                break;

            default:
                System.out.println("Não há resultados");
        } 

        // if = se
        // else if = senão se
        // else = senão
        
        /*
        System.out.println("Ta com a xícara?");
        xicara = input.nextBoolean();

        if(xicara == true){
            System.out.println("Tem café na xícara?");
            cafe = input.nextBoolean();
            if(cafe){
                System.out.println("Beber café!!!");
            }else{
                System.out.println("Fazer café!!!");
            }
            
        }else{
            System.out.println("Vá pegar a xícara!!!");
        }
        */


    }
}


/*
 Scanner input = new Scanner(System.in);
        String nome = "";
        double num1 = 0;
        double num2 = 0;
        double resultado = 0;

        System.out.println("Qual seu nome?");
        nome = input.nextLine();

        System.out.println(nome + ", iremos calcular a área e perímetro do retângulo!\n");

        System.out.println("Digite a base do retângulo:" );
        num1 = input.nextDouble();

        System.out.println("Digite a altura do retângulo:");
        num2 = input.nextDouble();

        resultado = num1*num2;

        System.out.println("Sua área é: "+String.format("%.3f", resultado));

        resultado = 2 * (num1 + num2);
        
        System.out.println("Seu perímetro é: "+String.format("%.3f", resultado));
*/