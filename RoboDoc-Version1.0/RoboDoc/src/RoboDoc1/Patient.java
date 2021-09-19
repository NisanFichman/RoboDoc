package RoboDoc1;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//		Form f= new Form();

public class Patient extends JDialog implements ActionListener{
	JDialog D;
	String name,id ;
	int age;
	String gender,Red,white,neu,lym,Ur,HCT,Hemo,Cret,ir,HD,AP;
	boolean smoker=false,ethiopian=false,asian=false,pregnency=false;
	public int activeDisease[] = new int [26];
	public data2text write = new data2text(); 

	
	public Patient(String name, String id,int age) {
		this.name=name;
		this.id= id;
		this.age=age;
		
	

		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}










