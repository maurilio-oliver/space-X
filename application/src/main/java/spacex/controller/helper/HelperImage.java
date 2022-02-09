package main.java.spacex.controller.helper;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.swing.ImageIcon;

public class HelperImage {

    /**
     * 
     * @param x    int @description: set horizontal image line
     * 
     * @param y    int @description: set vertical image line
     * @param path String @description: set image path
     * @return a new imagem Icon
     * @throws IOException
     */
    public static ImageIcon getImage(int x, int y, String path) throws IOException {
        BufferedImage image = ImageIO.read(new File(path));
        Image imageRedir = image.getScaledInstance(x, y, Image.SCALE_DEFAULT);
        return new ImageIcon(imageRedir);
    }

    
}
