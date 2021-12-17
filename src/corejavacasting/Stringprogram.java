package corejavacasting;

public class Stringprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="ENGLISH";
		String word2="";

			for(int i=word.length()-1;i>=0;i--)
			{
				word2=word2+word.charAt(i);
	}
			System.out.println(word2);
			if (word.equals(word2))
				System.out.println("Palinrome");
			else System.out.println("Not Palindrom");
}

}



