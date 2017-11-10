import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdIn;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static edu.princeton.cs.introcs.StdDraw.*;

public class RunnerGame {
    private static boolean spaceBarPressed = false;
    public static boolean leftButtonPressed = false;
    public static boolean rightButtonPressed = false;
    private static boolean spawnEnemy = false;
    private static int canvasWidth = 1400;
    private static int canvasHeight = 800;



    public static void main(String[] args) {
        StdDraw.setCanvasSize(canvasWidth, canvasHeight);
        StdDraw.setXscale(0, 1.0);
        StdDraw.setYscale(0, 1.0);
        eagle bWCEagle = new eagle(0.5, 0.5, true);
        Enemy bWCMonster = new Enemy(0.9, 0.5);
        Enemy bWCMonster1 = new Enemy(0.9, 0.75);
        Enemy bWCMonster2 = new Enemy(0.9, 0.25);

        FinishLine bWCFinish = new FinishLine(0.8, 0.5);
        Font font = new Font("Arial", Font.BOLD, 70);
        StdDraw.setFont(font);
        StdDraw.text(0.5, 0.5, "Bridgewater Eagle Run");
        Font smallFont = new Font("Arial", Font.PLAIN, 40);
        StdDraw.setFont(smallFont);
        StdDraw.text(0.5, 0.3, "Press Space to start");
        boolean victory = false;
        boolean monster = false;

        while (true) {
            int x = (int)(Math.random() * 30);
            if (getSpaceBarPress()) {
                while (!victory && !monster ) {
                    bWCFinish.drawFinishline();
                    if(getLeftButtonPress()){
                        bWCEagle.moveLeft();
                    }else if(getRightButtonPress()){
                        bWCEagle.moveRight();
                    }

                    if (getSpaceBarPress()) {
                        bWCEagle.moveUp();

                    } else {
                        bWCEagle.moveDown();
                    }
                    if(getspawnEnemy()) {
                        bWCMonster.moveUp();

                    }
                    if(x >= 1 && x <= 10){
                        bWCMonster1.moveUp();
                    }
                    if(x >= 11){
                        bWCMonster2.moveUp();
                    }
                    if(x >= 21 && x <= 30){
                        bWCMonster.moveUp();
                    }
                    if( bWCMonster.getxPosition()-0.1 < bWCEagle.getxPosition() && bWCEagle.getxPosition() < bWCMonster.getxPosition() + 0.1 &&
                    bWCMonster.getyPosition()-0.1 < bWCEagle.getyPosition() && bWCEagle.getyPosition() < bWCMonster.getyPosition() + 0.1){

                        monster = true;
                    }
                    if(bWCEagle.getxPosition() >= 0.9){

                        victory = true;
                    }

                    pause(30);
                    StdDraw.clear(StdDraw.WHITE);
                }
                if(victory) {
                    StdDraw.text(0.5, 0.75, "You've passed the Finish line! Congrats!");
                    StdDraw.text(0.5, 0.3, "Hit Space Bar to Start again!");
                    bWCEagle = new eagle(0.5, 0.5, true);
                    bWCMonster = new Enemy(0.75, 0.5);
                    bWCMonster1 = new Enemy(0.9, 0.75);
                    bWCMonster2 = new Enemy(0.9, 0.25);
                    victory = false;

                }

                if(monster) {
                    StdDraw.text(0.5, 0.75, "You've Hit the boss! Game Over!");
                    StdDraw.text(0.5, 0.3, "Hit Space Bar to Start again!");
                    bWCEagle = new eagle(0.5, 0.5, true);
                    bWCMonster = new Enemy(0.75, 0.5);
                    bWCMonster1 = new Enemy(0.9, 0.75);
                    bWCMonster2 = new Enemy(0.9, 0.25);
                    monster = false;
                }
            }


        }

        }





    /**
     * These methods fired when a key is pressed don't worry about them for now.
     */

    public static boolean getspawnEnemy(){
        int x = ((int) Math.random() * 30);
        if(x <= 15){
            RunnerGame.spawnEnemy = false;
            return true;
        }
        return false;
    }
    public static boolean getSpaceBarPress(){
        if(RunnerGame.spaceBarPressed  || StdDraw.isKeyPressed(KeyEvent.VK_SPACE)){
            RunnerGame.spaceBarPressed  = false;

            return true;
        }
        return false;

    }

    public static boolean getLeftButtonPress(){
        if(RunnerGame.leftButtonPressed || StdDraw.isKeyPressed(KeyEvent.VK_LEFT)){
            RunnerGame.leftButtonPressed = false;
            return true;
        }
        return false;
    }
        public static boolean getRightButtonPress(){
        if(RunnerGame.rightButtonPressed  || StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)){
            RunnerGame.rightButtonPressed = false;
            return true;
        }
        return false;
    }

}