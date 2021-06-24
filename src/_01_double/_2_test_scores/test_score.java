package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class test_score {
	
	public static void main(String[] args) {
		
		
		String score = JOptionPane.showInputDialog("what is your test score");
		
		double test = Double.parseDouble(score);
		
		
		
		if (test > 85) {JOptionPane.showMessageDialog(null, "Good enough");}
		else if (test < 85 && test >  70){JOptionPane.showMessageDialog(null, "Do better next time");}
		else if (test < 70 && test > 55 ) {JOptionPane.showMessageDialog(null, "Sorry, but u failed");}
		else if (test < 55 && test > 40) {JOptionPane.showMessageDialog(null, "did u even try");}
		else if (test < 40) {JOptionPane.showMessageDialog(null, "I think your in the worng grade");}
		
		
		
		
	}

}
