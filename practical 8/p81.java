import java.util.Scanner;

class abc{

	boolean equalsssssss(String s1, String s2)
	{
		return s1.equals(s2);
	}
	void compare(String s1, String s2)
	{
		System.out.print("Comparing strings: ");
		int result = s1.compareTo(s2);
		if(result < 0)
			System.out.println("greater ");
		else if(result > 0)
			System.out.println("less than");
		else
      		System.out.println(result);
	}
	void palindrome_check(String palindrome)
	{
        String s2 = reverse(palindrome);
        boolean ch = palindrome.equals(s2);
        System.out.println("palindrome check");
        System.out.println(ch);
    }

    String reverse(String name)
    {
    	int len = name.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];
        
        // put original string in an 
        // array of chars
        for (int i = 0; i < len; i++) {
            tempCharArray[i] = name.charAt(i);
        } 
        
        // reverse array of chars
        for (int j = 0; j < len; j++) {
            charArray[j] = tempCharArray[len - 1 - j];
        }

        String s2 = new String(charArray);
        return s2;


    }
    void do_reverse(String s1)
    {
    	System.out.println("reverse of string 1: " + reverse(s1));
    }

    void edit_string(String s1,String s2,String s3)
    {
    	System.out.println(s1.replaceAll(s2,s3));        
    }

    void count_spaces_vowels(String s1)
    {
    	int vowels = 0, blanks = 0, cons = 0;
    	String s = s1.toLowerCase();
    	char tempCharArray [] = s.toCharArray();
		for (int j = 0; j < s.length(); j++) 
		{
           char ch= tempCharArray[j];
		   if(ch == 'a' || ch == 'e' || ch == 'i' || 
			ch == 'o' || ch == 'u')
				 vowels ++;
			else if(Character.isWhitespace(ch))
				blanks ++;
			else 
				cons++;
        }
		System.out.println("\nVowels:"+vowels+"\nBlanks:"+blanks+"\nConsonants:"+cons);

    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1:");
		String s1 = sc.nextLine();
		System.out.println("Enter string 2:");
		String s2 = sc.nextLine();
		abc a1 = new abc();
		boolean e_qual;
		e_qual = a1.equalsssssss(s1,s2);
		System.out.println("String equal status: "+e_qual);

		a1.compare(s1,s2);
		a1.palindrome_check(s1);
		a1.do_reverse(s1);
		System.out.println("Enter substring to change:");
		String s3 = sc.nextLine();
		System.out.println("Enter new sub-string");
		String s4 = sc.nextLine();
		a1.edit_string(s1,s3,s4);
		a1.count_spaces_vowels(s1);



	}
}