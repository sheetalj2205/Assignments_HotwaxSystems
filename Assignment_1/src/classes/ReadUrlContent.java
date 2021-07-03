package classes;

import java.net.*;
import java.util.ArrayList;
import java.io.*;

public class ReadUrlContent {

	public String contentOfPage;
	
	
    // read words from file2 for which you want to count the number of occurrences and store them in a list
	public void readWords() {
		try {
			BufferedReader bufReader = new BufferedReader(new FileReader("file2.txt"));
			ArrayList<String> words = new ArrayList<>();

			String line = bufReader.readLine();
			while (line != null) {
				words.add(line);
				line = bufReader.readLine();
			}

			bufReader.close();
			for (String word : words) {
				countingWord(contentOfPage, word);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// read url names from file1 and store them in a list then get the content of url through getUrlContents()
	public void readFileNames() {
		try {
			BufferedReader bufReader = new BufferedReader(new FileReader("file1.txt"));
			ArrayList<String> list = new ArrayList<>();

			String line = bufReader.readLine();
			while (line != null) {
				list.add(line);
				line = bufReader.readLine();
			}

			bufReader.close();

			for (String fileName : list) {
				System.out.println(fileName);
				contentOfPage = getUrlContents(fileName);
				readWords();
				System.out.println("--------------------");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// count number of occurences of each word present in file2
	public int countingWord(String value, String findWord) {
		int counter = 0;
		while (value.contains(findWord)) {
			int index = value.indexOf(findWord);
			value = value.substring(index + findWord.length(), value.length());
			counter++;
		}
		System.out.println(findWord + " - " + counter +" times" );
		return counter;
	}

	// get the content of the page of url in a string format 
	public static String getUrlContents(String theUrl) {
		StringBuilder content = new StringBuilder();
		try {
			URL url = new URL(theUrl); // creating a url object
			URLConnection urlConnection = url.openConnection(); // creating a urlconnection object


			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			String line;
			
			while ((line = bufferedReader.readLine()) != null) {
				content.append(line + "\n");
			}
			bufferedReader.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return content.toString();
	}
}