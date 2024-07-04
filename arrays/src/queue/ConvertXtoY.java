package queue;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class ConvertXtoY {
    public static void main(String[] args) {
        int src = 3;
        int dst = 8;
        System.out.println(xtoY(src, dst));
    }

    static class Cell{
        int val;
        int step;

        Cell(int val, int step) {
            this.val = val;
            this.step = step;
        }
    }

    static int xtoY(int src, int dst) {
        HashSet<Integer> set = new HashSet<>();
        Queue<Cell> q = new LinkedList<>();
        q.offer(new Cell(src, 0));
        set.add(src);

        while(!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Cell c = q.poll();
                if(c.val == dst) return c.step;

                int mul = 2 * c.val;
                int sub = c.val - 1;

                if(!set.contains(mul)) q.offer(new Cell(mul, c.step + 1));
                if(!set.contains(sub)) q.offer(new Cell(sub, c.step + 1));
            }
        }
        return - 1;
    }
}
