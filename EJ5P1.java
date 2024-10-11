package PRACTICA1;
import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;
public class EJ5P1 {
    public static void main(String[] args) {
        //declaramos las variables
        int dimF=5; int dimC=4;
        int i; int j;
        int [][] matriz= new int [dimF][dimC];
        int suma=0;
        int promedio;
        GeneradorAleatorio.iniciar();
        //cargamos la matriz leyendo opiniones
        for(i=0;i<dimF;i++){
            for(j=0;j<dimC;j++){
            System.out.println("Ingrese la opinion del cliente del 1 al 10: "+i+" para el aspecto: "+j);
            matriz[i][j]=GeneradorAleatorio.generarInt(10);
            }     
	}
	for(i=0;i<dimF;i++){
            System.out.println("-");
            for(j=0;j<dimC;j++){
                System.out.print("("+i+","+j+")"+matriz[i][j]+" | ");
	    }
	}
        for(j=0;j<dimC;j++){
            for(i=0;i<dimF;i++){
                suma=matriz[i][j]+suma;
            }
            promedio=suma/dimF;
            suma=0;
            System.out.println("-");
            System.out.println("La clasificacion promedio obtenida en el aspecto: "+j+" es: "+promedio); 
        }
    }
}
