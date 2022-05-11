import java.util.ArrayList;

public class Oferta {
    private ArrayList<Estacion> listaEstaciones;
    private Estacion origen;
    private Estacion destino;

    public Oferta(Estacion pOrigen, Estacion pDestino)
    {
        origen=pOrigen;
        destino=pDestino;

        listaEstaciones=new ArrayList<>();
        listaEstaciones.add(pOrigen);
        listaEstaciones.add(pDestino);
    }

    public void addEstacion(Estacion pEstacion)
    {
        listaEstaciones.add(pEstacion);
    }

    public Estacion getOrigen() {
        return origen;
    }

    public void setOrigen(Estacion origen) {
        this.origen = origen;
    }

    public Estacion getDestino() {
        return destino;
    }

    public void setDestino(Estacion destino) {
        this.destino = destino;
    }

    public String toString()
    {
        return "\tOrigen: "+origen.getCiudad()+", Destino: "+destino.getCiudad()+", Coste: "+costeViaje();
    }

    public boolean mismoOrigen(String pOrigen)
    {
        return origen.getCiudad().equals(pOrigen);
    }

    public boolean mismoDestino(String pDestino)
    {
        return destino.getCiudad().equals(pDestino);
    }

    public boolean contieneEstacion(String pEstacion)
    {
        return listaEstaciones.stream().anyMatch(e -> e.getCiudad().equals(pEstacion));
    }
    
    public String ciudadOrigen()
    {
        return origen.getCiudad();
    }

    public String ciudadDestino()
    {
        return destino.getCiudad();
    }

    public double costeViaje()
    {
        return listaEstaciones.stream().mapToDouble(Estacion::getCosteParada).sum();
    }

    public int numEstaciones()
    {
        return listaEstaciones.size();
    }
}
