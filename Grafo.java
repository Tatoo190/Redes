package Grafo;
import Algoritmo_Dijkstra.DJ;
import java.util.Scanner;

public class Grafo {
    public static int[][] Grafo() {
        int vertices;//tamaño del arreglo bidimensional
        System.out.println("Ingrese el numero de vertices: ");
        Scanner entrada=new Scanner(System.in);
        vertices= entrada.nextInt();
        int[][] grafo=new int[vertices][vertices];
        for(int m=0;m<vertices;m++){
            for(int k=0;k<vertices;k++){
                grafo[m][k]=999999;
            }
        }
        System.out.println("Ingrese el numero de aristas: ");
        int aristas=entrada.nextInt();
        String saltoDeLinea = entrada.nextLine();
        int[] val=new int[3];
        for(int i=0;i<aristas;i++){
            System.out.println("Ingrese el vertice de origen, destino y valor: ");
            String valores=entrada.nextLine();
            String[] s=valores.split(",");
            val[0]=Integer.parseInt(s[0]);
            val[1]=Integer.parseInt(s[1]);
            val[2]=Integer.parseInt(s[2]);
            grafo[val[0]][val[1]]=val[2];
        }
        return grafo;
    }
    public static void main(String[] args) {
        int[][] grafo=Grafo();
        System.out.println("Vertice de origen: ");
        Scanner entrada=new Scanner(System.in);
        int origen=entrada.nextInt();
        DJ camino=new DJ(grafo,origen,grafo.length);
        camino.Dijsktra();
    }
}
