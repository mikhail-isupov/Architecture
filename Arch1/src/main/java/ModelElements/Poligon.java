package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class Poligon {
    public List<Point3D> points;

    public Poligon() {
        this.points = new ArrayList<>();
    }

    public List<Point3D> getPoints() {
        return points;
    }

    public void addPoint(Point3D point) {
        this.points.add(point);
    }
}
