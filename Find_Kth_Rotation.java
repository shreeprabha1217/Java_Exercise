class Solution {
    public int findKRotation(List<Integer> arr) {
       
        int n = arr.size();
        int low = 0, high = n - 1;
        int ans = Integer.MAX_VALUE;
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            
            // If the subarray is already sorted
            if (arr.get(low) <= arr.get(high)) {
                if (arr.get(low) < ans) {
                    ans = arr.get(low);
                    index = low;
                }
                break;
            }

            // Check if the left part is sorted
            if (arr.get(low) <= arr.get(mid)) {
                if (arr.get(low) < ans) {
                    ans = arr.get(low);
                    index = low;
                }
                low = mid + 1;
            } else {
                // If the right part is sorted
                high = mid - 1;
                if (arr.get(mid) < ans) {
                    ans = arr.get(mid);
                    index = mid;
                }
            }
        }
        return index;
    }
}
