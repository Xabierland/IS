package lab3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

public class Screen extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblNewLabel;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JLabel lblNewLabel_1;
	private JCheckBox chckbxNewCheckBox_2;
	private JCheckBox chckbxNewCheckBox_3;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private ButtonGroup g = new ButtonGroup();
	private JPanel panel_3;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPanel(), BorderLayout.CENTER);
		contentPane.add(getPanel_1(), BorderLayout.SOUTH);
		contentPane.add(getPanel_2(), BorderLayout.NORTH);
		g.add(rdbtnNewRadioButton);
		g.add(rdbtnNewRadioButton_1);
		g.add(rdbtnNewRadioButton_2);
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(new GridLayout(4, 2, 0, 0));
			panel.add(getRadioButton_1());
			panel.add(getBtnNewButton());
			panel.add(getBtnNewButton_1());
			panel.add(getRadioButton_2());
			panel.add(getBtnNewButton_4());
			panel.add(getBtnNewButton_2());
			panel.add(getRadioButton_3());
			panel.add(getBtnNewButton_3());
			panel.add(getBtnNewButton_5());
			panel.add(getPanel_3_1());
			panel.add(getChckbxNewCheckBox());
			panel.add(getChckbxNewCheckBox_1());
		}
		return panel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("A1");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("A2");
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("B2");
		}
		return btnNewButton_2;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("C1");
		}
		return btnNewButton_3;
	}
	private JButton getBtnNewButton_4() {
		if (btnNewButton_4 == null) {
			btnNewButton_4 = new JButton("B1");
		}
		return btnNewButton_4;
	}
	private JButton getBtnNewButton_5() {
		if (btnNewButton_5 == null) {
			btnNewButton_5 = new JButton("C2");
		}
		return btnNewButton_5;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.add(getLblNewLabel_1());
			panel_1.add(getChckbxNewCheckBox_2());
			panel_1.add(getChckbxNewCheckBox_3());
		}
		return panel_1;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.add(getLblNewLabel());
		}
		return panel_2;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\u00A1Pincha un boton!");
		}
		return lblNewLabel;
	}
	private JCheckBox getChckbxNewCheckBox() {
		if (chckbxNewCheckBox == null) {
			chckbxNewCheckBox = new JCheckBox("Op1");
		}
		return chckbxNewCheckBox;
	}
	private JCheckBox getChckbxNewCheckBox_1() {
		if (chckbxNewCheckBox_1 == null) {
			chckbxNewCheckBox_1 = new JCheckBox("Op2");
		}
		return chckbxNewCheckBox_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\u00BFTe gusta?");
		}
		return lblNewLabel_1;
	}
	private JCheckBox getChckbxNewCheckBox_2() {
		if (chckbxNewCheckBox_2 == null) {
			chckbxNewCheckBox_2 = new JCheckBox("SI");
		}
		return chckbxNewCheckBox_2;
	}
	private JCheckBox getChckbxNewCheckBox_3() {
		if (chckbxNewCheckBox_3 == null) {
			chckbxNewCheckBox_3 = new JCheckBox("NO");
		}
		return chckbxNewCheckBox_3;
	}
	private JRadioButton getRadioButton_1() {
		if (rdbtnNewRadioButton == null) {
			rdbtnNewRadioButton = new JRadioButton("A");
		}
		return rdbtnNewRadioButton;
	}
	private JRadioButton getRadioButton_2() {
		if (rdbtnNewRadioButton_1 == null) {
			rdbtnNewRadioButton_1 = new JRadioButton("B");
		}
		return rdbtnNewRadioButton_1;
	}
	private JRadioButton getRadioButton_3() {
		if (rdbtnNewRadioButton_2 == null) {
			rdbtnNewRadioButton_2 = new JRadioButton("C");
		}
		return rdbtnNewRadioButton_2;
	}
	private JPanel getPanel_3_1() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
		}
		return panel_3;
	}
}
