package clase4;
import java.util.Scanner;
public class Ejercicio10 {  
        public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            int num=0;        
            System.out.println("A continuacion debera ingresar 4 numeros de entre el 1 y el 20 ");
            int i = 0;
            for(int j=0; 4>j; j++){
                num = leer.nextInt();
                System.out.print(num+" ");
                for ( i=0 ; i< num ; i++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
}
