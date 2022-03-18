package lab4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Screen extends JFrame {

	private JPanel contentPane;
	private JButton boton;
	private ButtonGroup g=new ButtonGroup();
	private JRadioButton sel1;
	private JRadioButton sel2;
	private int dim=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Screen frame = new Screen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Screen() {
		setTitle("jajaja barquitos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 327);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		contentPane.add(getRdbtnNewRadioButton_2());
		contentPane.add(getRdbtnNewRadioButton_1_1());
		contentPane.add(getBoton());
		g.add(sel1);g.add(sel2);
	}
	private JButton getBoton() {
		if (boton == null) {
			boton = new JButton("Go go powerranger!");
			boton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					contentPane.setVisible(false);
					Juego juego = new Juego(dim);
					juego.setVisible(true);
				}
			});
		}
		return boton;
	}
	private JRadioButton getRdbtnNewRadioButton_2() {
		if (sel1 == null) {
			sel1 = new JRadioButton("5x5");
			sel1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dim=5;
				}
			});
			sel1.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return sel1;
	}
	private JRadioButton getRdbtnNewRadioButton_1_1() {
		if (sel2 == null) {
			sel2 = new JRadioButton("10x10");
			sel2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dim=10;
				}
			});
			sel2.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return sel2;
	}
}
