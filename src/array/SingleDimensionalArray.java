package array;

public class SingleDimensionalArray {

    public static void main(String[] args) {

        int[] a;     //Recommendable
        a = new int[4];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;

        System.out.println(a.length);
        System.out.println(a);

        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }

    }
}
