package PRACTICA1;
import PaqueteLectura.Lector;
public class EJ2P1 {
    public static void main(String[] args){
        int dimF= 5;
        double altura;
        double sumaProm =0;
        double prom;
        double [] vector = new double [dimF];
        int i;
        int cant=0;
        for(i=0;i<5;i++){
            System.out.println("Ingrese la altura del jugador "+i+" del equipo");
            altura=Lector.leerDouble();
            vector[i]=altura;
            sumaProm = sumaProm + vector[i];
        }
        prom = sumaProm / 5;
        for(i=1;i<5;i++){
            if(vector[i] > prom)
                cant++;      
        }
        for(i=0;i<5;i++){
            System.out.println("Altura del jugador"+ i +"es"+ vector[i]);
        }
        System.out.println("La altura promedio es"+prom);
        System.out.println("La cantidad de jugadores que superan la altura promedio es "+ cant);
    }
}
