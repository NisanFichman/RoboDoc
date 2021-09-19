package RoboDoc1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class PatientEnter extends JPanel implements ActionListener{
	JFrame f;
	JDialog D;
	String name,id ;
	int age;
	JTextPane textname,textid,textage;

	public PatientEnter() {
	

		
		D=new JDialog();
		D.setTitle("Fill information");
		D.setModal(true);
		D.setBounds(0, 0, 370, 250);
		D.getContentPane().setLayout(null);
		
		
		textname = new JTextPane();
		textname.setBounds(10, 48, 120, 19);
		D.getContentPane().add(textname);
		
		textid = new JTextPane();
		textid.setBounds(10, 91, 120, 19);
		D.getContentPane().add(textid);
		
		textage = new JTextPane();
		textage.setBounds(10, 141, 120, 19);
		D.getContentPane().add(textage);
		
		JLabel lblNewLabel = new JLabel("Full Name");
		lblNewLabel.setBounds(10, 30, 59, 13);
		D.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setBounds(10, 77, 18, 13);
		D.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Age");
		lblNewLabel_2.setBounds(10, 130, 31, 11);
		D.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(127, 182, 85, 21);
		btnNewButton.addActionListener(this);
		D.getContentPane().add(btnNewButton);
		D.setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		name =textname.getText();
		id=textid.getText();
		age=Integer. parseInt(textage.getText());
		D.setVisible(false);
		
	}


        
        
        
        
  

		
	}


