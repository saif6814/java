public class Specific{
public static void main(String arg[]) {
 int a[] = new int[5],flag=1;
a[0]=Integer.parseInt(arg[0]);
a[1]=Integer.parseInt(arg[1]);
a[2]=Integer.parseInt(arg[2]);
a[3]=Integer.parseInt(arg[3]);
a[4]=Integer.parseInt(arg[4]);
  int l=a.length;
for(int i=0;i<l-1;i++)
{
  for(int j=i+1;j<l;j++)
   {
    if(a[i]==a[j])
      {
       flag=0;
      break;
      }
   }
}
     if(flag==1)
     System.out.println("array is specific");
     else
     System.out.println("array is not specific");

  }
}