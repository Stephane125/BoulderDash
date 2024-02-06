package fr.exia.boulderdash.controller;

import fr.exia.boulderdash.contract.IOrderPerformer;
import fr.exia.boulderdash.contract.UserOrder;
import fr.exia.boulderdash.contract.intcontroller.IController;
import fr.exia.boulderdash.contract.intmodel.IModel;
import fr.exia.boulderdash.contract.intview.IView;
import fr.exia.boulderdash.view.View;

/**
 * <h1>The Class Controller.</h1>
 *
 * @author Stephane
 * @version 0.1
 * @see IOrderPerformer
 */

public class Controller implements IController, IOrderPerformer {

    /**
     * The Constant speed.
     */
    private static final int speed = 50;

    /**
     * The view.
     */
    private IView view;

    /**
     * The model.
     */
    private IModel model;

    /**
     * The stack order.
     */
    private UserOrder stackOrder;


    /**
     * Instantiates a new controller.
     *
     * @param view  the view
     * @param model the model
     */
    public Controller(final View view, final IModel model) {
        this.setView(view);
        this.setModel(model);
        this.clearStackOrder();
    }

    /**
     *
     *
     * @throws InterruptedException
     */
    /*
     * (non-Javadoc)
     * @see fr.exia.boulderdash.contract.intcontroller.IController#play()
     */
    @Override
    public final void play() throws InterruptedException {
        while (this.getModel().getMyPlayer().isAlive() && this.getModel().getMyPlayer().hasWon()) {
            Thread.sleep(speed);
          //  boulderfall();
            switch (this.getStackOrder()) {
                case RIGHT:
                    this.getModel().getMyPlayer().moveRight();
                    break;
                case LEFT:
                    this.getModel().getMyPlayer().moveLeft();
                    break;
                case DOWN:
                    this.getModel().getMyPlayer().moveDown();
                    break;
                case UP:
                    this.getModel().getMyPlayer().moveUp();
                    break;
                case NOP:
                default:
                    this.getModel().getMyPlayer().doNothing();
                    break;
            }
            this.clearStackOrder();
            this.getView().followMyPlayer();
        }
        if (this.getModel().getMyPlayer().isAlive() == false) {
            this.getView().displayMessage("Game Over");
        }
        if (this.getModel().getMyPlayer().hasWon() == false) {
            this.getView().displayMessage("Well done, you win !");
        }

    }

   
    /*
     * (non-Javadoc)
     * @see fr.exia.boulderdash.contract.intcontroller.IController#orderPerform(fr.exia.
     * boulderdash.controller.UserOrder)
     */
    @Override
    public final void orderPerform(final UserOrder userOrder) {
        this.setStackOrder(userOrder);
    }

    /**
     * Gets the view.
     *
     * @return the view
     */
    private IView getView() {
        return this.view;
    }

    /**
     * Sets the view.
     *
     * @param view the view to set
     */
    private void setView(final IView view) {
        this.view = view;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    private IModel getModel() {
        return this.model;
    }

    /**
     * Sets the model.
     *
     * @param model the model to set
     */
    private void setModel(final IModel model) {
        this.model = model;
    }

    /**
     * Gets the stack order.
     *
     * @return the stack order
     */
    private UserOrder getStackOrder() {
        return this.stackOrder;
    }

    /**
     * Sets the stack order.
     *
     * @param stackOrder the new stack order
     */
    private void setStackOrder(final UserOrder stackOrder) {
        this.stackOrder = stackOrder;
    }

    /**
     * Clear stack order.
     */
    private void clearStackOrder() {
        this.stackOrder = UserOrder.NOP;
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.boulderdash.contract.intcontroller.IController#getOrderPeformer()
     */
    @Override
    public IOrderPerformer getOrderPerformer() {
        return this ;
    }
}
