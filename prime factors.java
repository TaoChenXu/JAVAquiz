import java.util.Scanner;
public class Main {
public static int sfwzs(int a)
{
int p=1;
for(int i=2;i<a;i++)
{
if(a%i==0)
{
prime=0;
break;
}
}
return p;
}
public static int zxys(int a)
{
int b=0;
for(int i=2;i<a;i++)
{
if(a%i==0&sfwzs(i)==1)
{
b=i;
break;
}

}
return b; 
}

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner in= new Scanner(System.in);
int a=in.nextInt();
System.out.print(a+"=");
while(sfwzs(a)==0)
{
System.out.print(zxys(a)+"x");
a=a/zxys(a);
}
System.out.print(a);
}
}
