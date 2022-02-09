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
		return calcularNotaFinal()<5;  
	}
	
	public String toString()
	{
		return "nombre: " + nombre + " " + apellido + ", mail:" + mail; 
	}
	
	////////////////////////////JAVA7////////////////////////////////
	private Iterator<Entregable> obtIterador()
	{
		return lEntregables.iterator();
	}
	
	//Debereis modificarlo y usar las herramientas que nos proporciona Java8
	public double calcularAcumuladoEntregables()
	{
		double nota = 0;
		
		Iterator<Entregable> it = obtIterador();
		while(it.hasNext())
		{
			nota = nota + it.next().getNota();
		}
		return nota;
	}
	
	//Debereis modificarlo y usar las herramientas que nos proporciona Java8
	public double calcularNotaFinal()
	{
		double notaFinal = 0;		
		
		notaFinal = calcularAcumuladoEntregables()/lEntregables.size();
		notaFinal = notaFinal*0.6 + notaExamen*0.4;		
		
		return notaFinal;
	}	
	
}
