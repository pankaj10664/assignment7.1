import java.util.*;
class Bing
{
	public static void main(String args[])
	{
		
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter String 1:");
        String s1=sc.next();
        System.out.println("Enter String 2 which you want to search in string 1:");
        String s2=sc.next();
        int a=s1.length();
        int b=s2.length();
        if(s1.contains(s2))
            {
              System.out.println("String 1 contains String 2");
            }
        else
            {
                System.out.println("String 1 is not contains String 2");
            }
	}
}