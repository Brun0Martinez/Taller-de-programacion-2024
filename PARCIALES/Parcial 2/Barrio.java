package parciales.PARCIAL3;
public class Barrio {
    private String nombreBarrio;
    private Lote [][] matrizLote;
    private int dimFila;
    private int dimColumna;
    
    //constructor
    public Barrio(String nombre, int cantidadManzanas, int cantidadLotesXManzana){
        this.nombreBarrio=nombre;
        this.dimFila=cantidadManzanas;
        this.dimColumna=cantidadLotesXManzana;
        matrizLote= new Lote[cantidadManzanas][cantidadLotesXManzana];    
        
        //inicializamos matriz lotes
        for(int i=0;i<this.dimFila;i++){
            for(int j=0;j<this.dimColumna;j++)
                matrizLote[i][j]= new Lote();
        }            
    }
    public int getDimColumna() {
        return dimColumna;
    }

    public int getDimFila() {
        return dimFila;
    }
     public String getNombreBarrio() {
        return nombreBarrio;
    }
    public void agregarComprador(int dni, String nombre, String ciudad, int manzanaX, int loteY){
        matrizLote[manzanaX-1][loteY-1].agregarComprador(dni, nombre,ciudad);           
    }
    public void incrementarPrecioLotes(int manzana, double porcentaje){
        for(int j=0;j<this.dimColumna;j++){
            if(matrizLote[manzana][j].getComprador()==null)
                matrizLote[manzana][j].setPrecio(matrizLote[manzana][j].getPrecio()*(1 + porcentaje / 100.0));
        }
    }
    public double totalRecaudado(){
        double total=0.0;
        for(int i=0;i<this.dimFila;i++){
            for(int j=0;j<this.dimColumna;j++)
                if(matrizLote[i][j].getComprador()!=null)
                    total=total+matrizLote[i][j].getPrecio();
        }
        return total;
    }
    @Override
    public String toString(){
        String aux= "Barrio: "+ getNombreBarrio()+
                    " Recaudacion total: "+ totalRecaudado();
                    for(int i=0;i<this.dimFila;i++){
                        for(int j=0;j<this.dimColumna;j++){
                            aux=aux+"Manzana#"+i+
                                   " -Lote "+j+" "+matrizLote[i][j].getPrecio()+"";
                            if(matrizLote[i][j].getComprador()!=null)
                                aux=aux+matrizLote[i][j].getComprador().toString();
                            else 
                                aux=aux+"Disponible para la venta";
                        }
                    }
        return aux;
    }
}
