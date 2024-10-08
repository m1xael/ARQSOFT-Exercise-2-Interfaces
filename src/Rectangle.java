class Rectangle implements Comparable<Rectangle> {
    double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea() {
        double area = height * width;
        return area;
    }

    @Override
    public int compareTo(Rectangle other) {
        return Double.compare(this.calculateArea(), other.calculateArea());
    }
}
