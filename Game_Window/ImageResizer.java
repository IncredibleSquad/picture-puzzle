/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game_Window;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class ImageResizer {
	public  static BufferedImage resizeImage(BufferedImage image, int width, int height) {
       int type = 0;
       type = image.getType() == 0? BufferedImage.TYPE_INT_ARGB : image.getType();
       BufferedImage resizedImage = new BufferedImage(width, height,type);
       Graphics2D g = resizedImage.createGraphics();
       g.drawImage(image, 0, 0, width, height, null);
       g.dispose();
       return resizedImage;
    }
}

