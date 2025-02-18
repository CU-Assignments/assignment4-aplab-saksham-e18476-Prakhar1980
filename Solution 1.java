class Solution {
    public int[] beautifulArray(int n) {
        if (n == 1) {
            return new int[] {1};
        }
      
        int[] leftHalf = beautifulArray((n + 1) >> 1);
        int[] rightHalf = beautifulArray(n >> 1);
        int[] result = new int[n];
      
        int index = 0;
        for (int element : leftHalf) {
            result[index++] = element * 2 - 1;
        }
      
        for (int element : rightHalf) {
            result[index++] = element * 2;
        }
      
        return result;
    }
}

