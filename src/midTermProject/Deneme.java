package midTermProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Deneme {

	JFrame Mainframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Deneme window = new Deneme();
					window.Mainframe.setVisible(true);
					GPACalc c = new GPACalc();
					CalcMath m = new CalcMath();
					CalcBio b = new CalcBio();
					CalcPhy p = new CalcPhy();
					CalcGeo g = new CalcGeo();
					CalcHist h = new CalcHist();
					CalcAll a = new CalcAll();
					CalcLit l = new CalcLit();
					CalcChem ch = new CalcChem();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the application.
	 */
	public Deneme() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Mainframe = new JFrame();
		Mainframe.setBounds(100, 100, 5000, 5000);
		Mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Mainframe.getContentPane().setLayout(null);
		
		JLabel Welcome = new JLabel("Welcome to \"Student Helper 2022\"");
		Welcome.setFont(new Font("Myanmar MN", Font.BOLD, 40));
		Welcome.setBackground(Color.BLACK);
		Welcome.setBounds(418, 217, 838, 57);
		Mainframe.getContentPane().add(Welcome);
		
		JLabel ask = new JLabel("What would you like to do today ?");
		ask.setFont(new Font("Myanmar MN", Font.BOLD, 30));
		ask.setBackground(Color.BLACK);
		ask.setBounds(469, 313, 600, 57);
		Mainframe.getContentPane().add(ask);
		
		JButton avgGPA = new JButton("Calculate My Average GPA");
		avgGPA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				GPACalc xx = new GPACalc();
				xx.frame.setVisible(true);
				Mainframe.dispose();
			}
		});
		avgGPA.setFont(new Font("Myanmar MN", Font.PLAIN, 30));
		avgGPA.setBounds(483, 411, 457, 110);
		avgGPA.setForeground(Color.RED);
		Mainframe.getContentPane().add(avgGPA);
		
		
	}
}
