//Faça um Programa que pergunte ao usuário um valor em metros e converta o valor digitado para centímetros.

import java.util.Scanner;

class exercicio5 {
  
  public static void main(String[] args) {

    
//variaveis
    double metro;
      double centimetro;

    //passo 1: adicionar numéro em metro
    System.out.println("valor em metro");
    
     Scanner teclado = new Scanner(System.in);
    metro = teclado.nextDouble();
    teclado.close();
  

    //passo 2: transformar numéro em centimetro
centimetro = metro * 100;
    
    //passo 3: mostrar pro usuario
System.out.println(centimetro + " cm");



    
  }
}