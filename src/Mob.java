package Project.src;

public final class Mob {
    private final int id;
    private final byte[] gameData;

    public Mob(int id, byte[] gameData) {
        this.id = id;
        this.gameData = gameData;
    }

    public int getId() {
        return id;
    }

    public int getX() {
        return gameData[0 + id] & 0xFF;
    }

    public void setX(int x) {
        gameData[0 + id] = (byte) x;
    }

    public int getY() {
        return gameData[101 + id] & 0xFF;
    }

    public void setY(int y) {
        gameData[101 + id] = (byte) y;
    }

    public int getHP() {
        return gameData[1919 + id] & 0xFF;
    }

    public void setHP(int hp) {
        gameData[1919 + id] = (byte) hp;
    }

    public boolean isAlive() {
        return (gameData[1414 + id] & 0xFF) >= 12;
    }

    public int getTargetX() {
        return gameData[9645 + id] & 0xFF;
    }

    public void setTargetX(int targetX) {
        gameData[9645 + id] = (byte) targetX;
    }

    public int getTargetY() {
        return gameData[9667 + id] & 0xFF;
    }

    public void setTargetY(int targetY) {
        gameData[9667 + id] = (byte) targetY;
    }
}
