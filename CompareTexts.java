import java.io.*;
import java.util.*;

public class CompareTexts {
	public static String compareTexts(String s1, String s2) {
		HashMap<String, Integer> words = new HashMap<String, Integer>(); 
		String[] text1 = s1.split(" ");
		String[] text2 = s2.split(" ");
		String currentWord = "";
		
		for(int i = 0; i < text1.length; i++) {
			currentWord = text1[i];
			for(int j = 0; j < text2.length; j++) {
				if(text2[j].equals(currentWord)) {
					if(!words.containsKey(currentWord)) {
						words.put(currentWord, 1);
					} else {
						words.put(currentWord, words.get(currentWord) + 1);
					}
				}
			}
		
		}
		
		return getAllBars(words);
		
//		words.put("the", 0);
//		words.put("of", 0);
//		words.put("and", 0);
//		words.put("to", 0);
//		words.put("a", 0);
//		words.put("in", 0);
//		words.put("that", 0);
//		words.put("is", 0);
//		words.put("you", 0);
//		words.put("as", 0);
//		words.put("are", 0);
//		words.put("we", 0);
//		words.put("for", 0);
//		words.put("be", 0);
//		words.put("your", 0);
//		words.put("it", 0);
//		words.put("or", 0);
//		words.put("on", 0);
//		words.put("have", 0);
//		words.put("with", 0);
//		words.put("i", 0);
//		words.put("not", 0);
//		words.put("they", 0);
//		words.put("this", 0);
//		words.put("from", 0);
//		words.put("who", 0);
//		words.put("what", 0);
//		words.put("when", 0);
//		words.put("where", 0);
//		words.put("how", 0);
//		words.put("at", 0);
//		words.put("so", 0);
//		words.put("my", 0);
//		words.put("can", 0);
//		words.put("he", 0);
//		words.put("was", 0);
//		words.put("by", 0);
//		words.put("even", 0);
//		words.put("an", 0);
//		words.put("about", 0);
//		words.put("co", 0);
//		words.put("if", 0);
//		words.put("but", 0);
//		words.put("our", 0);
//		words.put("feel", 0);
//		words.put("more", 0);
//		words.put("one", 0);
//		words.put("like", 0);
//		words.put("their", 0);
//		words.put("his", 0);
//		words.put("self", 0);
//		words.put("all", 0);
//		words.put("do", 0);
//		words.put("just", 0);
//		words.put("people", 0);
//		words.put("no", 0);
//		words.put("l", 0);
//		words.put("because", 0);
//		words.put("don't", 0);
//		words.put("will", 0);
//		words.put("\"i", 0);
//		words.put("out", 0);
//		words.put("these", 0);
//		words.put("up", 0);
//		words.put("chat", 0);
//		words.put("has", 0);
//		words.put("get", 0);
//		words.put("were", 0);
//		words.put("then", 0);
//		words.put("other", 0);
//		words.put("me", 0);
//		words.put("it's", 0);
//		words.put("had", 0);
//		words.put("into", 0);
//		words.put("only", 0);
//		words.put("some", 0);
//		words.put("good", 0);
//		words.put("than", 0);
//		words.put("yourself", 0);
//		words.put("should", 0);
//		words.put("would", 0);
//		words.put("us", 0);

//		return getMostCommon(words);
		
	}
	
//	public static String getMostCommon(HashMap<String, Integer> map) {
//		String commonWord = "";
//		for(String s:map.keySet()) {
//			if(map.get(s) > map.get(commonWord)) {
//				commonWord = s;
//			}
//		}
//		return commonWord;
//	}
	
	public static String getAllBars(HashMap<String, Integer> map) {
		String output = "";
		for(String s:map.keySet()) {
			output += s + "\r|";
			for(int i = 0; i < map.get(s); i++) {
				output += "=";
			}
			output += "\n";
		}
		return output;
	}
	
	public static String printBars(int num) {
		String bar = "|";
		for(int i = 0; i < num; i++) {
			bar += "=";
		}
		
		return bar;
	}
	
	public static void main(String[] argsg) throws IOException {
		File text1 = new File("C:\\Users\\samue\\Desktop\\wisds.txt");
		File text2 = new File("C:\\Users\\samue\\Desktop\\ewfnewn.txt");
		BufferedReader reader = new BufferedReader(new FileReader(text1));
		String t1 = "";
		
		String txt1 = "";
		String txt2 = "";
		while((t1=reader.readLine()) != null) {
			txt1 += " " + t1.toLowerCase();
		}
		BufferedReader reader2 = new BufferedReader(new FileReader(text2));
		while((t1 = reader2.readLine()) != null) {
			txt2 += " " + t1.toLowerCase();
		}

		reader.close();
		reader2.close();
		
		System.out.println(compareTexts(txt1, txt2));
	}
	
}
