import java.util.Scanner;
 
class SubArray
{
    public static void SubArr(int arr[],int n)
    {
        int a = 1 , max = 1;
   
        for (int i=1; i<n; i++)
        {
            if (arr[i] > arr[i-1])
			{
                a++;
            }
			else
            {
                if (max < a)
				{
                    max = a;
                }
                a = 1;
            }    
        }

        if (max < a)
		{
            max = a;
		}
        System.out.println("Max length of Sub Array= " +max);
    }
     
    public static void main(String args [])
    {
		int i = 0;
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of an array:");
		for(i = 0 ; i < 10 ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		SubArr(arr, 10);
    }
}