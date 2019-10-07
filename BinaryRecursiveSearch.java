public class BinaryRecursiveSearch implements Practice03Search
{
    public BinaryRecursiveSearch()
    {}

    public String searchName()
    {
        return "Binary Search (Recursive)";
    }

    public int binSearch(int [] arr, int target, int low, int high)
    {
        int mid = (low + high) / 2;

        if(target == mid)
        {
            return mid;
        }
        else if(low < high)
        {
            if(target > mid)
            {
                return binSearch(arr, target, mid + 1, high);
            }
            else
            {
                return binSearch(arr, target, low, mid - 1);
            }
        }
        return -1;
    }
    public int search(int [] arr, int target)
    {
        return binSearch(arr, target, 0, arr.length - 1);
    }
}
