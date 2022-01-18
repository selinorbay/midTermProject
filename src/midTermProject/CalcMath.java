package midTermProject;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalcMath {

	 JFrame Mathframe;
	 
	JTextField mathText;
	JButton calc;
	JLabel gradeLbl;
	private JButton goBack;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcMath window = new CalcMath();
					window.Mathframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public CalcMath() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Mathframe = new JFrame();
		Mathframe.setBounds(100, 100, 5000, 5000);
		Mathframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Mathframe.getContentPane().setLayout(null);
		
		JLabel welcomeLit = new JLabel("Calculate your average literature GPA: ");
		welcomeLit.setBounds(76, 101, 559, 41);
		welcomeLit.setFont(new Font("Myanmar MN", Font.PLAIN, 25));
		Mathframe.getContentPane().add(welcomeLit);
		
		JLabel enter = new JLabel("Please enter all of you literature grades with spaces: (e.g- 40 50 60)");
		enter.setForeground(new Color(255, 0, 0));
		enter.setBounds(76, 205, 756, 24);
		enter.setFont(new Font("Myanmar MN", Font.PLAIN, 20));
		Mathframe.getContentPane().add(enter);
		
		mathText = new JTextField();
		mathText.setBounds(76, 274, 287, 48);
		Mathframe.getContentPane().add(mathText);
		mathText.setColumns(10);
		
		calc = new JButton("Calculate GPA");
		calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CalcAll litGPA = new CalcAll();
				
				double total = litGPA.getTotalLit(mathText);
				double inputVal = litGPA.getTotalLitInput(mathText);
				double average = total/inputVal;
				
				Double avgg = new Double(average); 
				
				gradeLbl = new JLabel(avgg.toString());
				gradeLbl.setFont(new Font("Myanmar MN", Font.BOLD, 25));
				gradeLbl.setBounds(85, 374, 128, 30);
				Mathframe.getContentPane().add(gradeLbl);

			}
		});
		calc.setBounds(411, 274, 165, 46);
		calc.setFont(new Font("Myanmar MN", Font.PLAIN, 15));
		Mathframe.getContentPane().add(calc);
		
		goBack = new JButton("Go Back");
		goBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GPACalc xx = new GPACalc();
				xx.frame.setVisible(true);
				Mathframe.dispose();
			}
		});
		goBack.setFont(new Font("Myanmar MN", Font.PLAIN, 15));
		goBack.setBounds(16, 24, 151, 41);
		Mathframe.getContentPane().add(goBack);
	}

}
