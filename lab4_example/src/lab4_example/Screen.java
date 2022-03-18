package lab4_example;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Color;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Screen extends JFrame {

	private JPanel contentPane;
	private JPanel radioButton;
	private JPanel Button_emoji;
	private JRadioButton black;
	private JRadioButton green;
	private JPanel buttonP;
	private JButton button;
	private JPanel emojiP;
	private JLabel emoji;
	private boolean emojiS=false;
	private boolean greenC=false;
	private boolean blackC=false;
	private ButtonGroup g=new ButtonGroup();

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
		setBounds(100, 100, 383, 192);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getRadioButton());
		contentPane.add(getButton_emoji());
		g.add(black);
		g.add(green);
	}
	private JPanel getRadioButton() {
		if (radioButton == null) {
			radioButton = new JPanel();
			radioButton.setBounds(5, 5, 359, 31);
			radioButton.add(getBlack());
			radioButton.add(getGreen());
		}
		return radioButton;
	}
	private JPanel getButton_emoji() {
		if (Button_emoji == null) {
			Button_emoji = new JPanel();
			Button_emoji.setBounds(5, 36, 359, 114);
			Button_emoji.setLayout(new BorderLayout(0, 0));
			Button_emoji.add(getButtonP(), BorderLayout.NORTH);
			Button_emoji.add(getEmojiP(), BorderLayout.CENTER);
		}
		return Button_emoji;
	}
	private JRadioButton getBlack() {
		if (black == null) {
			black = new JRadioButton("Black");
			black.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					blackC=true;
					greenC=false;
				}
			});
		}
		return black;
	}
	private JRadioButton getGreen() {
		if (green == null) {
			green = new JRadioButton("Green");
			green.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					blackC=false;
					greenC=true;
				}
			});
		}
		return green;
	}
	private JPanel getButtonP() {
		if (buttonP == null) {
			buttonP = new JPanel();
			FlowLayout fl_buttonP = (FlowLayout) buttonP.getLayout();
			buttonP.add(getButton());
		}
		return buttonP;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("Click Me!");
			button.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					emojiS=!emojiS;
					emojiP.setVisible(emojiS);
				}
			});
		}
		return button;
	}
	private JPanel getEmojiP() {
		if (emojiP == null) {
			emojiP = new JPanel();
			emojiP.add(getEmoji());
			emojiP.setVisible(false);
		}
		return emojiP;
	}
	private JLabel getEmoji() {
		if (emoji == null) {
			emoji = new JLabel(":)");
			emoji.addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseMoved(MouseEvent e) {
					if(greenC)
					{
						contentPane.setBackground(Color.GREEN);
					}
					else if(blackC)
					{
						contentPane.setBackground(Color.BLACK);
					}
					else
					{
						contentPane.setBackground(Color.LIGHT_GRAY);
					}
				}
			});
			emoji.setFont(new Font("Tahoma", Font.PLAIN, 50));
		}
		return emoji;
	}
}
