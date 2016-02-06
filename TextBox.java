import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class text_box here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextBox extends Actor
{
    /**
     * Act - do whatever the text_box wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public TextBox(String text, int fontSize) {
        GreenfootImage textImage = new GreenfootImage(text, fontSize, Color.white, Color.black);
        GreenfootImage image = new GreenfootImage(textImage.getWidth()+12, 36);
        image.setColor(Color.gray);
        image.fill();
        image.setColor(Color.darkGray);
        image.fillRect(3, 3, image.getWidth()-6, 30);
        image.drawImage(textImage, 6, 6);
        this.setImage(image);
    }
    
    
    public void act() 
    {
        
    }    
}
