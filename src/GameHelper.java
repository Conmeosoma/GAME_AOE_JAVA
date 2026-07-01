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

        this.mobs = new Mob[51];
        for (int i = 1; i <= 50; i++) {
            this.mobs[i] = new Mob(i, this.gameData);
        }

        this.resourceObjects = new ResourceObject[50];
        for (int i = 0; i < 50; i++) {
            this.resourceObjects[i] = new ResourceObject(i, this.gameData);
        }
    }

    public Mob getMob(int mobId) {
        if (mobId < 1 || mobId > 50) {
            return null;
        }
        return mobs[mobId];
    }

    public ResourceObject getResourceObject(int slotId) {
        if (slotId < 0 || slotId > 49) {
            return null;
        }
        return resourceObjects[slotId];
    }

    public GameMap getMap() {
        return gameMap;
    }
}
