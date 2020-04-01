package mas.task07;

public class Prism {
    int baseArea;
    int height;
    int radius;

    public Prism(int baseArea, int height, int radius) {
        this.baseArea = baseArea;
        this.height = height;
        this.radius = radius;
    }

    public int getBaseArea() {
        return baseArea;
    }

    public void setBaseArea(int baseArea) {
        this.baseArea = baseArea;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Prism{" +
                "baseArea=" + baseArea +
                ", height=" + height +
                ", radius=" + radius +
                '}';
    }
}

