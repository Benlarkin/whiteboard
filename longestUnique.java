public class longestUnique {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 1, 2, 3, 4, 2, 1};
        int n = a.length;
        int ans = 0;
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j <= n; j++){
                if (allUnique(a, i, j)){
                    // j-i is length of unique substring
                    ans = Math.max(ans, j - i);
                }
            }
        }
        System.out.println(ans);
    }

    public static boolean allUnique(int[] a, int start, int end) {
        int[] alphabet = new int[10];
        for (int i = start; i < end; i++) {
            int current = a[i];
            if (alphabet[current] != 0)
                return false;
            alphabet[current] = 1;
        }
        return true;
    }
}