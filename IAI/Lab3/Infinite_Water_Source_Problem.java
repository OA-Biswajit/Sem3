import java.util.Vector;
import java.util.Set;
import java.util.Queue;

public class Solution {
    public static boolean solution(int x, int y, int z) {
        if (x + y < z) {
            return false;
        }
        Vector<Integer> directions = new Vector<>();
        directions.add(x);
        directions.add(-x);
        directions.add(y);
        directions.add(-y);
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        visited.add(0);
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.peek();
            q.remove();
            for (int direction : directions) {
                int total = curr + direction;
                if (total == z) {
                    return z;
                }
                if (total < 0 || total > x + y) {
                    continue;
                }
                if (visited.contains(total)) {
                    continue;
                }
                visited.add(total);
                q.add(total);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int j1 = 3;
        int j2 = 5;
        int m = 4;
        System.out.println(solution(j1, j2, m));
    }
}