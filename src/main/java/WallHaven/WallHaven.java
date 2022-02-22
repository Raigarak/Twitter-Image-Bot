package WallHaven;

public class WallHaven {
    public Data data;

    public WallHaven(Data data) {
        this.data = data;
    }


    public WallHaven() {

    }

    @Override
    public String toString() {
        return data.getPath();
    }
}
