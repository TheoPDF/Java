public class Point {
    //attributes
    private double x, y;
    //getters
    public double getX() { return x; }
    public double getY() { return y; }
    //constructor
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    //functions
    public void moveTo(double x, double y){
    	this.x = x;
    	this.y = y;
    }
    public void rMoveTo(double x, double y){
    	this.x += x;
    	this.y += y;
    }
    public double distance(Point P2){
    	double dx = Math.pow((P2.getX() - getX()), 2);
    	double dy = Math.pow((P2.getY() - getY()), 2);
        return Math.sqrt(dx * dy);
    }
}
