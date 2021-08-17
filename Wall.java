import java.awt.Image;
import javax.swing.ImageIcon;

public class Wall extends Actor {
    private Image image;

    public Wall(int x, int y) {
        super(x, y);
        ImageIcon iia = new ImageIcon("wall.png");
        image = iia.getImage();
        this.setImage(image);
    }
}
