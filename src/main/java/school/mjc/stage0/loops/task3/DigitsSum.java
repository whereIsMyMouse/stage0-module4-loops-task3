package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        t = Math.abs(t);
        String NumberT = Integer.toString(t);
        int sumDigits = 0;
        if (NumberT.length() == 1) {
            sumDigits = t;
        } else {
            for (int i = 0; i < NumberT.length(); i++) {
                sumDigits = sumDigits + t % 10;
                t = t / 10;
            }
        }
        System.out.println(sumDigits);
    }
}
