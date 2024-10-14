package parciales.PARCIAL3;
public class Parcial3 {
    public static void main(String[] args) {
        Barrio barrio= new Barrio("Los Teros",6,9);
        barrio.agregarComprador(4543545,"Pedro","Laplata",3,4);
        barrio.agregarComprador(23232232,"jose","berazategui",2,1);
        barrio.agregarComprador(675465,"carlos","sanvicente",3,4);
        barrio.agregarComprador(322432,"raul","mardelplata",4,8);
        barrio.agregarComprador(65656,"bruno","dolores",6, 1);
        barrio.agregarComprador(324242,"raul","claromeco",1, 1);
        barrio.agregarComprador(324242,"raul","canning",2, 3);
        barrio.agregarComprador(121232,"Joaquin","ensenada",6,9);
        barrio.incrementarPrecioLotes(2,20);
        System.out.print(barrio.toString());
    }
}
