package RoboDoc1;

import java.awt.event.ActionEvent;
import Theprinter.*;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Color;

public class DocPage implements ActionListener{
	JDialog D;
	JButton info,diagnose;
	Patient currentp;
	Form form;
	Myprinter print = new Myprinter();
	private JButton exit;
	private JLabel exitlabal;
	private JLabel lblNewLabel_2;



	public DocPage(Patient p) {
		
		currentp=p;
		D=new JDialog();
		D.setTitle("Choose patient");
		D.setModal(true);


		D.setBounds(0, 0, 370, 250);
		D.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add Patient's info");
		lblNewLabel.setBounds(29, 66, 122, 26);
		D.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Find a  diagnosis");
		lblNewLabel_1.setBounds(208, 66, 97, 26);
		D.getContentPane().add(lblNewLabel_1);
		
		info = new JButton("Add info");
		info.setBackground(Color.GREEN);
		info.setBounds(29, 102, 85, 21);
		info.addActionListener(this);
		D.getContentPane().add(info);
		
		
		diagnose = new JButton("Diagnose");
		diagnose.setBounds(208, 102, 97, 21);
		diagnose.addActionListener(this);
		D.getContentPane().add(diagnose);
		
		exit = new JButton("Close");
		exit.setBackground(Color.RED);
		exit.setBounds(121, 167, 85, 21);
		exit.addActionListener(this);
		D.getContentPane().add(exit);
		
		exitlabal = new JLabel("Close");
		exitlabal.setBounds(145, 144, 85, 13);
		D.getContentPane().add(exitlabal);
		
		JLabel patientid = new JLabel("Patient name:  "+p.name);
		patientid.setBounds(111, 10, 291, 21);
		D.getContentPane().add(patientid);
		
		lblNewLabel_2 = new JLabel(" Patient id:  "+p.id);
		lblNewLabel_2.setBounds(111, 43, 208, 13);
		D.getContentPane().add(lblNewLabel_2);
		D.setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==exit) {
			D.setVisible(false);
		}
		if (e.getSource()==info) {
			 form = new Form();
			 addata();
			 printdata(currentp);

			
		}
		if (e.getSource()==diagnose) {
			
			Diagnose d = new Diagnose(currentp);
			
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
	public void addata() {
		 currentp.gender=form.gender;
		 currentp.white=form.white;
		 currentp.Red=form.Red;
		 currentp.neu=form.neu;
		 currentp.lym=form.lym;
		 currentp.Ur=form.Ur;
		 currentp.HCT=form.HCT;
		 currentp.Hemo=form.Hemo;
		 currentp.Cret=form.Cret;
		 currentp.ir=form.ir;
		 currentp.HD=form.HD;
		 currentp.AP=form.AP;
		 currentp.smoker=form.smoker;
		 currentp.ethiopian=form.ethiopian;
		 currentp.asian=form.asian;
		 currentp.pregnency=form.pregnency;
	}
}



