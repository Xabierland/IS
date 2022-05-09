import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RevisoresAutomaticos 
{
    private ArrayList<RevisorAutomatico> listaRevisores;
    private static RevisoresAutomaticos mRevisoresAutomaticos=null;

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

    public List<RevisorAutomatico> obtPosiblesRevisores(Articulo pArticulo)
    {
        return listaRevisores.stream().filter(r->r.esAdecuado(pArticulo)).sorted(Comparator.comparing((RevisorAutomatico r)->r.obtPorcentajeTemasExperto(pArticulo)).reversed()).collect(Collectors.toList());
    }
}

