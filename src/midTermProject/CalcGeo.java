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

public class CalcGeo {

	JFrame Geoframe;
	JTextField geoText;
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
					CalcGeo window = new CalcGeo();
					window.Geoframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public CalcGeo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Geoframe = new JFrame();
		Geoframe.setBounds(100, 100, 5000, 5000);
		Geoframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Geoframe.getContentPane().setLayout(null);
		
		JLabel welcomeLit = new JLabel("Calculate your average literature GPA: ");
		welcomeLit.setBounds(76, 101, 559, 41);
		welcomeLit.setFont(new Font("Myanmar MN", Font.PLAIN, 25));
		Geoframe.getContentPane().add(welcomeLit);
		
		JLabel enter = new JLabel("Please enter all of you literature grades with spaces: (e.g- 40 50 60)");
		enter.setForeground(new Color(255, 0, 0));
		enter.setBounds(76, 205, 756, 24);
		enter.setFont(new Font("Myanmar MN", Font.PLAIN, 20));
		Geoframe.getContentPane().add(enter);
		
		geoText = new JTextField();
		geoText.setBounds(76, 274, 287, 48);
		Geoframe.getContentPane().add(geoText);
		geoText.setColumns(10);
		
		calc = new JButton("Calculate GPA");
		calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CalcAll litGPA = new CalcAll();
				
				double total = litGPA.getTotalLit(geoText);
				double inputVal = litGPA.getTotalLitInput(geoText);
				double average = total/inputVal;
				
				Double avgg = new Double(average); 
				
				gradeLbl = new JLabel(avgg.toString());
				gradeLbl.setFont(new Font("Myanmar MN", Font.BOLD, 25));
				gradeLbl.setBounds(85, 374, 128, 30);
				Geoframe.getContentPane().add(gradeLbl);
				
			}
		});
		calc.setBounds(411, 274, 165, 46);
		calc.setFont(new Font("Myanmar MN", Font.PLAIN, 15));
		Geoframe.getContentPane().add(calc);
		
		goBack = new JButton("Go Back");
		goBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GPACalc xx = new GPACalc();
				xx.frame.setVisible(true);
				Geoframe.dispose();
			}
		});
		goBack.setFont(new Font("Myanmar MN", Font.PLAIN, 15));
		goBack.setBounds(16, 24, 151, 41);
		Geoframe.getContentPane().add(goBack);
	}

}
