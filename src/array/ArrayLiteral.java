package array;

public class ArrayLiteral {

    public static void main(String[] args) {

        int[] a = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println(a.length);

        for(int array : a){
            System.out.println(array)
        }
    }
}
