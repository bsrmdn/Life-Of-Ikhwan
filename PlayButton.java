import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A button that the player clicks to start playing
 * 
 * @author Michael
 * @version 12/17/2014
 */
public class PlayButton extends Actor {
    private static GreenfootSound backgroundSound;

    /**
     * Act - do whatever the PlayButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        if (Greenfoot.mouseClicked(this))
            GameManager.getInstance().changeWorld(GameManager.WorldState.VILLAGE, 2400, 590, true);
        backgroundSound = new GreenfootSound("backsound.mp3");
        backgroundSound.setVolume(50); //

    }
}
