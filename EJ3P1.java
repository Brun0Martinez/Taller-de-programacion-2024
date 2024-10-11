package PRACTICA1;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
public class EJ3P1 {
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        int i,j;
        int dimF=5; 
        int dimC=5;
        int [][] vector = new int [dimF][dimC];
        int [] vector2 = new int [5];
        int sumaFila=0;
        int sumaColumna=0;
        int valor;
        int posI=0;
        int posJ=0;
        //fin declaracion variables;
        for (i=0;i<5;i++){
            for(j=0;j<5;j++)
                vector[i][j]=GeneradorAleatorio.generarInt(30)+1;
        }
        //mostrar el contenido de la matriz 
        for (i=0;i<5;i++){
            System.out.println("-");
            for(j=0;j<5;j++)
                System.out.print("("+i+","+j+")"+vector[i][j]+" | ");
        }
        System.out.println("-");
        //sumar elementos de la fila 1 
        for(j=0;j<5;j++){
            sumaFila=sumaFila+vector[1][j];
        }
        System.out.println("La suma de todos los elementos de la fila 1 es: "+sumaFila);
        //nuevo vector de 5 posiciones
        for(j=0;j<5;j++){
            for(i=0;i<5;i++)
                sumaColumna=sumaColumna+vector[i][j];
            vector2[j]=sumaColumna;
            sumaColumna=0;
        }
        for(j=0;j<5;j++){ 
            System.out.print(vector2[j]+"|");
        }
        System.out.println("- - - - - - ");
        System.out.println("Ingrese un valor a buscar en la matriz");
        valor=Lector.leerInt();
        for(i=0;i<5;i++){
            for(j=0;j<5;j++)
                if(valor == vector[i][j]){
                    posI=i;
                    posJ=j;
                }
        }
        if(vector[posI][posJ]==valor){
            System.out.println("El valor se encuentra en la posicion"+"("+posI+","+posJ+")");
        }
        else{ 
            System.out.println("No se encontro el elemento");
        }
    }
}