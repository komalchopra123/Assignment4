class SearchArray{
public static void main(String[] args)
{
int array[]={1,4,7,2};
int n=6;
int flag=0;
for(int i=0;i<4;i++)
{
	if(n==array[i])
	{
		System.out.print("the number is in array");
		flag++;
		break;
	}
}

if(flag==0){System.out.println("the number is not presentx");}
}
}