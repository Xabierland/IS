public class Autor {
    private String nombre;
    private String nacionaldiad;
    

    private String universidad;
    private int edad;

    public Autor(String pNombre, String pNacion, String pUniversidad, int pEdad)
    {
        nombre=pNombre;
        nacionaldiad=pNacion;
        universidad=pUniversidad;
        edad=pEdad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionaldiad() {
        return nacionaldiad;
    }

    public void setNacionaldiad(String nacionaldiad) {
        this.nacionaldiad = nacionaldiad;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String toString()
    {
        return ("Nombre: "+nombre+", Nacionalidad: "+nacionaldiad+", Universidad: "+universidad+", Edad: "+edad);
    }
}
