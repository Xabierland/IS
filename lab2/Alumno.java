import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Alumno {

	private String nombre;
	private String apellido;
	private String mail;
	private double notaExamen;
	private String pais;
	private List<Entregable> lEntregables = new ArrayList<Entregable>() ;

	public Alumno(String pNombre, String pApellido, String pMail,  String pPais)
	{
		nombre = pNombre;
		apellido = pApellido;
		mail = pMail;
		pais = pPais;
		
	}
	////////////////////GETTERS/////////////////////////
	public String getNombre()
	{
		return nombre;
	}
	public String getApellido()
	{
		return apellido;
	}
	
	public String getPais()
	{
		return pais;
	}
	
	//////////////////////////////////////////////
	
	public void setNotaExamen(double pNotaExamen)
	{
		notaExamen = pNotaExamen;
	}
	
	public void addEntregable(Entregable pEnt)
	{
		lEntregables.add(pEnt);
	}
	
	public boolean haSuspendido() {
		return calcularNotaFinalJava8()<5;
	}
	
	public String toString()
	{
		return "nombre: " + nombre + " " + apellido + ", mail:" + mail; 
	}
	
	////////////////////////////JAVA8////////////////////////////////
	private Iterator<Entregable> obtIterador()
	{
		return lEntregables.iterator();
	}
	
	//Debereis modificarlo y usar las herramientas que nos proporciona Java8
	public double calcularNotaEntregableJava8()
	{
		return lEntregables.stream().mapToDouble(Entregable::getNota).average().orElse(0.0);
	}
	
	//Debereis modificarlo y usar las herramientas que nos proporciona Java8
	public double calcularNotaFinalJava8()
	{
		return calcularNotaEntregableJava8()*0.6+notaExamen*0.4;
	}

	public boolean todosEntregablesAprobados()
	{
		return lEntregables.stream().allMatch(p -> p.getNota()>=5);
	}

	public boolean superaNotaEnEntregable()
	{
		return lEntregables.stream().anyMatch(p -> p.getNota()>=8);
	}
}
