package Array;

public class gas_station {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int diff=0, diff_total=0,start=0,tank=0;
        for (int i = 0; i < gas.length; i++) {
            diff = gas[i]-cost[i];
            diff_total+=diff;
        }
        if(diff_total<0)
            return -1;
        else {
            for (int i = 0; i < gas.length; i++) {
                tank+=gas[i]-cost[i];
                if(tank<0) {
                    start = i+1;
                    tank=0;
                }
            }
        }
        return start;
    }
}
