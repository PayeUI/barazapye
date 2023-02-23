package incomeAnalysis;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PAYE {
	
	   private static JFrame mainFrame;
	  	    
		   public static void main(String[] args) {
		        payeUI();
		    }
		   
		    public void GUI (){
		        payeUI() ;
		    }
		    private static void payeUI() {
		        mainFrame = new JFrame("PAYE CALCULATOR");
		        mainFrame.setSize(400,400);

		        // create labels for each text field
		        JLabel payPeriodLabel = new JLabel("Pay Period:");
		        JLabel basicSalaryLabel = new JLabel("Basic Salary:");
		        JLabel benefitsLabel = new JLabel("Benefits Allowed:");
		        JLabel deductionsLabel = new JLabel("Deductions:");
		        JLabel taxLabel = new JLabel("Tax:");
		        JLabel netPayLabel = new JLabel("Net Pay:");

		        // create text fields
		        JTextField payPeriodField = new JTextField(10);
		        JTextField basicSalaryField = new JTextField(10);
		        JTextField benefitsField = new JTextField(10);
		        JTextField deductionsField = new JTextField(10);
		        JTextField taxField = new JTextField(10);
		        JTextField netPayField = new JTextField(10);
		        
		        payPeriodField.setPreferredSize(new Dimension(50, 10));
		        basicSalaryField.setPreferredSize(new Dimension(50, 10));
		        benefitsField.setPreferredSize(new Dimension(50, 20));
		        deductionsField.setPreferredSize(new Dimension(70, 20));
		        taxField.setPreferredSize(new Dimension(70, 20));
		        netPayField.setPreferredSize(new Dimension(700, 20));

		        // create button
		        JButton calbutton = new JButton("CALCULATE");
		        calbutton.setBorder(null);


		        // create panel and add labels and text fields to it
		        JPanel panel = new JPanel(new GridLayout(6,2,5,5));
		        panel.add(payPeriodLabel);
		        panel.add(payPeriodField);
		        panel.add(basicSalaryLabel);
		        panel.add(basicSalaryField);
		        panel.add(benefitsLabel);
		        panel.add(benefitsField);
		        panel.add(deductionsLabel);
		        panel.add(deductionsField);
		        panel.add(taxLabel);
		        panel.add(taxField);
		        panel.add(netPayLabel);
		        panel.add(netPayField);

		        // add button and panel to main frame
		        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		        buttonPanel.add(calbutton);
		        mainFrame.add(panel, BorderLayout.CENTER);
		        mainFrame.add(buttonPanel, BorderLayout.SOUTH);
		        
		        // display the GUI
		        mainFrame.setVisible(true);
		    }
private static double calculateTax(double taxableIncome) {
    // Implement the tax calculation logic here
    // This is just a placeholder implementation
    if (taxableIncome <= 10000) {
        return 0;
    } else if (taxableIncome <= 20000) {
        return 0.1 * (taxableIncome - 10000);
    } else if (taxableIncome <= 30000) {
        return 0.2 * (taxableIncome - 20000) + 1000;
    } else {
        return 0.3 * (taxableIncome - 30000) + 3000;
    }
}
}
