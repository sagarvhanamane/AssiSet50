package Seta1;

public class WordmostNoofvowel39 {

	public static void main(String[] args) {
		String str="The sun raises in the east";
        String word = "";
        String wordMostVowel = "";
        int temp = 0;
        int vowelCount = 0;
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch != ' ' && i != (str.length() - 1)) {
                word += ch;  
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++; 
                }
            } else { 
                if (vowelCount > temp) {
                    temp = vowelCount;
                    wordMostVowel = word;
                }
                word = "";
                vowelCount = 0;
            }    
        }
        System.out.println("The word with the most vowels (" + temp + ") is: " + wordMostVowel);

	}

}
