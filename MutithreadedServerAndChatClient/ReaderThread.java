/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.io.*;
import java.net.*;

/**
 *
 * @author krisalpha
 */
public class ReaderThread extends Thread {
    Socket sk;
    JTextArea jTextArea1;
    DefaultListModel dl;
	ReaderThread(Socket sk,JTextArea jTextArea1,DefaultListModel dl)
	{
		this.sk = sk;
		setDaemon(true);
                                    this.jTextArea1 = jTextArea1;
                                    this.dl = dl;
		start();
	}
        public void run()
	{
		try
		{
			DataInputStream din = new DataInputStream(sk.getInputStream());
			while(true)
			{
				String msg = din.readUTF();
                                                                        String str[] = msg.split("#");
				if(str[0].equals("Login"))
				{
                                                                                        jTextArea1.append(str[1]+"  Logged in \n");
					dl.addElement(str[1]);
				}
				else if(str[0].equals("Logout"))
				{
                                                                                          jTextArea1.append(str[1]+" Logged out \n");
					dl.removeElement(str[1]);
				}
                                                                        else
                                                                        {
                                                                                 jTextArea1.append(str[1]+"\n");
                                                                        }
			}
		}catch(Exception e)
		{
                                            JOptionPane.showMessageDialog(null, e);
		}
	}
}
