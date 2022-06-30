package Turma_02_Noite;

import java.util.Scanner;

public class Aula_4 {
    public static void main(String[] args) {
        int i = 200, j = 0;
        boolean cafe = true;
        double x[][] = new double[i][j];
        Scanner input = new Scanner(System.in);
        
        //  Looping - While; Do While; For;
        cafe = true;
        
        while(cafe == true){
            System.out.println("Beber coof\t" + i);
            i++;

            System.out.println("Continuar = 1\t Parar = 0");
            j = input.nextInt();

            if(j == 0){
                cafe = false;
            }else{
                cafe = true;
            }

        }
       
/*
        while((i < 100) && (j ==0)){
            System.out.println("While:\t" + i);
            i++;
        }
        */
       
        
        

        
        
    //for( Valor inicial da sua variável de controle; Enquanto esse ciclo for irá repetir; A que irei adicionar na minha variável de controle ){}
        /*
        for(i = 0; i < 10; i++){
            System.out.println("Beber coof\t" + i);
        }
        */
        //Do{}while(); - PRONTO
        /*
        cafe = false;

        do{
                
            System.out.println("Beber coof\t" + i);
            i++;


        }while(cafe == true);

        System.out.println("!!FIM DA LINHA!!");
        */

        // While - PRONTO
        
        /*
        cafe = true;
        while(cafe == true){
            System.out.println("Beber coof\t" + i);
            i++;

            System.out.println("Continuar = 1\t Parar = 0");
            j = input.nextInt();

            if(j == 0){
                cafe = false;
            }else{
                cafe = true;
            }

        }
       

        while((i < 100) && (j ==0)){
            System.out.println("While:\t" + i);
            i++;
        }
        // for (Valor inicial; Valor limite da repetição; A que ela se soma){}
        j=0;
        i=0;
        for (i = 0; i < 700; i++) {
            for (j = 0; j < 2; j++){
                
                System.out.println(i + j);
            }
            
        }

        i = 80;

        if(i == 0){
            // condição 1
        }else if( i != 0 && i > 10){
            // falso
        }else{

        }
        */

        //Condições

        // && = e
        // || = ou
        // ! = not
        // ^^ =  xor
        // = = Igual(Atribuir Valor)
        // == = Igual(Comparativo)
        // != Diferente
        // > = Maior
        // >= = Maior igual
        // < = Menor
        // <= = Menor igual
    }
}
