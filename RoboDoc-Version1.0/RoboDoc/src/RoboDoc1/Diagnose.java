package RoboDoc1;

import java.awt.Color;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.Callable;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JPanel;
import Theprinter.*;
import sun.awt.www.content.image.jpeg;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class Diagnose  implements ActionListener{
	JDialog D;
	JButton Start, Close;
	Patient cp;
	JPanel panel,diseasepanel;
	JLabel diseaselabel, l;
	int jump,counter;
	String patientLog;
	Myprinter print = new Myprinter();
	ArrayList<Integer> activeDisease2= new ArrayList<>();
	public Diagnose(Patient p) {
		cp=p;
		jump=0;
		diseasepanel= new JPanel();

		//diseasepanel.setBounds(10, 50*jump, 430, 49);
		//D.add(disesepanel);
		cp=p;
		D=new JDialog();
		D.setBackground(Color.WHITE);
		D.setTitle("Diagnose");
		D.setModal(true);
		D.setBounds(0, 0, 434, 760);
		D.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 420, 723);
		D.getContentPane().add(panel);
		panel.setLayout(null);
		
		Start = new JButton("Start Diagnosing");
		Start.setBounds(117, 23, 168, 21);
		Start.addActionListener(this);
		panel.add(Start);
		
		Close = new JButton("Close");
		Close.setBackground(Color.RED);
		Close.setBounds(300, 677, 85, 21);
		Close.addActionListener(this);
		panel.add(Close);
		D.setVisible(true);
		
	

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource()==Start)
		{
		    checksmoker();
		    Anemia();
		    Bleeding();
		    BloodFat();
		    makeBC();
		    metDisease();
		    ironPoisoning();
		    Dehydration();
		    Infection();
		    vitaminDeficiency();
		    viralDisease();
		    GallpathDis();
		    heartDisease();
		    bloodDiseas();
		    liverDiseas();
		    kidneyDisease();
		    ironDeficiency();
		    muscleDisease();
		    LungsDisease();
		    hyperThyroid();
		    seniorDiabities();
		    cancer();
		    meatDisorder();
		    drugUsage();
		    Malnutrition();

		    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		    LocalDateTime now = LocalDateTime.now();  
		    patientLog= "Visit Day and Time: "+dtf.format(now);
		    patientLog+= "\nPatient name: "+cp.name+"\n"+"Patient age: " +cp.age+"\n"+"Patient id: "+cp.id+"\n";
		    counter=0;
	    	jump=0;
	    	patientLog+="\nPatient Diagnosis: \n";
	    	for (int i=0;i<cp.activeDisease.length;i++) {
	    		switch (i) {
	    		case 0:
	    			if (cp.activeDisease[i] >= 1) 
	    			{
	    				patientLog+="The patient diagnosed with Anemia\n";
	    			    counter++;

	    			}
	    			break;
	    		case 1:
	    			if (cp.activeDisease[i] >= 1) 
	    			{
	    				patientLog+="The patient diagnosed with Diet\n";
	    			    counter++;

	    			}
	    			break;

	    		case 2:
	    			if (cp.activeDisease[i] >= 1) 
	    			{
	    				patientLog+="The patient is Bleeding\n";
	    			    counter++;



	    			}

	    			break;

	    		case 3:
	    			if (cp.activeDisease[i] >= 1) 
	    			{
	    				patientLog+="The patient diagnosed with Hyperlyphydemia\n";
	    			    counter++;


	    			}
	    			break;

	    		case 4:
	    			if (cp.activeDisease[i] >= 1) 
	    			{
	    			    counter++;

	    				patientLog+="The patient diagnosed with Hereditary Spherocytosis\n";

	    			}
	    			break;

	    		case 5:
	    			if (cp.activeDisease[i] >= 1) 
	    			{
	    				patientLog+="The patient diagnosed with Hemotological Disorder\n";
	    			    counter++;

	    			}
	    			break;

	    		case 6:
	    			if (cp.activeDisease[i] >= 1) 
	    			{
	    				patientLog+="The patient diagnosed with Iron Poisoning\n";
	    			    counter++;

	    			}
	    			break;

	    		case 7:
	    			if (cp.activeDisease[i] >= 1) 
	    			{
	    				patientLog+="The patient diagnosed with Dehydration\n";
	    			    counter++;

	    			}
	    			break;

	    		case 8:
	    			if (cp.activeDisease[i] >= 1) 
	    			{
	    				patientLog+="The patient diagnosed with Infection\n";
	    			    counter++;

	    			}
	    			break;

	    		case 9:
	    			if (cp.activeDisease[i] >= 1) 
	    			{
	    				patientLog+="The patient diagnosed with Vitamin Deficiency\n";
	    			    counter++;

	    			}
	    			break;

	    		case 10:
	    			if (cp.activeDisease[i] >= 1) 
	    			{
	    				patientLog+="The patient diagnosed with Viral Disease\n";
	    			    counter++;

	    			}
	    			break;

	    		case 11:
	    			if (cp.activeDisease[i] >= 1) 
	    			{
	    				patientLog+="The patient diagnosed with Gallpath Disease\n";
	    			    counter++;

	    			}
	    			break;

	    		case 12:
	    			if (cp.activeDisease[i] >= 1) 
	    			{
	    				patientLog+="The patient diagnosed with Heart Condition\n";
	    			    counter++;

	    			}
	    			break;

	    		case 13:
	    			if (cp.activeDisease[i] >= 1) 
	    			{
	    				patientLog+="The patient diagnosed with Blood Disease\n";
	    			    counter++;

	    			}
	    			break;

	    		case 14:
	    			if (cp.activeDisease[i] >= 1) 
	    			{
	    				patientLog+="The patient diagnosed with Leaver Disease\n";
	    			    counter++;

	    			}
	    			break;

	    		case 15:
	    			if (cp.activeDisease[i] >= 1) 
	    			{
	    				patientLog+="The patient diagnosed with Kidney Disease\n";
	    			    counter++;

	    			}
	    			break;

	    		case 16:
	    			if (cp.activeDisease[i] >= 1) 
	    			{
	    				patientLog+="The patient diagnosed with Iron Deficiency\n";
	    			    counter++;

	    			}
	    			break;

	    		case 17:
	    			if (cp.activeDisease[i] >= 1) 
	    			{
	    				patientLog+="The patient diagnosed with Muscle Disease\n ";
	    			    counter++;

	    			}
	    			break;

	    		case 18:
	    			if (cp.activeDisease[i] == 1) 
	    			{
	    				patientLog+="The patient is Smoking\n";
	    			    counter++;

	    			}
	    			break;

	    		case 19:
	    			if (cp.activeDisease[i] >= 1) 
	    			{
	    				patientLog+="The patient diagnosed with Lungs Disease\n";
	    			    counter++;

	    			}
	    			break;

	    		case 20:
	    			if (cp.activeDisease[i] >= 1) 
	    			{
	    				patientLog+="The patient diagnosed with Hyper Thyroid\n";
	    			    counter++;

	    			}
	    			break;

	    		case 21:
	    			if (cp.activeDisease[i] >= 1) 
	    			{
	    				patientLog+="The patient diagnosed with Diabities\n";
	    			    counter++;

	    			}
	    			break;

	    		case 22:
	    			if (cp.activeDisease[i] >= 1) 
	    			{
	    				patientLog+="The patient diagnosed with Cancer\n";
	    			    counter++;

	    			}
	    			break;

	    		case 23:
	    			if (cp.activeDisease[i] >= 1) 
	    			{
	    				patientLog+="The patient diagnosed with Eating Too much meat\n";
	    			    counter++;

	    			}
	    			break;

	    		case 24:
	    			if (cp.activeDisease[i] >= 1) 
	    			{
	    				patientLog+="The patient Consumpting too many diffrent drugs\n";
	    			    counter++;

	    			}
	    			break;

	    		case 25:
	    			if (cp.activeDisease[i] >= 1) 
	    			{
	    				patientLog+="The patient diagnosed with Malnutrition\n";
	    			    counter++;

	    			}
	    			break;

	    		
	    		default:
	    			
	    		}

	    	}
			if (counter!=0) {
				patientLog+="\nPatient's Treatment: \n";
		    	for (int i=0;i<cp.activeDisease.length;i++) 
		    	{
		    		
		    		
		    		switch (i) {
		    		case 0:
		    			if (cp.activeDisease[i] == 1) 
		    			{
			    			print.Myprinting("you might have Anemia");
			    			l= new JLabel("You might have Anemia- reffered to further instructions");
			    			patientLog+="Patient suspected with Anemia \n";
			    			l.setBounds(10,70+70*jump, 400, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
		    			}
		    			else if(cp.activeDisease[i]>1) 
		    			{
			    			print.Myprinting("you have anemia");
			    			l= new JLabel("Anemia-Take twice a day  B12 pills(10 MG) for one month");
			    			patientLog+="Anemia-Take twice a day  B12 pills(10 MG) for one month\n";
			    			l.setBounds(10,70+70*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
		    				
		    			}
		    			

		    			break;
		    		case 1:
		    			if (cp.activeDisease[i] == 1) 
		    			{
			    			print.Myprinting("you might need a Diet ");
			    			l= new JLabel("You might need a Diet - reffered to further instructions");
			    			patientLog+="Patient suspected with bad nutrition and needs a Diet\n";
			    			l.setBounds(10,70+70*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;

		    			}
		    			else if(cp.activeDisease[i]>1) 
		    			{
			    			print.Myprinting("you need a diet");
			    			l= new JLabel("Diet-Please schedule a meeting with a nutrision for further instructions ");
			    			patientLog+="Diet-Please schedule a meeting with a nutrision for further instructions \n";
			    			l.setBounds(10,70+10*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
		    			}
		    			break;

		    		case 2:
		    			if (cp.activeDisease[i] == 1) 
		    			{
			    			print.Myprinting("you might be bleeding ");
			    			l= new JLabel("You might be bleeding - reffered to further instructions");
			    			patientLog+="Patient suspcted with blood loss\n";
			    			l.setBounds(10,70+70*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;

		    			}
		    			else if(cp.activeDisease[i]>1) 
		    			{
			    			patientLog+="Bleeding-YOU NEED TO GO TO A HOSPITAL IMMEDIATLY!!!!!!\n";
			    			print.Myprinting("you're bleeding!!!");
			    			l= new JLabel("Bleeding-YOU NEED TO GO TO A HOSPITAL IMMEDIATLY!!!!!!");
			    			l.setBounds(10,70+10*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
		    				
		    			}

		    			break;

		    		case 3:
		    			if (cp.activeDisease[i] == 1) 
		    			{
			    			print.Myprinting("you might have Hyperlipidemia ");
			    			l= new JLabel("You might have Hyperlipidemia - reffered to further instructions");
			    			patientLog+="Patient suspcted Hyperlipidemia\n";
			    			l.setBounds(10,70+70*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;

		    			}
		    			else if(cp.activeDisease[i]>1) 
		    			{
			    			patientLog+="Hyperlipidemia-Please schedule a meeting with a nutrision for further instructions \n";
			    			print.Myprinting("you're fat fuck");
			    			l= new JLabel("Hyperlipidemia-Please schedule a meeting with a nutrision for further instructions ");
			    			l.setBounds(10,70+10*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
		    			}
		    			break;

		    		case 4:
		    			if (cp.activeDisease[i] == 1) 
		    			{
			    			print.Myprinting("you might have a problem pruducing blood cells ");
			    			l= new JLabel("you might have a problem pruducing blood cells  - reffered to further instructions");
			    			patientLog+="Patient suspcted a problem pruducing blood cells\n";
			    			l.setBounds(10,70+70*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;

		    			}
		    			else if(cp.activeDisease[i]>1) 
		    			{
			    			patientLog+="Blood Pruduce -Take once a day B12 pill (10 mg) and folic acid pill (5 mg) for one month\n";
			    			print.Myprinting("you have a red blood cells producing problem");
			    			l= new JLabel("Blood Pruduce-Take once a day B12 pill (10 mg) and folic acid pill (5 mg) for one month");
			    			l.setBounds(10,70+10*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;	
		    			}
		    			break;

		    		case 5:
		    			if (cp.activeDisease[i] == 1) 
		    			{
			    			print.Myprinting("you might have a Metodological Disorder ");
			    			l= new JLabel("you might have a Metodological Disorder  - reffered to further instructions");
			    			patientLog+="Patient suspcted with a Metodological Disorder\n";
			    			l.setBounds(10,70+70*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;

		    			}
		    			else if(cp.activeDisease[i]>1) 
		    			{
		    				
			    			patientLog+="Metodological Disorder-you need to get an injection to help stimulate red blood prudction hormone\n";
			    			print.Myprinting("you have metodological disorder");
			    			l= new JLabel("Metodological Disorder-you need to get an injection to help stimulate red blood prudction hormone");
			    			l.setBounds(10,70+10*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;	
		    			}
		    			break;

		    		case 6:
		    			if (cp.activeDisease[i] == 1) 
		    			{
			    			print.Myprinting("you might have Iron Poisoning ");
			    			l= new JLabel("you might have Iron Poisoning  - reffered to further instructions");
			    			patientLog+="Patient suspcted with Iron Poisoning\n";
			    			l.setBounds(10,70+70*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
		    			}
		    			else if(cp.activeDisease[i]>1) 
		    			{
			    			patientLog+="Iron Poisoning-YOU NEED TO GO TO A HOSPITAL IMMEDIATLY!!!!!!\n";
			    			print.Myprinting("you have Iron Poisoning");
			    			l= new JLabel("Iron Poisoning-YOU NEED TO GO TO A HOSPITAL IMMEDIATLY!!!!!!");
			    			l.setBounds(10, 70+10*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
		    			}
		    			break;

		    		case 7:
		    			if (cp.activeDisease[i] == 1) 
		    			{
			    			print.Myprinting("you might be Dehydraded ");
			    			l= new JLabel("you might  be Dehydraded  - reffered to further instructions");
			    			patientLog+="Patient suspcted with Dehydration\n";
			    			l.setBounds(10,70+70*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
	    				

		    			}
		    			else if(cp.activeDisease[i]>1) 
		    			{
			    			patientLog+="Dehydraded-lie down and drink a lot\n";
			    			print.Myprinting("you have Dehydration");
			    			l= new JLabel("Dehydraded-lie down and drink a lot");
			    			l.setBounds(10, 70+10*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
		    			}
		    			break;

		    		case 8:
		    			if (cp.activeDisease[i] == 1) 
		    			{
			    			print.Myprinting("you might have Infection ");
			    			l= new JLabel("you might have Infection  - reffered to further instructions");
			    			patientLog+="Patient suspcted with Infection\n";
			    			l.setBounds(10,70+70*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
	    				

		    			}
		    			else if(cp.activeDisease[i]>1) 
		    			{
			    			patientLog+="Infection-A prescripction of antibiotics was sent to patient\n";
			    			print.Myprinting("you have Infection");
			    			l= new JLabel("Infection-A prescripction of antibiotics was sent to patient");
			    			l.setBounds(10, 70+10*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
		    			}
		    			break;

		    		case 9:
		    			if (cp.activeDisease[i] == 1) 
		    			{
			    			print.Myprinting("you might have Vitamin Deficiency ");
			    			l= new JLabel("you might have Vitamin Deficiency  - reffered to further instructions");
			    			patientLog+="Patient suspcted with Vitamin Deficiency\n";
			    			l.setBounds(10,70+70*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;

		    			}
		    			else if(cp.activeDisease[i]>1) 
		    			{
			    			patientLog+="Vitamin Deficiency-go have a blood test to know what vitamins are missing\n";
			    			print.Myprinting("you have Vitamin Deficiency");
			    			l= new JLabel("Vitamin Deficiency-go have a blood test to know what vitamins are missing");
			    			l.setBounds(10, 770+10*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
		    				
		    			}
		    			break;

		    		case 10:
		    			if (cp.activeDisease[i] == 1) 
		    			{
			    			print.Myprinting("you might have a Viral Disease ");
			    			l= new JLabel("you might have a Viral Disease  - reffered to further instructions");
			    			patientLog+="Patient suspcted with a Viral Disease\n";
			    			l.setBounds(10,70+70*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;

		    			}
		    			else if(cp.activeDisease[i]>1) 
		    			{
			    			patientLog+="Viral Disease-Rest\n";
			    			print.Myprinting("you have Viral Disease");
			    			l= new JLabel("Viral Disease-Rest");
			    			l.setBounds(10, 70+10*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
		    			}
		    			break;

		    		case 11:
		    			if (cp.activeDisease[i] == 1) 
		    			{
			    			print.Myprinting("you might have a Gallpath Disease ");
			    			l= new JLabel("you might have a Gallpath Disease  - reffered to further instructions");
			    			patientLog+="Patient suspcted with a Gallpath Disease\n";
			    			l.setBounds(10,70+70*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;

		    			}
		    			else if(cp.activeDisease[i]>1) 
		    			{
			    			patientLog+="Gallpath Disease-reffaral to surgical treatment\n";
			    			print.Myprinting("you have Gallpath Disease");
			    			l= new JLabel("Gallpath Disease-reffaral to surgical treatment");
			    			l.setBounds(10,70+10*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
		    			}
		    			break;

		    		case 12:
		    			if (cp.activeDisease[i] == 1) 
		    			{
			    			print.Myprinting("you might have a Heart Condition ");
			    			l= new JLabel("you might have a Heart Condition  - reffered to further instructions");
			    			patientLog+="Patient suspcted with a Heart Condition\n";
			    			l.setBounds(10,70+70*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;

		    			}
		    			else if(cp.activeDisease[i]>1) 
		    			{
			    			patientLog+="Heart Condition-Please schedule a meeting with a nutrision for further instructions\n";
			    			print.Myprinting("you have Heart Condition");
			    			l= new JLabel("Heart Condition-Please schedule a meeting with a nutrision for further instructions");
			    			l.setBounds(10, 70+10*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
		    			}
		    			break;

		    		case 13:
		    			if (cp.activeDisease[i] == 1) 
		    			{
			    			print.Myprinting("you might have a Blood Disease ");
			    			l= new JLabel("you might have a Blood Disease  - reffered to further instructions");
			    			patientLog+="Patient suspcted with a Blood Disease\n";
			    			l.setBounds(10,70+70*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;

		    			}
		    			else if(cp.activeDisease[i]>1) 
		    			{
			    			patientLog+="Blood Disease-You need a combined dose of Cyclophosphamide and Corticosteroids\n";
			    			print.Myprinting("you have Blood Disease");
			    			l= new JLabel("Blood Disease-You need a combined dose of Cyclophosphamide and Corticosteroids");
			    			l.setBounds(10, 70+10*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
		    			}
		    			break;

		    		case 14:
		    			if (cp.activeDisease[i] == 1) 
		    			{
			    			print.Myprinting("you might have a Leaver Disease ");
			    			l= new JLabel("you might have a Leaver Disease  - reffered to further instructions");
			    			patientLog+="Patient suspcted with a Leaver Disease\n";
			    			l.setBounds(10,70+70*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
		    			}
		    			else if(cp.activeDisease[i]>1) 
		    			{
			    			patientLog+="Leaver Disease-refferal for a specific diagnose\n";
			    			print.Myprinting("you have Leaver Disease");
			    			l= new JLabel("Leaver Disease-refferal for a specific diagnose");
			    			l.setBounds(10, 70+10*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
		    			}
		    			break;

		    		case 15:
		    			if (cp.activeDisease[i] == 1) 
		    			{
			    			print.Myprinting("you might have a Kidney Disease ");
			    			l= new JLabel("you might have a Kidney Disease  - reffered to further instructions");
			    			patientLog+="Patient suspcted with a Kidney Disease\n";
			    			l.setBounds(10,70+70*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;

		    			}
		    			else if(cp.activeDisease[i]>1) 
		    			{
			    			patientLog+="Kidney Disease-balance your sugar levels in blood stream\n";
			    			print.Myprinting("you have Kidney Disease");
			    			l= new JLabel("Kidney Disease-balance your sugar levels in blood stream");
			    			l.setBounds(10, 70+10*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
		    			}
		    			break;

		    		case 16:
		    			if (cp.activeDisease[i] == 1) 
		    			{
			    			print.Myprinting("you might have a Iron Deficiency ");
			    			l= new JLabel("you might have a Iron Deficiency  - reffered to further instructions");
			    			patientLog+="Patient suspcted with a Iron Deficiency\n";
			    			l.setBounds(10,70+70*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;

		    			}
		    			else if(cp.activeDisease[i]>1) 
		    			{
			    			patientLog+="Iron Deficiency-Take twice a day  B12 pills(10 mg) for one month\n";
			    			print.Myprinting("you have Iron Deficiency");
			    			l= new JLabel("Iron Deficiency-Take twice a day  B12 pills(10 mg) for one month");
			    			l.setBounds(10, 70+10*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
		    			}
		    			break;

		    		case 17:
		    			if (cp.activeDisease[i] == 1) 
		    			{
			    			print.Myprinting("you might have a Muscle Disease ");
			    			l= new JLabel("you might have a Muscle Disease  - reffered to further instructions");
			    			patientLog+="Patient suspcted with a Muscle Disease\n";
			    			l.setBounds(10,70+70*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
		
		    			}
		    			else if(cp.activeDisease[i]>1) 
		    			{
			    			patientLog+="Muscle Disease-take twice a day turmeric c3 (5mg) of altman's for a month\n";
			    			print.Myprinting("you have Muscle Disease");
			    			l= new JLabel("Muscle Disease-take twice a day turmeric c3 (5mg) of altman's for a month");
			    			l.setBounds(10, 70+10*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
		    			}
		    			break;

		    		case 18:
		    			if (cp.activeDisease[i] == 1) 
		    			{
			    			patientLog+="quit smoking!!!\n";
			    			print.Myprinting("you'r a smoker");
			    			l= new JLabel("quit smoking!!!");
			    			l.setBounds(10, 70+10*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
		    			}
		    			break;

		    		case 19:
		    			if (cp.activeDisease[i] == 1) 
		    			{
			    			print.Myprinting("you might have a Lungs Disease ");
			    			l= new JLabel("you might have a Lungs Disease  - reffered to further instructions");
			    			patientLog+="Patient suspcted with a Lungs Disease\n";
			    			l.setBounds(10,70+70*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
		    			}
		    			else if(cp.activeDisease[i]>1) 
		    			{
			    			patientLog+="Lungs Disease-quit smoking or refferal to lungs X-RAY\n";
			    			print.Myprinting("you have Lungs Disease");
			    			l= new JLabel("Lungs Disease-quit smoking or refferal to lungs X-RAY");
			    			l.setBounds(10, 70+10*jump, 300, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
		    			}
		    			break;

		    		case 20:
		    			if (cp.activeDisease[i] == 1) 
		    			{
			    			print.Myprinting("you might have Hyper Thyroid ");
			    			l= new JLabel("you might have Hyper Thyroid  - reffered to further instructions");
			    			patientLog+="Patient suspcted with Hyper Thyroid\n";
			    			l.setBounds(10,70+70*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
		    			}
		    			else if(cp.activeDisease[i]>1) 
		    			{
			    			patientLog+="Hyper Thyroid-Take Propylthiouracil to decrease Hyper Thyroid\n";
			    			print.Myprinting("you have Hyper Thyroid");
			    			l= new JLabel("Hyper Thyroid-Take Propylthiouracil to decrease Hyper Thyroid");
			    			l.setBounds(10, 70+10*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
		    			}
		    			break;

		    		case 21:
		    			if (cp.activeDisease[i] == 1) 
		    			{
			    			print.Myprinting("you might have Diabities ");
			    			l= new JLabel("you might have Diabities  - reffered to further instructions");
			    			patientLog+="Patient suspcted with Diabities\n";
			    			l.setBounds(10,70+70*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;

		    			}
		    			else if(cp.activeDisease[i]>1) 
		    			{
			    			patientLog+="Diabities-reffral to suitable insulin for patient\n";
			    			print.Myprinting("you have Diabities");
			    			l= new JLabel("Diabities-reffral to suitable insulin for patient");
			    			l.setBounds(10, 70+10*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
		    			}
		    			break;

		    		case 22:
		    			if (cp.activeDisease[i] == 1) 
		    			{
			    			print.Myprinting("you might have Cancer ");
			    			l= new JLabel("you might have Cancer  - reffered to further instructions");
			    			patientLog+="Patient suspcted with Cancer\n";
			    			l.setBounds(10,70+70*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
		    			}
		    			else if(cp.activeDisease[i]>2) 
		    			{
			    			patientLog+="Cancer-Entrectinib\n";
			    			print.Myprinting("you have Cancer");
			    			l= new JLabel("Cancer-Entrectinib");
			    			l.setBounds(10, 70+10*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
		    			}
		    			break;

		    		case 23:
		    			if (cp.activeDisease[i] == 1) 
		    			{
			    			print.Myprinting("you might be over consuming meat  ");
			    			l= new JLabel("you might be over consuming meat  - reffered to further instructions");
			    			patientLog+="Patient suspcted with over consumption of meat\n";
			    			l.setBounds(10,70+70*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;

		    			}
		    			else if(cp.activeDisease[i]>1) 
		    			{
			    			patientLog+="Over consuming meat-Please schedule a meeting with a nutrision for further instructions\n";
			    			print.Myprinting("you'r eating too much meat!!");
			    			l= new JLabel("Over consuming meat-Please schedule a meeting with a nutrision for further instructions");
			    			l.setBounds(10, 70+10*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
		    				
		    			}
		    			break;

		    		case 24:
		    			if (cp.activeDisease[i] == 1) 
		    			{
			    			print.Myprinting("you might be consuming too many diffrent drugs  ");
			    			l= new JLabel("you might be consuming too many diffrent drugs - reffered to further instructions");
			    			patientLog+="Patient suspcted with consuming too many diffrent drugs\n";
			    			l.setBounds(10,70+70*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;

		    			}
		    			else if(cp.activeDisease[i]>1) 
		    			{
			    			patientLog+="Drugs usage-refferal to family doctor for drug adjustment\n";
			    			print.Myprinting("you'r using a lot of diffrent drugs");
			    			l= new JLabel("Drugs usage-refferal to family doctor for drug adjustment");
			    			l.setBounds(10, 70+10*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
		    			}
		    			break;

		    		case 25:
		    			if (cp.activeDisease[i] == 1) 
		    			{
			    			print.Myprinting("you might have Malnutrition  ");
			    			l= new JLabel("you might have Malnutrition  - reffered to further instructions");
			    			patientLog+="Patient suspcted with Malnutrition\n";
			    			l.setBounds(10,70+70*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
		    			}
		    			else if(cp.activeDisease[i]>1) 
		    			{
			    			patientLog+="Malnutrition-Please schedule a meeting with a nutrision for further instructions\n";
			    			print.Myprinting("you have Malnutrition");
			    			l= new JLabel("Malnutrition-Please schedule a meeting with a nutrision for further instructions");
			    			l.setBounds(10, 70+10*jump, 420, 100);
			    			panel.add(l);
			    			panel.repaint();
			    			jump++;
		    			}
		    			break;

		    		
		    		default:
		    			
		    		}
		    	
		    	}
				
			}
			else {
    			patientLog+="The patient is healthy as a bull\n";
    			
    			
			}

		    cp.write.wrtiedata(patientLog);
	
			
			
		}
		
		if (e.getSource()==Close) {
			D.setVisible(false);
		}
		

		
	}
	
    public void printdata(Patient p) {
    	print.Myprinting("gender : " +p.gender);
    	print.Myprinting("red cells in blood : "+ p.Red);
    	print.Myprinting("white cells in blood : " +p.white);
    	print.Myprinting("Neut : "+p.neu);
    	print.Myprinting("Lymph : "+p.lym);
    	print.Myprinting("Ur  : "+p.Ur);
    	print.Myprinting("HCT : " +p.HCT);
    	print.Myprinting("Hemoglobin : " +p.Hemo);
    	print.Myprinting("Creatine : "+ p.Cret);
    	print.Myprinting("Iron : " +p.ir);
    	print.Myprinting("HDL : "+ p.HD);
    	print.Myprinting("AP : " +p.AP);
    	if (p.asian) print.Myprinting("yes asain");
    	else print.Myprinting("no asain");
    	if (p.ethiopian) print.Myprinting("yes ethiopian");
    	else print.Myprinting("no ethiopian");
    	if (p.pregnency) print.Myprinting("yes pregnency");
    	else print.Myprinting("no pregnency");
    	if (p.smoker) print.Myprinting("yes smoker");
    	else print.Myprinting("no smoker");
    

    	
    	
    }

	//--------------------------------------------Disease----------------------------------------------------------------------------------
	public void checksmoker() {
		if (cp.smoker)
			cp.activeDisease[18]=1;

	}
	public void Anemia() {
		if (checkRBC()==-1) {
			cp.activeDisease[0]+=1;
		}
		if (checkHCT()==-1 )
			cp.activeDisease[0]+=1;
			
		if (checkHemoglobin()==-1)
			cp.activeDisease[0]+=1;
			
	}
	public void Diet()
	{
		if (checkCreatianin()!=0) 
			cp.activeDisease[1]+=1;
		
	}
	public void Bleeding() 
	{
		if (checkRBC() == -1 ) 
		{
			cp.activeDisease[2]+=1;
		}
		if (checkHCT() ==-1)
			cp.activeDisease[2]+=1;
		if (checkIron() == -1)
			cp.activeDisease[2]+=1;
	}
	public void BloodFat() {
		if (checkHDL() == -1) 
		{
			cp.activeDisease[3]+=1;
		}
		
		
	}
	public void makeBC() {
		if (checkNeutrophil() == -1) {
			cp.activeDisease[4]+=1;
		}
		if (checkLymphocytes() == -1)
			cp.activeDisease[4]+=1;
		if (checkRBC() == 1)
		{
			for (int i =0 ; i < cp.activeDisease.length;i++) {
				if (cp.activeDisease[19]>=1) {
					cp.activeDisease[4]+=1;
				}
			}

		}
	}
	public void metDisease() {
		if (checkHemoglobin() == 1)
			cp.activeDisease[5]+=1;

	}
	public void ironPoisoning() {
		if (checkIron() == 1)
			cp.activeDisease[6]+=1;

	}
	public void Dehydration() {
		if (checkUrea() == 1  )
			cp.activeDisease[7]+=1;
		if (checkWBC() == 1)
			cp.activeDisease[7]+=1;

	}
	public void Infection()
	{
		if (checkNeutrophil() != 0 ) 
			cp.activeDisease[8]+=1;
		if (checkLymphocytes() == 1)
			cp.activeDisease[8]+=1;
		if (checkWBC() == 1)
			cp.activeDisease[8]+=1;
	}
	public void vitaminDeficiency() 
	{
		if (checkAP() == -1)
			cp.activeDisease[9]+=1;
	}
	public void viralDisease()
	{
		if (checkWBC() == -1)
			cp.activeDisease[10]+=1;
	}
	public void GallpathDis() 
	{
		if (checkAP() == 1)
			cp.activeDisease[11]+=1;

	}
	public void heartDisease() 
	{
		if (checkHDL() == -1)
			cp.activeDisease[12]+=1;
	}
	public void bloodDiseas() 
	{
		if (checkWBC() == 1)
			cp.activeDisease[13]+=1;
	}
	public void liverDiseas() 
	{
		if (checkUrea() == -1)
			if (!cp.pregnency)
				cp.activeDisease[14]+=1;
		if (checkAP() == 1)
			if (!cp.pregnency)
				cp.activeDisease[14]+=1;
			
	}
	public void kidneyDisease()
	{
		if (checkCreatianin() == 1)
			cp.activeDisease[15]+=1;
		if (checkUrea() == 1)
			cp.activeDisease[15]+=1;
	}
	public void ironDeficiency()
	{
		if (checkHemoglobin() == -1)
		{
			if (!cp.pregnency)
				cp.activeDisease[16]+=1;
		}
	}	
	public void muscleDisease()
	{
		if (checkCreatianin() == 1  )
			cp.activeDisease[17]+=1;
		if (checkCreatianin() == -1)
			cp.activeDisease[17]+=1;
	}
	
	public void LungsDisease()

	{
		if (cp.smoker || checkRBC() == 1)
			cp.activeDisease[19]+=1;
		
		
		
	}
	public void hyperThyroid() 
	{
		if (checkAP() == 1)
			if (!cp.pregnency)
				cp.activeDisease[20]+=1;
	}
	public void seniorDiabities()
	{
		if (checkHDL() == -1)
			cp.activeDisease[21]+=1;
		
	}
	public void cancer()
	{
		if (checkWBC() != 0)
			cp.activeDisease[22]+=1;
		if (checkNeutrophil() == -1)
			cp.activeDisease[22]+=1;
		if (checkLymphocytes() == 1)
			cp.activeDisease[22]+=1;
	}	
	public void meatDisorder()
	{
		if (checkCreatianin() == 1)
			cp.activeDisease[23]+=1;
	}
	public void drugUsage() 
	{
		if (checkAP() == 1)
			if (!cp.pregnency)
				cp.activeDisease[24]+=1;
	}
	public void Malnutrition() {
		if ( checkUrea() == -1)
			if (!cp.pregnency)
				cp.activeDisease[25]+=1;
		if (checkAP() ==-1)
			cp.activeDisease[25]+=1;
		if (checkIron() == -1)
			if (!cp.pregnency)
				cp.activeDisease[25]+=1;
		if (checkCreatianin() == -1)
			cp.activeDisease[25]+=1;
			
	}	
	
	
	
	
	
	//--------------------------------------------END Disease----------------------------------------------------------------------------------

	//--------------------------------------------High/normal/small values-----------------------------------------------------------------
	
	
	public int checkWBC()
	{
		if (cp.age < 4)
		{
			if (Double.parseDouble(cp.white) > 17500)
				return 1;
			if (Double.parseDouble(cp.white) < 6000)
				return -1;
			else 
				return 0;
		}
		if (cp.age > 3 && cp.age < 18)
		{
			if (Double.parseDouble(cp.white) > 15500)
				return 1;
			if (Double.parseDouble(cp.white) < 5500)
				return -1;
			else 
				return 0;
		}
		if (cp.age > 17)
		{
			if (Double.parseDouble(cp.white) > 11000)
				return 1;
			if (Double.parseDouble(cp.white) < 4500)
				return -1;
			else 
				return 0;
		}
		return 0;
	}
	public int checkNeutrophil()
	{
		if (Double.parseDouble(cp.neu) > 54)
			return 1;
		if (Double.parseDouble(cp.neu) < 28)
			return -1;
		else 
			return 0;
	}
	public int checkLymphocytes()
	{
		if (Double.parseDouble(cp.lym) > 52)
			return 1;
		if (Double.parseDouble(cp.lym) < 36)
			return -1;
		else 
			return 0;
	}
	public int checkRBC()
	{
		if (Double.parseDouble(cp.Red) > 6)
			if (cp.smoker) {
				return 0;
			}
			else {
				return 1;
			}
			
		if (Double.parseDouble(cp.Red) < 4.5)
			return -1;
		else 
			return 0;
	}
	public int checkHCT() {
		if (cp.gender=="male") {
			if (Double.parseDouble(cp.HCT)>54	)
				if (cp.smoker) {
					return 0;
				}
				else {
					return 1;
				}
			if (Double.parseDouble(cp.HCT)<37) {
				return -1;
			}
			else 
				return 0;
			
		}
		else {
			if (Double.parseDouble(cp.HCT)>47)
				return 1;
			if (Double.parseDouble(cp.HCT)<33)
				return -1;
			else 
				return 0;
		}
		
	}
	public int checkUrea()
	{
		if (!cp.asian)
		{
			
			if (Double.parseDouble(cp.Ur) > 43)
				return 1;
			if (Double.parseDouble(cp.Ur) < 17)
				if (cp.pregnency) {
					return 0;
				}
				else
				{
					return -1;
				}
				
			else 
				return 0;
		}
		else
		{
			if (Double.parseDouble(cp.Ur) > 47.3)
				return 1;
			if (Double.parseDouble(cp.Ur) < 18.7)
				if (cp.pregnency) {
					return 0;
				}
				else
				{
					return -1;
				}
			else 
				return 0;
		}
	}	
	public int checkHemoglobin()
	{
		if (cp.age < 18)
		{
			if (Double.parseDouble(cp.Hemo) > 15.5)
				return 1;
			if (Double.parseDouble(cp.Hemo) < 11.5)
				return -1;
			else 
				return 0;
		}
		else if (cp.age > 18 && cp.gender == "female")
		{
			if (Double.parseDouble(cp.Hemo) > 16)
				return 1;
			if (Double.parseDouble(cp.Hemo) < 12)
				return -1;
			else 
				return 0;
		}
		else
		{
			if (Double.parseDouble(cp.Hemo) > 18)
				return 1;
			if (Double.parseDouble(cp.Hemo) < 12)
				return -1;
			else 
				return 0;
		}
	}
	public int checkCreatianin() {
		if (cp.age<3) {
			if (Double.parseDouble(cp.Cret)>0.5) {
				return 1;//baby's creat high
				
			}
			if (Double.parseDouble(cp.Cret)<0.2) {
				return -1;//teen's low
			}
			else {
				return 0;//baby's normal	
			}

		}
		if (cp.age > 2 && cp.age < 18) 
		{
			if (Double.parseDouble(cp.Cret)>1) {
				return 1;//baby's creat high
				
			}
			if (Double.parseDouble(cp.Cret)<0.5) {
				return -1;//teen's low
			}
			else {
				return 0;//teen's normal	
			}
		}
		if (cp.age > 17 && cp.age<60) {
			if (Double.parseDouble(cp.Cret)<0.6) {
				return 1;//adult's creat high
				
			}
			if (Double.parseDouble(cp.Cret)>1) {
				return -1;//adult's low
			}
			else {
				return 0;//adult's normal	
			}
			//adult
		}
		else {
			if (Double.parseDouble(cp.Cret)>0.6) {
				return 1;//senior's creat high
				
			}
			if (Double.parseDouble(cp.Cret)<1.2) {
				return -1;//senior's low
			}
			else {
				return 0;//senior's normal	
			}
		}
	}
	public int checkIron()
	{
		if (cp.gender == "male")
		{
			if (Double.parseDouble(cp.ir) > 160)
				return 1;
			if (Double.parseDouble(cp.ir) < 60)
				return -1;
			else 
				return 0;
		}
		else
		{
			if (Double.parseDouble(cp.ir) > 128)
				return 1;
			if (Double.parseDouble(cp.ir) < 48)
				return -1;
			else 
				return 0;
		}
	}
	public int checkHDL() {
		if (!cp.ethiopian)
		{
			if (cp.gender=="male") {
				if (Double.parseDouble(cp.HD) > 62)
					return 1;
				if (Double.parseDouble(cp.HD) < 29)
					return -1;
				else 
					return 0;
				
			}
			else {//female
				if (Double.parseDouble(cp.HD) > 82)
					return 1;
				if (Double.parseDouble(cp.HD) < 34)
					return -1;
				else 
					return 0;
				
			}

		}
		else
		{
			if (cp.gender=="male") {
				if (Double.parseDouble(cp.HD) > 76.4)
					return 1;
				if (Double.parseDouble(cp.HD) < 33.8)
					return -1;
				else 
					return 0;
				
			}
			else {//female
				if (Double.parseDouble(cp.HD) >98.4)
					return 1;
				if (Double.parseDouble(cp.HD) < 40.6)
					return -1;
				else 
					return 0;
				
			}

		}
	}
	public int checkAP() {
		if (!cp.asian) 
		{
			if (Double.parseDouble(cp.AP) > 90)
				return 1;
			if (Double.parseDouble(cp.AP) < 30)
				return -1;
			else 
				return 0;
			
		}
		else
		{
			if (Double.parseDouble(cp.AP) > 120)
				return 1;
			if (Double.parseDouble(cp.AP) < 60)
				return -1;
			else 
				return 0;
			
		}
		
	}
}


