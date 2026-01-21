import java.util.*;
class MinMax{ 
public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);
System.out.println("enter the size  of an array");
   int n = sc.nextInt();
   int arr[] = new int [n];
System.out.println("enter the no's  of an array");

for(int i=0;i<n;i++)
{
 arr[i]=sc.nextInt();
}
   int max=arr[0];
   int min=arr[0];
for(int i=0;i<n;i++){
   if(arr[i]>max)
      max=arr[i];
   else if(arr[i]<min)
      min=arr[i];
}
  System.out.println("Maximum element:" +max);
  System.out.println("Minimum element:" +min);
}
}