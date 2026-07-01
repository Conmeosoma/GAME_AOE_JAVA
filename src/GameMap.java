package Project.src;

public final class GameMap {
    private final byte[][] mapTiles;
    private final GameResources resources;

    public GameMap(GameResources resources) {
        this.resources = resources;
        this.mapTiles = resources.c_byteArr2;
    }

    public int getWidth() {
        return resources.c_short;
    }

    public int getHeight() {
        return resources.d_short;
    }

    public int getTileAt(int x, int y) {
        if (x < 0 || y < 0 || y >= mapTiles.length || x >= mapTiles[0].length) {
            return 0;
        }
        return mapTiles[y][x] & 0xFF;
    }

    public void setTileAt(int x, int y, int tileValue) {
        if (x >= 0 && y >= 0 && y < mapTiles.length && x < mapTiles[0].length) {
            mapTiles[y][x] = (byte) tileValue;
        }
    }

    public boolean isValidCoordinate(int x, int y) {
        return x >= 0 && x < getWidth() && y >= 0 && y < getHeight();
    }
}
