import edu.princeton.cs.introcs.StdDraw;
public class FinishLine {
    private double xPosition;
    private double yPosition;
    private static String finishline = "C:\\Users\\anjau\\IdeaProjects\\RunnerGame\\src\\FinishLine.jpg";
    public void drawFinishline(){StdDraw.picture (getxPosition(), getyPosition() , getFinishLineFile()); }
    public static String getFinishLineFile(){
        return finishline;
    }
    public FinishLine(double x, double y){
        xPosition = x;
        yPosition =  y;

    }
    public double getxPosition() {
        return xPosition;
    }
    public double getyPosition() {
        return yPosition;
    }
}
