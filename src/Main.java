import metier.Point;
import metier.PyRat;
import outils.Labyrinthe;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main (String[] args) {
        PyRat pyrat = new PyRat();
        final Map<Point, List<Point>> laby = Labyrinthe.getLaby();
        final int labyWidth = Labyrinthe.getLabyWidth();
        final int labyHeight = Labyrinthe.getLabyHeight();
        Point position = Labyrinthe.getPosition();
        List<Point> fromages = Labyrinthe.getFromages();
        Set<Point> setFromages = new HashSet<>();

        pyrat.preprocessing(laby, labyWidth, labyHeight, position, fromages, setFromages);
        pyrat.turn(laby, labyWidth, labyHeight, position, fromages, setFromages);
    }
}