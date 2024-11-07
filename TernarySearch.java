class TernarySearch {
    public int ternarySearch(int[] values, int target) {
        int start = 0, end = values.length - 1;

        while (start <= end) {
            int arrayChunk = (end - start) / 3;

            int mid1 = start + arrayChunk;
            int mid2 = start + arrayChunk * 2;

            if (values[mid1] == target) {
                return mid1;
            }
            if (values[mid2] == target) {
                return mid2;
            }

            if (target < values[mid1]) {
                end = mid1 - 1;
            } else if (target > values[mid2]) {
                start = mid2 + 1;
            } else {
                start = mid1 + 1;
                end = mid2 - 1;
            }
        }

        return -1;
    }
}
