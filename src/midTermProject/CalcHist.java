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

public class CalcHist {

	JFrame Histframe;
	JTextField histText;
	JButton calc;
	JLabel gradeLbl;
	private JButton goBack;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcHist window = new CalcHist();
					window.Histframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public CalcHist() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Histframe = new JFrame();
		Histframe.setBounds(100, 100, 5000, 5000);
		Histframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Histframe.getContentPane().setLayout(null);
		
		JLabel welcomeLit = new JLabel("Calculate your average literature GPA: ");
		welcomeLit.setBounds(76, 101, 559, 41);
		welcomeLit.setFont(new Font("Myanmar MN", Font.PLAIN, 25));
		Histframe.getContentPane().add(welcomeLit);
		
		JLabel enter = new JLabel("Please enter all of you literature grades with spaces: (e.g- 40 50 60)");
		enter.setForeground(new Color(255, 0, 0));
		enter.setBounds(76, 205, 756, 24);
		enter.setFont(new Font("Myanmar MN", Font.PLAIN, 20));
		Histframe.getContentPane().add(enter);
		
		histText = new JTextField();
		histText.setBounds(76, 274, 287, 48);
		Histframe.getContentPane().add(histText);
		histText.setColumns(10);
		
		calc = new JButton("Calculate GPA");
		calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CalcAll litGPA = new CalcAll();
				
				double total = litGPA.getTotalLit(histText);
				double inputVal = litGPA.getTotalLitInput(histText);
				double average = total/inputVal;
				
				Double avgg = new Double(average); 
				
				gradeLbl = new JLabel(avgg.toString());
				gradeLbl.setFont(new Font("Myanmar MN", Font.BOLD, 25));
				gradeLbl.setBounds(85, 374, 128, 30);
				Histframe.getContentPane().add(gradeLbl);
				
			}
		});
		calc.setBounds(411, 274, 165, 46);
		calc.setFont(new Font("Myanmar MN", Font.PLAIN, 15));
		Histframe.getContentPane().add(calc);
		
		goBack = new JButton("Go Back");
		goBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GPACalc xx = new GPACalc();
				xx.frame.setVisible(true);
				Histframe.dispose();
			}
		});
		goBack.setFont(new Font("Myanmar MN", Font.PLAIN, 15));
		goBack.setBounds(16, 24, 151, 41);
		Histframe.getContentPane().add(goBack);
	}

}
