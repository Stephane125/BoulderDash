package fr.exia.boulderdash.main;
import javax.swing.*;

import fr.exia.boulderdash.controller.Controller;
import fr.exia.boulderdash.model.Model;
import fr.exia.boulderdash.view.View;

import java.io.IOException;

public class GameFrame extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = -3876717885971887466L;
	private static final int startX = 2;
    private static final int startY = 2;

    public GameFrame() {
        try {
            final Model model = new Model(startX, startY);
            final View view = new View(model.getMap(), model.getMyPlayer());
            final Controller controller = new Controller(view, model);
            view.setOrderPerformer(controller.getOrderPerformer());
            controller.play();

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(700, 600);
            setLocationRelativeTo(null);
            setTitle("BoulderDash");

            setVisible(true);

        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
