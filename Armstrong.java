class Armstrong{
public static void main(String[] args){
int num=123,n,temp,total=0;
n=num;
while(n!=0)
{
temp=n%10;
total=total+temp*temp*temp;
n=n/10;
}
if(total==n)
System.out.print("the number is armstrong number");
else
System.out.print("the number is not a armstrong number");
}
}