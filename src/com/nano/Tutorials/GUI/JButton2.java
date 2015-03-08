package com.nano.Tutorials.GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JButton2 extends JFrame{
	
	private JButton reg;
	private JButton custom;
	
	public JButton2(){
		super("The title");
		setLayout(new FlowLayout());
		
		reg = new JButton("reg Button");
		add(reg);
		
		Icon button1 = new ImageIcon(getClass().getResource("button1.png"));
		Icon button2 = new ImageIcon(getClass().getResource("button2.png"));
		custom = new JButton("Custom", button1);
		custom.setRolloverIcon(button2);
		add(custom);
		
		Handler handler = new Handler();
		reg.addActionListener(handler);
		custom.addActionListener(handler);
		
	}
	private class Handler implements ActionListener{
		public void actionPerformed(ActionEvent event){
			JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
		}
		
	}

}
