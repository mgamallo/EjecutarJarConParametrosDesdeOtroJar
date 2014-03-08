package es.mgamallo.jarconparametros;

import java.io.IOException;

public class Programa1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Runtime.getRuntime().exec("java -jar Programa2.jar \"Adios mundo cruel\""); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
