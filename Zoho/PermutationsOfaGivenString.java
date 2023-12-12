package Zohoexc;
import java.util.*;


public class PermutationsOfaGivenString {
    public static void main(String[] args) {
        PermutationsOfaGivenString permutations = new PermutationsOfaGivenString();
        String s = "ABC";
        List<String> result = permutations.find_permutation(s);
        System.out.println(result);
    }

    public List<String> find_permutation(String S) {
        List<String> l = new ArrayList<>();
        char[] c = S.toCharArray();
        int n = S.length();
        permu(0, n, c, l);
        Collections.sort(l);
        return l;
    }

    void permu(int idx, int n, char[] c, List<String> ans) {
        if (idx == n) {
            String str = new String(c);
            if (!ans.contains(str))
                ans.add(str);
            return;
        }
        for (int i = idx; i < n; i++) {
            swap(idx, i, c);
            permu(idx + 1, n, c, ans);
            swap(idx, i, c);
        }
    }

    void swap(int a, int b, char[] c) {
        char temp = c[a];
        c[a] = c[b];
        c[b] = temp;
    }
}
