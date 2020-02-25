package metier;

import java.util.Objects;

public class Combinaison {
    private Point a;
    private Point b;

    public Combinaison(Point a, Point b){
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Combinaison that = (Combinaison) o;
        return Objects.equals(a, that.a) &&
                Objects.equals(b, that.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    public boolean contains(Point p){
        return a.equals(p) || b.equals(p);
    }


}
