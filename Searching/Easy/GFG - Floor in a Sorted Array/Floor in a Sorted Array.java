class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        int low = 0, high = arr.length - 1, ans = -1;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(arr[mid] <= x) {
                ans = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
                
        }
        return ans;
    }
    
}