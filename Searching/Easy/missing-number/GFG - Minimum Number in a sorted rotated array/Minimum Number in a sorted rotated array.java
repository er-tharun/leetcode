class Solution
{
    //Function to find the minimum element in sorted and rotated array.
    static int minNumber(int arr[], int low, int high)
    {
        //int low = 0, high = arr.length - 1;
        if(arr.length == 1)
            return arr[0];
        int minNum = Integer.MAX_VALUE;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(arr[low] <= arr[high]) {
                minNum = minNum < arr[low] ? minNum : arr[low];
                break;
            }
            //Left sorted
            if(arr[low] <= arr[mid]) {
                minNum = minNum < arr[low] ? minNum : arr[low];
                low = mid+1;
            }
            else {
                minNum = minNum < arr[mid] ? minNum : arr[mid];
                high = mid-1;
            }
        }
        return minNum;
    }
}