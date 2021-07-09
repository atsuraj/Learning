package com.grocery.controller;

public class IsPalindrome {

    public boolean isPalindrome(int i){

        if(i <0 || (i%10 ==0 && i != 0))
        return  false;

        int revertedNumber=0;
        while(i>revertedNumber){
            revertedNumber = revertedNumber * 10+i%10;
            i/=10;
        }

        return i == revertedNumber || i == revertedNumber/10;
    }

    private static void drawVerticalBarChart( int[] values ) {

        int rows = values.length;
        int maxValue = findMaximum( values );

        String[] horizontalRow = new String[ maxValue + 1];

        for( int row = 1; row <= maxValue; row++ ) {

            String patternForThisRow = "";
            int barChartUnitAtThisRow = maxValue - row;
            for( int column = 0; column < values.length; column++ ) {

                if( barChartUnitAtThisRow < values[ column ] ) {
                    patternForThisRow += "*\t";
                } else {
                    patternForThisRow += "0\t";
                }
            }

            horizontalRow[ row ] = patternForThisRow;

        }

        for (int i = 1; i < horizontalRow.length; i++) {
            System.out.println( horizontalRow[i] );
        }


        for( int value : values )
            System.out.printf( "%d \t", value );
    }

    private static int findMaximum( int[] values ) {

        int max = 0;
        for( int value : values ) {
            if( max < value ) {
                max = value;
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int n = 5;
        int a[]  = {1,3,0,1,5};
        drawVerticalBarChart(a);


        System.out.println(new IsPalindrome().isPalindrome(123321));

        System.out.println(getDigitFrequency(994543234,4));

        int[] ae = {1,2,4,5,7,8,10,33};
        int k = 0;
        System.out.println(binarySearch(a,0,ae.length-1,k));
    }
    public static int getDigitFrequency(int n, int d) {
        int count =0 ;
        while(n!=0) {
            if (n % 10 == d) {
                count++;
                //  n=n/10;
            }
            n = n / 10;
        }
        return count;
    }

    public static int binarySearch(int[] a,int start,int end,int target){

        int mid = (start+end)/2;

        if(start<=end) {
            if (a[mid] == target) return mid+1;

            if (a[mid] > target) return binarySearch(a, start, mid - 1, target);
            if (a[mid] < target) return binarySearch(a, mid + 1, end, target);
        }
        return -1;
    }
}
