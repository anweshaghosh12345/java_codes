package Array;

public class Daily_Temperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] answer=new int[n];
        for (int i = 0; i < n; i++) {
            int c=0;
            for (int j = i; j <n ; j++) {
                if(temperatures[i]<=temperatures[j])
                    c++;
                else
                    break;
            }
            answer[i]=c;
        }

        return answer;
    }
}