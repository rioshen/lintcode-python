public class SingleNumber {
	/**
	 *@param A : an integer array
	 *return : a integer
	 */
	public int singleNumber(int[] A) {
        if (A == null || A.length == 0) return 0;

        int num = 0;
        for (int elem : A) {
            num ^= elem;
        }

        return num;
    }
}
