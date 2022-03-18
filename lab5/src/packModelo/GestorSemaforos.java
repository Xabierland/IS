package packModelo;
import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;

/** MODELO PARA GESTIONAR EL SEMAFORO*/
@SuppressWarnings("deprecation")
public class GestorSemaforos extends Observable{
	private static GestorSemaforos mGestorSemaforos = new GestorSemaforos();
	private boolean estaVerde;
	private static final int PERIODO = 15;
	private int cont;
	private Timer timer = null;
	
	private GestorSemaforos ()
	{
		estaVerde = true;
		cont = PERIODO;
		//Cada segundo se ejectuta actualizarCont para actualizar el contador del semáforo
		TimerTask timerTask = new TimerTask() 
		{
			@Override
			public void run() 
			{
				actualizarCont();
			}		
		};
		timer = new Timer();
		timer.scheduleAtFixedRate(timerTask, 0, 1000);
	}
	
	private void actualizarCont() 
	{
		cont--;
		if (cont == 0) 
		{
			cont = PERIODO;
			estaVerde = !estaVerde;
		}
		//Mostrar información del modelo
		setChanged();
		notifyObservers();
		System.out.printf("Estado del modelo-> estaVerde : %b   Cont: %d\n", estaVerde, cont);
	}
	
	public static GestorSemaforos getGestorSemaforos() 
	{
		return mGestorSemaforos;
	}
	

	public int getContador() 
	{
		return cont;
	}
	
	public boolean estaVerde() 
	{
		return estaVerde;
	}
	
	public void ponerVerde() 
	{
		if (!estaVerde()) 
		{
			cont = PERIODO;
			estaVerde = true;
		}
	}
}
