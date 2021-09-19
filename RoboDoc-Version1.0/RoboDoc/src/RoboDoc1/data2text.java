package RoboDoc1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import Theprinter.Myprinter;

public class data2text {
	Myprinter p ;

	public data2text() {
		// TODO Auto-generated constructor stub
		p = new Myprinter();
	}
	
	public void wrtiedata(String s) {
		File output = new File("LogPatient.txt");
		FileWriter writer;
		try {
			writer = new FileWriter(output,true);
			writer.write("****************************************\n");
			writer.write(s);
			writer.write("****************************************");
			writer.flush();
			writer.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		};

	}

}
