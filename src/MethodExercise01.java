import java.util.Scanner;

public class MethodExercise01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int input = myScanner.nextInt();
        Tools01 tool = new Tools01();
        System.out.println(tool.JudgeParity(input));
    }
}

class Tools01 {
    public boolean JudgeParity(int input) {
        boolean parity;
        if (input / 2 == 0) {
            parity = false;
        } else {
            parity = true;
        }
        return parity;
    }
}