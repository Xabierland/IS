package lab4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.SwingConstants;

public class Juego extends JFrame {

	private JPanel contentPane;
	private JPanel tablero;
	private JPanel menu;
	private JLabel coordenadas;
	private JButton horiz;
	private JButton vert;
	private JButton surrond;
	private int DIM=5;

	/**
	 * Create the frame.
	 */
	public Juego(int pDim) {
		DIM=pDim;
		setTitle("mas barquitos xd");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getTablero(), BorderLayout.CENTER);
		contentPane.add(getMenu(), BorderLayout.EAST);
	}

	private JLabel getCasilla()
	{
		JLabel casilla = new JLabel();
		boolean click=false;
		casilla.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		casilla.setOpaque(true);
		casilla.setBackground(Color.DARK_GRAY);
		casilla.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				//if(casilla.getColorModel()==Color.DARK_GRAY)
				{
					
				}
				
				
			}
		});
		return casilla;
	}
	
	private JPanel getTablero() {
		if (tablero == null) 
		{
			tablero = new JPanel();
			tablero.setLayout(new GridLayout(DIM, DIM, 0, 0));
			int i,j;
			for(i=0;i<DIM;i++)
				for(j=0; j<DIM;j++)
				{
					tablero.add(getCasilla());
				}
			
		}
		return tablero;
	}
	private JPanel getMenu() {
		if (menu == null) {
			menu = new JPanel();
			menu.setLayout(new GridLayout(0, 1, 0, 0));
			menu.add(getCoordenadas());
			menu.add(getHoriz());
			menu.add(getVert());
			menu.add(getSurrond());
		}
		return menu;
	}
	private JLabel getCoordenadas() {
		if (coordenadas == null) {
			coordenadas = new JLabel("X: ?? & Y:??");
			coordenadas.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return coordenadas;
	}
	private JButton getHoriz() {
		if (horiz == null) {
			horiz = new JButton("HORIZONTAL");
		}
		return horiz;
	}
	private JButton getVert() {
		if (vert == null) {
			vert = new JButton("VERTICAL");
		}
		return vert;
	}
	private JButton getSurrond() {
		if (surrond == null) {
			surrond = new JButton("SURROUND");
		}
		return surrond;
	}
}
