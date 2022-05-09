public class Estacion {
    private String ciudad;
    private float costeParada;

    public Estacion(String pCiudad, float pCoste)
    {
        ciudad=pCiudad;
        costeParada=pCoste;
    }

    public String toString()
    {
        return "Estacion: "+ciudad+", Coste: "+costeParada;
    }

    public String getCiudad()
    {
        return ciudad;
    }
    
    public float getCosteParada()
    {
        return costeParada;
    }
}
