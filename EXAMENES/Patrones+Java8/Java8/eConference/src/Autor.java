
public class Autor {
    private String nombre;
    private String nacionalidad;
    private String universidad;
    private int edad;

    public Autor(String pNombre, String pNacionalidad, String pUniversidad, int pEdad)
    {
        nombre=pNombre;nacionalidad=pNacionalidad;universidad=pUniversidad;edad=pEdad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
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

    
}
