import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArticulosRecibidos {
    private ArrayList<Articulo> listaArticulos;
    private static ArticulosRecibidos mArticulosRecibidos;

    private ArticulosRecibidos()
    {
        listaArticulos=new ArrayList<>();
    }

    public static ArticulosRecibidos gArticulosRecibidos()
    {
        if(mArticulosRecibidos==null)
        {
            mArticulosRecibidos=new ArticulosRecibidos();
        }
        return mArticulosRecibidos;
    }

    public void addArticulo(Articulo pArticulo)
    {
        listaArticulos.add(pArticulo);
    }

    //////////////JAVA8////////////////
    //1
    public List<Articulo> ordenadosPorNacionalidadesDistintas()
    {
        return listaArticulos.stream().sorted(Comparator.comparing((Articulo a) -> a.contarNacionalidadesDistintas()).reversed()).collect(Collectors.toList());
    }
    //2
    public List<Articulo> ordenadosPorNacionalidadesDistintasYEdad()
    {
        return listaArticulos.stream().sorted(Comparator.comparing(Articulo::contarNacionalidadesDistintas).reversed().thenComparing(Articulo::mediaEdadAutores)).collect(Collectors.toList());
    }
    //5
    public Map<Boolean, Long> getNumPublicacionesAutorSoloYVarios()
    {
        return listaArticulos.stream().collect(Collectors.groupingBy(Articulo::unicoAutor, Collectors.counting()));
    }
}
