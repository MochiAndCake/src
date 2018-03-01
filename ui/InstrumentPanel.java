package ui;

import resources.Constants;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

/**
 * Created by freddeng on 2018-03-01.
 */
public class InstrumentPanel extends JPanel {

    public InstrumentPanel () {

        setBounds(0,0,370,625);
        setBackground(new Color(0,0,0,0));

    }

    public void paintComponent (Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g2d.setPaint(Constants.panel_bright);
        g2d.fill(new RoundRectangle2D.Double(20, 20, 350, 605, 25, 25));

    }

}
