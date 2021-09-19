package RoboDoc1;
import Theprinter.*;
import javax.swing.JDialog;
import javax.swing.JCheckBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JRadioButton;

public class Form extends JPanel implements ActionListener{
	JDialog D;
	JTextPane WBC,Neut,Lymph,RBC,UR,Hb,create,HC,iron,HDL,Aph;
	JButton sub;
	JRadioButton femaleradio,maleradio;
	JCheckBox smoke,Eti,preg,asia;
	String gender,Red,white,neu,lym,Ur,HCT,Hemo,Cret,ir,HD,AP;
	boolean smoker=false,ethiopian=false,asian=false,pregnency=false;
	Myprinter print = new Myprinter();


		
	
	
	public Form() 
	{
		
		D=new JDialog();
		D.setTitle("Fill information");
		D.setModal(true);
		D.setBounds(0, 0, 376, 748);
		D.getContentPane().setLayout(null);


		//---------------Labels
		JLabel lblNewLabel_1 = new JLabel("White cells in blood");
		lblNewLabel_1.setBounds(10, 62, 148, 13);
		D.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Neutrophil");
		lblNewLabel_2.setBounds(10, 103, 74, 13);
		D.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Lymphocytes");
		lblNewLabel_3.setBounds(10, 155, 93, 13);
		D.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Red cells in blood");
		lblNewLabel_4.setBounds(10, 207, 113, 13);
		D.getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Urea level");
		lblNewLabel_5.setBounds(10, 317, 93, 13);
		D.getContentPane().add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Hemoglobin");
		lblNewLabel_6.setBounds(10, 369, 93, 13);
		D.getContentPane().add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Creatinine");
		lblNewLabel_7.setBounds(10, 421, 93, 13);
		D.getContentPane().add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("HCT");
		lblNewLabel_8.setBounds(10, 259, 45, 13);
		D.getContentPane().add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("Iron");
		lblNewLabel_9.setBounds(10, 473, 45, 13);
		D.getContentPane().add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("High Density Lipoprotein");
		lblNewLabel_10.setBounds(10, 533, 161, 13);
		D.getContentPane().add(lblNewLabel_10);

		JLabel lblNewLabel_11 = new JLabel("Alkaline Phosphatase");
		lblNewLabel_11.setBounds(10, 585, 171, 13);
		D.getContentPane().add(lblNewLabel_11);



		//---------------TextFiels


		WBC = new JTextPane();
		WBC.setText("7000");
		WBC.setBounds(10, 74, 161, 19);
		D.getContentPane().add(WBC);


		Neut = new JTextPane();
		Neut.setText("50");
		Neut.setBounds(10, 126, 161, 19);
		D.getContentPane().add(Neut);


		Lymph = new JTextPane();
		Lymph.setText("40");
		Lymph.setBounds(10, 178, 161, 19);
		D.getContentPane().add(Lymph);



		RBC = new JTextPane();
		RBC.setText("5");
		RBC.setBounds(10, 230, 161, 19);
		D.getContentPane().add(RBC);



		UR = new JTextPane();
		UR.setText("30");
		UR.setBounds(10, 340, 161, 19);
		D.getContentPane().add(UR);



		Hb = new JTextPane();
		Hb.setText("16");
		Hb.setBounds(10, 392, 161, 19);
		D.getContentPane().add(Hb);



		create = new JTextPane();
		create.setText("0.7");
		create.setBounds(10, 444, 161, 19);
		D.getContentPane().add(create);



		HC = new JTextPane();
		HC.setText("45");
		HC.setBounds(10, 282, 161, 19);
		D.getContentPane().add(HC);



		iron = new JTextPane();
		iron.setText("120");
		iron.setBounds(10, 504, 161, 19);
		D.getContentPane().add(iron);



		HDL = new JTextPane();
		HDL.setText("60");
		HDL.setBounds(10, 556, 161, 19);
		D.getContentPane().add(HDL);

		Aph = new JTextPane();
		Aph.setText("60");
		Aph.setBounds(10, 608, 161, 19);
		D.getContentPane().add(Aph);

		sub = new JButton("Submit");
		sub.setBounds(134, 680, 85, 21);
		sub.addActionListener(this);
		D.getContentPane().add(sub);
		
		smoke = new JCheckBox("Smoking");
		smoke.setBounds(229, 62, 93, 21);
		D.getContentPane().add(smoke);

		Eti = new JCheckBox("Ethiopian ");
		Eti.setBounds(229, 87, 93, 21);
		D.getContentPane().add(Eti);

		preg = new JCheckBox("Pregnent");
		preg.setBounds(229, 110, 93, 21);
		D.getContentPane().add(preg);

		asia = new JCheckBox("Asain");
		asia.setBounds(229, 135, 93, 21);
		D.getContentPane().add(asia);
		
		JLabel infolabel = new JLabel("Please Fill Patient's information");
		infolabel.setBounds(89, 10, 248, 13);
		D.getContentPane().add(infolabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(222, 156, 85, 60);
		D.getContentPane().add(panel);
		panel.setLayout(null);
		
		maleradio = new JRadioButton("Male");
		maleradio.setBounds(4, 6, 67, 21);
		maleradio.setSelected(true);
		maleradio.addActionListener(this);
		panel.add(maleradio);
		
		femaleradio = new JRadioButton("Female");
		femaleradio.setBounds(4, 27, 83, 21);
		femaleradio.addActionListener(this);
		panel.add(femaleradio);
		D.setVisible(true);


	}






	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==femaleradio) {
			if (femaleradio.isSelected()) {
				maleradio.setSelected(false);
			}
		}
		if (e.getSource()==maleradio) {
			if (maleradio.isSelected()) {
				femaleradio.setSelected(false);
			}
		}
		if (e.getSource()==sub) {
			if (maleradio.isSelected())
				this.gender="male";
			else 
				this.gender="female";
			if(gender.equalsIgnoreCase("female")&& preg.isSelected()) {pregnency=true;}
			this.Red = RBC.getText();
			this.white = WBC.getText();
			this.neu = Neut.getText();
			this.lym = Lymph.getText();
			this.Ur = UR.getText();
			this.HCT = HC.getText();
			this.Hemo= Hb.getText();
			this.Cret = create.getText();
			this.ir = iron.getText();
			this.HD = HDL.getText();
			this.AP = Aph.getText();
			if (smoke.isSelected()) {this.smoker=true;}
			if (Eti.isSelected()) {this.ethiopian=true;}
			if (asia.isSelected()) {this.asian=true;}
			if (CheckValues()) {
				D.setVisible(false);
				
			}
		}

	
		
		

		
	}
	public boolean CheckValues() {
		print.Myprinting(gender);
		double x;
		if (!femaleradio.isSelected()&&!maleradio.isSelected()) {
			JOptionPane.showMessageDialog(null, "please choose gender", "please enter a valid input", JOptionPane.INFORMATION_MESSAGE);
			return false;
		}
		try {
			
			x=Double.parseDouble(Red);
			if (!(x>0)) {
				print.Myprinting("wrong input");
				JOptionPane.showMessageDialog(null, "please enter a number greater than zero", "please enter a valid input", JOptionPane.INFORMATION_MESSAGE);
				return false;
				}

			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "wrong red blood cell", "please enter a valid input", JOptionPane.INFORMATION_MESSAGE);
			return false;
		}
		try {
			x=Double.parseDouble(white);
			if (!(x>0)) {
				print.Myprinting("wrong input");
				JOptionPane.showMessageDialog(null, "please enter a number greater than zero", "please enter a valid input", JOptionPane.INFORMATION_MESSAGE);
				return false;
				}
			


			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "wrong white blood cell", "please enter a valid input", JOptionPane.INFORMATION_MESSAGE);

			return false;
		}
		try {
			x=Double.parseDouble(neu);
			if (!(x>0))  {
				print.Myprinting("wrong input");
				JOptionPane.showMessageDialog(null, "please enter a number greater than zero", "please enter a valid input", JOptionPane.INFORMATION_MESSAGE);
				return false;
				}


			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "wrong Neutrophil", "please enter a valid input", JOptionPane.INFORMATION_MESSAGE);
			return false;
		}
		try {
			x=Double.parseDouble(lym);
			if (!(x>0))  {
				print.Myprinting("wrong input");
				JOptionPane.showMessageDialog(null, "please enter a number greater than zero", "please enter a valid input", JOptionPane.INFORMATION_MESSAGE);
				return false;
				}


			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "wrong Lymphocytes", "please enter a valid input", JOptionPane.INFORMATION_MESSAGE);
			return false;
		}
		try {
			x=Double.parseDouble(Ur);
			if (!(x>0))  {
				print.Myprinting("wrong input");
				JOptionPane.showMessageDialog(null, "please enter a number greater than zero", "please enter a valid input", JOptionPane.INFORMATION_MESSAGE);
				return false;
				}


			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "wrong Urea level", "please enter a valid input", JOptionPane.INFORMATION_MESSAGE);
			return false;
		}
		try {
			x=Double.parseDouble(Hemo);
			if (!(x>0))  {
				print.Myprinting("wrong input");
				JOptionPane.showMessageDialog(null, "please enter a number greater than zero", "please enter a valid input", JOptionPane.INFORMATION_MESSAGE);
				return false;
				}


			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "wrong Hemoglobin", "please enter a valid input", JOptionPane.INFORMATION_MESSAGE);
			return false;
		}
		try {
			x=Double.parseDouble(Cret);
			if (!(x>0))  {
				print.Myprinting("wrong input");
				JOptionPane.showMessageDialog(null, "please enter a number greater than zero", "please enter a valid input", JOptionPane.INFORMATION_MESSAGE);
				return false;
				}


			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "wrong Creatinine", "please enter a valid input", JOptionPane.INFORMATION_MESSAGE);
			return false;
		}
		try {
			x=Double.parseDouble(HCT);
			if (!(x>0)) {
				print.Myprinting("wrong input");
				JOptionPane.showMessageDialog(null, "please enter a number greater than zero", "please enter a valid input", JOptionPane.INFORMATION_MESSAGE);
				return false;
				}


			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "wrong HCT", "please enter a valid input", JOptionPane.INFORMATION_MESSAGE);
			return false;
		}
		try {
			x=Double.parseDouble(ir);
			if (!(x>0))  {
				print.Myprinting("wrong input");
				JOptionPane.showMessageDialog(null, "please enter a number greater than zero", "please enter a valid input", JOptionPane.INFORMATION_MESSAGE);
				return false;
				}


			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "wrong Iron Level", "please enter a valid input", JOptionPane.INFORMATION_MESSAGE);
			return false;
		}
		try {
			x=Double.parseDouble(HD);
			if (!(x>0))  {
				print.Myprinting("wrong input");
				JOptionPane.showMessageDialog(null, "please enter a number greater than zero", "please enter a valid input", JOptionPane.INFORMATION_MESSAGE);
				return false;
				}


			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "wrong High Density Lipoprotein", "please enter a valid input", JOptionPane.INFORMATION_MESSAGE);
			return false;
		}
		try {
			x=Double.parseDouble(AP);
			if (!(x>0))  {
				print.Myprinting("wrong input");
				JOptionPane.showMessageDialog(null, "please enter a number greater than zero", "please enter a valid input", JOptionPane.INFORMATION_MESSAGE);
				return false;
				}

			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "wrong Alkaline Phosphatase", "please enter a valid input", JOptionPane.INFORMATION_MESSAGE);
			return false;
		}

		return true;
		
	}
}


