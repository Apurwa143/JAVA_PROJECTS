
// -------------------Simple calculator using application window java--------------------------

package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Window.Type;

public class caculator {

	private JFrame frmApsCalculator;
	private JTextField textDisplay;
	private JButton btn8;
	private JButton btn9;
	private JButton btnPlus;
	private JButton btnminus;

//------------Variables-------------------
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	private JButton btnequal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					caculator window = new caculator();
					window.frmApsCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public caculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmApsCalculator = new JFrame();
		frmApsCalculator.setTitle("APS Calculator");
		frmApsCalculator.setType(Type.POPUP);
		frmApsCalculator.getContentPane().setFocusCycleRoot(true);
		frmApsCalculator.getContentPane().setFont(new Font("Verdana", Font.BOLD, 18));
		frmApsCalculator.setBounds(100, 100, 309, 336);
		frmApsCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmApsCalculator.getContentPane().setLayout(null);
		
		textDisplay = new JTextField();
		textDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		textDisplay.setBounds(10, 23, 272, 45);
		frmApsCalculator.getContentPane().add(textDisplay);
		textDisplay.setColumns(10);
		
	// -----------------------------ROW-1------------------------------------------------------	
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textDisplay.getText() + btn7.getText();
				textDisplay.setText(EnterNumber);
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 79, 45, 45);
		frmApsCalculator.getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn8.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(65, 79, 45, 45);
		frmApsCalculator.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn9.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(120, 79, 45, 45);
		frmApsCalculator.getContentPane().add(btn9);
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "+";
			}
		});
		btnPlus.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btnPlus.setBounds(181, 79, 45, 45);
		frmApsCalculator.getContentPane().add(btnPlus);
		
		btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "-";
			}
		});
		btnminus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnminus.setBounds(237, 79, 45, 45);
		frmApsCalculator.getContentPane().add(btnminus);
		
		btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Double.parseDouble(textDisplay.getText());
				if( operations == "+")                                     // ---------Conditions----------
				{
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
				    textDisplay.setText(answer);
				}
				if( operations == "-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
				    textDisplay.setText(answer);
				}
				if( operations == "*")
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
				    textDisplay.setText(answer);
					
				}
				if( operations == "/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
				    textDisplay.setText(answer);
					
				}
			}
		});
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnequal.setBounds(89, 257, 101, 29);
		frmApsCalculator.getContentPane().add(btnequal);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textDisplay.getText() + btn6.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(10, 135, 45, 45);
		frmApsCalculator.getContentPane().add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textDisplay.getText() + btn5.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(65, 135, 45, 45);
		frmApsCalculator.getContentPane().add(btn5);
		
		JButton btn4 = new JButton("4\r\n\r\n");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textDisplay.getText() + btn4.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(120, 135, 45, 45);
		frmApsCalculator.getContentPane().add(btn4);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textDisplay.getText() + btn3.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(10, 191, 45, 45);
		frmApsCalculator.getContentPane().add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textDisplay.getText() + btn2.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(65, 190, 45, 45);
		frmApsCalculator.getContentPane().add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textDisplay.getText() + btn1.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(120, 191, 45, 45);
		frmApsCalculator.getContentPane().add(btn1);
		
		JButton btnmult = new JButton("*");
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
	
				firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "*";
			}
		});
		btnmult.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnmult.setBounds(181, 135, 45, 45);
		frmApsCalculator.getContentPane().add(btnmult);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "/";
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		btndiv.setBounds(237, 135, 45, 45);
		frmApsCalculator.getContentPane().add(btndiv);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textDisplay.getText() + btn0.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(181, 191, 45, 45);
		frmApsCalculator.getContentPane().add(btn0);
		
		JButton btnclear = new JButton("c");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textDisplay.setText(null);
				
			}
		});
		btnclear.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnclear.setBounds(237, 191, 45, 45);
		frmApsCalculator.getContentPane().add(btnclear);
		
		
	}
}
