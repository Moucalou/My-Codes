package program;

import java.util.ArrayList;
import java.util.List;

public class Challenge_Valid_String {

	public static void main(String[] args) {
		
		List<Character> list = new ArrayList<>();
		String s = "({[]})";
	
		for (int i = 0; i < s.length(); i ++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				list.add(s.charAt(i));
			} else if (s.charAt(i) == ')' && list.getLast() == '(') {
				list.removeLast();
			} else if (s.charAt(i) == ']' && list.getLast() == '[') {
				list.removeLast();
			} else if (s.charAt(i) == '}' && list.getLast() == '{') {
				list.removeLast();
			}			
		}
		
		if (list.size() == 0) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}
}
