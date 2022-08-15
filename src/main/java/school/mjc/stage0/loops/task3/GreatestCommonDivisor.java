package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int maxNumber = Math.max(first, second);
        int divider = 1;
        for (int i = 1; i <= maxNumber; i++) {
            if ((first % i == 0) && (second % i == 0)) {
                divider = i;
            }
        }
        System.out.println(divider);
    }
}
