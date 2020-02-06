public class Index{
public static void main(String arg[]){
int b=5;
int a[]= new int[5];
a[0]=Integer.parseInt(arg[0]);
a[1]=Integer.parseInt(arg[1]);
a[2]=Integer.parseInt(arg[2]);
a[3]=Integer.parseInt(arg[3]);
a[4]=Integer.parseInt(arg[4]);
int l=a.length;
  
   for(int i=0;i<l;i++) 
       {
         if (a[i]==b)
         System.out.println("index of given value is" + i);
       }
 }
}