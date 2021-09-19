	package RoboDoc1;
import javax.imageio.ImageIO;
import javax.print.Doc;
import javax.swing.*;
import javax.swing.text.JTextComponent;

import RoboDoc1.System;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import Theprinter.*;
public class System extends JFrame implements ActionListener {

	Container container = getContentPane();
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JButton patientButton = new JButton("Add future patient");
    JCheckBox showPassword = new JCheckBox("Show Password");
    PatientWindow pw;
    HashMap<String, String> DocUsers= new HashMap<>();
    ArrayList<Patient> allPatients= new ArrayList<Patient>();
    private final JButton addD = new JButton("Add new doctor login");
    private ImageIcon image1;
	private JLabel labelImage1;
	private final JPanel impanel = new JPanel();
	Myprinter print = new Myprinter();
	DocPage doc;
	private final JButton exit = new JButton("Close System");

    System() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
        addImage();
        addbaseDoctor();
        addbasePatient();

       



    }
    public void  addbasePatient() {
    	allPatients.add(new Patient("Boaz", "204385413", 25));
    	allPatients.add(new Patient("Niso", "204470199", 25));
    	allPatients.add(new Patient("Moran", "318274677", 25));
    	allPatients.add(new Patient("Eli", "315744961", 25));
    }
    public void printhash() {
    	for (String name: DocUsers.keySet()) {
    		if (!(name=="11")) {
        	    String key = name.toString();
        	    String value = DocUsers.get(name).toString();
        	    print.Myprinting(key + " " + value);
    		}

    	}
    }
    public void addImage() {
    	image1 = new ImageIcon(getClass().getResource("doctor.jpg"));
		labelImage1 = new JLabel(image1);
		labelImage1.setBounds(0, 0, 100, 60);
	    impanel.add(labelImage1);
    }


    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        userLabel.setBounds(50, 226, 100, 30);
        passwordLabel.setBounds(50, 277, 100, 30);
        userTextField.setBounds(150, 227, 150, 30);
        passwordField.setBounds(150, 278, 150, 30);
        showPassword.setBounds(150, 314, 150, 30);
        loginButton.setBounds(50, 374, 100, 30);
        resetButton.setBounds(264, 374, 100, 30);
        patientButton.setBounds(50	,414, 150, 30);
        addD.setBounds(50, 454, 180, 30);
        getContentPane().add(addD);


    }

    public void addComponentsToContainer() {
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);
        container.add(patientButton);
        impanel.setBounds(10, 0, 416, 216);
        
        getContentPane().add(impanel);
        exit.setForeground(Color.BLACK);
        exit.setBackground(Color.RED);
        exit.setBounds(264, 463, 162, 21);
        exit.addActionListener(this);
        getContentPane().add(exit);
        
        
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
        patientButton.addActionListener(this);
        addD.addActionListener(this);
    }
    public void addbaseDoctor() {
    	DocUsers.put("Bitton92", "Bitton92!");
    	DocUsers.put("Nisan15", "Nisan15?");
    	DocUsers.put("Moran11", "Moran11#");
    	DocUsers.put("11", "11");
    	printhash();

    }
    public void printdata(Patient p) {
    	print.Myprinting(p.gender);
    	print.Myprinting(p.Red);
    	print.Myprinting(p.white);
    	print.Myprinting(p.neu);
    	print.Myprinting(p.lym);
    	print.Myprinting(p.Ur);
    	print.Myprinting(p.HCT);
    	print.Myprinting(p.Hemo);
    	print.Myprinting(p.Cret);
    	print.Myprinting(p.ir);
    	print.Myprinting(p.HD);
    	print.Myprinting(p.AP);
    

    	
    	
    }
    public void addDoctor (String u,String p) 
    {
    	if (checkUser(u) == 1 && checkPass(p) == 1)
    	{
    		if (!DocUsers.containsKey(u)) 
            {	
        		DocUsers.put(u,p);
        		printhash();
            }
    		else
    		{
    			JOptionPane.showMessageDialog(null, "username allready exists choose diffrent username & password", "invalid username & password", JOptionPane.INFORMATION_MESSAGE);
    		}
    	}
    }
    
    public int checkUser(String user) {
    	int num=0,num2=0;
    	if (user.length() < 6 || user.length() > 8)//check length
    	{
    		JOptionPane.showMessageDialog(null, "username must be between 6-8 characters long","invalid username", JOptionPane.INFORMATION_MESSAGE);
    		return 0;
    	}
    	for (int i=0;i<user.length();i++) //check digits
    	{
    		char c = user.charAt(i);
    		if (Character.isDigit(c)) 
    		{
    			num++;
    		}
    		if (Character.isLetter(c)) {
    			num2++;
    		}

    	}
    	if (num>2) {//check digits
			JOptionPane.showMessageDialog(null, "username must contain at maximum 2 digits","invalid username", JOptionPane.INFORMATION_MESSAGE);

    		return 0;
    	}
		if (num2<=2) 
		{
			JOptionPane.showMessageDialog(null, "username must contain at least one letter!","invalid username", JOptionPane.INFORMATION_MESSAGE);
			return 0;
		}//
		JOptionPane.showMessageDialog(null, "username verified","valid username", JOptionPane.INFORMATION_MESSAGE);
    	return 1;
    	
    }
    public int checkPass(String p)
    {
    	int num= 0 ,num2 = 0,num3=0;
    	
    	if (p.length() < 8 || p.length() > 10){
			JOptionPane.showMessageDialog(null, "password must be between 8-10 characters long","invalid password", JOptionPane.INFORMATION_MESSAGE);
			return 0;
    	}	
    	for (int i = 0 ;i < p.length(); i++) //check digits
    	{//BOAZ CHECK!!!
    		char c = p.charAt(i);
    		if (Character.isLetter(c)) 
    		{
    			num++;
    		}
    		if (c == '$' || c == '!' || c == '?' || c == '#')
    		{
    			num2++;
    		}
    		if (Character.isDigit(c)) {
    			num3++;
    		}
    	}
    	if (num == 0)
    	{
			JOptionPane.showMessageDialog(null, "password must contain at least one letter!", "invalid password",JOptionPane.INFORMATION_MESSAGE);
    		return 0;
    	}
    	if (num2 == 0)
    	{
			JOptionPane.showMessageDialog(null,"password must contain at least one special char (!,#,$,?)","invalid password", JOptionPane.INFORMATION_MESSAGE);
			return 0;
    	}
    	if (num3==0) {
			JOptionPane.showMessageDialog(null,"password must contain at least one digit","invalid password", JOptionPane.INFORMATION_MESSAGE);
			return 0;	
    	}
		JOptionPane.showMessageDialog(null, "password verified","password username", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,"Doctor added successfully","doctoradded", JOptionPane.INFORMATION_MESSAGE);

    	return 1;
    }
    public int findPatient(String s) {
    	int i;
    	for (i=0;i<allPatients.size();i++) {
    		if (allPatients.get(i).getId()==s) {
    			break;
    		}
    		
    	}
    	return i;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //Coding Part of LOGIN button
        if (e.getSource() == loginButton) {
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
            //userText.equalsIgnoreCase("mehtab") && pwdText.equalsIgnoreCase("12345")
            //----------------------add check for doctors database!!!!!!!!!
            if (DocUsers.containsKey(userText)) 
            {	
            	if (DocUsers.get(userText).equals(pwdText))
            	{
                	this.setVisible(false);
                	pw = new PatientWindow(allPatients);
                	while (pw.flag) {
                    	int index = findPatient(pw.Choice);
                    	doc = new DocPage(allPatients.get(index));
                    	pw.D.setVisible(true);
                		
                	}

                	this.setVisible(true);
                	
                
            		
            	}
            	else {
            		//wrong pass
        			JOptionPane.showMessageDialog(null, "Wrong Password", "please enter a valid password", JOptionPane.INFORMATION_MESSAGE);

            		
            	}
            }
            else {
    			JOptionPane.showMessageDialog(null, "Wrong Username", "please enter a valid username", JOptionPane.INFORMATION_MESSAGE);

    			
            }
            
        }
        //Coding Part of RESET button
        if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
        }
       //Coding Part of showPassword JCheckBox
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }


        }
        if (e.getSource()==patientButton) {
        	PatientEnter pe = new PatientEnter();
        	allPatients.add(new Patient(pe.name, pe.id, pe.age));
        	

        	
        }
        if (e.getSource()==addD)
        {
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
        	addDoctor(userText, pwdText);
        	
        }
        if (e.getSource()==exit) {
        	print.Myprinting("closing");
        	this.dispose();

        }
    }

}




