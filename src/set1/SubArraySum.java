package set1;

import java.util.HashMap;
import java.util.Map;
//prefixmap
public class SubArraySum   {


    public static void main(String[] args) {
        int [] num = {1,2,3};
        int k = 3;
        sol(num, k);
    }

    private static void sol(int[] num, int k) {
        int sum = 0;
        int count = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0,1);
        for (int j : num) {
            sum += j;
            if (mp.containsKey(sum - k)) {
                count += mp.get(sum - k);
            }
            mp.put(sum, mp.getOrDefault(sum, 0) + 1);


        }
        System.out.printf("count: %d", count);
    }
}
