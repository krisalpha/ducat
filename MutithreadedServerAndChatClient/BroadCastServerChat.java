/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;
import java.net.*;
import javax.swing.*;
/**
 *
 * @author krisalpha
 */
public class BroadCastServerChat {
	public static void main(String s[])
	{
		try
		{
			System.out.println("Server Started");
			ServerSocket ss = new ServerSocket(1500);
			ArrayList socket = new ArrayList();
			while(true)
			{
				Socket sk = ss.accept();
				System.out.println("Client Connected");
				socket.add(sk);
				new ClientThread(sk,socket);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class ClientThread extends Thread
{
	ArrayList al;
	Socket sk;
	ClientThread(Socket sk,ArrayList al)
	{
		this.sk = sk;
		this.al = al;
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
                                                                                           System.out.println(str[1]+" Connected");
				}
				else if(str[0].equals("Logout"))
				{
                                                                                            System.out.println(str[1]+" DisConnected");
				}
				broadcast(msg);
				if(str[0].equals("Logout"))
				{
					al.remove(sk);
					break;
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void broadcast(String msg)
	{
		try
		{
			for(Object ob:al)
			{
				Socket sk = (Socket)ob;
				DataOutputStream dout = new DataOutputStream(sk.getOutputStream());
				dout.writeUTF(msg);
				dout.flush();
			}
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
	}
}
