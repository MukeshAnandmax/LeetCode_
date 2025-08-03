class Solution {
    static int[] fibCache;
    public int fib(int n) {
        fibCache = new int[n+1];
        Arrays.fill(fibCache, -1);
        return fib1( n);
    }

        public static int fib1(int n){
        if(fibCache[n] != -1){
            return fibCache[n];
        }
        if(n == 0 || n == 1){
            return fibCache[n] = n;
        }
        return fibCache[n] = fib1(n-1) + fib1(n-2);
    }
}