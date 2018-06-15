class AscendingOrder{

	public static void main(String[] args){
		int j,i,temp;
		int array[]={1,1,1,1,0,0,1,0};

	for(i=0;i<array.length-1;i++)
	{
		for(j=0;j<array.length-1;j++)
			{
		if(array[j]>array[j+1])
             {
               temp=array[j+1];
           array[j+1]=array[j];
              array[j]=temp;

				}
			}
	}
		
				
			for(int k=0;k<array.length;k++)
			{
                      System.out.print(array[k]);
                  }
	}
}