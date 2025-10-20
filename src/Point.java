public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

   public double distance(){
       Point pointZero = new Point(0,0);
       return this.distance(pointZero);
   }

   public double distance(Point point2){
       return Math.sqrt( (this.x - point2.getX()) * (this.x - point2.getX()) + (this.y - point2.getY()) * (this.y - point2.getY()));

   }

   public double distance(int x, int y){
       Point pointNew = new Point(x,y);
       return this.distance(pointNew);

   }
}