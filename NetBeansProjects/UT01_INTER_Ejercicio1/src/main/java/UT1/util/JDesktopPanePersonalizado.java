/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT1.util;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;

/**
 *
 * @author pedro.rinpiz
 */
public class JDesktopPanePersonalizado extends JDesktopPane
{
    private BufferedImage img;
    
    public JDesktopPanePersonalizado(String rutaImg)
    {
        try 
        {
            img = ImageIO.read(getClass().getResourceAsStream(rutaImg)); 
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, getWidth(), getHeight(),null);
    }
    
}
