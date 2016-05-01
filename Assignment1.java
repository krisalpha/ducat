import java.awt.*;

class DetailsFrame
{
	Frame fr;
	Label lb1, lb2, lb3, lb4, lb5;
	TextField tf1, tf2, tf3, tf4, tf5;
	Button b1, b2;

	DetailsFrame()
	{
		fr = new Frame();
		fr.setLayout(null);
		lb1 = new Label("Name");
		lb2 = new Label("Address");
		lb3 = new Label("Email");
		lb4 = new Label("Phone");
		lb5 = new Label("DOB");
		tf1 = new TextField("Enter name");
		tf2 = new TextField("Enter Address");
		tf3 = new TextField("Enter Email");
		tf4 = new TextField("Enter Phone");
		tf5 = new TextField("Enter DOB");
		b1 = new Button("Submit");
		b2 = new Button("Cancel");

		lb1.setBounds(30, 50, 80, 30);
		tf1.setBounds(130, 50, 120, 30);
		lb2.setBounds(30, 100, 80, 30);
		tf2.setBounds(130, 100, 120, 30);
		lb3.setBounds(30, 150, 80, 30);
		tf3.setBounds(130, 150, 120, 30);
		lb4.setBounds(30, 200, 80, 30);
		tf4.setBounds(130, 200, 120, 30);
		tf5.setBounds(30, 250, 80, 30);
		lb5.setBounds(130, 250, 80, 30);
		b1.setBounds(30, 300, 100, 50);
		b2.setBounds(150, 300, 100, 50);

		fr.add(lb1);
		fr.add(tf1);
		fr.add(lb2);
		fr.add(tf2);
		fr.add(lb3);
		fr.add(tf3);
		fr.add(lb4);
		fr.add(tf4);
		fr.add(lb5);
		fr.add(tf5);
		fr.add(b1);
		fr.add(b2);
		fr.setSize(500, 500);		
		fr.setVisible(true);

	}
	

	public static void main(String[] args) {
		try{

			new DetailsFrame();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		} 

	}

}