public class Main {
    public static void main(String[] args) {
        TernarySearch search = new TernarySearch();
        int[] values = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 7;

        int result = search.ternarySearch(values, target);

        if (result == -1) {
            System.out.println("The element " + target + " not found in the array.");
        } else {
            System.out.println("The element " + target + " found at index: " + result);
        }
    }
}
