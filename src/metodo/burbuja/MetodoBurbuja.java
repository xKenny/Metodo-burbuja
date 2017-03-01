
package metodo.burbuja;
import java.util.Scanner;
public class MetodoBurbuja {

    public static void crearVect(){
        Scanner teclado= new Scanner(System.in);
        byte tamaño, i, j;
        System.out.println("ingrese el tamaño del vector a ordenar: ");
        tamaño = teclado.nextByte();
        int vector[]=new int[tamaño];
        for(i=0; i<tamaño; i++){
            System.out.print("ingrese el dato de la posicion " + i + ":  ");
            vector[i]= teclado.nextInt();
        }
        System.out.println("este es el vector desordenado : ");
        for(i=0; i<tamaño; i++){
            System.out.print(" " +vector[i] +" ");
        }
        System.out.println();
        ordenVect(vector);
    }
    public static void ordenVect(int vector[]){
         byte i, j;
         int aux;
        for(i=0;i<vector.length-1;i++)
              for(j=0;j<vector.length-i-1;j++)
                   if(vector[j+1]<vector[j]){
                      aux= vector[j+1];
                      vector[j+1]=vector[j];
                      vector[j]=aux;
                   }
        System.out.println("este es el vector ordenado : ");
        for(i=0; i<vector.length; i++){
            System.out.print(" " +vector[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       crearVect();
    }
    
}
