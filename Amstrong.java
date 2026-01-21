import java.util.*;
class Amstrong{
                 public static void main(String args[])
                    {
                       Scanner s=new Scanner(System.in);
                       System.out.println("Enter the number:");
                       int num=s.nextInt();
                       int original=num;
                       int sum=0;
                       int digits=String.valueOf(num).length();
                        while(num>0)
                         {
                            int digit =num%10;
                            sum+=Math.pow(digit,digits);
                            num/=10;
                         }
                        if(sum==original)
                          {
                              System.out.println(original +" is Amstrong number");
                          } 
                        else {
                             System.out.println(original + " is not Amstrong number");
                            }
}
}