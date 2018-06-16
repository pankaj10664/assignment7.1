import java.util.*;;

class Nik
{
   public static void main(String args[])
   {
       String strOrig, strNew;
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter a String : ");
       strOrig = sc.nextLine();
       
       System.out.println("Removing Vowels from The String [" +strOrig+ "]\n");
       strNew = strOrig.replaceAll("[aeiouAEIOU]", "");
	   
       System.out.println("All Vowels Removed Successfully..!!\nNow the String is :\n");
              
       System.out.print(strNew);
   }
}