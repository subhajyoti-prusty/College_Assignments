
public class String_Search_Counting_Occurounce_BruteForce {
    public int bruteforce(String Test, String Str)
	{
		int m = Test.length();
		int n = Str.length();
		int count = 0;

		for (int i = 0; i <n-m; i++)
		{
			int j = 0;
			while ((j < m) && (Str.charAt(i + j) == Test.charAt(j)))
				j++;
			
			if (j == m)
			{
				System.out.println("Found at index: " + (i+1) + " upto " + (i+m));
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args)
	{
		String_Search_Counting_Occurounce_BruteForce obj = new String_Search_Counting_Occurounce_BruteForce();
		
		String Str = "";
		String Test = "the";
		
		int count = obj.bruteforce(Test, Str);
		
		if (count == 0)
			System.out.println("Pattern is not matched in the text");
		else
			System.out.println("Pattern found "+count+" times.");
	}
}