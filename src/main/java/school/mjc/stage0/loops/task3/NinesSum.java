package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sumNine = 0;
        String actualNumString = new String("9");
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            int actualNumber = Integer.parseInt(actualNumString.repeat(i));
            sumNine = sumNine + actualNumber;
        }
        System.out.println(sumNine);
    }
}
