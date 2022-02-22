package WallHaven;

public class Uploader{
    public String username;
    public String group;
    public Avatar avatar;

    public Uploader(String username, String group, Avatar avatar) {
        this.username = username;
        this.group = group;
        this.avatar = avatar;
    }

    public Uploader() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Avatar getAvatar() {
        return avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }
}