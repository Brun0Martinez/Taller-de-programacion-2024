package PRACTICA1;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
public class EJ4P1 {
    public static void main(String[] args) {
        // declaramos variables
        int dimF= 8;
        int dimC=4;
        int i;
        int j;
        int [][] matriz = new int [dimF][dimC];
        int piso;//fila
        int oficina;//columna
        //incializamos vector en 0
        for(i=0;i<dimF;i++){
            for(j=0;j<dimC;j++)
                matriz[i][j]=0;
        }
        //leer piso y oficina y sumarle en esa pos 
        System.out.println("Ingrese numero de piso, del 0 al 8");
        piso=Lector.leerInt();
        System.out.println("Ingrese numero de oficina,del 0 al 4");
        oficina=Lector.leerInt();
        while(piso != 8){
            matriz[piso--][oficina--]++;
            System.out.println("Ingrese numero de piso, del 0 al 8");
            piso=Lector.leerInt();
            System.out.println("Ingrese numero de oficina,del 0 al 4");
            oficina=Lector.leerInt();
        }
        for(i=0;i<dimF;i++){
            System.out.println("-");
            for(j=0;j<dimC;j++)
                System.out.print("("+i+","+j+")"+matriz[i++][j]+" | ");
        }
    }
}
