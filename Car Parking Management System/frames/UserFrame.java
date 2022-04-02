package frames;

import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

import entity.*;
import repository.*;

public class Userframe extends JFrame implements ActionListener, MouseListener
{
	Jpanel panel;
	Jlabel userLabel;
	JTextField userTextField;
	JButton enterBtn;
	
	public Userframe()
	{
		super("Car Parking Management System - User Window");
		
		this.setSize(900, 550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
	
        panel = new JPanel();
		panel.setLayout(null);
		
		
		userLabel = new userLabel("Vehicle Type: ");
		userLabel.setBounds(300,150,100,30);
		panel.add(userLabel);
		
		userTF = new JTextField();
		userTF.setBounds(370, 100, 100, 30);
		
		panel.add(userTF);
		
		userLabel = new userLabel("Vehicle Number: ");
		userLabel.setBounds(300,150,100,30);
		panel.add(userLabel);
		
		userTF = new JTextField();
		userTF.setBounds(370, 100, 100, 30);
		
		panel.add(userTF);
		
		
		
		userLabel = new userLabel("Arrival Time: ");
		userLabel.setBounds(300,150,100,30);
		panel.add(userLabel);
		
		userTF = new JTextField();
		userTF.setBounds(370, 100, 100, 30);
		
		panel.add(userTF);
		
		
		userLabel = new userLabel("Departure Time: ");
		userLabel.setBounds(300,150,100,30);
		panel.add(userLabel);
		
		userTF = new JTextField();
		userTF.setBounds(370, 100, 100, 30);
		panel.add(userTF);
		
		enterBtn = new JButton("Enter");
		enterBtn.setBounds(390,200,80,30);
		
		enterBtn.addActionListener(this);
		panel.add(enterBtn);
		
		
		backBtn = new JButton("Back");
		backBtn.setBounds(390,200,80,30);
		
		backBtn.addActionListener(this);
		panel.add(backBtn);
		
		this.add(panel);
	}
	
		
		public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if(command.equals(enterBtn.getText()))
		{
		
		}
		else if(command.equals(backBtn.getText()))
		{
			this.setVisible(false);
			
		}
		else{}
	}
}