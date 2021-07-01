package classes;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("file1.txt");
		list.add("file2.txt");

		CountNumberOfOccurences count = new CountNumberOfOccurences();

		for (String fileName : list) {
			System.out.println(fileName);
			count.countNoOfOccurences(fileName);
			System.out.println("--------------------");

		}

	}
}
