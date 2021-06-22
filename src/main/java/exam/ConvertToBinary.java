package exam;

public class ConvertToBinary
{
  public String toBinary(final int n)
  {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    int bin[]=new int[50];
    int count=0;
    while(n>0)
    {
      bin[count++]=n%2;
      n=n/2;
    }
    for(int i=count-1;i>=0;i--)
      System.out.print(bin[i]);
  System.out.println();
    return "";
  }
}
