package Seta1;

public class printAlternetposition11 {

	public static void main(String[] args) {
        String str="hello";
        String result=" ";
for(int i=0;i<str.length();i++){
	if(i%2==0){
		result=result+str.charAt(i);
	}
}
System.out.println(result);
	}

}
