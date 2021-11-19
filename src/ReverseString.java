public class ReverseString {
    public static void main(String[] args) {
    }
    public static void revString(char[] s ,int left , int right)
    {
        if(left > right ){
            return;
        }
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        revString(s,++left,--right);
    }
}
