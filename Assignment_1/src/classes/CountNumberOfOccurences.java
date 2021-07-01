package classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class CountNumberOfOccurences {

	void countNoOfOccurences(String fileName) {

		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));

			String line = br.readLine();

			HashMap<String, Integer> map = new HashMap<>();

			while (line != null) {
				if (!line.trim().equals("")) {
					String[] words = line.split(" ");

					for (String word : words) {
						if (word == null || word.trim().equals("")) {
							continue;
						}
						String proccessed = word.toLowerCase();
						if (map.containsKey(proccessed)) {
							map.put(proccessed, map.get(proccessed) + 1);
						} else {
							map.put(proccessed, 1);
						}
					}
				}
				line = br.readLine();

			}
			for (Map.Entry<String, Integer> entry : map.entrySet()) {

				System.out.println(entry.getKey() + " - " + entry.getValue());

			}
			br.close();

		} catch (

		Exception e) {
			e.printStackTrace();
		}

	}

}
