import edu.princeton.cs.introcs.StdDraw;
public class Enemy {
    private double xPosition;
    private double yPosition;
    private final double rate =0.02;
    private final double upRate = 0.1;
    private boolean up;
    private static String monster = "C:\\Users\\anjau\\IdeaProjects\\RunnerGame\\src\\GameEnemy2.jpg";


    public void  drawMonster(){
        StdDraw.picture(getxPosition(), getyPosition(), getMonsterFile());
    }
    public static String getMonsterFile() {
        int x =((int) Math.random() * 10);
        if(x <= 5){
            return monster;
        }else{
            return monster;
        }

    }

    public Enemy(double x, double y){

        xPosition = x;
        yPosition =  y;

    }
    public void moveUp() {
        int z = ((int) Math.random() * 30);
        // counter
        if (z <= 15) {
            if (yPosition < 1) {
                //yPosition += 0.01;
                xPosition -= 0.01;
            } else if (yPosition >= 0) {
                //yPosition -=  1 ;
                xPosition -= 0.01;


            }
            /*} else if (yPosition == 0) {
                yPosition += 0.01;
               // xPosition -= 0.01;
            }*/

                drawMonster();
                //yPosition += 0.01;
                // xPosition -= 0.01;
        /*}else{
            xPosition += 0.01;
        }*/

       /* if(yPosition >= 1){
                yPosition -= 0.02;
        }else if(yPosition <= -1) {
                yPosition += 0.01;
        }else if(yPosition == 0){
            yPosition += 0.01;
        }
        drawMonster();*/


            }
        }


    public double getxPosition(){
        return xPosition;
    }

    public double getyPosition(){
        return yPosition;
    }

    /*public void moveRight(){

    }*/
}
