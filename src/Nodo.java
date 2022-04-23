import java.util.List;

public class Nodo {
    int[][] puzzle;
    int g;
    int f;
    int h;
    List<Nodo> hijos;

    public Nodo() {
    }

    public Nodo(int[][] puzzle, int g, int f, int h) {
        this.puzzle = puzzle;
        this.g = g;
        this.f = f;
        this.h = h;
    }

    public int[][] getPuzzle() {
        return puzzle;
    }

    public void setPuzzle(int[][] puzzle) {
        this.puzzle = puzzle;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public List<Nodo> getHijos() {
        return hijos;
    }

    public void setHijos(List<Nodo> hijos) {
        this.hijos = hijos;
    }
}
