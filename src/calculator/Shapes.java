package calculator;
public abstract class Shapes {

    // attributes
    private int height;
    private int width;
    private int area;
    private boolean paintable;
    

    //constructor
    public Shapes(int vheight, int vwidth){
        this.height = vheight;
        this.width = vwidth;
        
    }

    //method
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return height * width;
    }

    public void setArea() {
        this.area = height * width;
    }

    public String toString(){
        return "the height is: " +this.height + " meters the width is: " + this.width + "  10 meters the total area is: " + getArea() + " m^2";
    }



}