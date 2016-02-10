package com.xeronith;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Console {
    
	private static final String os = System.getProperty("os.name");
	private static final BufferedReader bufferedReader =
		new BufferedReader(new InputStreamReader(System.in));    

	public static String readLine() {
		try {
			return bufferedReader.readLine();
		} catch (Exception ex) {
			ex.printStackTrace();
			System.exit(1);
		}

		return null;
	}

	public static int readInt() {
		try {
			return Integer.parseInt(bufferedReader.readLine());
		} catch (Exception ex) {
			ex.printStackTrace();
			System.exit(1);
		}

		return 0;
	}

	public static void clear() {
		try {
			if(os.contains("Windows"))
				new ProcessBuilder("cmd", "/c", "cls")
					.inheritIO()
					.start()
					.waitFor();
			else
				Runtime.getRuntime().exec("clear");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void write(Object arg) { 
		System.out.print(arg); 
	}

	public static void writeLine(Object arg) { 
		System.out.println(arg); 
	}

	public static void writeLine() { 
		System.out.println();
	}

	public static void exit() {
		System.exit(0);
	}
}
