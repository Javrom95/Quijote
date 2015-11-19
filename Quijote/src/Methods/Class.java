package Methods;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class Class {

	private int LINES;
	private long CHARS = 0;
	private BufferedReader BR;
	private String LINE;
	private String PATH;
	private char CHARAC;
	private int Dipt;
	private String LONGWORD="";
	private int POSL;
	private int LPOS = 0;
	private int POSW;
	private int WPOS = 1;
	private int VOWS = 0;

	public String getPath() {
		System.out.println("Introducir ruta:");
		Scanner enter = new Scanner(System.in);
		PATH = enter.next();
		return PATH;
	}

	// Method 1.
	public long countUFTChars(String path) {
		try {
			BR = new BufferedReader(new FileReader(path));
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado.");
			e.printStackTrace();
		}

		try {
			while ((LINE = BR.readLine()) != null) {
				String[] carac = LINE.split("");
				CHARS += carac.length;
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
		return CHARS;
	}

	// Method 2.
	public long countLowerCaseChars(String path) {
		try {
			BR = new BufferedReader(new FileReader(path));
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado.");
			e.printStackTrace();
		}
		CHARS = 0;
		try {
			while ((LINE = BR.readLine()) != null) {
				char[] carac = LINE.toCharArray();
				for (int i = 0; i < carac.length; i++) {
					if (Character.isLowerCase(carac[i])) {
						CHARS++;
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return CHARS;
	}

	// Method 3.
	public long countAsciiChars(String Path) {
		try {
			BR = new BufferedReader(new FileReader(PATH));
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado.");
			e.printStackTrace();
		}
		try {
			CHARS = 0;
			while ((LINE = BR.readLine()) != null) {
				char[] carac = LINE.toCharArray();
				for (int i = 0; i < carac.length; i++) {
					if (Character.isAlphabetic(carac[i])) {
						CHARS++;
					}
				}
			}
		} catch (IOException e) {

			e.printStackTrace();
		}

		return CHARS;
	}

	// Method 4.
	public long countLines(String Path) {
		try {
			BR = new BufferedReader(new FileReader(PATH));
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado.");
			e.printStackTrace();
		}
		try {
			while ((LINE = BR.readLine()) != null) {
				LINES++;
			}
		} catch (IOException e) {

			e.printStackTrace();
		}

		return LINES;
	}

	// Method 5. Pendiente.
	public long countWords(String Path) {

		CHARAC = 0;

		try {
			BR = new BufferedReader(new FileReader(PATH));
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado.");
			e.printStackTrace();
		}
		try {
			CHARS = 0;
			while ((LINE = BR.readLine()) != null) {
				char[] carac = LINE.toCharArray();
				for (int i = 0; i < carac.length; i++) {
					if (Character.isAlphabetic(carac[i])) {

					}
				}
			}
		} catch (IOException e) {

			e.printStackTrace();
		}

		return CHARAC;

	}

	// Method 7. Pendiente.
	public int countDipWords(String Path) {
		try {
			BR = new BufferedReader(new FileReader(PATH));
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado.");
			e.printStackTrace();
		}
		try {
			CHARS = 0;
			while ((LINE = BR.readLine()) != null) {
				char[] carac = LINE.toCharArray();
				for (int i = 0; (i - 1) < carac.length; i++) {
					if (true) {
						CHARS++;
					}
				}
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
		return Dipt;
	}

	// Method 8 and 9.

	public String longestWords(String Path) {

		String palMasLarga = "";
		
		try {
			BR = new BufferedReader(new FileReader(PATH));
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado.");
			e.printStackTrace();
		}
		try {
			while ((LINE = BR.readLine()) != null) {
				String[] carac = LINE.split(" ");
				LPOS++;
				WPOS = 1;
				for(int i=0; i<carac.length;i++){
				WPOS++;
				if(LONGWORD.length()<carac[i].length()){
				LONGWORD=carac[i];
				POSL=LPOS;
				POSW=WPOS;
				}
			}
		}
		}catch (IOException e) {
			e.printStackTrace();
		}
		return LONGWORD;
	}

	// Method 11.
	public int pentaWord(String Path) {
		WPOS = 0;
		try {
			BR = new BufferedReader(new FileReader(PATH));
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado.");
			e.printStackTrace();
		}

		try {
			while ((LINE = BR.readLine()) != null) {
				String[] carac = LINE.split(" ");
				POSW = 0;
				for (int i = 0; i < carac.length; i++) {
					WPOS++;
					for (int o = 0; o < carac[i].length(); o++) {
						int WORD = 0;
						if (WORD < 1 && (carac[i].charAt(o) == 'a' || carac[i].charAt(o) == 'A'
								|| carac[i].charAt(o) == 'e' || carac[i].charAt(o) == 'E' || carac[i].charAt(o) == 'i'
								|| carac[i].charAt(o) == 'I' || carac[i].charAt(o) == 'o' || carac[i].charAt(o) == 'O'
								|| carac[i].charAt(o) == 'u' || carac[i].charAt(o) == 'U')) {
							VOWS++;
							if (VOWS == 5) {
								POSW = WPOS;
								WORD++;
							}

						}

					}
					VOWS = 0;
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return POSW;
	}

	public static void main(String[] args) {

		Class CLASS = new Class();
		// System.out.println("Caracteres en total: " +
		// CLASS.countUFTChars(CLASS.getPath()));
		// System.out.println("Letras minúsculas: " +
		// CLASS.countLowerCaseChars(CLASS.getPath()));
		// System.out.println("Líneas : " + CLASS.countLines(CLASS.getPath()));
		// System.out.println("Caracteres alfabéticos: " +
		// CLASS.countAsciiChars(CLASS.getPath()));
		// System.out.println("Palabras en total: " +
		// CLASS.countWords(CLASS.getPath()));
		 System.out.println("Palabra más larga: " +
		 CLASS.longestWords(CLASS.getPath()));
		//System.out.println(CLASS.pentaWord(CLASS.getPath()));
	}
}
