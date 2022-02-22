package WallHaven;

public class Thumbs{
    public String large;
    public String original;
    public String small;

    public Thumbs(String large, String original, String small) {
        this.large = large;
        this.original = original;
        this.small = small;
    }

    public Thumbs() {

    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }
}