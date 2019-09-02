
public class ReverseString {
	public static void reverseString(char[] s) {
		for (int i = 0; i < s.length / 2; i++) {
			char start = s[i];
			char end = s[s.length - 1 - i];

			s[i] = end;
			s[s.length - 1 - i] = start;
		}
	}
	
	public static void main(String[] args) {
		char[] input = {'h','e','l','l','o'};
		
		System.out.println("Before: " + input);
		reverseString(input);
		System.out.println("After:" + input);
		
	}
}
