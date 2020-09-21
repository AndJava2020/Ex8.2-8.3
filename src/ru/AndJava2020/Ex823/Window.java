package ru.AndJava2020.Ex823;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Window extends JFrame {

    Image image;
    String cmd;

    Window(String cmd){
        super("Ex8.2");
        this.cmd=cmd;
        try {
            image = ImageIO.read(new File(cmd));
        } catch (IOException e) {
            e.printStackTrace();
        }
        setBounds(0,0,image.getHeight(null),image.getWidth(null));

        Container container = getContentPane();
        container.setLayout(new GridLayout());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void selectPicture(String cmdArg){
        try {
            image = ImageIO.read(new File(cmdArg));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void paint(Graphics g) {

        if(image!=null) {
            g.drawImage(image, 0, 0, null);
        }
    }
}