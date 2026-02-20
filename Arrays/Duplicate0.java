class Solution {
    public void duplicateZeros(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                count++;
        }
        int i = arr.length - 1;
        int j = arr.length + count -1;
        while (i!=j) {
            if (j < arr.length) {
                arr[j] = arr[i];
            }
            if (arr[i] == 0) {
                    j--;
                if (j < arr.length) {
                    arr[j] = arr[i];
                }
            }
            i--;
            j--;
        }

    }
}