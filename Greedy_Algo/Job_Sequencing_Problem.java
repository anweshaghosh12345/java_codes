package Greedy_Algo;

import java.util.Arrays;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z;
    }
}

public class Job_Sequencing_Problem {
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr,(a,b)-> (b.profit-a.profit));
        int max=0;
        for (int i = 0; i < n; i++) {
            if(arr[i].deadline>max){
                max=arr[i].deadline;
            }
        }
        int res[]=new int[max+1];
        Arrays.fill(res,-1);

        int countJobs=0,jobProfit=0;
        for(int i=0;i<n;i++){
            for(int j=arr[i].deadline;j>0;j--){
                if(res[j]==-1){
                    res[j]=i;
                    countJobs++;
                    jobProfit+=arr[i].profit;
                    break;
                }
            }
        }
        int ans[]=new int[2];
        ans[0]=countJobs;
        ans[1]=jobProfit;
        return ans;

    }
}
