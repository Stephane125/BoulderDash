package fr.exia.boulderdash.contract;

import java.util.Observable;

/**
 * <h1>The Interface IMap.</h1>
 *
 * @author Stephane
 * @version 0.1
 */

public interface IMap {

    /**
     * Gets the width.
     *
     * @return the width
     */
    int getWidth();

    /**
     * Gets the height.
     *
     * @return the height
     */
    int getHeight();

    /**
     * Gets the objective.
     *
     * @return the objective
     */
    int getObjective();

    /**
     * Gets the XY on the map.
     *
     * @param x the x
     * @param y the y
     * @return the on the map XY
     */
    IElement getOnTheMapXY(int x, int y);

    /**
     * Sets the OnTheMapXY
     *
     * @param iElement the element to set.
     * @param x the x on which to set.
     * @param y the y on which to set.
     *
     */
    IElement setOnTheMapXY(IElement iElement, int x, int y);

    /**
     * Sets the mobile has changed.
     */
    void setMobileHasChanged();

    /**
     * Gets the observable.
     *
     * @return the observable
     */
    Observable getObservable();
    
    /**
     * Make the element fall.
     *
     * @param map The map on which the element falls.
     * @param x   The x-coordinate of the element.
     * @param y   The y-coordinate of the element.
     */

}
