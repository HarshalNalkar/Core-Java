class BubbleSortAscending
{
    public static void main(String[] args)
    {
        int[] arr = {36,2,8,1,9,21};
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length; i++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+",");     
        }
    }
}