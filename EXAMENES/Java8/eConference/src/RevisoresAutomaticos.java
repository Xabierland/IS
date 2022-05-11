import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RevisoresAutomaticos {
    private ArrayList<RevisorAutomatico> listaRevisores;
    private static RevisoresAutomaticos mRevisoresAutomaticos;

    private RevisoresAutomaticos()
    {
        listaRevisores=new ArrayList<>();
    }

    public static RevisoresAutomaticos gRevisoresAutomaticos()
    {
        if(mRevisoresAutomaticos==null)
        {
            mRevisoresAutomaticos=new RevisoresAutomaticos();
        }
        return mRevisoresAutomaticos;
    }

    public void addRevisores(RevisorAutomatico pRevisor)
    {
        listaRevisores.add(pRevisor);
    }

    public List<RevisorAutomatico> revisorDeArticulo(Articulo pArticulo)
    {
        return listaRevisores.stream().filter(r -> r.obtPorcentajeTemasExperto(pArticulo)==1.0).collect(Collectors.toList());
    }
}
