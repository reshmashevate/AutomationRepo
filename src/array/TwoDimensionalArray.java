package array;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        int[][] b = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
        String[][] s = new String[3][3];
        String sa = "Reshma";

        System.out.println(b.length);
        System.out.println(s.length);
        System.out.println(sa.length());



       /* b[0][0] = 1;
        b[0][1] = 2;
        b[0][2] = 3;
        b[1][0] = 4;
        b[1][1] = 5;
        b[1][2] = 6;
        b[2][0] = 7;
        b[2][1] = 8;
        b[2][2] = 9;*/

        System.out.println(b.length);

        for(int i=0; i<b.length; i++){
            for(int j=0; j<b.length; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println(" ");
        }



    }

}
