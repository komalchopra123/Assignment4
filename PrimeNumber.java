import java.util.*;
class PrimeNumber{
public static void main(String[] args){
int n,p;
Scanner S=new Scanner(System.in);
System.out.print("enter number");
n=S.nextInt();
for(int i=2;i<=n;i++)
{
p=0;
for(int j=1;j<i;j++)
{
if(i%j==0)
p=p+1;
}
if(p==1)
System.out.println(i);
}
}
}