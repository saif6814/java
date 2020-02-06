public class Ave{
public static void main(String[] arg){
int a[]=new int[5],s=0,av;
System.out.println("Enter the no.");
a[0]=Integer.parseInt(arg[0]);
a[1]=Integer.parseInt(arg[1]);
a[2]=Integer.parseInt(arg[2]);
a[3]=Integer.parseInt(arg[3]);
a[4]=Integer.parseInt(arg[4]);
for(int i=0;i<5;i++)
{
s=s+a[i];
}
av=s/5;
System.out.println(av);

 }  
}