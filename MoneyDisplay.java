import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MoneyDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoneyDisplay extends ScrollActor
{
        private MoneyManager moneyManager;
    
    public MoneyDisplay(MoneyManager moneyManager) {
        this.moneyManager = moneyManager;
        updateDisplay();
    }
    
    public void act() {
        updateDisplay();
        
    }
    
    public void updateDisplay() {
        GreenfootImage image = new GreenfootImage(150, 50);
        image.setColor(Color.WHITE);
        image.fillRect(0, 0, 150, 50);
        image.setColor(Color.BLACK);
        image.drawString("Saldo: Rp " + moneyManager.getBalance(), 10, 30);
        setImage(image);
        setLocation(300, 300 + 266);

    }
}
