package Roman_Integer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

import javax.swing.*;

public class FrontEnd extends JFrame implements ActionListener{
	
	JPanel panel;
	JTextField textfield;
	ImageIcon icon;

	// Font format for the buttons
	Font font = new Font("Times new roman", Font.BOLD, 20);
	
	private JTextField RomanField, integerField, resultfield; 
    private JButton Convert1Button;
    private Roman_INT roman;
    

    public FrontEnd() {

        this.setTitle("R-I Converter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 400);
        this.setLocationRelativeTo(null); // Center the frame

        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(6, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel RomanLabel = new JLabel("Roman:");
        RomanField = new JTextField(10);
        RomanField.setFont(font);

        JLabel integerLabel = new JLabel("Integer:");
        integerField = new JTextField(10);
        integerField.setFont(font);
        JLabel resultLabel = new JLabel("Result:");
        resultfield = new JTextField(10);
        resultfield.setEditable(false);
        resultfield.setFont(font);


        Convert1Button = new JButton("Convert");
        
      
        this.setVisible(true);
        
        
     // Add labels and fields to the input panel
        inputPanel.add(RomanLabel);
        inputPanel.add(RomanField);
        inputPanel.add(integerLabel);
        inputPanel.add(integerField);
        inputPanel.add(resultLabel);
        inputPanel.add(resultfield);
     
        
        Convert1Button = new JButton("Convert");
        Convert1Button.setFont(new Font("Times new roman", Font.BOLD, 12));
        Convert1Button.setPreferredSize(new Dimension(100, 30)); // Set preferred size for the button

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT)); // Align button to the right
        buttonPanel.add(Convert1Button);
       
 

        mainPanel.add(inputPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.PAGE_END);
       
        icon= new ImageIcon("OIP.jpg");
        
        this.setIconImage(icon.getImage());
        this.add(mainPanel);
        
        
        roman = new Roman_INT();
        
        Convert1Button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	    if (!RomanField.getText().isEmpty()) {
        	        resultfield.setText("Your Result is: " + Convert1());
        	}   else if (!integerField.getText().isEmpty()) {
        		    resultfield.setText("Your Result is: " + Convert2());
        	}   else {
        		    resultfield.setText("Please enter a value.");
        	}
        	}
        	});
      
    }

	public String Convert1() {
			String roma = RomanField.getText();
			int result = 0;
			try {
			    result = Roman_INT.romanToInt(roma);
			}catch(InputMismatchException e) {
				System.out.println("Enter valid input");
			}
	    	
	    	clear();
	    	return String.valueOf(result);
		
    	
    }
    
    public String Convert2() {
    	int roma = Integer.parseInt(integerField.getText());
    	clear();
    	return String.valueOf(Roman_INT.intToRoman(roma));
    }
    
    public void clear() {
    	RomanField.setText("");
    	integerField.setText("");
    }

	
	  public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                new FrontEnd().setVisible(true);
	            }
	        });
	  }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	


}
 
