import java.util.ArrayList;

public class RevisorAutomatico {
    private String id;
    private ArrayList<String> listaTemas;

    public RevisorAutomatico(String pId)
    {
        id=pId;
        listaTemas=new ArrayList<>();
    }

    public void addTemas(String pTema) {
        listaTemas.add(pTema);
    }

    public String toString()
    {
        return "\tRevisor "+id;
    }

    public double obtPorcentajeTemasExperto(Articulo pArticulo) {
        return listaTemas.stream().filter(s->pArticulo.contieneTema(s)).count()*1.0 / pArticulo.numeroTemas();
    }
}
