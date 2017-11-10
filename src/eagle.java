import edu.princeton.cs.introcs.StdDraw;
public class eagle {
    private double xPosition;
    private double yPosition;
    private double topPostion = 0.9;
    private double bottomPostion = 0.1;
    private final double upRate =0.02;
    private boolean up;
    private static String eagleUp = "C:\\Users\\anjau\\IdeaProjects\\RunnerGame\\src\\eagleUp.png";
    private static String eagleDown ="C:\\Users\\anjau\\IdeaProjects\\RunnerGame\\src\\eagleDown.png";

    public eagle(double x, double y, boolean upPosition){

        xPosition = x;
        yPosition =  y;
        up = upPosition;

    }

    public double getxPosition(){
        return xPosition;
    }

    public double getyPosition(){
        return yPosition;
    }

    public String getEagleFile(){
        if(up){
            up =!up;
            return eagleDown;
        }else{
            up = !up;
            return eagleUp;
        }
    }

    public void moveUp(){
        if(yPosition < 0.9 ){
            yPosition += 0.02;
        }
        drawEagle();

    }


    public void  drawEagle(){
        StdDraw.picture(getxPosition(), getyPosition(), getEagleFile());
    }

    public void moveDown(){
        if(yPosition > 0.1 ){
            yPosition -= 0.01;
        }
        drawEagle();
    }
    public void moveLeft(){
        if (xPosition > 0.1){
            xPosition -= 0.01;
        }
    }
    public void moveRight(){
        if (xPosition < 0.9){
            xPosition +=0.02;
        }
    }


}
