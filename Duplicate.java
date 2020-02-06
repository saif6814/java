public class Duplicate{
public static void main(String arg[]){
int a[]= new int[]{1,1,3,3,4,5,7,7,8,9};
int temp[]=new int[10];
int n=1;
temp[0]=a[0];
    for(int i=1;i<a.length;i++)
    {
      for(int j=0;j<temp.length;j++)
       {
         if(a[i]!=temp[j])
          {
           temp[n]=a[i];
           n++;
          }
       }    
    }
for(int i=0;i<10;i++)
{
System.out.println(temp[i]);
}

  }
}