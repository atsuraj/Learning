package com.grocery.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChangeCoinProblem {


    public static void main(String[] args) {

        ChangeCoinProblem changeCoinProblem = new ChangeCoinProblem();

       int n =18;
        int a[] = {5,7,1};

        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        for (int x: dp ) {
            System.out.print(" "+x);
        }

        int coinCount = changeCoinProblem.minCoin(n,a,dp);
        System.out.println("\n"+coinCount);
        for (int x: dp
        ) {
            System.out.print(" "+x);
        }
    }


    public  int minCoin(int rupee,int coins[],int[] dp){

        if(rupee==0) return 0;
            int numOfTotalCoin = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            if(rupee-coins[i]>=0) {
                int sumCoin = 0;
                if(dp[rupee-coins[i]] != -1){
                    sumCoin = dp[rupee - coins[i]];
                }else {
                     sumCoin = minCoin(rupee - coins[i], coins, dp);
                }
                if (sumCoin != Integer.MAX_VALUE && sumCoin+1 <numOfTotalCoin)
                    numOfTotalCoin = sumCoin+1;
            }
        }

        return dp[rupee] = numOfTotalCoin;
    }

}
