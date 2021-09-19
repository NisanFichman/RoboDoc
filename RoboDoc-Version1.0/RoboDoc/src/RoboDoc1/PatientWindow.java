package RoboDoc1;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import Theprinter.*;
import java.awt.Color;

public class PatientWindow implements ActionListener{
	JDialog D;
	JComboBox<String> comboBox;
	ArrayList<Patient> pp= new ArrayList<Patient>();
	JComboBox<String> plist;
	final static String [] nums= new String[10];
	String Choice;
	JButton ok ,exit;
    private ImageIcon image1;
	private JLabel labelImage1;
	private JPanel impanel = new JPanel();
	Myprinter print = new Myprinter();
	public boolean flag =false;


    public void addImage() {
    	image1 = new ImageIcon(getClass().getResource("senku.jpg"));
		labelImage1 = new JLabel(image1);
		labelImage1.setBounds(0, 0, 100, 60);
	    impanel.add(labelImage1);
	    print.Myprinting("image added");
    }

	public PatientWindow(ArrayList<Patient> op)
	{
		this.flag=true;
		pp=op;

		for (int i =0;i<op.size();i++) {
			nums[i]= op.get(i).getId();
		}

		D=new JDialog();
		D.setTitle("Choose patient");
		D.setModal(true);


		D.setBounds(0, 0, 429, 276);
		D.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please Choose a Patient");
		lblNewLabel.setBounds(23, 168, 151, 13);
		D.getContentPane().add(lblNewLabel);
		
		comboBox = new JComboBox<String>(nums);
		comboBox.setBounds(23, 191, 89, 21);
		D.getContentPane().add(comboBox);
		
		ok = new JButton("OK");
		ok.addActionListener(this);
		ok.setBounds(169, 191, 85, 21);
		D.getContentPane().add(ok);
		
		impanel = new JPanel();
		impanel.setBounds(23, 10, 376, 137);
		D.getContentPane().add(impanel);
		addImage();

		exit = new JButton("Close");
		exit.setBackground(Color.RED);
		exit.setBounds(297, 191, 85, 21);
		exit.addActionListener(this);
		D.getContentPane().add(exit);
		D.setVisible(true);
		

		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==ok) {
	    	Choice = comboBox.getItemAt(comboBox.getSelectedIndex());
			print.Myprinting( Choice);
			D.setVisible(false);
		}
		if (e.getSource()==exit) {
			this.flag=false;
			D.setVisible(false);
			
			
		}
		
    	

		
		
	}
}

