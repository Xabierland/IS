public class main {
    private static int index=0;
    
    private static void printCabecera()
    {
        System.out.println("===EJERCICIO "+ ++index +"===");
    }
    public static void main(String[] args) {
        ////////////////////////////AUTOR//////////////////////////////////
        Autor a1,a2,a3,a4,a5;
        a1=new Autor("Autor1", "España", "UPV", 36);
        a2=new Autor("Autor2","Argentina","UPV",28);
        a3=new Autor("Autor3","Mexico","UPV",18);
        a4=new Autor("Autor4","Francia","UPV",20);
        a5=new Autor("Autor5","Alemania","UPV",68);
    
        ////////////////////////////ARTICULO//////////////////////////////////
        Articulo ar1,ar2,ar3,ar4;
        ar1=new Articulo("Articulo1", "Fichero1");
        ar1.addAutor(a1);ar1.addAutor(a2);
        ar1.addTemas("Tema1");
        ar2=new Articulo("Articulo2", "Fichero1");
        ar2.addAutor(a3);ar2.addAutor(a4);
        ar2.addTemas("Tema2");
        ar3=new Articulo("Articulo3", "Fichero2");
        ar3.addAutor(a5);
        ar3.addTemas("Tema3");
        ar4=new Articulo("Articulo4", "Fichero3");
        ar4.addAutor(a1);ar4.addAutor(a2);ar4.addAutor(a3);ar4.addAutor(a4);ar4.addAutor(a5);
        ar4.addTemas("Tema1");ar4.addTemas("Tema2");ar4.addTemas("Tema3");

        ////////////////////////////ARTICULO_RECIBIDO//////////////////////////////////
        ArticulosRecibidos la=ArticulosRecibidos.getArticulosRecibidos();
        la.addArticulo(ar1);la.addArticulo(ar2);la.addArticulo(ar3);la.addArticulo(ar4);

        ///////////////////////////////REVISOR_AUTOMATICO/////////////////////////////
        RevisorAutomatico r1,r2,r3;
        r1=new RevisorAutomatico("1");
        r1.addTemas("Tema1");
        r2=new RevisorAutomatico("2");
        r2.addTemas("Tema1");r2.addTemas("Tema2");
        r3=new RevisorAutomatico("3");
        r3.addTemas("Tema1");r3.addTemas("Tema2");r3.addTemas("Tema3");

        /////////////////////////////REVISORES_AUTOMATICOS//////////////////////////////
        RevisoresAutomaticos ra=RevisoresAutomaticos.gRevisoresAutomaticos();
        ra.addRevisores(r1);ra.addRevisores(r2);ra.addRevisores(r3);


        //////////////////////////////////////////////////////////////////
        /////////////////////////////PRUEBAS//////////////////////////////
        //1
        printCabecera();
        la.ordenadosPorNacionalidadesDistintas().forEach(System.out::println);
        //2
        printCabecera();
        la.ordenadosPorNacionalidadesDistintasYEdad().forEach(System.out::println);
        //3
        printCabecera();
        System.out.println("Revisor 1");
        System.out.println("\t"+r1.obtPorcentajeTemasExperto(ar1));
        System.out.println("\t"+r1.obtPorcentajeTemasExperto(ar2));
        System.out.println("\t"+r1.obtPorcentajeTemasExperto(ar3));
        System.out.println("\t"+r1.obtPorcentajeTemasExperto(ar4));
        System.out.println("Revisor 2");
        System.out.println("\t"+r2.obtPorcentajeTemasExperto(ar1));
        System.out.println("\t"+r2.obtPorcentajeTemasExperto(ar2));
        System.out.println("\t"+r2.obtPorcentajeTemasExperto(ar3));
        System.out.println("\t"+r2.obtPorcentajeTemasExperto(ar4));
        System.out.println("Revisor 3");
        System.out.println("\t"+r3.obtPorcentajeTemasExperto(ar1));
        System.out.println("\t"+r3.obtPorcentajeTemasExperto(ar2));
        System.out.println("\t"+r3.obtPorcentajeTemasExperto(ar3));
        System.out.println("\t"+r3.obtPorcentajeTemasExperto(ar4));
        //4
        printCabecera();
        System.out.println("Articulo 1");
        ar1.obtPosibleRevisores().forEach(System.out::println);
        System.out.println("Articulo 2");
        ar2.obtPosibleRevisores().forEach(System.out::println);
        System.out.println("Articulo 3");
        ar3.obtPosibleRevisores().forEach(System.out::println);
        System.out.println("Articulo 4");
        ar4.obtPosibleRevisores().forEach(System.out::println);
        //5
        printCabecera();
        la.getNumPublicacionesAutorSoloYVarios().entrySet().forEach(entry -> System.out.println("\t"+entry.getKey()+": "+entry.getValue()));
    }
}
