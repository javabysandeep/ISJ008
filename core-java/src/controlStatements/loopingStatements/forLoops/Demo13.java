package controlStatements.loopingStatements.forLoops;

public class Demo13 {
    public static void main(String[] args) {
        for (int left = 0, right = 10; left < right; left++, right--) {
            System.out.println(left + "\t" + right);
        }
        // 0 10
        // 1 9
        // 2 8
        // 3 7
        // 4 6
        // 5 5 stop --> iterations = 5
    }
}
