import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;

public class Articulo {
    private String titulo;
    private String fichero;
    private ArrayList<String> listaTemas;
    private ArrayList<Autor> listaAutores;

    public Articulo(String pTitulo, String pFichero)
    {
        titulo=pTitulo;
        fichero=pFichero;
        listaTemas=new ArrayList<>();
        listaAutores=new ArrayList<>();
    }

    public String toString()
    {
        return "Titulo: "+titulo+", Fichero: "+fichero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFichero() {
        return fichero;
    }

    public void setFichero(String fichero) {
        this.fichero = fichero;
    }

    public void addTemas(String pTemas)
    {
        listaTemas.add(pTemas);
    }

    public void addAutor(Autor pAutor)
    {
        listaAutores.add(pAutor);
    }

    public int contarNacionalidadesDistintas()
    {
        return (int) listaAutores.stream().map(Autor::getNacionaldiad).distinct().count();
    }

    public double mediaEdadAutores()
    {
        return listaAutores.stream().mapToInt(Autor::getEdad).average().getAsDouble();
    }

    public boolean unicoAutor()
    {
        if(listaAutores.size()<=1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean contieneTema(String pTema)
    {
        return listaTemas.contains(pTema);
    }

    public int numTemas()
    {
        return listaTemas.size();
    }

    public List<RevisorAutomatico> obtPosibleRevisores()
    {
        RevisoresAutomaticos r=RevisoresAutomaticos.gRevisoresAutomaticos();
        return r.obtPosiblesRevisores(this);
    }
    
}
