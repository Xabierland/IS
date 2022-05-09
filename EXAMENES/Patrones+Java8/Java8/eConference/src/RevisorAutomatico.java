import java.util.ArrayList;

public class RevisorAutomatico 
{
    private String id;
    private ArrayList<String> listaTemas;

    public RevisorAutomatico(String pId)
    {
        id=pId;
        listaTemas=new ArrayList<>();
    }

    public void addTemas(String pTema)
    {
        listaTemas.add(pTema);
    }

    public float obtPorcentajeTemasExperto(Articulo pArticulo)
    {
        return (float) (listaTemas.stream().filter(s->pArticulo.contieneTema(s)).count()*1.0/pArticulo.numTemas());
    }

    public boolean esAdecuado(Articulo pArticulo) {
        return listaTemas.stream().anyMatch(s->pArticulo.contieneTema(s));
    }
}
