package set1;

import java.util.PriorityQueue;
import java.util.Queue;

public class MinCostToConnectSticks {


    public static void main(String[] args) {

        int [] sticks = {2,3,4};
        sol(sticks);
    }

    private static void sol(int[] sticks) {

        Queue<Integer> q1 = new PriorityQueue<>();

        for(int i: sticks) {
            q1.offer(i);
        }

        int result = 0;
        while(q1.size() > 1) {
            Integer i1 = q1.poll();
            Integer i2 = q1.poll();

            int r = Integer.sum(i1,i2);
            result += r;
            q1.offer(r);
        }
        System.out.println(result);
    }
}
