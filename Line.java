public class Line {
    private Point x1, x2;


    public Line (Point x1, Point x2) {
        this.x1=x1;
        this.x2=x2;
    }



    public String toString(){
        return "Линия от " + x1 + " до " + x2;

    }


}
