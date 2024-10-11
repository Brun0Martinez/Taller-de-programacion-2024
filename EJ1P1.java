package PRACTICA1;

//aca definir los paquetes que vamos a usar 
import PaqueteLectura.GeneradorAleatorio;

public class EJ1P1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        int num= 1+GeneradorAleatorio.generarInt(11);
        int DF=11;  
        int [] tabla2 = new int[DF]; // indices de 0 a 10
        int i;
        for (i=0;i<DF;i++){ 
            tabla2[i]=2*i;
        }
        while(num != 11){
            System.out.print(num + " x2");
            System.out.println("="+tabla2[num]);
            num=GeneradorAleatorio.generarInt(11)+1;
        }
    }
}
//recorro vector 
  //realizo multiplicacion por cada pos
//leo un numero 
//si no es 11 
//  muestro resultado de multiplicacion con valor[num]