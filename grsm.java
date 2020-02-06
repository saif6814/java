public class grsm{
public static void main(String arg[]){
int a[]=new int[]{2,8,1,5,0};
int s=a[0],g=a[0];
for(int i=1;i<a.length;i++)
    {
     if(a[i]>g)
       {
        g=a[i];
       }

     if(a[i]<s)
       {
        s=a[i];
       }
    }
 System.out.println("Greatest no. is  "  + g);
 System.out.println("Smallest no. is  "  + s);


}
  }