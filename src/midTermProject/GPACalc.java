package midTermProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JComboBox;

public class GPACalc {

	JFrame frame;
	JComboBox comboBox;
	JButton goBack;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GPACalc window = new GPACalc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public GPACalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100,5000, 5000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel welcome2 = new JLabel("Welcome to Average Grade Calculator !");
		welcome2.setFont(new Font("Myanmar MN", Font.BOLD, 40));
		welcome2.setBounds(349, 200, 829, 62);
		frame.getContentPane().add(welcome2);
		
		JLabel PleaseSelect = new JLabel("Please select the lesson(s) you would like your grade to be calculated. ");
		PleaseSelect.setForeground(new Color(255, 51, 51));
		PleaseSelect.setFont(new Font("Myanmar MN", Font.PLAIN, 25));
		PleaseSelect.setBounds(349, 288, 829, 52);
		frame.getContentPane().add(PleaseSelect);
		
		String[] classes = {"English", "Mathematics", "Literature", "Geography",
				"History", "Biology", "Chemisty", "Physics", "Calculate all"};
		comboBox = new JComboBox(classes);
		comboBox.setBounds(347, 352, 266, 62);
		frame.getContentPane().add(comboBox);
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					System.out.println(comboBox.getSelectedItem());
							
					if(comboBox.getSelectedItem() == "Calculate all") {
						CalcAll xx = new CalcAll();
						xx.Calcframe.setVisible(true);
						frame.dispose();
						System.out.println("Selected");
						
					}
					
					if(comboBox.getSelectedItem() == "Literature") {
						CalcLit xx = new CalcLit();
						xx.Litframe.setVisible(true);
						frame.dispose();
						System.out.println("Selected");
						
					}
					
					if(comboBox.getSelectedItem() == "English") {
						CalcEng xx = new CalcEng();
						xx.Engframe.setVisible(true);
						frame.dispose();
						System.out.println("Selected");
						
					}
					
					if(comboBox.getSelectedItem() == "Mathematics") {
						CalcMath xx = new CalcMath();
						xx.Mathframe.setVisible(true);
						frame.dispose();
						System.out.println("Selected");
						
					}
					
					if(comboBox.getSelectedItem() == "Chemistry") {
						CalcChem xx = new CalcChem();
						xx.Chemframe.setVisible(true);
						frame.dispose();
						System.out.println("Selected");
						
					}
					
					if(comboBox.getSelectedItem() == "Biology") {
						CalcBio xx = new CalcBio();
						xx.Bioframe.setVisible(true);
						frame.dispose();
						System.out.println("Selected");
						
					}
					
					if(comboBox.getSelectedItem() == "Physics") {
						CalcPhy xx = new CalcPhy();
						xx.Phyframe.setVisible(true);
						frame.dispose();
						System.out.println("Selected");
						
					}
					
					if(comboBox.getSelectedItem() == "Geography") {
						CalcGeo xx = new CalcGeo();
						xx.Geoframe.setVisible(true);
						frame.dispose();
						System.out.println("Selected");
						
					}
					
					if(comboBox.getSelectedItem() == "History") {
						CalcHist xx = new CalcHist();
						xx.Histframe.setVisible(true);
						frame.dispose();
						System.out.println("Selected");
						
					}

			
			}
		});
		
		
		JLabel warning = new JLabel("WARNING: Lessons should only be from one academic year");
		warning.setForeground(new Color(0, 0, 0));
		warning.setFont(new Font("Myanmar MN", Font.PLAIN, 20));
		warning.setBounds(357, 426, 821, 52);
		frame.getContentPane().add(warning);
		
		goBack = new JButton("Go Back");
		goBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Deneme xx = new Deneme();
				xx.Mainframe.setVisible(true);
				frame.dispose();
			}
		});
		goBack.setFont(new Font("Myanmar MN", Font.PLAIN, 15));
		goBack.setBounds(16, 24, 151, 41);
		frame.getContentPane().add(goBack);
	}
}
