import javax.swing.*;
import java.awt.event.*;

class ComboTest implements ActionListener 
{
	JFrame fr, tempfr;
	JComboBox cb1, cb2, tempcb1;
	JButton b1, tempb1;
	JLabel templ1, templ2;
	JTextField temptext1;
	DefaultComboBoxModel model1, model2, model3;
	
	ComboTest()
	{
		fr = new JFrame();
		fr.setLayout(null);
		String city[] = {"Noida", "Basti", "Agra"};
		model1 = new DefaultComboBoxModel(city);
		String city2[] = {"jaipur", "jodhpur", "ajmer"};
		model2 = new DefaultComboBoxModel(city2);
		String city3[] = {"bhopal", "indore", "jabalpur"};
		model3 = new DefaultComboBoxModel(city3);

		String state[] = {"UP", "Raj", "MP"};
		cb1 = new JComboBox(state);
		cb2  = new JComboBox();
		b1 = new JButton("Manage");
		cb1.setBounds(50, 50, 100, 50);	
		cb2.setBounds(180, 50,  100, 50);
		b1.setBounds(200, 250, 100, 50);

		fr.add(b1);
		fr.add(cb1);
		fr.add(cb2);

		cb1.addActionListener(this);
		b1.addActionListener(this);
		fr.setSize(500, 500);
		fr.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == cb1)
		{
			String str = (String)cb1.getSelectedItem();
			if(str.equals("UP"))
				cb2.setModel(model1);
			if(str.equals("Raj"))
				cb2.setModel(model2);
			if(str.equals("MP"))
				cb2.setModel(model3);
		}
		if(e.getSource() == b1)
		{
			tempfr = new JFrame();
			tempfr.setLayout(null);
			templ1 = new JLabel("State");
			templ2 = new JLabel("New City");
			temptext1 = new JTextField();
			tempb1 = new JButton("Add");

			//String state[] = {"UP", "Raj", "MP"};
			//tempcb1 = new JComboBox(state);
			
			templ2.setBounds(30, 50, 100, 30);
			temptext1.setBounds(150, 50, 200, 30);
			templ1.setBounds(30, 100, 100, 30);
			cb1.setBounds(150, 100, 100, 30);
			tempb1.setBounds(150, 200, 100, 30);
			
			tempfr.add(templ1);
			tempfr.add(temptext1);
			tempfr.add(templ2);
			tempfr.add(tempcb1);
			tempfr.add(tempb1);

			tempfr.setSize(600, 600);
			tempfr.setVisible(true);
		}

		if(e.getSource() == tempb1)
		{
			String value = temptext1.getText();
			System.out.println(value);
			String combotext = (String)cb1.getSelectedItem();
			if(combotext.equals("UP"))
				model1.addElement(value);
			if(combotext.equals("Raj"))
				model2.addElement(value);
			if(combotext.equals("MP"))
				model3.addElement(value);
		}

	}
	public static void main(String[] args) {
		new ComboTest();
	}
}