import packVista.SemaforoCoches;
import packVista.SemaforoPeatones;
import packModelo.GestorSemaforos;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		//MODELO//
		GestorSemaforos.getGestorSemaforos();
		//VISTA//
		SemaforoCoches sc = new SemaforoCoches();
		SemaforoPeatones sp = new SemaforoPeatones();
	}
}
