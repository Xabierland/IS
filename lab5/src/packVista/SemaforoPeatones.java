package packVista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import packModelo.GestorSemaforos;

import javax.swing.JButton;

public class SemaforoPeatones extends JFrame implements Observer{

	private static final long serialVersionUID = 820323745068010478L;
	private JPanel contentPane;
	private JPanel pnlSemaforo;
	private LuzSemaforo luzVerde = null;
	private LuzSemaforo luzRoja = null;
	private Controlador controlador = null;
	private JLabel lblCont;
	private JButton btnPedirPaso;


	public SemaforoPeatones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initialize();
		GestorSemaforos.getGestorSemaforos().addObserver(this);
	}

	public void update(Observable arg0, Object arg1)
	{
		lblCont.setText(String.valueOf(GestorSemaforos.getGestorSemaforos().getContador()));
		if(GestorSemaforos.getGestorSemaforos().estaVerde()) {
			lblCont.setForeground(Color.green);
			getLuzVerde().setActivo(true);
			getLuzRoja().setActivo(false);
		}
		else {
			lblCont.setForeground(Color.red);
			getLuzVerde().setActivo(false);
			getLuzRoja().setActivo(true);
		}
		
	}
	
	private void initialize() {
		setSize(150, 555);
		this.setContentPane(getContentPane());
		setTitle("Peatones");
		setLocationRelativeTo(null);
		setVisible(true);

	}
	
	public JPanel getContentPane() {
		if (contentPane == null) {
			contentPane = new JPanel();
			contentPane.setLayout(new BorderLayout());
			contentPane.add(getPnlSemaforo(), BorderLayout.CENTER);
		}
		return contentPane;
	}
	//Panel del semaforo
	private JPanel getPnlSemaforo() {
		if (pnlSemaforo == null) {
			pnlSemaforo = new JPanel();
			pnlSemaforo.setLayout(new GridLayout(4, 1, 0, 10));
			pnlSemaforo.add(getLblCont());
			pnlSemaforo.add(getLuzRoja(),null);
			pnlSemaforo.add(getLuzVerde(),null);
			pnlSemaforo.add(getBtnPedirPaso());
		}
		return pnlSemaforo;
	}
	//0- SEMAFORO: luz roja
	private LuzSemaforo getLuzRoja() {
		if (luzRoja == null) {
			luzRoja = new LuzSemaforo("rojo", true);
		}
		return luzRoja;
	}
	//1- SEMAFORO: luz verde
	private LuzSemaforo getLuzVerde() {
		if (luzVerde == null) {
			luzVerde = new LuzSemaforo("verde", false);
		}
		return luzVerde;
	}
	//2- SEMAFORO: contador
	private JLabel getLblCont() {
		if (lblCont == null) {
			lblCont = new JLabel("15");
			lblCont.setOpaque(true);
			lblCont.setBackground(Color.BLACK);
			lblCont.setFont(new Font("Lucida Grande", Font.BOLD, 72));
			lblCont.setHorizontalAlignment(SwingConstants.CENTER);
			lblCont.setForeground(Color.RED);
		}
		return lblCont;
	}
	//0- CONTROLADOR : asignar evento al boton
	private JButton getBtnPedirPaso() {
		if (btnPedirPaso == null) {
			btnPedirPaso = new JButton("Pedir paso");
			btnPedirPaso.addActionListener(getControlador());
		}
		return btnPedirPaso;
	}
	//1- CONTROLADOR : instancia	
	private Controlador getControlador() {
		if (controlador == null) {
			controlador = new Controlador();
		}
		return controlador;
	}
	//2- CONTROLADOR : listener
	private class Controlador implements ActionListener {
		//Tras pulsar el botón, modificar "estadoVerde" del modelo a true.
		@Override
		public void actionPerformed(ActionEvent e) {
				System.out.println("Click!");
				GestorSemaforos.getGestorSemaforos().ponerVerde();
		}
	}
}
