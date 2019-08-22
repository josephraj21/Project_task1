package task1;

public class ReverseString{
	
	public static void main(String[] args) {
		
		 String text="GreensTechnology";
		 
		 String reverse="";
		 
		 for(int i=text.length()-1;i>=0;i--)
		 {
			 
			 char c=text.charAt(i);
			 
			 reverse=reverse+c;
			 
		 }
		 
		 System.out.println(reverse);
	}
	

}
