import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CatalogoOfertas {
    private ArrayList<Oferta> lista;
    private static CatalogoOfertas miCatalogoOfertas=null;

    private CatalogoOfertas()
    {
        lista=new ArrayList<>();
    }

    public static CatalogoOfertas getCatalogoOfertas()
    {
        if(miCatalogoOfertas==null)
        {
            miCatalogoOfertas=new CatalogoOfertas();
        }
        return miCatalogoOfertas;
    }

    public void addOfertas(Oferta pOferta)
    {
        lista.add(pOferta);
    }


    //1
    public void imprimirPosiblesDestinos(String pOrigen)
    {
        lista.stream().filter(o -> o.coincideOrigen(pOrigen)).map(Oferta::getDestino).forEach(System.out::println);
    }
    //2
    public void imprimirPosiblesDestinos2(String pOrigen)
    {
        lista.stream().filter(o -> o.coincideOrigen(pOrigen)).map(Oferta::getDestino).distinct().forEach(System.out::println);
    }
    //3
    public List<Oferta> getOfertasOrdenadasOrigen()
    {
        return lista.stream().sorted(Comparator.comparing(Oferta::getOrigen)).collect(Collectors.toList());
    }
    //4
    public List<Oferta> getOfertasOrdenadasOrigenDestino()
    {
        return lista.stream().sorted(Comparator.comparing(Oferta::getOrigen).thenComparing(Oferta::getDestino)).collect(Collectors.toList());
    }
    //5
    public List<Oferta> ofertasConEstacion(String pCiudad)
    {
        return lista.stream().filter(o -> o.contieneEstacion(pCiudad)).collect(Collectors.toList());
    }
    //6
    public List<Oferta> buscarOfertas(String pOrigen, String pDestino)
    {
        return lista.stream().filter(o -> o.coincideOrigen(pOrigen)&&o.coincideDestino(pDestino)).sorted(Comparator.comparing(Oferta::calcularCoste)).collect(Collectors.toList());
    }
    //7
    public Map<String, Oferta> getOfertaMinEstacionesPorOrigen()
    {
        return (Map<String, Oferta>) lista.stream().collect(Collectors.groupingBy(Oferta::getOrigen, Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Oferta::numeroEstaciones)), p->p.get())));
    }
    //8
    public Map<String, Integer> getMinEstacionesPorOrigen()
    {
        return lista.stream().collect(Collectors.groupingBy(Oferta::getOrigen, Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Oferta::numeroEstaciones)), p->p.get().numeroEstaciones())));
    }


}
