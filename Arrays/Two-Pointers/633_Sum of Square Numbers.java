class Solution {
    public boolean judgeSquareSum(int c) {
        long st = 0;
        long end = (long) Math.sqrt(c);

        while (st <= end) {
            long sq_sum = st * st + end * end;

            if (sq_sum > c) {
                end--;
            } else if (sq_sum < c) {
                st++;
            } else {
                return true;
            }
        }

        return false;
    }
}