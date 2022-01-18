package midTermProject;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class CalcAll{

	/**
	 * 
	 */

	JFrame Calcframe;
	JTextField litTxt, mathTxt, engTxt, chemTxt, bioTxt, histTxt, geoTxt, phyTxt;
	JLabel engG, chemG, bioG, histG, geoG, phyG;
	JCheckBox litCheck, mathCheck, engCheck, chemCheck, bioCheck, histCheck, geoCheck, phyCheck;
	JButton confirmClasses, confirmGrades;
	JLabel selectionLbl, note;
	
	private double totalGrades;
	private double totalInputs;
	JLabel finalLbl;
	JLabel gradeLbl;
	
	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcAll window = new CalcAll();
					window.Calcframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
	}*/

	/**
	 * Create the application.
	 */
	public CalcAll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//sets up the frame
		Calcframe = new JFrame();
		Calcframe.setBounds(100, 100, 5000, 5000);
		Calcframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Calcframe.getContentPane().setLayout(null);
		
		//shows literature label and the according JtextField object in the output window 
		JLabel litG = new JLabel("Enter Literature Grades Here:");
		litG.setBounds(642, 32, 229, 16);
		litG.setFont(new Font("Myanmar MN", Font.PLAIN, 15));
		Calcframe.getContentPane().add(litG);
		
		
		litTxt = new JTextField();
		litTxt.setColumns(10);
		litTxt.setBounds(642, 60, 85, 26);
		litTxt.setBackground(new Color(240, 248, 255));
		Calcframe.getContentPane().add(litTxt);
		
		
		//shows mathematics label and the according JtextField object in the output window 
		
		JLabel mathG = new JLabel("Enter Math Grades Here:");
		mathG.setBounds(642, 109, 229, 16);
		mathG.setFont(new Font("Myanmar MN", Font.PLAIN, 15));
		Calcframe.getContentPane().add(mathG);
		
		mathTxt = new JTextField();
		mathTxt.setBounds(642, 137, 85, 26);
		mathTxt.setBackground(new Color(240, 248, 255));
		mathTxt.setColumns(10);
		Calcframe.getContentPane().add(mathTxt);
		
		//shows English label and the according JtextField object in the output window 
		
		engG = new JLabel("Enter English Grades Here:");
		engG.setBounds(642, 186, 229, 16);
		engG.setFont(new Font("Myanmar MN", Font.PLAIN, 15));
		Calcframe.getContentPane().add(engG);
		
		engTxt = new JTextField();
		engTxt.setBounds(642, 214, 85, 26);
		engTxt.setColumns(10);
		engTxt.setBackground(new Color(240, 248, 255));
		Calcframe.getContentPane().add(engTxt);
		
		//shows Chemistry label and the according JtextField object in the output window 
		chemG = new JLabel("Enter Chemistry Grades Here:");
		chemG.setBounds(642, 263, 229, 16);
		chemG.setFont(new Font("Myanmar MN", Font.PLAIN, 15));
		Calcframe.getContentPane().add(chemG);
		
		chemTxt = new JTextField();
		chemTxt.setBounds(642, 291, 85, 26);
		chemTxt.setColumns(10);
		chemTxt.setBackground(new Color(240, 248, 255));
		Calcframe.getContentPane().add(chemTxt);
		
		//shows Biology label and the according JtextField object in the output window 
		bioG = new JLabel("Enter Biology Grades Here:");
		bioG.setFont(new Font("Myanmar MN", Font.PLAIN, 15));
		bioG.setBounds(642, 344, 229, 16);
		Calcframe.getContentPane().add(bioG);
		
		bioTxt = new JTextField();
		bioTxt.setColumns(10);
		bioTxt.setBackground(new Color(240, 248, 255));
		bioTxt.setBounds(642, 372, 85, 26);
		Calcframe.getContentPane().add(bioTxt);
		
		//shows History label and the according JtextField object in the output window 
		histG = new JLabel("Enter History Grades Here:");
		histG.setFont(new Font("Myanmar MN", Font.PLAIN, 15));
		histG.setBounds(642, 420, 229, 16);
		Calcframe.getContentPane().add(histG);
		
		histTxt = new JTextField();
		histTxt.setColumns(10);
		histTxt.setBackground(new Color(240, 248, 255));
		histTxt.setBounds(642, 448, 85, 26);
		Calcframe.getContentPane().add(histTxt);
		
		//shows Geography label and the according JtextField object in the output window 
		geoG = new JLabel("Enter Geography Grades Here:");
		geoG.setFont(new Font("Myanmar MN", Font.PLAIN, 15));
		geoG.setBounds(642, 500, 229, 16);
		Calcframe.getContentPane().add(geoG);
		
		geoTxt = new JTextField();
		geoTxt.setColumns(10);
		geoTxt.setBackground(new Color(240, 248, 255));
		geoTxt.setBounds(642, 534, 85, 26);
		Calcframe.getContentPane().add(geoTxt);
		
		//shows Physics label and the according JtextField object in the output window 
		phyG = new JLabel("Enter Physics Grades Here:");
		phyG.setFont(new Font("Myanmar MN", Font.PLAIN, 15));
		phyG.setBounds(642, 580, 229, 16);
		Calcframe.getContentPane().add(phyG);
		
		phyTxt = new JTextField();
		phyTxt.setColumns(10);
		phyTxt.setBackground(new Color(240, 248, 255));
		phyTxt.setBounds(642, 610, 85, 26);
		Calcframe.getContentPane().add(phyTxt);
		
		
		//displays label
		selectionLbl = new JLabel("Please select the classes you are taking this year: ");
		selectionLbl.setBounds(98, 31, 400, 26);
		selectionLbl.setFont(new Font("Myanmar MN", Font.PLAIN, 15));
		Calcframe.getContentPane().add(selectionLbl);
		
		//displays label
		note = new JLabel("You must take, therefore select, minimum 6 classes for a valid GPA !");
		note.setBounds(98, 61, 500, 26);
		note.setFont(new Font("Myanmar MN", Font.PLAIN, 15));
		Calcframe.getContentPane().add(note);
		
		//displays checkboxes
		litCheck = new JCheckBox("Literature");
		litCheck.setBounds(100, 91, 128, 23);
		litCheck.setFont(new Font("Myanmar MN", Font.PLAIN, 15));
		Calcframe.getContentPane().add(litCheck);
		
		mathCheck = new JCheckBox("Mathematics");
		mathCheck.setBounds(100, 121, 128, 23);
		mathCheck.setFont(new Font("Myanmar MN", Font.PLAIN, 15));
		Calcframe.getContentPane().add(mathCheck);
		
		engCheck = new JCheckBox("English");
		engCheck.setBounds(100, 151, 128, 23);
		engCheck.setFont(new Font("Myanmar MN", Font.PLAIN, 15));
		Calcframe.getContentPane().add(engCheck);
		
		chemCheck = new JCheckBox("Chemistry");
		chemCheck.setBounds(100, 181, 128, 23);
		chemCheck.setFont(new Font("Myanmar MN", Font.PLAIN, 15));
		Calcframe.getContentPane().add(chemCheck);
		
		bioCheck = new JCheckBox("Biology");
		bioCheck.setBounds(252, 91, 128, 23);
		bioCheck.setFont(new Font("Myanmar MN", Font.PLAIN, 15));
		Calcframe.getContentPane().add(bioCheck);
		
		histCheck = new JCheckBox("History");
		histCheck.setBounds(252, 121, 128, 23);
		histCheck.setFont(new Font("Myanmar MN", Font.PLAIN, 15));
		Calcframe.getContentPane().add(histCheck);
		
		geoCheck = new JCheckBox("Geology");
		geoCheck.setBounds(252, 151, 128, 23);
		geoCheck.setFont(new Font("Myanmar MN", Font.PLAIN, 15));
		Calcframe.getContentPane().add(geoCheck);
		
		phyCheck = new JCheckBox("Physics");
		phyCheck.setBounds(252, 181, 128, 23);
		phyCheck.setFont(new Font("Myanmar MN", Font.PLAIN, 15));
		Calcframe.getContentPane().add(phyCheck);
		
		//displays confirm button
		confirmClasses = new JButton("Confirm Selected Classes");
		
		/*checks to determine which classes are not selected and 
		 * disables the non-selected classes from text editing */
		confirmClasses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirmClassesMethod();
			}
		});
		
		confirmClasses.setBounds(98, 214, 282, 30);
		confirmClasses.setFont(new Font("Myanmar MN", Font.PLAIN, 15));
		Calcframe.getContentPane().add(confirmClasses);
		
		confirmGrades = new JButton("Confirm Grades");
		confirmGrades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirmClassesMethod();
				Double avgg = new Double(calcAvg()); 
				
				finalLbl = new JLabel("YOUR OVERALL GRADE AVERAGE IS: ");
				finalLbl.setBackground(new Color(0, 0, 255));
				finalLbl.setForeground(new Color(0, 0, 205));
				finalLbl.setFont(new Font("Myanmar MN", Font.PLAIN, 25));
				finalLbl.setBounds(27, 331, 519, 37);
				Calcframe.getContentPane().add(finalLbl);
				
				gradeLbl = new JLabel(avgg.toString());
				gradeLbl.setFont(new Font("Myanmar MN", Font.BOLD, 25));
				gradeLbl.setBounds(252, 405, 128, 30);
				Calcframe.getContentPane().add(gradeLbl);
				
				
			}
		});
		confirmGrades.setForeground(new Color(220, 20, 60));
		confirmGrades.setFont(new Font("Myanmar MN", Font.PLAIN, 20));
		confirmGrades.setBounds(642, 673, 229, 37);
		Calcframe.getContentPane().add(confirmGrades);
		
		
		
		
		
		
		
	}
	
	public double getTotalLit(JTextField a) {
		
		String[] arr = a.getText().split(" ");
		
		double totalvalues = 0.0;
		
		for(int i = 0; i < arr.length; i++) {
			
			totalvalues += Double.valueOf(arr[i]);
		}
		
		return totalvalues;

	}
	
	public double getTotalLitInput(JTextField a) {
		
		String[] arr = a.getText().split(" ");
	
		return arr.length;

	}
	
	public double getTotalMath(JTextField a) {
		
		String[] arr = mathTxt.getText().split(" ");
		
		double totalvalues = 0.0;
		
		for(int i = 0; i < arr.length; i++) {
			totalvalues += Double.valueOf(arr[i]);
		}
		
		return totalvalues;

	}
	
	public double getTotalMathInput(JTextField a) {
		
		String[] arr = mathTxt.getText().split(" ");
	
		return arr.length;

	}
	
	public double getTotalEng(JTextField a) {
		
		String[] arr = engTxt.getText().split(" ");
		
		double totalvalues = 0.0;
		
		for(int i = 0; i < arr.length; i++) {
			totalvalues += Double.valueOf(arr[i]);
		}
		
		return totalvalues;

	}
	
	public double getTotalEngInput(JTextField a) {
		
		String[] arr = engTxt.getText().split(" ");
	
		return arr.length;

	}
	
	public double getTotalChem(JTextField a) {
		
		String[] arr = chemTxt.getText().split(" ");
		
		double totalvalues = 0.0;
		
		for(int i = 0; i < arr.length; i++) {
			totalvalues += Double.valueOf(arr[i]);
		}
		
		return totalvalues;

	}
	
	public double getTotalChemInput(JTextField a) {
		
		String[] arr = chemTxt.getText().split(" ");
	
		return arr.length;

	}
	
	public double getTotalBio(JTextField a) {
		
		String[] arr = bioTxt.getText().split(" ");
		
		double totalvalues = 0.0;
		
		for(int i = 0; i < arr.length; i++) {
			totalvalues += Double.valueOf(arr[i]);
		}
		
		return totalvalues;

	}
	
	public double getTotalBioInput(JTextField a) {
		
		String[] arr = bioTxt.getText().split(" ");
	
		return arr.length;

	}
	
	public double getTotalHist(JTextField a) {
		
		String[] arr = histTxt.getText().split(" ");
		
		double totalvalues = 0.0;
		
		for(int i = 0; i < arr.length; i++) {
			totalvalues += Double.valueOf(arr[i]);
		}
		
		return totalvalues;

	}
	
	public double getTotalHistInput(JTextField a) {
		
		String[] arr = histTxt.getText().split(" ");
	
		return arr.length;

	}	
	
	public double getTotalGeo(JTextField a) {
		
		String[] arr = geoTxt.getText().split(" ");
		
		double totalvalues = 0.0;
		
		for(int i = 0; i < arr.length; i++) {
			totalvalues += Double.valueOf(arr[i]);
		}
		
		return totalvalues;

	}
	
	public double getTotalGeoInput(JTextField a) {
		
		String[] arr = geoTxt.getText().split(" ");
	
		return arr.length;

	}
	
	public double getTotalPhy(JTextField a) {
		
		String[] arr = phyTxt.getText().split(" ");
		
		double totalvalues = 0.0;
		
		for(int i = 0; i < arr.length; i++) {
			totalvalues += Double.valueOf(arr[i]);
		}
		
		return totalvalues;

	}
	
	public double getTotalPhyInput(JTextField a) {
		
		String[] arr = phyTxt.getText().split(" ");
	
		return arr.length;

	}	
	
	
	
	public void confirmClassesMethod() {
		
				
				
				if(!litCheck.isSelected() && !mathCheck.isSelected()){
					
					mathTxt.setEditable(false);
					litTxt.setEditable(false);
					
					ArrayList<Double> grades = new ArrayList<Double>();
					
					Arrays.asList(getTotalEng(engTxt), getTotalChem(chemTxt), getTotalBio(bioTxt), 
							getTotalHist(histTxt), getTotalGeo(geoTxt), getTotalPhy(phyTxt));
					
					for(int i = 0; i < grades.size(); i++) {
						
						totalGrades += grades.get(i);
					}
					
					ArrayList<Double> inputValss = new ArrayList<Double>();
					
					Arrays.asList(getTotalEngInput(engTxt), getTotalChemInput(chemTxt), getTotalBioInput(bioTxt), 
								getTotalHistInput(histTxt), getTotalGeoInput(geoTxt), getTotalPhyInput(phyTxt));
					
					for(int i = 0; i < inputValss.size(); i++) {
						
						totalGrades += inputValss.get(i);
					}
		
					
					
				}
				
				else if(!litCheck.isSelected() && !engCheck.isSelected()){
						
					litTxt.setEditable(false);
					engTxt.setEditable(false);
					
					totalGrades = getTotalMath(mathTxt) + getTotalChem(chemTxt) + getTotalBio(bioTxt) + 
							getTotalHist(histTxt) + getTotalGeo(geoTxt) + getTotalPhy(phyTxt);
					totalInputs = getTotalMathInput(mathTxt) + getTotalChemInput(chemTxt) + getTotalBioInput(bioTxt) + 
							getTotalHistInput(histTxt) + getTotalGeoInput(geoTxt) + getTotalPhyInput(phyTxt);
				
				}
				
				else if(!litCheck.isSelected() && !chemCheck.isSelected()){
						
					litTxt.setEditable(false);
					chemTxt.setEditable(false);
					
					totalGrades = getTotalEng(engTxt) + getTotalMath(mathTxt) + getTotalBio(bioTxt) + 
							getTotalHist(histTxt) + getTotalGeo(geoTxt) + getTotalPhy(phyTxt);
					totalInputs = getTotalEngInput(engTxt) + getTotalMathInput(mathTxt) + getTotalBioInput(bioTxt) + 
							getTotalHistInput(histTxt) + getTotalGeoInput(geoTxt) + getTotalPhyInput(phyTxt);

				}
				
				else if(!litCheck.isSelected() && !bioCheck.isSelected()){
						
					litTxt.setEditable(false);
					bioTxt.setEditable(false);
					
					totalGrades = getTotalEng(engTxt) + getTotalChem(chemTxt) + getTotalMath(mathTxt) + 
							getTotalHist(histTxt) + getTotalGeo(geoTxt) + getTotalPhy(phyTxt);
					totalInputs = getTotalEngInput(engTxt) + getTotalChemInput(chemTxt) + getTotalMathInput(mathTxt) + 
							getTotalHistInput(histTxt) + getTotalGeoInput(geoTxt) + getTotalPhyInput(phyTxt);

				}
				
				else if(!litCheck.isSelected() && !histCheck.isSelected() ){
						
					litTxt.setEditable(false);
					histTxt.setEditable(false);
					
					totalGrades = getTotalEng(engTxt) + getTotalChem(chemTxt) + getTotalBio(bioTxt) + 
							getTotalMath(mathTxt) + getTotalGeo(geoTxt) + getTotalPhy(phyTxt);
					totalInputs = getTotalEngInput(engTxt) + getTotalChemInput(chemTxt) + getTotalBioInput(bioTxt) + 
							getTotalMathInput(mathTxt) + getTotalGeoInput(geoTxt) + getTotalPhyInput(phyTxt);
					
				}
				
				else if(!litCheck.isSelected() && !geoCheck.isSelected()){
						
					litTxt.setEditable(false);
					geoTxt.setEditable(false);
					
					totalGrades = getTotalEng(engTxt) + getTotalChem(chemTxt) + getTotalBio(bioTxt) + 
							getTotalHist(histTxt) + getTotalMath(mathTxt) + getTotalPhy(phyTxt);
					totalInputs = getTotalEngInput(engTxt) + getTotalChemInput(chemTxt) + getTotalBioInput(bioTxt) + 
							getTotalHistInput(histTxt) + getTotalMathInput(mathTxt) + getTotalPhyInput(phyTxt);
				}
				
				else if(!litCheck.isSelected() && !phyCheck.isSelected()){
					
					litTxt.setEditable(false);
					phyTxt.setEditable(false);
					
					totalGrades = getTotalEng(engTxt) + getTotalChem(chemTxt) + getTotalBio(bioTxt) + 
							getTotalHist(histTxt) + getTotalGeo(geoTxt) + getTotalMath(mathTxt);
					totalInputs = getTotalEngInput(engTxt) + getTotalChemInput(chemTxt) + getTotalBioInput(bioTxt) + 
							getTotalHistInput(histTxt) + getTotalGeoInput(geoTxt) + getTotalMathInput(mathTxt);
				}
				
				else if(!mathCheck.isSelected() && !engCheck.isSelected()){
					
					engTxt.setEditable(false);
					mathTxt.setEditable(false);
					
					totalGrades = getTotalLit(litTxt) + getTotalChem(chemTxt) + getTotalBio(bioTxt) + 
							getTotalHist(histTxt) + getTotalGeo(geoTxt) + getTotalPhy(phyTxt);
					totalInputs = getTotalLitInput(litTxt) + getTotalChemInput(chemTxt) + getTotalBioInput(bioTxt) + 
							getTotalHistInput(histTxt) + getTotalGeoInput(geoTxt) + getTotalPhyInput(phyTxt);
				}
				
				else if(!mathCheck.isSelected() && !chemCheck.isSelected()){
					chemTxt.setEditable(false);
					mathTxt.setEditable(false);
					
					totalGrades = getTotalEng(engTxt) + getTotalLit(litTxt) + getTotalBio(bioTxt) + 
							getTotalHist(histTxt) + getTotalGeo(geoTxt) + getTotalPhy(phyTxt);
					totalInputs = getTotalEngInput(engTxt) + getTotalLitInput(litTxt) + getTotalBioInput(bioTxt) + 
							getTotalHistInput(histTxt) + getTotalGeoInput(geoTxt) + getTotalPhyInput(phyTxt);
					
					
				}	
				
				else if(!mathCheck.isSelected() && !bioCheck.isSelected()){
					
					bioTxt.setEditable(false);
					mathTxt.setEditable(false);
					
					totalGrades = getTotalLit(litTxt) + getTotalChem(chemTxt) + getTotalEng(engTxt) + 
							getTotalHist(histTxt) + getTotalGeo(geoTxt) + getTotalPhy(phyTxt);
					
					totalInputs = getTotalLitInput(litTxt) + getTotalChemInput(chemTxt) + getTotalEngInput(engTxt) + 
							getTotalHistInput(histTxt) + getTotalGeoInput(geoTxt) + getTotalPhyInput(phyTxt);
				}
				else if(!mathCheck.isSelected() && !histCheck.isSelected()){
					
					histTxt.setEditable(false);
					mathTxt.setEditable(false);
					
					totalGrades = getTotalLit(litTxt) + getTotalChem(chemTxt) + getTotalBio(bioTxt) + 
							getTotalEng(engTxt) + getTotalGeo(geoTxt) + getTotalPhy(phyTxt);
					totalInputs = getTotalLitInput(litTxt) + getTotalChemInput(chemTxt) + getTotalBioInput(bioTxt) + 
							getTotalEngInput(engTxt) + getTotalGeoInput(geoTxt) + getTotalPhyInput(phyTxt);
					
				}
				else if(!mathCheck.isSelected() && !geoCheck.isSelected()){
					
					geoTxt.setEditable(false);
					mathTxt.setEditable(false);
					
					totalGrades = getTotalLit(litTxt) + getTotalChem(chemTxt) + getTotalBio(bioTxt) + 
							getTotalHist(histTxt) + getTotalEng(engTxt) + getTotalPhy(phyTxt);
					totalInputs = getTotalLitInput(litTxt) + getTotalChemInput(chemTxt) + getTotalBioInput(bioTxt) + 
							getTotalHistInput(histTxt) + getTotalEngInput(engTxt) + getTotalPhyInput(phyTxt);
				}
				else if(!mathCheck.isSelected() && !phyCheck.isSelected()){
					
					phyTxt.setEditable(false);
					mathTxt.setEditable(false);
					
					totalGrades = getTotalLit(litTxt) + getTotalChem(chemTxt) + getTotalBio(bioTxt) + 
							getTotalHist(histTxt) + getTotalGeo(geoTxt) + getTotalEng(engTxt);
					totalInputs = getTotalLitInput(litTxt) + getTotalChemInput(chemTxt) + getTotalBioInput(bioTxt) + 
							getTotalHistInput(histTxt) + getTotalGeoInput(geoTxt) + getTotalEngInput(engTxt);
				}
				else if(!engCheck.isSelected() && !chemCheck.isSelected()){
					
					chemTxt.setEditable(false);
					engTxt.setEditable(false);
					
					totalGrades = getTotalLit(litTxt) + getTotalMath(mathTxt) + getTotalBio(bioTxt) + 
							getTotalHist(histTxt) + getTotalGeo(geoTxt) + getTotalPhy(phyTxt);
					totalInputs = getTotalLitInput(litTxt) + getTotalMathInput(mathTxt) + getTotalBioInput(bioTxt) + 
							getTotalHistInput(histTxt) + getTotalGeoInput(geoTxt) + getTotalPhyInput(phyTxt);
				}	
				else if(!engCheck.isSelected() && !bioCheck.isSelected()){
					
					bioTxt.setEditable(false);
					engTxt.setEditable(false);
					
					totalGrades = getTotalLit(litTxt) + getTotalMath(mathTxt) + getTotalChem(chemTxt) + 
							getTotalHist(histTxt) + getTotalGeo(geoTxt) + getTotalPhy(phyTxt);
					totalInputs = getTotalLitInput(litTxt) + getTotalMathInput(mathTxt) + getTotalChemInput(chemTxt) + 
							getTotalHistInput(histTxt) + getTotalGeoInput(geoTxt) + getTotalPhyInput(phyTxt);
				}
				else if(!engCheck.isSelected() && !histCheck.isSelected()){
					
					histTxt.setEditable(false);
					engTxt.setEditable(false);
					
					totalGrades = getTotalLit(litTxt) + getTotalMath(mathTxt) + getTotalBio(bioTxt) + 
							getTotalChem(chemTxt) + getTotalGeo(geoTxt) + getTotalPhy(phyTxt);
					totalInputs = getTotalLitInput(litTxt) + getTotalMathInput(mathTxt) + getTotalBioInput(bioTxt) + 
							getTotalChemInput(chemTxt) + getTotalGeoInput(geoTxt) + getTotalPhyInput(phyTxt);
				}
				else if(!engCheck.isSelected() && !geoCheck.isSelected()){
					
					geoTxt.setEditable(false);
					engTxt.setEditable(false);
					
					totalGrades = getTotalLit(litTxt) + getTotalMath(mathTxt) + getTotalBio(bioTxt) + 
							getTotalHist(histTxt) + getTotalChem(chemTxt) + getTotalPhy(phyTxt);
					totalInputs = getTotalLitInput(litTxt) + getTotalMathInput(mathTxt) + getTotalBioInput(bioTxt) + 
							getTotalHistInput(histTxt) + getTotalChemInput(chemTxt) + getTotalPhyInput(phyTxt);
				}
				else if(!engCheck.isSelected() && !phyCheck.isSelected()){
					
					phyTxt.setEditable(false);
					engTxt.setEditable(false);
					
					totalGrades = getTotalLit(litTxt) + getTotalMath(mathTxt) + getTotalBio(bioTxt) + 
							getTotalHist(histTxt) + getTotalGeo(geoTxt) + getTotalChem(chemTxt);
					totalInputs = getTotalLitInput(litTxt) + getTotalMathInput(mathTxt) + getTotalBioInput(bioTxt) + 
							getTotalHistInput(histTxt) + getTotalGeoInput(geoTxt) + getTotalChemInput(chemTxt);
				}
				else if(!chemCheck.isSelected() && !bioCheck.isSelected()){
					
					bioTxt.setEditable(false);
					chemTxt.setEditable(false);
					
					totalGrades = getTotalLit(litTxt) + getTotalMath(mathTxt) + getTotalEng(engTxt) + 
							getTotalHist(histTxt) + getTotalGeo(geoTxt) + getTotalPhy(phyTxt);
					totalInputs = getTotalLitInput(litTxt) + getTotalMathInput(mathTxt) + getTotalEngInput(engTxt) + 
							getTotalHistInput(histTxt) + getTotalGeoInput(geoTxt) + getTotalPhyInput(phyTxt);
				}
				else if(!chemCheck.isSelected() && !histCheck.isSelected()){
					
					histTxt.setEditable(false);
					chemTxt.setEditable(false);
					
					totalGrades = getTotalLit(litTxt) + getTotalMath(mathTxt) + getTotalEng(engTxt) + 
							getTotalBio(bioTxt) + getTotalGeo(geoTxt) + getTotalPhy(phyTxt);
					totalInputs = getTotalLitInput(litTxt) + getTotalMathInput(mathTxt) + getTotalEngInput(engTxt) + 
							getTotalBioInput(bioTxt) + getTotalGeoInput(geoTxt) + getTotalPhyInput(phyTxt);
				}
				else if(!chemCheck.isSelected() && !geoCheck.isSelected()){
					
					geoTxt.setEditable(false);
					chemTxt.setEditable(false);
					
					totalGrades = getTotalLit(litTxt) + getTotalMath(mathTxt) + getTotalEng(engTxt) + 
							getTotalHist(histTxt) + getTotalBio(bioTxt) + getTotalPhy(phyTxt);
					totalInputs = getTotalLitInput(litTxt) + getTotalMathInput(mathTxt) + getTotalEngInput(engTxt) + 
							getTotalHistInput(histTxt) + getTotalBioInput(bioTxt) + getTotalPhyInput(phyTxt);
				}
				else if(!chemCheck.isSelected() && !phyCheck.isSelected()){
					
					phyTxt.setEditable(false);
					chemTxt.setEditable(false);
					
					totalGrades = getTotalLit(litTxt) + getTotalMath(mathTxt) + getTotalEng(engTxt) + 
							getTotalHist(histTxt) + getTotalGeo(geoTxt) + getTotalBio(bioTxt);
					totalInputs = getTotalLitInput(litTxt) + getTotalMathInput(mathTxt) + getTotalEngInput(engTxt) + 
							getTotalHistInput(histTxt) + getTotalGeoInput(geoTxt) + getTotalBioInput(bioTxt);
				}
				
				else if(!bioCheck.isSelected() && !geoCheck.isSelected()){
					
					geoTxt.setEditable(false);
					bioTxt.setEditable(false);
					
					totalGrades = getTotalLit(litTxt) + getTotalMath(mathTxt) + getTotalEng(engTxt) + 
							getTotalHist(histTxt) + getTotalChem(chemTxt) + getTotalPhy(phyTxt);
					totalInputs = getTotalLitInput(litTxt) + getTotalMathInput(mathTxt) + getTotalEngInput(engTxt) + 
							getTotalHistInput(histTxt) + getTotalChemInput(chemTxt) + getTotalPhyInput(phyTxt);
				}
				else if(!bioCheck.isSelected() && !phyCheck.isSelected()){
					
					phyTxt.setEditable(false);
					bioTxt.setEditable(false);
					
					totalGrades = getTotalLit(litTxt) + getTotalMath(mathTxt) + getTotalEng(engTxt) + 
							getTotalHist(histTxt) + getTotalChem(chemTxt) + getTotalGeo(geoTxt);
					totalInputs = getTotalLitInput(litTxt) + getTotalMathInput(mathTxt) + getTotalEngInput(engTxt) + 
							getTotalHistInput(histTxt) + getTotalChemInput(chemTxt) + getTotalGeoInput(geoTxt);
				}
				else if(!geoCheck.isSelected() && !phyCheck.isSelected()){
					
					phyTxt.setEditable(false);
					geoTxt.setEditable(false);
					
					totalGrades = getTotalLit(litTxt) + getTotalMath(mathTxt) + getTotalEng(engTxt) + 
							getTotalHist(histTxt) + getTotalChem(chemTxt) + getTotalBio(bioTxt);
					totalInputs = getTotalLitInput(litTxt) + getTotalMathInput(mathTxt) + getTotalEngInput(engTxt) + 
							getTotalHistInput(histTxt) + getTotalChemInput(chemTxt) + getTotalBioInput(bioTxt);
				}				
				
				else if(!litCheck.isSelected()){
					
					litTxt.setEditable(false);
					totalGrades = getTotalMath(mathTxt) + getTotalEng(engTxt) + 
							getTotalHist(histTxt) + getTotalChem(chemTxt) + getTotalBio(bioTxt) +
							getTotalGeo(geoTxt) + getTotalPhy(phyTxt);;
					totalInputs =  getTotalMathInput(mathTxt) + getTotalEngInput(engTxt) + 
							getTotalHistInput(histTxt) + getTotalChemInput(chemTxt) + getTotalBioInput(bioTxt) +
							getTotalGeoInput(geoTxt) + getTotalPhyInput(geoTxt);

				}
				else if(!mathCheck.isSelected()){
					
					mathTxt.setEditable(false);
					
					totalGrades = getTotalLit(litTxt) + getTotalEng(engTxt) + 
							getTotalHist(histTxt) + getTotalChem(chemTxt) + getTotalBio(bioTxt) +
							getTotalGeo(geoTxt) + getTotalPhy(phyTxt);;
					totalInputs =  getTotalLitInput(litTxt) + getTotalEngInput(engTxt) + 
							getTotalHistInput(histTxt) + getTotalChemInput(chemTxt) + getTotalBioInput(bioTxt) +
							getTotalGeoInput(geoTxt) + getTotalPhyInput(geoTxt);
				}
				else if(!engCheck.isSelected()){
					
					engTxt.setEditable(false);
					
					totalGrades = getTotalLit(litTxt) +  getTotalMath(mathTxt) + 
							getTotalHist(histTxt) + getTotalChem(chemTxt) + getTotalBio(bioTxt) +
							getTotalGeo(geoTxt) + getTotalPhy(phyTxt);
					totalInputs =  getTotalLitInput(litTxt) + getTotalMathInput(mathTxt) + 
							getTotalHistInput(histTxt) + getTotalChemInput(chemTxt) + getTotalBioInput(bioTxt) +
							getTotalGeoInput(geoTxt) + getTotalPhyInput(geoTxt);

				}
				else if(!chemCheck.isSelected()){
					
					chemTxt.setEditable(false);
					
					totalGrades = getTotalLit(litTxt) +  getTotalMath(mathTxt) + 
							getTotalHist(histTxt) + getTotalEng(engTxt) + getTotalBio(bioTxt) +
							getTotalGeo(geoTxt) + getTotalPhy(phyTxt);;
					totalInputs =  getTotalLitInput(litTxt) + getTotalMathInput(mathTxt) + 
							getTotalHistInput(histTxt) + getTotalEngInput(engTxt) + getTotalBioInput(bioTxt) +
							getTotalGeoInput(geoTxt) + getTotalPhyInput(geoTxt);

				}
				else if(!bioCheck.isSelected()){
					
					bioTxt.setEditable(false);
					totalGrades = getTotalLit(litTxt) +  getTotalMath(mathTxt) + 
							getTotalHist(histTxt) + getTotalEng(engTxt) + getTotalChem(chemTxt) +
							getTotalGeo(geoTxt) + getTotalPhy(phyTxt);
					totalInputs =  getTotalLitInput(litTxt) + getTotalMathInput(mathTxt) + 
							getTotalHistInput(histTxt) + getTotalEngInput(engTxt) + getTotalChemInput(chemTxt) +
							getTotalGeoInput(geoTxt) + getTotalPhyInput(geoTxt);

				}
				else if(!histCheck.isSelected()){
					
					histTxt.setEditable(false);
					
					totalGrades = getTotalLit(litTxt) +  getTotalMath(mathTxt) + 
							getTotalBio(bioTxt) + getTotalEng(engTxt) + getTotalChem(chemTxt) +
							getTotalGeo(geoTxt) + getTotalPhy(phyTxt);
					totalInputs =  getTotalLitInput(litTxt) + getTotalMathInput(mathTxt) + 
							getTotalBioInput(bioTxt) + getTotalEngInput(engTxt) + getTotalChemInput(chemTxt) +
							getTotalGeoInput(geoTxt) + getTotalPhyInput(geoTxt);

				}
				else if(!geoCheck.isSelected()){
					
					geoTxt.setEditable(false);
					
					totalGrades = getTotalLit(litTxt) +  getTotalMath(mathTxt) + 
							getTotalBio(bioTxt) + getTotalEng(engTxt) + getTotalChem(chemTxt) +
							getTotalHist(histTxt) + getTotalPhy(phyTxt);
					totalInputs =  getTotalLitInput(litTxt) + getTotalMathInput(mathTxt) + 
							getTotalBioInput(bioTxt) + getTotalEngInput(engTxt) + getTotalChemInput(chemTxt) +
							getTotalHistInput(histTxt) + getTotalPhyInput(geoTxt);
				}
				else if(!phyCheck.isSelected()){
					
					phyTxt.setEditable(false);
					
					totalGrades = getTotalLit(litTxt) +  getTotalMath(mathTxt) + 
							getTotalBio(bioTxt) + getTotalEng(engTxt) + getTotalChem(chemTxt) +
							getTotalHist(histTxt) + getTotalGeo(geoTxt);
					totalInputs =  getTotalLitInput(litTxt) + getTotalMathInput(mathTxt) + 
							getTotalBioInput(bioTxt) + getTotalEngInput(engTxt) + getTotalChemInput(chemTxt) +
							getTotalHistInput(histTxt) + getTotalPhyInput(geoTxt);

				}
				
				else if(litCheck.isSelected() && mathCheck.isSelected() && engCheck.isSelected() && chemCheck.isSelected()
						&& bioCheck.isSelected() && histCheck.isSelected() && geoCheck.isSelected() 
						&& phyCheck.isSelected()) {
					
					totalGrades = getTotalLit(litTxt) +  getTotalMath(mathTxt) + 
							getTotalBio(bioTxt) + getTotalEng(engTxt) + getTotalChem(chemTxt) +
							getTotalHist(histTxt) + getTotalGeo(geoTxt) + getTotalPhy(phyTxt);
					totalInputs =  getTotalLitInput(litTxt) + getTotalMathInput(mathTxt) + 
							getTotalBioInput(bioTxt) + getTotalEngInput(engTxt) + getTotalChemInput(chemTxt) +
							getTotalHistInput(histTxt) + getTotalPhyInput(geoTxt) + getTotalPhyInput(geoTxt);
				}

		
	}
	
	public double calcAvg() {
		double avg = totalGrades/totalInputs;
		return avg;
		
	}

	
}
