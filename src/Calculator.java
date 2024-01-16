import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton equalsButton;
	JButton zeroButton;
	JButton dotButton;
	JButton divButton;
	JButton multiButton;
	JButton subButton;
	JButton addButton;
	JButton clearButton;
	
	boolean isOperatorClicked=false;
	String oldValue="0";
	
	public Calculator(){
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(300, 150);
		
		
		displayLabel=new  JLabel();
		displayLabel.setBounds(30, 50, 540, 40);
		displayLabel.setBackground(Color.LIGHT_GRAY);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setFont(new Font("Serif", Font.PLAIN, 40));
		
		
		jf.add(displayLabel); 
		jf.setVisible(true); 
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		sevenButton = new JButton("7");
		sevenButton.setBounds(30, 130, 80, 80);
		sevenButton.setFont(new Font("Arial",Font.ITALIC, 35));
		sevenButton.setBackground(Color.orange);
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(130, 130, 80, 80);
		eightButton.setFont(new Font("Arial",Font.ITALIC, 35));
		eightButton.setBackground(Color.orange);
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(230, 130, 80, 80);
		nineButton.setFont(new Font("Arial",Font.ITALIC, 35));
		nineButton.setBackground(Color.orange);
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(30, 230, 80, 80);
		fourButton.setFont(new Font("Arial",Font.ITALIC, 35));
		fourButton.setBackground(Color.orange);
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(130, 230, 80, 80);
		fiveButton.setFont(new Font("Arial",Font.ITALIC, 35));
		fiveButton.setBackground(Color.orange);
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(230, 230, 80, 80);
		sixButton.setFont(new Font("Arial",Font.ITALIC, 35));
		sixButton.setBackground(Color.orange);
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(30, 330, 80,80);
		oneButton.setFont(new Font("Arial",Font.ITALIC, 35));
		oneButton.setBackground(Color.orange);
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(130, 330, 80, 80);
		twoButton.setFont(new Font("Arial",Font.ITALIC, 35));
		twoButton.setBackground(Color.orange);
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(230, 330, 80, 80);
		threeButton.setFont(new Font("Arial",Font.ITALIC, 35));
		threeButton.setBackground(Color.orange);
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		equalsButton=new JButton("=");
		equalsButton.setBounds(230, 430, 80, 80);
		equalsButton.setFont(new Font("Arial",Font.ITALIC, 35));
		equalsButton.setBackground(Color.orange);
		equalsButton.addActionListener(this);
		jf.add(equalsButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(130, 430, 80, 80);
		zeroButton.setFont(new Font("Arial",Font.ITALIC, 35));
		zeroButton.setBackground(Color.orange);
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		
		dotButton=new JButton(".");
		dotButton.setBounds(30, 430, 80, 80);
		dotButton.setFont(new Font("Arial",Font.ITALIC, 35));
		dotButton.setBackground(Color.orange);
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		divButton=new JButton("/");
		divButton.setBounds(330, 130, 80, 80);
		divButton.setFont(new Font("Arial",Font.ITALIC, 35));
		divButton.setBackground(Color.orange);
		divButton.addActionListener(this);
		jf.add(divButton);
		
		multiButton=new JButton("x");
		multiButton.setBounds(330, 230, 80, 80);
		multiButton.setFont(new Font("Arial",Font.ITALIC, 35));
		multiButton.setBackground(Color.orange);
		multiButton.addActionListener(this);
		jf.add(multiButton);
		
		subButton=new JButton("-");
		subButton.setBounds(330, 330, 80, 80);
		subButton.setFont(new Font("Arial",Font.ITALIC, 35));
		subButton.setBackground(Color.orange);
		subButton.addActionListener(this);
		jf.add(subButton);
		
		addButton=new JButton("+");
		addButton.setBounds(330, 430, 80, 80);
		addButton.setFont(new Font("Arial",Font.ITALIC, 35));
		addButton.setBackground(Color.orange);
		addButton.addActionListener(this);
		jf.add(addButton);
		
		clearButton=new JButton("Clear");
		clearButton.setBounds(430, 130, 120, 80);
		clearButton.setFont(new Font("Arial",Font.ITALIC, 30));
		clearButton.setBackground(Color.orange);
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
				
		
		
		
		
	}
public static void main(String[] args) {
	new Calculator();
}


@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==sevenButton) {
		if(isOperatorClicked) {
			displayLabel.setText("7");
			isOperatorClicked=false;
		}else {
			displayLabel.setText(displayLabel.getText() +"7");
		}
		
	}
	else if(e.getSource()==eightButton) {
		if(isOperatorClicked) {
			displayLabel.setText("8");
			isOperatorClicked=false;
		}else {
			displayLabel.setText(displayLabel.getText() +"8");
		}
		
	}
	else if(e.getSource()==nineButton){
		if(isOperatorClicked) {
			displayLabel.setText("9");
			isOperatorClicked=false;
		}
		else {
			displayLabel.setText(displayLabel.getText() +"9");
		}	
	}
	else if (e.getSource()==fourButton) {
		if(isOperatorClicked) {
			displayLabel.setText("4");
			isOperatorClicked=false;
		}else {
			displayLabel.setText(displayLabel.getText() +"4");
		}
	}
	else if(e.getSource()==fiveButton) {
		if(isOperatorClicked) {
			displayLabel.setText("5");
			isOperatorClicked=false;
		}else {
			displayLabel.setText(displayLabel.getText() +"5");
		}
	}
	else if(e.getSource()==sixButton) {
		if(isOperatorClicked) {
			displayLabel.setText("6");
			isOperatorClicked=false;
		}else {
			displayLabel.setText(displayLabel.getText() +"6");
		}
		
	}
	else if(e.getSource()==oneButton){
		if(isOperatorClicked) {
			displayLabel.setText("1");
			isOperatorClicked=false;
		}else {
			displayLabel.setText(displayLabel.getText() +"1");
		}
		
	}
	else if(e.getSource()==twoButton) {
		if(isOperatorClicked) {
			displayLabel.setText("2");
			isOperatorClicked=false;
		}else {
			displayLabel.setText(displayLabel.getText() +"2");

		}
	}
	else if(e.getSource()==threeButton)  {
		if(isOperatorClicked) {
			displayLabel.setText("3");
			isOperatorClicked=false;
		}else {
			displayLabel.setText(displayLabel.getText() +"3");

		}
	}
	else if(e.getSource()==zeroButton)  {
		if(isOperatorClicked) {
			displayLabel.setText("0");
			isOperatorClicked=false;
		}else {
			displayLabel.setText(displayLabel.getText() +"0");

		}
	}
	else if(e.getSource()==dotButton) {
		if(isOperatorClicked) {
			displayLabel.setText(".");
			isOperatorClicked=false;
		}else {
			displayLabel.setText(displayLabel.getText() +".");

		}
	}
	else if(e.getSource()==clearButton) {
		displayLabel.setText("");
	}
	
	else if (e.getSource() == equalsButton) {
	    String newValue = displayLabel.getText();

	    float oldValueF = Float.parseFloat(oldValue);
	    float newValueF = Float.parseFloat(newValue);
	    float result = 0;
	    if (isOperatorClicked) {
	        String operator = displayLabel.getText().replaceAll("[0-9.]", ""); // Extract the operator

	        switch (operator) {
	            case "+":
	                result = oldValueF + newValueF;
	                break;
	            case "x":
	                result = oldValueF * newValueF;
	                break;
	            case "-":
	                result = oldValueF - newValueF;
	                break;
	            case "/":
	                if (newValueF != 0) {
	                    result = oldValueF / newValueF;
	                } else {
	                    displayLabel.setText("Error");
	                    return;
	                }
	                break;
	        }

	        oldValue = result + "";
	        newValue = "";
	        displayLabel.setText(result + "");
	        isOperatorClicked = false;
	    }
	}

	
	else if(e.getSource()==addButton) {
		isOperatorClicked=true;
		oldValue=displayLabel.getText();
	}
	else if(e.getSource()==multiButton) {
		isOperatorClicked=true;
		oldValue=displayLabel.getText();
	}
	else if(e.getSource()==subButton) {
		isOperatorClicked=true;
		oldValue=displayLabel.getText();
	}
	else if(e.getSource()==divButton) {
		isOperatorClicked=true;
		oldValue=displayLabel.getText();
	}
	
}
}


