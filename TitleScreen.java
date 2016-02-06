import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x600 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        this.addObject(new TextBox("Start Game", 24),300, 200);
        this.addObject(new TextBox("Credits",24),300,400);
        GreenfootImage background = new GreenfootImage("background.png");
        setBackground(background);
        
        // GIF IMAGE CODE
        // GifImage badTime = new GifImage(<gif>);
        // setImage(badTime.getCurrentImage())
    }
}
