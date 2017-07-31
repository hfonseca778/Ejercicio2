/**
 * SERIE DE EJERCICIOS DE PROGRAMACION BASICA No. 1
 * Ejercicio 2: Suma de 3 números
 * @author hfonseca778
 * @version 30-07-2017
 */
import java.util.Scanner;
public class suma
{
    public static void main(String [] args)
    {
        Scanner reader = new Scanner(System.in);
    
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        int x=0;
        
        System.out.println("Introduce el primer número: ");			
        numero1=reader.nextInt();
 
        System.out.println("Introduce el segundo número: ");
        numero2 = reader.nextInt();
        
        System.out.println("Introduce el tercer número: ");
        numero3  = reader.nextInt();
        
        x=numero1+numero2+numero3;
        
        System.out.println("La suma de " + numero1 + " + " + numero2 + " + " + numero3 + " es " + x);
        
    }

    
}
