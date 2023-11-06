/*Interpolation Search*/

public class interpolationSearch
{
    public static void main(String[] args)
    {
        int[] arr={2};
        int index=interpolationSearch(arr,2);
        if(index==-1)
        {
            System.out.println("Element is not found");
        }
        else
        {
            System.out.println("found element at index "+index);
        }
    }
    public static int interpolationSearch (int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;
        int index=-1;

        while(start<=end && target>=arr[start] && target<=arr[end])
        {
            if (arr[start]==arr[end])
            {
                if(arr[start]==target)
                {
                    index=start;
                }
                break;
            }
            int pos = start + (target - arr[start])*(end - start)/(arr[end]-arr[start]);
            if(arr[pos]==target)
            {
                index=pos;
                break;
            }
            else if(target<arr[pos])
            {
                end=pos-1;
            }
            else
            {
                start=pos-1;
            }
        }

        return index;


    }
}
