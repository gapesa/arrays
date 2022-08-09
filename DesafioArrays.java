import java.util.Arrays;
import java.util.Scanner;

public class DesafioArrays {
   public static void main(String[] args) {
	   
	
	Scanner entrada = new Scanner(System.in);
	System.out.println("Quantas notas deseja informar? ");
	int notas = entrada.nextInt();
		
	double[] Notas1 = new double[notas];
    for( int i = 0; i < Notas1.length; i++) {
		System.out.print("Digite a nota " +( i + 1) + ": ");
		Notas1[i] = entrada.nextDouble();
	}
	
   double total = 0;
   for(double nota2: Notas1) {
	total +=nota2;   
   }
   
    System.out.println("A sua média final é : " + total/Notas1.length);
    entrada.close();
		   
   }  
}

