package fr.exia.boulderdash.entity;

/**
 * <h1>The DAOMap Class.</h1>
 *
 * @author Stephane
 * @version 0.1
 */

public class DAOMap {

    /**
     * The id.
     */
    private int id;

    /**
     * The key.
     */
    private String key;

    /**
     * The layout.
     */
    private String layout;

    /**
     * The mapHeight.
     */
    private int mapHeight;

    /**
     * The mapWidth.
     */
    private int mapWidth;

    /**
     * The mapObjective.
     */
    private int mapObjective;


    /**
     * Instantiates a new hello world.
     *
     * @param id        the id
     * @param key       the key
     * @param layout   the layout
     * @param mapHeight the mapHeight
     * @param mapWidth  the mapWidth
     * @param mapObjective  the mapObjective
     */
    public DAOMap(final int id, final String key, final String layout, final int mapHeight, final int mapWidth, final int mapObjective) {
        this.setId(id);
        this.setKey(key);
        this.setLayout(layout);
        this.setmapHeight(mapHeight);
        this.setmapWidth(mapWidth);
        this.setmapObjective(mapObjective);
    }

    /**
     * Instantiates a new DAOMap.
     */
    public DAOMap() {
        this(0, "", "", 0, 0,1);
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public int getId() {
        return this.id;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId(final int id) {
        this.id = id;
    }

    /**
     * Gets the key.
     *
     * @return the key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Sets the key.
     *
     * @param key the new key
     */
    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * Gets the layout.
     *
     * @return the layout
     */
    public String getLayout() {
        return this.layout;
    }

    /**
     * Sets the layout.
     *
     * @param layout the new layout
     */
    public void setLayout(final String layout) {
        this.layout = layout;
    }

    /**
     * Gets the mapHeight.
     *
     * @return the mapHeight
     */
    public int getmapHeight() {
        return this.mapHeight;
    }


    /**
     * Sets the mapHeight.
     *
     * @param mapHeight the new mapHeight
     */
    public void setmapHeight(final int mapHeight) {
        this.mapHeight = mapHeight;
    }


    /**
     * Gets the mapWidth.
     *
     * @return the mapWidth
     */
    public int getmapWidth() {
        return this.mapWidth;
    }

    /**
     * Sets the mapWidth.
     *
     * @param mapWidth the new mapWidth
     */
    public void setmapWidth(final int mapWidth) {
        this.mapWidth = mapWidth;
    }

    /**
     * Gets the mapObjective.
     *
     * @return the mapObjective
     */
    public int getmapObjective() {
        return this.mapObjective;
    }

    /**
     * Sets the mapObjective.
     *
     * @param mapObjective the new mapObjective
     */
    public void setmapObjective(final int mapObjective) {
        this.mapObjective = mapObjective;
    }

}