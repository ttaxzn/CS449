import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GUI {
	
	private JButton[] buttons = null;
	public int num=3;
	JFrame frame = new JFrame("SOS GAME");
	ButtonGroup group1 = new ButtonGroup();
	ButtonGroup group2 = new ButtonGroup();
	ButtonGroup group3 = new ButtonGroup();
    JLabel label1 = new JLabel("SOS");
    JRadioButton radio1 = new JRadioButton("Simple Game");
    JRadioButton radio2 = new JRadioButton("General Game");
   
    JLabel label2 = new JLabel("Board Size");
    JTextField text1 = new JTextField("3");
    JLabel label3 = new JLabel("Blue Player");
    JRadioButton radio3 = new JRadioButton("S");
    JRadioButton radio4 = new JRadioButton("O");
    JLabel label4 = new JLabel("Red Player");
    JRadioButton radio5 = new JRadioButton("S");
    JRadioButton radio6 = new JRadioButton("O");
    JLabel label5 = new JLabel("Current Turn:");
    JLabel label6 = new JLabel("Blue");
    JButton plus = new JButton("+");
    JButton minus = new JButton("-");
    
    public int getNum() {
    	return this.num;
    }
    Stack <String> stack = new Stack<String>();
    Stack <String> stack1 = new Stack<String>();
   
    public boolean gameSelected() {
    	if(radio1.isSelected()==true || radio2.isSelected())
    	{
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean player1Select() {
    	if(radio3.isSelected()==true || radio4.isSelected())
    	{
    		return true;
    	}
    	else {
    		return false;
    	}
    }
   

	public GUI() {
		
		// Grouping for game mode
		 group1.add(radio1);
		 group1.add(radio2);
		 
		 //Grouping for Player 1
		 group2.add(radio3);
		 group2.add(radio4);
		 
		 //Grouping for Player 2
		 group3.add(radio5);
		 group3.add(radio6);
		num=getNum();
		int n = num*num; // DEFAULT STARTING NUMBERS
		for (int j=1; j<81; j++)
		{
			if(j%2==0)
			{
			stack.push("O");
			}
			else {
				stack.push("S");
			}
		}
		
		for (int k=1; k<81; k++)
		{
			if(k%2==0)
			{
			stack1.push("Red");
			}
			else {
				stack1.push("Blue");
			}
		}
		
		frame.setSize(700, 500);
	    frame.setLayout(null);
	      
	    
	    
	    
	    	
	    	  // 3x3 BOARD
	  	    JPanel panel3 = new JPanel(new GridLayout(num, num));
	  	      buttons = new JButton[n];
	  	      for(int i=0; i<n; i++)
	  	      {
	  	    	  final int finali=i;
	  	    	  buttons[i]=new JButton();
	  	    	  buttons[i].addActionListener(new ActionListener() {
	  	    		  public void actionPerformed(ActionEvent e) {
	  	    			  buttons[finali].setText("S");
	  	    		  }
	  	    	  });
	  	    	  panel3.add(buttons[i]);
	  	      }
	  	      
	  	      // 4x4 BOARD
	  	    JPanel panel4 = new JPanel(new GridLayout(4, 4));
	  	      buttons = new JButton[16];
	  	      for(int i=0; i<16; i++)
	  	      {
	  	    	  final int finali=i;
	  	    	  buttons[i]=new JButton();
	  	    	  buttons[i].addActionListener(new ActionListener() {
	  	    		  public void actionPerformed(ActionEvent e) {
	  	    			  buttons[finali].setText("S");
	  	    		  }
	  	    	  });
	  	    	  panel4.add(buttons[i]);
	  	      }
	  	      
	  	      //5x5 BOARD
	  	    JPanel panel5 = new JPanel(new GridLayout(5, 5));
	  	      buttons = new JButton[25];
	  	      for(int i=0; i<25; i++)
	  	      {
	  	    	  final int finali=i;
	  	    	  buttons[i]=new JButton();
	  	    	  buttons[i].addActionListener(new ActionListener() {
	  	    		  public void actionPerformed(ActionEvent e) {
	  	    			  buttons[finali].setText("S");
	  	    		  }
	  	    	  });
	  	    	  panel5.add(buttons[i]);
	  	      }
	  	      
	  	    JPanel panel6 = new JPanel(new GridLayout(6, 6));
	  	      buttons = new JButton[36];
	  	      for(int i=0; i<36; i++)
	  	      {
	  	    	  final int finali=i;
	  	    	  buttons[i]=new JButton();
	  	    	  buttons[i].addActionListener(new ActionListener() {
	  	    		  public void actionPerformed(ActionEvent e) {
	  	    			  buttons[finali].setText("S");
	  	    		  }
	  	    	  });
	  	    	  panel6.add(buttons[i]);
	  	      }
	  	      
	  	    JPanel panel7 = new JPanel(new GridLayout(7, 7));
	  	      buttons = new JButton[49];
	  	      for(int i=0; i<49; i++)
	  	      {
	  	    	  final int finali=i;
	  	    	  buttons[i]=new JButton();
	  	    	  buttons[i].addActionListener(new ActionListener() {
	  	    		  public void actionPerformed(ActionEvent e) {
	  	    			  buttons[finali].setText("S");
	  	    		  }
	  	    	  });
	  	    	  panel7.add(buttons[i]);
	  	      }
	  	      
	  	      
	  	    JPanel panel8 = new JPanel(new GridLayout(8, 8));
	  	      buttons = new JButton[64];
	  	      for(int i=0; i<64; i++)
	  	      {
	  	    	  final int finali=i;
	  	    	  buttons[i]=new JButton();
	  	    	  buttons[i].addActionListener(new ActionListener() {
	  	    		  public void actionPerformed(ActionEvent e) {
	  	    			  buttons[finali].setText(stack.peek());
	  	    			  label6.setText(stack1.peek());
	  	    			  stack1.pop();
	  	    			  stack.pop();
	  	    		  }
	  	    	  });
	  	    	  panel8.add(buttons[i]);
	  	      }
	  	      
	  	      //SETTING PANELS VIEWS TO FALSE
	  	      panel4.setVisible(false);
	  	      panel5.setVisible(false);
	  	      panel6.setVisible(false);
	  	      panel7.setVisible(false);
	  	      panel8.setVisible(false);

	  	      
	  	      //ALLIGNING PANELS TO BOUNDS
	  	      panel3.setBounds(200, 100, 300, 300);
	  	      panel4.setBounds(200, 100, 300, 300);
	  	      panel5.setBounds(200, 100, 300, 300);
	  	      panel6.setBounds(200, 100, 300, 300);
	  	      panel7.setBounds(200, 100, 300, 300);
	  	      panel8.setBounds(200, 100, 300, 300);


	  	      //ADDING PANELS TO FRAME
	  	      frame.add(panel3);
		      frame.add(panel4);
	  	      frame.add(panel5);
	  	      frame.add(panel6);
	  	      frame.add(panel7);
	  	      frame.add(panel8);

		      
		      plus.addActionListener(new ActionListener( ) {
			    	public void actionPerformed(ActionEvent e) {
			    		num++;
			    		text1.setText(String.valueOf(num));
			    		if(num==4) {
				  	    	 panel3.setVisible(false);
				  	    	 panel4.setVisible(true);
				  	     }
			    		if(num==5) {
				  	    	 panel3.setVisible(false);
				  	    	 panel4.setVisible(false);
				  	    	 panel5.setVisible(true);
				  	    	 panel6.setVisible(false);
				  	    	 panel7.setVisible(false);
				  	    	 panel8.setVisible(false);
				  	     }
			    		if(num==6) {
			    			panel3.setVisible(false);
				  	    	 panel4.setVisible(false);
				  	    	 panel5.setVisible(false);
				  	    	 panel6.setVisible(true);
				  	    	 panel7.setVisible(false);
				  	    	 panel8.setVisible(false);
			    		}
			    		if(num==7) {
			    			panel3.setVisible(false);
				  	    	 panel4.setVisible(false);
				  	    	 panel5.setVisible(false);
				  	    	 panel6.setVisible(false);
				  	    	 panel7.setVisible(true);
				  	    	 panel8.setVisible(false);
			    		}
			    		
			    		if(num==8) {
			    			panel3.setVisible(false);
				  	    	 panel4.setVisible(false);
				  	    	 panel5.setVisible(false);
				  	    	 panel6.setVisible(false);
				  	    	 panel7.setVisible(false);
				  	    	 panel8.setVisible(true);
			    		}
			    	}
			    });
			    
			    minus.addActionListener(new ActionListener( ) {
			    	public void actionPerformed(ActionEvent e) {
			    		num--;
			    		text1.setText(String.valueOf(num));
			    		if(num==3) {
				  	    	 panel3.setVisible(true);
				  	    	 panel4.setVisible(false);
				  	    	 panel5.setVisible(false);
				  	    	 panel6.setVisible(false);
				  	    	 panel7.setVisible(false);
				  	    	 panel8.setVisible(false);
				  	     }
			    		if(num==4) {
			    			panel3.setVisible(false);
				  	    	 panel4.setVisible(true);
				  	    	 panel5.setVisible(false);
				  	    	 panel6.setVisible(false);
				  	    	 panel7.setVisible(false);
				  	    	 panel8.setVisible(false);
			    		}
			    		if(num==5) {
			    			panel3.setVisible(false);
				  	    	 panel4.setVisible(false);
				  	    	 panel5.setVisible(true);
				  	    	 panel6.setVisible(false);
				  	    	 panel7.setVisible(false);
				  	    	 panel8.setVisible(false);
			    		}
			    		if(num==6) {
			    			panel3.setVisible(false);
				  	    	 panel4.setVisible(false);
				  	    	 panel5.setVisible(false);
				  	    	 panel6.setVisible(true);
				  	    	 panel7.setVisible(false);
				  	    	 panel8.setVisible(false);
			    		}
			    		if(num==7) {
			    			panel3.setVisible(false);
				  	    	 panel4.setVisible(false);
				  	    	 panel5.setVisible(false);
				  	    	 panel6.setVisible(false);
				  	    	 panel7.setVisible(true);
				  	    	 panel8.setVisible(false);
			    		}
			    		
			    		if(num==8) {
			    			panel3.setVisible(false);
				  	    	 panel4.setVisible(false);
				  	    	 panel5.setVisible(false);
				  	    	 panel6.setVisible(false);
				  	    	 panel7.setVisible(false);
				  	    	 panel8.setVisible(true);
			    		}
			    	}
			    });

	  	    
	  	     
	      
	    
	      // Setting position and size of a button
	      radio1.setBounds(130, 30, 120, 30);
	      radio2.setBounds(250, 30, 120, 30);
	      label1.setBounds(100, 30,120,30);
	      label2.setBounds(500, 30, 120, 30);
	      text1.setBounds(590, 30, 50, 30);
	      plus.setBounds(650, 20, 20, 20);
	      minus.setBounds(650, 50, 20, 20);
	      label3.setBounds(30, 150, 100, 30);
	      radio3.setBounds(45, 200, 50, 30);
	      radio4.setBounds(45, 230, 50, 30);
	      label4.setBounds(580, 150, 100, 30);
	      radio5.setBounds(590, 200, 50, 30);
	      radio6.setBounds(590, 230, 50, 30);
	      label5.setBounds(290, 420, 120, 30);
	      label6.setBounds(390, 420, 120, 30);
	      frame.add(label1);
	      frame.add(radio1);
	      frame.add(radio2);
	      frame.add(label2);
	      frame.add(text1);
	      frame.add(label3);
	      frame.add(radio3);
	      frame.add(radio4);
	      frame.add(label4);
	      frame.add(radio5);
	      frame.add(radio6);
	      frame.add(label5);
	      frame.add(label6);
	      frame.add(plus);
	      frame.add(minus);
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setLocationRelativeTo(null);
	      frame.setVisible(true);
		
		

		
		
	}
	public static void main(String[] args) {
		new GUI();
	}

}
