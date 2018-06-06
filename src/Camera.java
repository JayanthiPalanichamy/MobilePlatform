public class Camera {
    private double resolution;
    private boolean front;
    private boolean back;

    public Camera(double resolution, boolean front, boolean back) {
        this.resolution = resolution;
        this.front = front;
        this.back = back;
    }

    public double getResolution() {
        return resolution;
    }

    public boolean isBack() {
        return back;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "resolution=" + resolution +
                ", front=" + front +
                ", back=" + back +
                '}';
    }
}
