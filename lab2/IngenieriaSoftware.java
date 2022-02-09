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
		lMatriculados.stream().mapToDouble(Alumno::calcularNotaFinalJava8).forEach(System.out::println);
	}
	
	public List<Alumno> obtenerAlumnosSuspendidos()
	{
		return lMatriculados.stream().filter(Alumno::haSuspendido).collect(Collectors.toList());
	}

	public List<Alumno> obtenerAlumnosAprobadosOrdenadosNombre()
	{
		return lMatriculados.stream().filter(p -> !p.haSuspendido()).sorted(Comparator.comparing(Alumno::getNombre)).collect(Collectors.toList());
	}

	public List<Alumno> obtenerAlumnosAprobadosOrdenadosNombreApellido()
	{
		return lMatriculados.stream().filter(p -> !p.haSuspendido()).sorted(Comparator.comparing(Alumno::getNombre).thenComparing(Alumno::getApellido)).collect(Collectors.toList());
	}

	public double obtenerPorcentajeAprobados()
	{
		return lMatriculados.stream().filter(p -> !p.haSuspendido()).count()/(double)lMatriculados.size();
	}

	public List<String> obtenerPaisesRepresentados()
	{
		return lMatriculados.stream().map(Alumno::getPais).distinct().collect(Collectors.toList());
	}

	public List<Alumno> obtenerAlumnosTodosEntregablesAprobados()
	{
		return lMatriculados.stream().filter(Alumno::todosEntregablesAprobados).collect(Collectors.toList());
	}

	public List<Alumno> obtenerAlumnosQueSuperanNotasEnEntregable()
	{
		return lMatriculados.stream().filter(Alumno::superaNotaEnEntregable).collect(Collectors.toList());
	}
}
