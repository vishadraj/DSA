public class Power_Of_Two {
    public static boolean isPowerOfTwo(int n){
        if(n==0) return false;
        while(n%2==0) n/=2;
        return n ==1;

    }

    public static void main(String[] args) {
        isPowerOfTwo(13);
    }

}
