public class break_continue_stat {
    // two dimensional array of numbers
    public static void main(String[] args) {
        int[][] array = new int[2][3];
        array[0][0] = 10;
        array[0][1] = 20;
        array[0][2] = 30;
        array[1][0] = 40;
        array[1][1] = 50;
        array[1][2] = 60;

        for (int i = 0; i < array.length; i++) {
            if (array[i][0] == 40) {
                break;
            }
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 50) {
                    continue;
                }
                System.out.println(array[i][j]);
            }
        }

    }
}
