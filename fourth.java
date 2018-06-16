class All
{
  public static void main(String args[])
  {
   for(int i=1;i<4;i++)
   {
   int alphabet=65;                        
   for(int j=1;j<=i;j++)
   {
   System.out.print((char)alphabet);
   alphabet++;
   }
   System.out.println();
   }
  }
}