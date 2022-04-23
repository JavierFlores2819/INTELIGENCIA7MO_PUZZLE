public class App {
    public static void main(String[] args) throws Exception {

        int[][] puzzle = new int[][] { { 8, 3, 2 }, { 1, 4, 0 }, { 7, 6, 5 } }; // estado inicial
        int g = 0;
        int h = funcionH(puzzle);
        int f = g + h;
      //  Arbol raiz = new Arbol(puzzle, g, f, h, null);
        while (h != 0) {
            for (int i = 0; i < puzzle.length; i++) {
                for (int j = 0; j < puzzle[i].length; j++) {
                    if (j + 1 < puzzle[i].length && puzzle[i][j + 1] == 0) {
                        // data += "derecha en : " + i + "," + j + " ";
                    }

                    if (j > 0 && puzzle[i][j - 1] == 0) {
                        // data += "izquierda en : " + i + "," + j + " ";
                    }
                    if (i > 0 && puzzle[i - 1][j] == 0) {
                        // data += "arriba en : " + i + "," + j + " ";
                    }
                    if (i + 1 < puzzle.length && puzzle[i + 1][j] == 0) {
                        // data += "abajo en : " + i + "," + j + " ";
                    }
                }
                System.out.println("");
            }
        }
    }

    public static int funcionH(int[][] matriz) {
        var puzzleFinal = new int[][] { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } }; // estado final
        int h = matriz.length * matriz[matriz.length - 1].length; // numero de valores

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == puzzleFinal[i][j]) {
                    h--;
                }
            }
        }
        return h;
    }
}
