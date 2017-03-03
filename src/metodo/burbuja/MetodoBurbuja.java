/**
 * @version 1.0
 * @author Duvan Poveda, David Jimenez
 */
package metodo.burbuja;
import java.util.Scanner;
public class MetodoBurbuja {

    public static void crearVect(){                          //creamos el metodo para crear el vector
        Scanner teclado= new Scanner(System.in);             //llamamos el scanner para recibir por teclado
        byte tamaño, i, j;
        System.out.println("ingrese el tamaño del vector a ordenar: ");         //solicitamos el tamaño del vector a ordenar
        tamaño = teclado.nextByte();
        int vector[]=new int[tamaño];                                       //creamos el vector
        for(i=0; i<tamaño; i++){
            System.out.print("ingrese el dato de la posicion " + i + ":  ");        //solicitamos los datos que se desean ordenar
            vector[i]= teclado.nextInt();
        }
        System.out.println("este es el vector desordenado : ");                    //imprimimos el vector lleno
        for(i=0; i<tamaño; i++){
            System.out.print(" " +vector[i] +" ");
        }
        System.out.println();
        ordenVect(vector);                              //llamamos el metodo para ordenar el vector
    }
    public static void ordenVect(int vector[]){                     //creamos el metodo que ordena el vector
         byte i, j;
         int aux;
        for(i=0;i<vector.length-1;i++)                               //recorremos el vector y lor ordenamos con el metodo burbuja
              for(j=0;j<vector.length-i-1;j++)
                   if(vector[j+1]<vector[j]){
                      aux= vector[j+1];                               //usamos una variable auxiliar para cambiar de posicion los datos del vector sin perderlos
                      vector[j+1]=vector[j];
                      vector[j]=aux;
                   }
        System.out.println("este es el vector ordenado : ");               //finalmente imprimimos el vector ya ordenado
        for(i=0; i<vector.length; i++){
            System.out.print(" " +vector[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       crearVect();                                                    //llamamos el metodo de crear vector en nuestra funcion principal
    }
    
}
