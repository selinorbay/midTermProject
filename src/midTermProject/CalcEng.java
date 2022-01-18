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

public class CalcEng {

	JFrame Engframe;
	JTextField engText;
	JButton calc;
	JLabel gradeLbl;
	private JButton goBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcEng window = new CalcEng();
					window.Engframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalcEng() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Engframe = new JFrame();
		Engframe.setBounds(100, 100, 5000, 5000);
		Engframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Engframe.getContentPane().setLayout(null);
		
		JLabel welcomeEng = new JLabel("Calculate your average english GPA: ");
		welcomeEng.setBounds(76, 101, 559, 41);
		welcomeEng.setFont(new Font("Myanmar MN", Font.PLAIN, 25));
		Engframe.getContentPane().add(welcomeEng);
		
		JLabel enter = new JLabel("Please enter all of you english grades with spaces: (e.g- 40 50 60)");
		enter.setForeground(new Color(255, 0, 0));
		enter.setBounds(76, 205, 756, 24);
		enter.setFont(new Font("Myanmar MN", Font.PLAIN, 20));
		Engframe.getContentPane().add(enter);
		
		engText = new JTextField();
		engText.setBounds(76, 274, 287, 48);
		Engframe.getContentPane().add(engText);
		engText.setColumns(10);
		
		calc = new JButton("Calculate GPA");
		calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CalcAll litGPA = new CalcAll();
				
				double total = litGPA.getTotalLit(engText);
				double inputVal = litGPA.getTotalLitInput(engText);
				double average = total/inputVal;
				
				Double avgg = new Double(average); 
				
				gradeLbl = new JLabel(avgg.toString());
				gradeLbl.setFont(new Font("Myanmar MN", Font.BOLD, 25));
				gradeLbl.setBounds(85, 374, 128, 30);
				Engframe.getContentPane().add(gradeLbl);

			}
		});
		calc.setBounds(411, 274, 165, 46);
		calc.setFont(new Font("Myanmar MN", Font.PLAIN, 15));
		Engframe.getContentPane().add(calc);
		
		goBack = new JButton("Go Back");
		goBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GPACalc xx = new GPACalc();
				xx.frame.setVisible(true);
				Engframe.dispose();
			}
		});
		goBack.setFont(new Font("Myanmar MN", Font.PLAIN, 15));
		goBack.setBounds(16, 24, 151, 41);
		Engframe.getContentPane().add(goBack);
	}

}
