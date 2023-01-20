package lab4;


import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

import java.awt.*;
import  java.awt.image.BufferedImage;



public class JImageDisplay extends JComponent {
    public final BufferedImage picture;
    //Конструктор Фрактала
    public JImageDisplay(int wight, int hight){
        picture = new BufferedImage(wight, hight, BufferedImage.TYPE_INT_RGB);
        Dimension dimension = new Dimension(wight, hight);
        super.setPreferredSize(dimension);
    }
    // Выводит на экран данные изображения
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(picture,0,0,picture.getWidth(), picture.getHeight(), null);

    }
    //устанавливает все пиксели изображения в черный цвет
    public void clearImage(){
        for(int i=0;i<picture.getWidth();i++){
            for(int j=0;j<picture.getHeight();i++){
                drawPixel(i, j, 0);
            }
        }
    }
    //устанавливает пиксель в определенный цвет
    public void drawPixel(int x,int y, int rgbCollor){
        picture.setRGB(x, y, rgbCollor);
    }
}
