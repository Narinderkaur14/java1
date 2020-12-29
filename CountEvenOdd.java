package javaproo;

public class CountEvenOdd {
	public int FindNumbers(int[] nums)
	{
		int res=0;
		for(int i=0;i<nums.length;i++)
		{
			if(isEvenCount(nums[i]))
			{
				res++;
			}
		}
	
	
	return res;
	}

	private static  boolean isEvenCount(int num)
	{
	int count = 0;
	while(num != 0)
	{
	count++;
	num = num / 10;
	}

	return(count % 2 == 0);
	}

	public static void main(String[] args) {
	int nums= 12358;
	System.out.println(isEvenCount(nums));
	}
}
	


	
	