package set1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CustomKeySort {

    static void sol(String order, String s) {
        Map<Character, Integer> rank = new HashMap<>();
        for(int i=0; i<order.length(); i++) {
            rank.put(order.charAt(i),i);
        }

        Character [] ca = new Character[s.length()];
        for(int i=0;i<s.length(); i++) {
            ca[i] = s.charAt(i);
        }
        Arrays.sort( ca,
                ((a,b) -> {
                    int i1 = rank.getOrDefault(a, 26);
                    int j1 = rank.getOrDefault(b, 26);
                    return Integer.compare(i1,j1);
                }));

        StringBuilder sb = new StringBuilder();
        for(char e: ca) {
            sb.append(e);
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        sol("cba", "abcd");
    }
}
