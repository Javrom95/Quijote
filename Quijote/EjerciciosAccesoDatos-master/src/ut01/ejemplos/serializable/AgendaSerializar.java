package ut01.ejemplos.serializable;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


/**
 *  @descrition Clase que serializa objetos Agenda a un archivo
 *	@author Laura
 *  @date 26/3/2015
 *  @version 1.0
 *  @license GPLv3
 */
public class AgendaSerializar {
	public static void main(String[] args) {
		Agenda a1 = new Agenda("Ana", "Mart�nez", "Fern�ndez");
		Agenda a2 = new Agenda("Ernesto", "Garc�a", "P�rez");
		Path salida = Paths.get("agenda.txt");
		try {
			// Creamos el archivo
			//InputStream y OutputStream de java.io nos permiten trabajar byte a byte
			OutputStream ostream = Files.newOutputStream(salida);
			//FileOutputStream fs = new FileOutputStream("agenda.txt");
			ObjectOutputStream os = new ObjectOutputStream(ostream);
			// El m�todo writeObject() serializa el objeto y lo escribe en el
			// archivo
			os.writeObject(a1);

			os.writeObject(a2);
			// Hay que cerrar siempre el archivo
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}