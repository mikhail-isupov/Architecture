package ModelElements;

public class Flash extends Camera {

    public Color color;
    public float power;

    public Flash(Point3D location, Angle3D angle, Color color, float power) {
        super(location, angle);
        this.color = color;
        this.power = power;
    }
}


