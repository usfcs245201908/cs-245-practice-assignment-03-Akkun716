public class BinaryIterativeSearch implements Practice03Search
{
    public BinaryIterativeSearch()
    {}

    public String searchName()
    {
        return "Binary Search (Iterative)";
    }
    public int search(int [] arr, int target)
    {
        int low = 0;
        int high = arr.length - 1;

        while(low < high)
        {
            int mid = (low + high) / 2;

            if(arr[mid] == target)
            {
                return mid;
            }
            else if(target > mid)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }

        return -1;
    }
}
