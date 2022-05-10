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

    public static ArticulosRecibidos getArticulosRecibidos()
    {
        if(mArticulosRecibidos==null)
        {
            mArticulosRecibidos=new ArticulosRecibidos();
        }
        return mArticulosRecibidos;
    }

    public void addArticulo(Articulo pArticulo) {
        listaArticulos.add(pArticulo);
    }



    ///JAVA8///
    public List<Articulo> ordenadosPorNacionalidadesDistintas()
    {
        return listaArticulos.stream().sorted(Comparator.comparing(Articulo::numeroNacionalidades)).collect(Collectors.toList());
    }

    public List<Articulo> ordenadosPorNacionalidadesDistintasYEdad() {
        return listaArticulos.stream().sorted(Comparator.comparing(Articulo::numeroNacionalidades).thenComparing(Articulo::sumaEdades)).collect(Collectors.toList());
    }

    public Map<Boolean, Long> getNumPublicacionesAutorSoloYVarios() {
        return listaArticulos.stream().collect(Collectors.groupingBy(Articulo::unAutor, Collectors.counting()));
    }

    
}
