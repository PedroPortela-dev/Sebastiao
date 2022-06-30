package Turma_02_Noite;

import java.util.Scanner;
// Faça um programa que 
//solicite a base e altura de um retângulo e informe sua área e perímetro.
public class TestandoCodigos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Diga a posição:");
        byte n = input.nextByte();

        long r = (long)((Math.pow((1+Math.sqrt(5)) /2,n) - Math.pow((1-Math.sqrt(5)) /2,n)) / Math.sqrt(5));

        System.out.println("Posição "+n+ " Valor "+r);
            
    }
}

        /*
        
        double a,b,end;
        String op;

        System.out.println("Bem vindo a calculadoraaa");
        System.out.println("Escolha o primeiro número a calcular");
        a = input.nextDouble();

        System.out.println("Escreva o segundo número a calcular");
        b = input.nextDouble();

        System.out.println("Escreva que operação você ira utilizar:");
        System.out.println("Opções: \n[+]\tadicao\n[-]\tsubtracao\n[*]\tmultiplicacao\n[/]\tdivisao\n[%]\tdivisao com resto");
        System.out.println("Digite o simbolo da operação:");
        op = input.next();
        
        end = 0;
        switch(op){
            case "+":
                end = a + b;
                break;
            case "-":
                end = a - b;
                break;
            case "*":
                end = a * b;
                break;
            case "%":
                end = a % b;
                break;
            case "/":
                end = a / b;
                break;
                
            default:
                System.out.println("Erro, por favor reinicie");
                break;
        }
        
        System.out.println("Resultado:" + end);
        */
            /*
            // Numero maximo numero minimo (quis não usar o Math.max pq não teria graça)

            double x, y, num;

            // Recendo valor de X
            System.out.println("Coloque o valor de X: ");
            x = input.nextDouble();

            // Recendo valor de Y
            System.out.println("Coloque o valor de Y: ");
            y = input.nextDouble();
            
            System.out.println("Inicial");
            System.out.println("X = "+x);
            System.out.println("Y = "+y);
            
            num = x;
            x = y;  
            y = num;

            System.out.println("\nTrocado");
            System.out.println("X = "+x);
            System.out.println("Y = "+y);
            */


            /*
            System.out.println("Bem vindo ao medidor de números :)");
            
            // Primeiro número
            System.out.println("Insira o primeiro valor:");
            double a = input.nextDouble();
            
            // Segundo número
            System.out.println("Insira o segundo valor:");
            double b = input.nextDouble();

            // a = b; // atribuição
            // a == b; // comparação

            if(a > b){ //Verificação se o primeiro é maior que o segundo
                System.out.println(a +" é maior que " + b);
            }else if(a < b){ //Verificação se o segundo é maior que o primeiro
                System.out.println(b +" é maior que " + a);
            }else if(a == b){ //Verificação para caso os dois sejam iguais
                System.out.println("Os dois são iguais!");
            }
            */
            //Formula de fibonacci
    
            /*
            System.out.println("Fibonacci maker");
            System.out.println("Coloque o número:");
            double num = input.nextDouble();
            double fib1 = Math.pow((1 + Math.sqrt(5)) / 2,num);
            double fib2 = Math.pow((1 - Math.sqrt(5)) / 2,num);
            double fibF = ( fib1- fib2 ) / Math.sqrt(5);
            System.out.println("O valor de fibonacci é: " + fibF);
            */
    
            // Numero maximo numero minimo (quis não usar o Math.max pq não teria graça)
            
            /*
            System.out.println("Bem vindo ao medidor de números :)");
            System.out.println("Insira o primeiro valor:");
            // Primeiro número
            double a = input.nextDouble();
            System.out.println("Insira o segundo valor:");
            // Segundo número
            double b = input.nextDouble();
            if(a > b){ //Verificação se o primeiro é maior que o segundo
                System.out.println(a +" é maior que " + b);
            }else if(a < b){ //Verificação se o segundo é maior que o primeiro
                System.out.println(b +" é maior que " + a);
            }else if(a == b){ //Verificação para caso os dois sejam iguais
                System.out.println("Os dois são iguais!");
            }
            */
    
            // Sistema de inversão
            /*
            String a,b,temp; //Variaveis que vão ser utilizadas
    
            System.out.println("Bem vindo ao Ultra Mega Inversor 3000K!");
    
            System.out.println("Escolha o primeiro elemento a ser invertido: ");
            a = input.nextLine(); //Input do primeiro elemento
            System.out.println("Escolha o segundo elemento a ser invertido: ");
            b = input.nextLine(); //Input do segundo elemento
            
            // Calculadoraaa
    
            double a,b,end;
            String op;
    
            System.out.println("Bem vindo a calculadoraaa");
            System.out.println("Escolha o primeiro número a calcular");
            a = input.nextDouble();
    
            System.out.println("Escreva o segundo número a calcular");
            b = input.nextDouble();
    
            System.out.println("Escreva que operação você ira utilizar:");
            System.out.println("Opções: adição, subtração, mutiplicação, divisão, divisão com resto");
            op = input.next();
            
            switch(op){
                case "adição":
                end = a + b;
                System.out.println("Resultado:" + end);
                break;
                case "subtração":
                end = a - b;
                System.out.println("Resultado:" + end);
                break;
                case "mutiplicação":
                end = a * b;
                System.out.println("Resultado:" + end);
                break;
                case "divisão com resto":
                System.out.println("Resultado do resto" + a % b);
                case "divisão":
                end = a / b;
                System.out.println("Resultado:" + end);
                break;
                case default: //ta dando o erro ( The preview feature Pattern Matching in Switch is only available with source level 17 and aboveJava(4195409))
                
                System.out.println("Erro, por favor reinicie");
                break;
                
            }
    
            temp = a; //Aqui atribuimos o valor de "a" a variavel "temp"
            a = b; //Aqui deletamos o valor atribuido anteriormente a "a", colocando o valor de b no lugar
            b = temp; //Aqui pegamos o valor de "b" e deletamos, colocando o valor de temp, variavel que tinha armazenado o valor de "a"
            System.out.println("Resultados: ");
            System.out.println("Primeiro valor: " + a);
            System.out.println("Segundo valor: " + b);
            
            */


/*
        Scanner input = new Scanner(System.in);
        String nome = "";
        double num1 = 0;
        double num2 = 0;
        double resultado = 0;

        System.out.println("Digite a base do retângulo:" );
        num1 = input.nextDouble();

        System.out.println("Digite a altura do retângulo:");
        num2 = input.nextDouble();

        resultado = num1*num2;

        System.out.println("Sua área é: " + resultado);

        resultado = 2 * (num1 + num2);
        
        System.out.println("Seu perímetro é: " + resultado); 
        
//=================================================================================

        Scanner imput= new Scanner(System.in);
        float base = 0;
        float altura = 0;
        float area = 0;
        float perimetro = 0;
    
        System.out.println("Por favor escreva o número da base do seu retângulo ");
        base = imput.nextFloat();
    
        System.out.println("Por favor escreva o número da altura do seu retângulo ");
        altura = imput.nextFloat();
    
        area = base * altura;
    
        System.out.println("O resultado da área do seu retangulo é ");
        perimetro = 2*(base + altura);
        System.out.println("A área do seu retângulo é " + String.format("%.0f", base) + " e o perimetro do seu retângulo é " + String.format("%.0f", altura));
    
        
        */