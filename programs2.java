import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Collection;
import java.util.Scanner;
class  Panagram
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String sentence: ");
		String st = "abcdefghijklmnopqrstuvwxyz";
		String str = sc.nextLine();
		if (st.equals(check(str)))
		{
			System.out.println("It is pangram");
		}
		else
		{
			System.out.println("It is not panagram");
		}
		
	}
	public static String check(String st)
	{
		String em ="";
		
		String s1 =st.toLowerCase();
		String s2 = s1.replace(' ','a');
		char ch1[] = s2.toCharArray();
		Arrays.sort(ch1);
		Collection<Character> update =  removeDuplicates(ch1);
		for(char c1 : update)
		{
			em+=c1;
		}
		return em;
	}


	public static Collection<Character> removeDuplicates(char []a)
    {
        LinkedHashSet<Character> set= new LinkedHashSet<Character>();
        for (int i = 0; i < a.length; i++)
		{
            set.add(a[i]);
		}

		return set;
    }
}
