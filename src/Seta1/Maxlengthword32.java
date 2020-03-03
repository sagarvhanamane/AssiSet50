package Seta1;

public class Maxlengthword32 {

	public static void main(String[] args) {
		String s= "Honesty is my best policy";
        String [] word = s.split(" ");
         String maxlengthWord = " ";
          for(int i = 0; i < word.length; i++){
         if(word[i].length() >= maxlengthWord.length()){
               maxlengthWord = word[i];
         } 
 }
  System.out.println(maxlengthWord);  
	}

}
