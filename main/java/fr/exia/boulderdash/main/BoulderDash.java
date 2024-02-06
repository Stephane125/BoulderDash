package fr.exia.boulderdash.main;

import java.io.IOException;

import fr.exia.boulderdash.contract.intcontroller.IController;
import fr.exia.boulderdash.controller.Controller;
import fr.exia.boulderdash.contract.intmodel.IModel;
import fr.exia.boulderdash.model.Model;
import fr.exia.boulderdash.view.View;

/**
 * <h1>The BoulderDash Class.</h1>
 *
 * @author Stephane
 * @version 0.1
 */

public abstract class BoulderDash {

    /**
     * The Constant startX.
     */
    private static final int startX = 2;

    /**
     * The Constant startY.
     */
    private static final int startY = 2;


    /**
     * The main method.
     *
     * @param args the arguments
     * @throws IOException          Signals that an I/O exception has occurred.
     * @throws InterruptedException the interrupted exception
     */
    public static void main(final String[] args) throws IOException, InterruptedException {
        final IModel model = new Model(startX, startY);
        final View view = new View(model.getMap(), model.getMyPlayer());
        final IController controller = new Controller(view, model);
        view.setOrderPerformer(controller.getOrderPerformer());
        controller.play();
        
        
    }
}
