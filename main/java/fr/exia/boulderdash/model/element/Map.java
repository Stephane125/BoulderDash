package fr.exia.boulderdash.model.element;

import java.io.*;
import java.util.Observable;


import fr.exia.boulderdash.contract.IElement;
import fr.exia.boulderdash.contract.IMap;

/**
 * <h1>The Map Class.</h1>
 *
 * @author Stephane
 * @version 0.1
 */

public class Map extends Observable implements IMap {

    /**
     * The width.
     */
    private int width;

    /**
     * The height.
     */
    private int height;

    /**
     * The objective.
     */
    private int objective;

    /**
     * The on the map.
     */
    private IElement[][] onTheMap;

    /**
     * Instantiates a new map with the content of the file fileName.
     *
     * @param fileName the file name where the map is
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public Map(final String fileName, final int mapHeight, final int mapWidth, final int mapObjective) throws IOException {
        super();
        this.loadFile(fileName, mapHeight, mapWidth, mapObjective);
    }

    public Map() {
        super();
    }


    /**
     * Loads file.
     *
     * @param fileName the file name
     * @throws IOException Signals that an I/O exception has occurred.
     */
    private void loadFile(final String fileName, final int mapHeight, final int mapWidth, final int mapObjective) throws IOException {

        String name = "src\\main\\resources\\map.txt";
        PrintWriter outFile = new PrintWriter(new FileWriter(name));
        for (int i = 0; i < fileName.length(); i++) {
            outFile.write(fileName.charAt(i));
        }
        outFile.close();

        final BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream("src\\main\\resources\\map.txt")));
        String line;
        int y = 0;
        this.setWidth(mapWidth);
        this.setHeight(mapHeight);
        this.setObjective(mapObjective);
        this.onTheMap = new IElement[this.getWidth()][this.getHeight()];
        line = buffer.readLine();
        while (line != null) {
            for (int x = 0; x < mapWidth; x++) {
                this.setOnTheMapXY(MotionlessElementsFactory.getFromFileSymbol(line.toCharArray()[x]), x, y);
            }
            line = buffer.readLine();
            y++;
        }
        buffer.close();
    }

    /**
     * Gets the Width
     *
     * @return width
     */
    /*
     * (non-Javadoc)
     * @see fr.exia.boulderdash.contract.IMap#getWidth()
     */
    @Override
    public final int getWidth() {
        return this.width;
    }

    /**
     * Sets the width.
     *
     * @param width the new width
     */
    private void setWidth(final int width) {
        this.width = width;
    }

    /**
     * Gets the height
     *
     * @return height
     */
    /*
     * (non-Javadoc)
     * @see fr.exia.boulderdash.contract.IMap#getHeight()
     */
    @Override
    public final int getHeight() {
        return this.height;
    }

    /**
     * Sets the height.
     *
     * @param height the new height
     */
    private void setHeight(final int height) {
        this.height = height;
    }

    @Override
    public final int getObjective() {
        return this.objective;
    }

    /**
     * Sets the objective.
     *
     * @param objective the new objective
     */
    private void setObjective(final int objective) {
        this.objective = objective;
    }

    /**
     * Gets on the MapXY
     *
     * @param x the x
     * @param y the y
     * @return onThemap [x][y]
     */
    /*
     * (non-Javadoc)
     * @see fr.exia.boulderdash.contract.IMap#getOnTheRoadXY(int, int)
     */
    @Override
    public final IElement getOnTheMapXY(final int x, final int y) {
        return this.onTheMap[x][y];
    }

    /**
     * Sets the on the map XY.
     *
     * @param element the element
     * @param x       the x
     * @param y       the y
     * @return element the element
     */
    public IElement setOnTheMapXY(final IElement element, final int x, final int y) {
        this.onTheMap[x][y] = null;
        this.onTheMap[x][y] = element;
        return element;
    }

    /**
     * Sets Mobile Has Changed
     */
    /*
     * (non-Javadoc)
     * @see fr.exia.boulderdash.contract.IMap#setMobileHasChanged()
     */
    @Override
    public final void setMobileHasChanged() {
        this.setChanged();
        this.notifyObservers();
    }

    /**
     * Gets Observable
     *
     * @return
     */
    /*
     * (non-Javadoc)
     * @see fr.exia.boulderdash.contract.IMap#getObservable()
     */
    @Override
    public Observable getObservable() {
        return this;
    }
}
