import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;

public class Encryption {

    public static void mask(String source) throws IOException{

        myBufferedImage img = new myBufferedImage(ImageIO.read(new File(source)));

        int originalHeight = img.getHeight();
        int originalWidth = img.getWidth();

        myBufferedImage imgOne = new myBufferedImage(new BufferedImage(originalWidth * 4, originalHeight * 4,
                                                        BufferedImage.TYPE_INT_RGB));
        myBufferedImage imgTwo = new myBufferedImage(new BufferedImage(originalWidth * 4, originalHeight * 4,
                                                        BufferedImage.TYPE_INT_RGB));

        for (int row = 0; row < originalHeight; row++) {
            for (int column = 0; column < originalWidth; column++) {

                SecureRandom random = new SecureRandom();
                int randomInt = random.nextInt(6);

                // put correct transformation of a pixel from source file to first and second image
                imgOne.transformPixel(row, column, img.getRGB(row, column), false, randomInt);
                imgTwo.transformPixel(row, column, img.getRGB(row, column), true, randomInt);

            }
        }

        String name1 = source;
        String name2 = source;
        String format;

        if(source.contains(".jpg")){

            name1 = source.substring(0, source.length()-4);
            name2 = source.substring(0, source.length()-4);

            name1+="1.jpg";
            name2+="2.jpg";
            format = "jpg";

        } else if(source.contains(".png")){

            name1 = source.substring(0, source.length()-4);
            name2 = source.substring(0, source.length()-4);

            name1+="1.png";
            name2+="2.png";
            format = "png";


        } else if(source.contains(".gif")){

            name1 = source.substring(0, source.length()-4);
            name2 = source.substring(0, source.length()-4);

            name1+="1.gif";
            name2+="2.gif";
            format = "gif";

        } else {

            name1+="1";
            name2+="2";
            format = "jpg";
        }

        ImageIO.write(imgOne.getBufferedImage(), format, new File(name1));
        ImageIO.write(imgTwo.getBufferedImage(), format, new File(name2));
    }
}
