package Project.src;

public final class GameHelper {
    private final byte[] gameData;
    private final GameResources resources;
    private final GameMap gameMap;
    private final Mob[] mobs;
    private final ResourceObject[] resourceObjects;

    public GameHelper(GameResources resources) {
        this.resources = resources;
        this.gameData = resources.e_byteArr;
        this.gameMap = new GameMap(resources);
        
        // Initialize 51 Mob slots (indices 1 to 50 are active)
        this.mobs = new Mob[51];
        for (int i = 1; i <= 50; i++) {
            this.mobs[i] = new Mob(i, this.gameData);
        }
        
        // Initialize 50 Resource Object slots (indices 0 to 49)
        this.resourceObjects = new ResourceObject[50];
        for (int i = 0; i < 50; i++) {
            this.resourceObjects[i] = new ResourceObject(i, this.gameData);
        }
    }

    /**
     * Lấy thực thể Mob theo chỉ số id (1 đến 50)
     */
    public Mob getMob(int mobId) {
        if (mobId < 1 || mobId > 50) return null;
        return mobs[mobId];
    }

    /**
     * Lấy thực thể Tài nguyên trên map theo chỉ số slot (0 đến 49)
     */
    public ResourceObject getResourceObject(int slotId) {
        if (slotId < 0 || slotId > 49) return null;
        return resourceObjects[slotId];
    }

    /**
     * Lấy bản đồ game điều khiển ô gạch
     */
    public GameMap getMap() {
        return gameMap;
    }
}
