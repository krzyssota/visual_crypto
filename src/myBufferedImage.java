import java.awt.*;
import java.awt.image.BufferedImage;

public class myBufferedImage {

    private BufferedImage bufferedImage;

    public void transformPixel(int row, int column, int color, boolean secondFile, int randomInt){

        int blackRGB = Color.BLACK.getRGB();
        int whiteRGB = Color.WHITE.getRGB();

        switch (randomInt) {

            case 0:
                // 10
                // 01

                if (color == blackRGB && secondFile) {

                    bufferedImage.setRGB(row * 2, column * 2, whiteRGB);
                    bufferedImage.setRGB(row * 2 + 1, column * 2, blackRGB);

                    bufferedImage.setRGB(row * 2, column * 2 + 1, blackRGB);
                    bufferedImage.setRGB(row * 2 + 1, column * 2 + 1, whiteRGB);

                } else {

                    bufferedImage.setRGB(row * 2, column * 2, blackRGB);
                    bufferedImage.setRGB(row * 2 + 1, column * 2, whiteRGB);

                    bufferedImage.setRGB(row * 2, column * 2 + 1, whiteRGB);
                    bufferedImage.setRGB(row * 2 + 1, column * 2 + 1, blackRGB);

                }
                break;

            case 1:
                // 11
                // 00

                if (color == blackRGB && secondFile) {

                    bufferedImage.setRGB(row * 2, column * 2, whiteRGB);
                    bufferedImage.setRGB(row * 2 + 1, column * 2, blackRGB);

                    bufferedImage.setRGB(row * 2, column * 2 + 1, whiteRGB);
                    bufferedImage.setRGB(row * 2 + 1, column * 2 + 1, blackRGB);

                } else {

                    bufferedImage.setRGB(row * 2, column * 2, blackRGB);
                    bufferedImage.setRGB(row * 2 + 1, column * 2, whiteRGB);

                    bufferedImage.setRGB(row * 2, column * 2 + 1, blackRGB);
                    bufferedImage.setRGB(row * 2 + 1, column * 2 + 1, whiteRGB);

                }
                break;

            case 2:
                // 01
                // 01

                if (color == blackRGB && secondFile) {

                    bufferedImage.setRGB(row * 2, column * 2, blackRGB);
                    bufferedImage.setRGB(row * 2 + 1, column * 2, blackRGB);

                    bufferedImage.setRGB(row * 2, column * 2 + 1, whiteRGB);
                    bufferedImage.setRGB(row * 2 + 1, column * 2 + 1, whiteRGB);

                } else {

                    bufferedImage.setRGB(row * 2, column * 2, whiteRGB);
                    bufferedImage.setRGB(row * 2 + 1, column * 2, whiteRGB);

                    bufferedImage.setRGB(row * 2, column * 2 + 1, blackRGB);
                    bufferedImage.setRGB(row * 2 + 1, column * 2 + 1, blackRGB);

                }
                break;

            case 3:
                // 10
                // 10

                if (color == blackRGB && secondFile) {

                    bufferedImage.setRGB(row * 2, column * 2, whiteRGB);
                    bufferedImage.setRGB(row * 2 + 1, column * 2, whiteRGB);

                    bufferedImage.setRGB(row * 2, column * 2 + 1, blackRGB);
                    bufferedImage.setRGB(row * 2 + 1, column * 2 + 1, blackRGB);

                } else {

                    bufferedImage.setRGB(row * 2, column * 2, blackRGB);
                    bufferedImage.setRGB(row * 2 + 1, column * 2, blackRGB);

                    bufferedImage.setRGB(row * 2, column * 2 + 1, whiteRGB);
                    bufferedImage.setRGB(row * 2 + 1, column * 2 + 1, whiteRGB);

                }
                break;

            case 4:
                // 00
                // 11

                if (color == blackRGB && secondFile) {

                    bufferedImage.setRGB(row * 2, column * 2, blackRGB);
                    bufferedImage.setRGB(row * 2 + 1, column * 2, whiteRGB);

                    bufferedImage.setRGB(row * 2, column * 2 + 1, blackRGB);
                    bufferedImage.setRGB(row * 2 + 1, column * 2 + 1, whiteRGB);

                } else {

                    bufferedImage.setRGB(row * 2, column * 2, whiteRGB);
                    bufferedImage.setRGB(row * 2 + 1, column * 2, blackRGB);

                    bufferedImage.setRGB(row * 2, column * 2 + 1, whiteRGB);
                    bufferedImage.setRGB(row * 2 + 1, column * 2 + 1, blackRGB);

                }
                break;

            case 5:
                // 01
                // 10

                if (color == blackRGB && secondFile) {

                    bufferedImage.setRGB(row * 2, column * 2, blackRGB);
                    bufferedImage.setRGB(row * 2 + 1, column * 2, whiteRGB);

                    bufferedImage.setRGB(row * 2, column * 2 + 1, whiteRGB);
                    bufferedImage.setRGB(row * 2 + 1, column * 2 + 1, blackRGB);

                } else {

                    bufferedImage.setRGB(row * 2, column * 2, whiteRGB);
                    bufferedImage.setRGB(row * 2 + 1, column * 2, blackRGB);

                    bufferedImage.setRGB(row * 2, column * 2 + 1, blackRGB);
                    bufferedImage.setRGB(row * 2 + 1, column * 2 + 1, whiteRGB);

                }
                break;
        }
    }


    public BufferedImage getBufferedImage() {
        return bufferedImage;
    }
    public myBufferedImage(BufferedImage bufferedImage){
        this.bufferedImage = bufferedImage;
    }
    public int getHeight(){
        return bufferedImage.getHeight();
    }
    public int getWidth(){
        return bufferedImage.getWidth();
    }
    public int getRGB(int x, int y){
        return bufferedImage.getRGB(x, y);
    }

}
