package lab3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Juego extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JLabel lblNewLabel;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private JRadioButton rdbtnNewRadioButton_3;
	private ButtonGroup g=new ButtonGroup();
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego frame = new Juego();
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
	public Juego() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPanel(), BorderLayout.CENTER);
		contentPane.add(getPanel_3(), BorderLayout.EAST);
		contentPane.add(getPanel_4(), BorderLayout.NORTH);
		contentPane.add(getPanel_5(), BorderLayout.SOUTH);
		g.add(rdbtnNewRadioButton);
		g.add(rdbtnNewRadioButton_1);
		g.add(rdbtnNewRadioButton_2);
		g.add(rdbtnNewRadioButton_3);
		crearButtons();
	}
	private JButton cbt(String sim, int i, int j)
	{
		String con=sim+i+j;
		JButton btnNewButton = new JButton(con);
		return btnNewButton;
	}
	private void crearButtons()
	{
		int i,j;
		for(i=0;i<10;i++)
			for(j=0; j<10;j++)
			{
				panel_1.add(cbt("@",i,j), BorderLayout.CENTER, i*10+j);
				panel_2.add(cbt("#",i,j), BorderLayout.CENTER, i*10+j);
			}
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(new GridLayout(1, 0, 0, 0));
			panel.add(getPanel_1());
			panel.add(getPanel_2());
			
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(new GridLayout(10, 10, 0, 0));
		}
		return panel_1;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setLayout(new GridLayout(10, 10, 0, 0));
		}
		return panel_2;
	}
	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.setLayout(new GridLayout(0, 1, 0, 0));
			panel_3.add(getRdbtnNewRadioButton_1());
			panel_3.add(getRdbtnNewRadioButton());
			panel_3.add(getRdbtnNewRadioButton_2());
			panel_3.add(getRdbtnNewRadioButton_3());
		}
		return panel_3;
	}
	private JPanel getPanel_4() {
		if (panel_4 == null) {
			panel_4 = new JPanel();
			panel_4.add(getLblNewLabel());
		}
		return panel_4;
	}
	private JPanel getPanel_5() {
		if (panel_5 == null) {
			panel_5 = new JPanel();
			panel_5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panel_5.add(getBtnNewButton());
			panel_5.add(getBtnNewButton_1());
			panel_5.add(getBtnNewButton_2());
			panel_5.add(getBtnNewButton_3());
		}
		return panel_5;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Juego");
		}
		return lblNewLabel;
	}
	private JRadioButton getRdbtnNewRadioButton() {
		if (rdbtnNewRadioButton == null) {
			rdbtnNewRadioButton = new JRadioButton("R2");
		}
		return rdbtnNewRadioButton;
	}
	private JRadioButton getRdbtnNewRadioButton_1() {
		if (rdbtnNewRadioButton_1 == null) {
			rdbtnNewRadioButton_1 = new JRadioButton("R1");
		}
		return rdbtnNewRadioButton_1;
	}
	private JRadioButton getRdbtnNewRadioButton_2() {
		if (rdbtnNewRadioButton_2 == null) {
			rdbtnNewRadioButton_2 = new JRadioButton("R3");
		}
		return rdbtnNewRadioButton_2;
	}
	private JRadioButton getRdbtnNewRadioButton_3() {
		if (rdbtnNewRadioButton_3 == null) {
			rdbtnNewRadioButton_3 = new JRadioButton("R4");
		}
		return rdbtnNewRadioButton_3;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("B1");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("B2");
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("B3");
		}
		return btnNewButton_2;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("B4");
		}
		return btnNewButton_3;
	}
}
