public class Reverse{
public static void main(String arg[]){
int a[]=new int[5];
int temp,i;
a[0]=Integer.parseInt(arg[0]);
a[1]=Integer.parseInt(arg[1]);
a[2]=Integer.parseInt(arg[2]);
a[3]=Integer.parseInt(arg[3]);
a[4]=Integer.parseInt(arg[4]);
int l=a.length;
int n=l-1;
   for( i=0;i<(l/2);i++)
    {
     temp=a[n];
     a[n]=a[i];
     a[i]=temp; 
     n--;
    }
       for(i=0;i<l;i++)
       {
        System.out.print(a[i]);
       }
  }
}
