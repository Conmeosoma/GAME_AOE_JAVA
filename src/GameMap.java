package Project.src;

public final class GameMap {
    private final byte[][] mapTiles;    // Ma trận gạch nền map (GameResources.c_byteArr2)
    private final GameResources resources;

    public GameMap(GameResources resources) {
        this.resources = resources;
        this.mapTiles = resources.c_byteArr2;
    }

    /**
     * Lấy chiều rộng bản đồ (số ô cột)
     */
    public int getWidth() {
        return resources.c_short;
    }

    /**
     * Lấy chiều cao bản đồ (số ô hàng)
     */
    public int getHeight() {
        return resources.d_short;
    }

    /**
     * Lấy loại ô gạch tại tọa độ (x, y)
     */
    public int getTileAt(int x, int y) {
        if (x < 0 || y < 0 || y >= mapTiles.length || x >= mapTiles[0].length) {
            return 0;
        }
        return mapTiles[y][x] & 0xFF;
    }

    /**
     * Đặt loại ô gạch tại tọa độ (x, y)
     */
    public void setTileAt(int x, int y, int tileValue) {
        if (x >= 0 && y >= 0 && y < mapTiles.length && x < mapTiles[0].length) {
            mapTiles[y][x] = (byte) tileValue;
        }
    }

    /**
     * Kiểm tra tọa độ có nằm trong bản đồ không
     */
    public boolean isValidCoordinate(int x, int y) {
        return x >= 0 && x < getWidth() && y >= 0 && y < getHeight();
    }
}
