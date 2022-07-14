package com.selva;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Framework {
	
	public static QueueIntf getInstance() throws FileNotFoundException {
//		return new FirstQueue();
		
		File file = new File("MyConfig.txt");
		Scanner scanner = new Scanner(file);
		String className = scanner.nextLine();
		scanner.close();
		
		QueueIntf q = null;
		
		switch (className) {
		case "FirstQueue": 
			q = new FirstQueue();
			break;
		case "BetterQueue":
			q = new BetterQueue();
			break;
		};
		
		return q;
	}
}
