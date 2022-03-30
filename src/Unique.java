class Unique {
    public static void main(String[] args) {
        int[] y = {1, 2, 3, 42, 2};
        areUnique(y);

    }

    public static void areUnique(int[] x) {
        /* for (int i = 0; i < x.length; i++) {
             for (int j = i+1; j < x.length ; j++) {
                 if(x[i] == x[j])
                     return false;
             }
             System.out.println("false");
         }
         System.out.println("True");
         return true;*/
        int n = 5;
        for (int i = 1; i < n; i++)
            for (int j = 0; j < i; j++)
                if (j % i == 0)
                    System.out.println(i + " " + j);
    }

}

