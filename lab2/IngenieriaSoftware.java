import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.*;

public class IngenieriaSoftware {
	
	private static IngenieriaSoftware mIngenieriaSoftware;
	private List<Alumno> lMatriculados = new ArrayList<Alumno>();
	
	private IngenieriaSoftware(){}
	
	public static IngenieriaSoftware getIngenieriaSoftware()
	{
		if(mIngenieriaSoftware==null)
		{
			mIngenieriaSoftware = new IngenieriaSoftware();
		}
		return mIngenieriaSoftware;
	}
	
	public void addAlumno(Alumno pAl)
	{
		lMatriculados.add(pAl);
	}	
	
	////////////////////////////JAVA7////////////////////////////////
	private Iterator<Alumno> obtIterador()
	{
		return lMatriculados.iterator();
	}	
	
	public void mostrarNotasTotales()
	{
		Iterator<Alumno> it = obtIterador();
		
		while(it.hasNext())
		{
			System.out.println(it.next().calcularNotaFinal());
		}
	}
	
	public List<Alumno> obtenerAlumnosSuspendidos()
	{
		List<Alumno>  alumnosSuspendidos = new ArrayList<>();
		
		Iterator<Alumno> it = obtIterador();
		while(it.hasNext())
		{
			Alumno al = it.next();
			if(al.haSuspendido())
			{
				alumnosSuspendidos.add(al);
			}
		}		
		return alumnosSuspendidos;
	}	

}
