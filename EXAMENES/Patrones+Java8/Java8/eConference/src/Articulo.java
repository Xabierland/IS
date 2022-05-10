import java.util.ArrayList;
import java.util.List;

public class Articulo {
    private String titulo;
    private String fichero;
    private ArrayList<String> listaTemas;
    private ArrayList<Autor> listaAutores;

    public Articulo(String pTitulo, String pFichero)
    {
        titulo=pTitulo;
        fichero=pFichero;
        listaAutores=new ArrayList<>();
        listaTemas=new ArrayList<>();
    }

    public void addTemas(String pTema)
    {
        listaTemas.add(pTema);
    }

    public void addAutor(Autor pAutor)
    {
        listaAutores.add(pAutor);
    }

    public String toString()
    {
        return "\tTitulo: "+titulo;
    }

    public int numeroNacionalidades()
    {
        return (int) listaAutores.stream().map(Autor::getNacionalidad).distinct().count();
    }

    public int sumaEdades()
    {
        return (int) listaAutores.stream().mapToInt(Autor::getEdad).sum();
    }

    public boolean contieneTema(String pTema)
    {
        return listaTemas.contains(pTema);
    }
    public int numeroTemas()
    {
        return listaTemas.size();
    }
    public boolean unAutor()
    {
        return listaAutores.size()==1;
    }

    public List<RevisorAutomatico> obtPosibleRevisores() {
        return RevisoresAutomaticos.gRevisoresAutomaticos().revisorDeArticulo(this);
    }
}
