public class main {
    static int index=0;

    private static void printEjercicio()
    {
        System.out.println("===EJERCICIO "+ ++index +"===");;
    }

    public static void main(String[] args) {
        //ESTACIONES
        Estacion e1,e2,e3,e4,e5,e6,e7,e8,e9;
        e1=new Estacion("Bilbao", 8);
        e2=new Estacion("Basauri", 3);
        e3=new Estacion("Arrigorriaga", 2);
        e4=new Estacion("Miraballes", 3);
        e5=new Estacion("Areta", 4);
        e6=new Estacion("Llodio", 5);
        e7=new Estacion("Luyando", 3);
        e8=new Estacion("Amurrio", 6);
        e9=new Estacion("Orduña", 8);
        

        //OFERTAS
        Oferta o1,o2,o3,o4,o5;
        o1=new Oferta(e1,e9);
        o1.addEstacion(e2);o1.addEstacion(e3);o1.addEstacion(e4);o1.addEstacion(e5);o1.addEstacion(e6);o1.addEstacion(e7);o1.addEstacion(e8);

        o2=new Oferta(e1,e6);
        o2.addEstacion(e2);o2.addEstacion(e3);o2.addEstacion(e4);o2.addEstacion(e5);

        o3=new Oferta(e1,e9);

        o4=new Oferta(e6,e9);
        o4.addEstacion(e7);o4.addEstacion(e8);

        o5=new Oferta(e3, e4);
        //CATALOGO
        CatalogoOfertas co = CatalogoOfertas.getCatalogoOfertas();
        co.addOfertas(o1);
        co.addOfertas(o2);
        co.addOfertas(o3);
        co.addOfertas(o4);
        co.addOfertas(o5);


        //PRUEBAS
        //1
        printEjercicio();
        co.imprimirPosiblesDestinos("Bilbao");
        //2
        printEjercicio();
        co.imprimirPosiblesDestinos2("Bilbao");
        //3
        printEjercicio();
        co.getOfertasOrdenadasOrigen().forEach(System.out::println);
        //4
        printEjercicio();
        co.getOfertasOrdenadasOrigenDestino().forEach(System.out::println);
        //5
        printEjercicio();
        co.ofertasConEstacion("Miraballes").forEach(System.out::println);
        //6
        printEjercicio();
        co.buscarOfertas("Bilbao", "Orduña").forEach(System.out::println);
        //7
        printEjercicio();
        co.getOfertaMinEstacionesPorOrigen().entrySet().forEach(entry->System.out.println(entry.getKey()+": "+entry.getValue()));
        //8
        printEjercicio();
        co.getMinEstacionesPorOrigen().entrySet().forEach(entry->System.out.println(entry.getKey()+": "+entry.getValue()));
    }
}
