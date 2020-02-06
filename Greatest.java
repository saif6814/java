public class Greatest{
 public static void main(String[] arg){
int a,b,c;
a=Integer.parseInt(arg[0]);
b=Integer.parseInt(arg[1]);
c=Integer.parseInt(arg[2]);

if(a>b && a>c)
{
System.out.println("a is greatest");
}
else if(b>a && b>c)
{
System.out.println("b is greatest");
}
else 
System.out.println("c is greatest");
}
}