import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CatalogoOfertas {
    private ArrayList<Oferta> lista;
    private static CatalogoOfertas mCatalogoOfertas;

    private CatalogoOfertas()
    {
        lista=new ArrayList<>();
    }

    public static CatalogoOfertas getCatalogoOfertas()
    {
        if(mCatalogoOfertas==null)
        {
            mCatalogoOfertas=new CatalogoOfertas();
        }
        return mCatalogoOfertas;
    }

    public void addOferta(Oferta pOferta)
    {
        lista.add(pOferta);
    }

    ///JAVA8///
    public void imprimirPosiblesDestinos(String pOrigen)
    {
        lista.stream().filter(o -> o.mismoOrigen(pOrigen)).map(Oferta::getDestino).forEach(System.out::println);
    }

    public void imprimirPosiblesDestinos2(String pOrigen)
    {
        lista.stream().filter(o -> o.mismoOrigen(pOrigen)).map(Oferta::getDestino).distinct().forEach(System.out::println);
    }

    public List<Oferta> getOfertasOrdenadasOrigen()
    {
        return lista.stream().sorted(Comparator.comparing(Oferta::ciudadOrigen)).collect(Collectors.toList());
    }

    public List<Oferta> getOfertasOrdenadasOrigenDestino()
    {
        return lista.stream().sorted(Comparator.comparing(Oferta::ciudadOrigen).thenComparing(Oferta::ciudadDestino)).collect(Collectors.toList());
    }

    public List<Oferta> ofertasConEstacion(String pCiudad)
    {
        return lista.stream().filter(o -> o.contieneEstacion(pCiudad)).collect(Collectors.toList());
    }

    public List<Oferta> buscarOfertas(String pOrigen, String pDestino)
    {
        return lista.stream().filter(o -> o.ciudadOrigen().equals(pOrigen)&&o.ciudadDestino().equals(pDestino)).sorted(Comparator.comparing(Oferta::costeViaje)).collect(Collectors.toList());
    }

    public Map<String, Oferta> getOfertaMinEstacionesPorOrigen()
    {
        return lista.stream().collect(Collectors.groupingBy(Oferta::ciudadOrigen, Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Oferta::numEstaciones)), p->p.get() )));
    }

    public Map<String, Integer> getMinEstacionesPorOrigen()
    {
        return lista.stream().collect(Collectors.groupingBy(Oferta::ciudadOrigen, Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Oferta::numEstaciones)), p->p.get().numEstaciones() )));
    }
}
