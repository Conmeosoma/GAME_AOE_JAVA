package Project.src;

public final class ResourceObject {
    private final int slotId;
    private final byte[] gameData;

    public ResourceObject(int slotId, byte[] gameData) {
        this.slotId = slotId;
        this.gameData = gameData;
    }

    public int getSlotId() {
        return slotId;
    }

    public int getType() {
        return gameData[9833 + slotId] & 0xFF;
    }

    public void setType(int type) {
        gameData[9833 + slotId] = (byte) type;
    }

    public int getStock() {
        return gameData[9883 + slotId] & 0xFF;
    }

    public void setStock(int stock) {
        gameData[9883 + slotId] = (byte) stock;
    }

    public int getX() {
        return gameData[9733 + slotId] & 0xFF;
    }

    public int getY() {
        return gameData[9783 + slotId] & 0xFF;
    }
}
