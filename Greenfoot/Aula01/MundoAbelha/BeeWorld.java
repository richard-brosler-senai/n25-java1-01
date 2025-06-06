import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Definição da Classe BeeWorld.
 * 
 * @author Richard Brosler 
 * @version 2025-06-04
 */
public class BeeWorld extends World
{

    /**
     * Constructor for objects of class BeeWorld.
     * 
     */
    public BeeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Aranha aranha = new Aranha();
        addObject(aranha,32,33);
        
        Abelha abelha = new Abelha();
        addObject(abelha,45,152);
        
        Mosca mosca = new Mosca();
        addObject(mosca,32,271);
        
        Mosca mosca2 = new Mosca();
        addObject(mosca2,32,334);
        
        Mosca mosca3 = new Mosca();
        addObject(mosca3,32,394);
        
        Mosca mosca4 = new Mosca();
        addObject(mosca4,32,452);
    }
}
