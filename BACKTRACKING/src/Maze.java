import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3, 3));  // Outputs the number of paths
        System.out.println(path("", 3, 3));  // Prints all possible paths
    }

    // Count the number of ways to reach (r, c) from (1,1)
    static int count(int r, int c) {
        if (r == 1 || c == 1) {  // If we reach the first row or column, only one way is possible
            return 1;
        }
        int left = count(r - 1, c);  // Move Down
        int right = count(r, c - 1); // Move Right

        return left + right;  // Total paths
    }

    // Print all possible paths from (1,1) to (r,c)
    static ArrayList<String> path(String p, int r, int c) {
            if (r == 1 && c == 1) {  // Reached destination
                ArrayList<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }

            ArrayList<String> list = new ArrayList<>();

            if (r > 1) {
                list.addAll(path(p + 'D', r - 1, c));  // Move Down
            }
            if (c > 1) {
                list.addAll(path(p + 'R', r, c - 1));  // Move Right
            }

            return list;
        }
    }



