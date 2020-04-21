import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Decryption {

    public static void unmask(String name1, String name2) throws IOException{

        BufferedImage imgOne = ImageIO.read(new File(name1));
        BufferedImage imgTwo = ImageIO.read(new File(name2));

        int height = imgOne.getHeight();
        int width = imgOne.getWidth();

        BufferedImage restoredImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        for (int row = 0; row < height; row++) {
            for (int column = 0; column < width; column++) {

                // Logical OR on pixels
                if(!(imgOne.getRGB(row, column) == Color.WHITE.getRGB() && imgTwo.getRGB(row, column) == Color.WHITE.getRGB())){

                    restoredImg.setRGB(row, column, Color.BLACK.getRGB());

                } else {

                    restoredImg.setRGB(row, column, Color.WHITE.getRGB());

                }

            }
        }


        String name = name1;
        String format;

        if(name1.contains(".jpg")){

            name = name1.substring(0, name1.length()-(4+1));

            name+="Restored.jpg";
            format = "jpg";

        } else if(name1.contains(".png")){

            name = name1.substring(0, name1.length()-(4+1));

            name+="Restored.png";
            format = "png";

        } else if(name1.contains(".gif")){

            name = name1.substring(0, name1.length()-(4+1));

            name+="Restored.gif";
            format = "gif";


        } else {

            name+="Restored";
            format = "jpg";
        }

        ImageIO.write(restoredImg, format, new File(name));
    }
}