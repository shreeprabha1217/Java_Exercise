class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        long s = 0;
        long as = 0;
        long e = (long) n * (n + 1) / 2;
        long es = (long) n * (n + 1) * (2 * n + 1) / 6;

        // Calculate actual sum and sum of squares
        for (int num : arr) {
            s += num;
            as += (long) num * num;
        }

        // Calculate differences
        long d = e - s; // missing - repeating
        long ds = es - as; // missing^2 - repeating^2

        // Calculate missing and repeating
        long missing = (d + (ds / d)) / 2;
        long repeat = missing - d;

        // Prepare the result
        int[] result = new int[2];
        result[0] = (int) repeat;
        result[1] = (int) missing;

        return result;
    
    }
}
