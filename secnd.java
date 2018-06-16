import java.util.*;;
 
class Sub
{
   public static void main(String args[])
   {
      String s, l;
      int i, c, length;
 
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string to print it's all substrings");
      s = sc.nextLine();
 
      length = s.length();   
 
      System.out.println("Substrings of \""+s+"\" are:");
 
      for (c=0;c<length;c++)
      {
         for(i=1;i<=length-c;i++)
         {
            l = s.substring(c, c+i);
            System.out.println(l);
         }
      }
   }
}