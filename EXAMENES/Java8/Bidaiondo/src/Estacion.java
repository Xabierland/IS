
public class Estacion {
    private String ciudad;
    private float costeParada;

    public Estacion(String pCiudad, float pCosteParada)
    {
        ciudad=pCiudad;
        costeParada=pCosteParada;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public float getCosteParada() {
        return costeParada;
    }

    public void setCosteParada(float costeParada) {
        this.costeParada = costeParada;
    }

    public String toString()
    {
        return "\tEstacion| Ciudad: "+ciudad+", Coste: "+costeParada;
    }
}
