package Greedy_Algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class Number_of_Coins {
    public int minCoins(int coins[], int M, int V)
    {
        // Your code goes here
        Arrays.sort(coins);
        Vector<Integer> ans=new Vector<>();
        for (int i = M-1; i >=0 ; i--) {
            while (V>=coins[i]){
                V-=coins[i];
                ans.add(coins[i]);
            }
        }
        return ans.size();
    }
}
