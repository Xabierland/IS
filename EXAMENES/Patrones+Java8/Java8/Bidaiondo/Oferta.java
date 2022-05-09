import java.util.ArrayList;
import java.util.List;

public class Oferta {
    private ArrayList<Estacion> listaEstaciones=new ArrayList<>();
    private Estacion origen;
    private Estacion destino;

    public Oferta(Estacion pOrigen, Estacion pDestino){
        origen=pOrigen;
        destino=pDestino;
        addEstacion(origen);
        addEstacion(destino);
    }

    public String getOrigen()
    {
        return origen.getCiudad();
    }

    public String getDestino()
    {
        return destino.getCiudad();
    }

    public void addEstacion(Estacion pEstacion)
    {
        listaEstaciones.add(pEstacion);
    }

    public boolean contieneEstacion(String pEstacion)
    {
        boolean enc=false;
        for(Estacion e : listaEstaciones)
        {
            if(e.getCiudad().equals(pEstacion))
            {
                enc=true;
                break;
            }
        }
        return enc;
    }

    public int numeroEstaciones()
    {
        return listaEstaciones.size();
    }

    public String toString()
    {
        return "Origen: "+origen.getCiudad()+", Destino: "+destino.getCiudad()+", Coste: "+calcularCoste()+"€";
    }

    public float calcularCoste()
    {
        return (float)listaEstaciones.stream().mapToDouble(e -> e.getCosteParada()).sum();
    }

    public boolean coincideOrigen(String pOrigen)
    {
        if(origen.getCiudad().equals(pOrigen))
        {
            return true;
        }
        else{
            return false;
        }
    }

    public boolean coincideDestino(String pDestino)
    {
        if(destino.getCiudad().equals(pDestino))
        {
            return true;
        }
        else{
            return false;
        }
    }
}
