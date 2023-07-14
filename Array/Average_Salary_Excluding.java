package Array;

import java.util.Arrays;

public class Average_Salary_Excluding {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum=0;
        int div=salary.length-2;
        for (int i = 1; i <salary.length-1 ; i++) {
           sum+=salary[i];
        }
        return sum/div;
    }
}
