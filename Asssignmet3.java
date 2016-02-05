import javax.swing.*;
import java.awt.event.*;

class Practice3 implements ActionListener 
{
	JFrame fr;
	JTextField t1, t2, t3, t4;
	JButton b1, b2;
	int button;
	int orientation[] =  new int[4];

	Practice3()
	{
		fr = new JFrame();
		fr.setLayout(null);

		t1 = new JTextField("First");
		t1.setHorizontalAlignment(JTextField.RIGHT);
		t2 = new JTextField("Second");
		t2.setHorizontalAlignment(JTextField.LEFT);
		t3 = new JTextField("Third");
		t3.setHorizontalAlignment(JTextField.RIGHT);
		t4 = new JTextField("Fourth");
		t4.setHorizontalAlignment(JTextField.LEFT);

		b1 = new JButton("Change");
		b2 = new JButton("Change All");
		for(int i = 0; i < 4; i++)
			orientation[i] = i%2;
		button = 0;
		
		t1.setBounds(30, 50, 200, 50);
		t2.setBounds(30, 120, 200, 50);
		t3.setBounds(30, 170, 200, 50);
		t4.setBounds(30, 240, 200, 50);
		b1.setBounds(250, 120, 100, 50);
		b2.setBounds(250, 240, 100, 50);
		b1.addActionListener(this);
		b2.addActionListener(this);

		fr.add(t1);
		fr.add(t2);
		fr.add(t3);
		fr.add(t4);
		fr.add(b1);
		fr.add(b2);
		fr.setSize(500, 500);
		fr.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == b1)
		{
			if(button >= 4)
				button = button%4;
			switch(button){

				case 0 : 
						if(orientation[button] == 1)
							{ t1.setHorizontalAlignment(JTextField.RIGHT); orientation[button] = 0; }
						else
							{ t1.setHorizontalAlignment(JTextField.LEFT); orientation[button] = 1; }
						break;

				case 1 : 
						if(orientation[button] == 1)
							{ t2.setHorizontalAlignment(JTextField.RIGHT); orientation[button] = 0; }
						else
							{ t2.setHorizontalAlignment(JTextField.LEFT); orientation[button] = 1; }
						break;

				case 2 : 
						if(orientation[button] == 1)
							{ t3.setHorizontalAlignment(JTextField.RIGHT); orientation[button] = 0; }
						else
							{ t3.setHorizontalAlignment(JTextField.LEFT); orientation[button] = 1; }
						break;

				case 3 : 
						if(orientation[button] == 1)
							{ t4.setHorizontalAlignment(JTextField.RIGHT); orientation[button] = 0; }
						else
							{ t4.setHorizontalAlignment(JTextField.LEFT); orientation[button] = 1; }
 						break;
			}
			button++;
		}
		if(e.getSource() == b2)
		{
			// in next program make objects of buttons
			if(orientation[0] == 0)
				{ t1.setHorizontalAlignment(JTextField.LEFT); orientation[0] = 1;}
			else
				{ t1.setHorizontalAlignment(JTextField.RIGHT); orientation[0] = 0;}
			
			if(orientation[1] == 0)
				{ t2.setHorizontalAlignment(JTextField.LEFT); orientation[1] = 1;}
			else
				{ t2.setHorizontalAlignment(JTextField.RIGHT); orientation[1] = 0;}
		
			if(orientation[2] == 0)
				{ t3.setHorizontalAlignment(JTextField.LEFT); orientation[2] = 1;}
			else
				{ t3.setHorizontalAlignment(JTextField.RIGHT); orientation[2] = 0;}
		
			if(orientation[3] == 0)
				{ t4.setHorizontalAlignment(JTextField.LEFT); orientation[3] = 1;}
			else
				{ t4.setHorizontalAlignment(JTextField.RIGHT); orientation[3] = 0;}
		}
	}
	public static void main(String[] args) {
		new Practice3();
	}
}