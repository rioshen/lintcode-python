public class FindMinimuminRotatedArray {
    /**
     * @param num: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] num) {
        int lo = 0, hi = num.length - 1;
        while (lo < hi && num[lo] > num[hi]) {
            int mid = lo + (hi - lo) / 2;
            if (num[mid] < num[hi]) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return num[lo];
    }
}
