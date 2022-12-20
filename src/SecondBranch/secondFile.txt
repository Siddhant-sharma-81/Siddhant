package question2;

import java.io.File;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.util.ArrayList;

import java.util.Iterator;

import java.util.Scanner;

public class DataRead {

	public static void main(String[] args) throws Exception {
		
		File f = new File("./src/question2/Read file");
		
		Scanner scanner = new Scanner(f);
		
		while(scanner.hasNextLine());
		
		System.out.println(scanner.nextLine());

	}

}

// class for counting words.

class WordCounter{
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream in = new FileInputStream("./src/question2/Read file");
		
		Scanner scanner = new Scanner(in);
		
		ArrayList<String>w = new ArrayList<String>();
		
		ArrayList<Integer>c = new ArrayList<Integer>();
		
			while(scanner.hasNext()) {
				
				String next = scanner.next();
				
				if(w.contains(next)) {
					
					int index = w.indexOf(next);
					
					c.set(index, c.get(index)+1);
					
				}
				
				else {
					
					w.add(next);
					c.add(1);
					
				}
					
			}	
			
			scanner.close();
			
			in.close();
			
			for(int i = 0; i<w.size();i++) {
				
				System.out.println(w.get(i)+" - "+"present at"+" - "+c.get(i)+" "+"times");
				
			}
		
	}
	
}
