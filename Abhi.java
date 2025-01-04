
import java.util.Arrays;


class Abhi {
    public static void main(String[] args) {
        int[] a = { 2, 3, 5, 7, 2, 9, 5, 4, 3, 8, 2 };
        int b = a.length;
        System.out.println(a[0]);
        for (int q = 0; q < b;q++){
            for (int o = 0; o < b - 1; o++) {
                if (a[o] > a[o + 1]) {
                    int c = a[o];

                    a[o] = a[o + 1];
                    a[o + 1] = c;

                }
            }


        }System.out.println(Arrays.toString(a));
    };

}
