package mas.task06;

public class Prism {
    int baseEdges;
    int baseEdgeLength;
    int height;
    int radius;

    public Prism(int baseEdges, int baseEdgeLength, int height, int radius) {
        this.baseEdges = baseEdges;
        this.baseEdgeLength = baseEdgeLength;
        this.height = height;
        this.radius = radius;
    }

    public int getBaseEdges() {
        return baseEdges;
    }

    public void setBaseEdges(int baseEdges) {
        this.baseEdges = baseEdges;
    }

    public int getBaseEdgeLength() {
        return baseEdgeLength;
    }

    public void setBaseEdgeLength(int baseEdgeLength) {
        this.baseEdgeLength = baseEdgeLength;
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
                "baseEdges=" + baseEdges +
                ", baseEdgeLength=" + baseEdgeLength +
                ", height=" + height +
                ", radius=" + radius +
                '}';
    }
}
