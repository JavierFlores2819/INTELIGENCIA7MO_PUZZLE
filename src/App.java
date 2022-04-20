public class App {
    public static void main(String[] args) throws Exception {

        var puzzle = new int[][] { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };
        
        var puzzle2 = new int[][] { { 1,8,2 }, {0,4,3 }, { 7,6,5} };

        int tamaño = 9;
      

        for (int i = 0; i < puzzle.length; i++) {
            for (int j = 0; j < puzzle[i].length; j++) {
                if (puzzle[i][j] == puzzle2[i][j]) {
                    tamaño--;
                }
            }
        }
        System.out.println(tamaño);
    }
}
