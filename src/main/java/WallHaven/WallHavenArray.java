package WallHaven;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WallHavenArray {
    public List<Data> data;
    public Meta meta;

    public WallHavenArray(List<Data> data, Meta meta) {
        this.data = data;
        this.meta = meta;
    }


    public WallHavenArray() {

    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Set<String> getAllImages() {
        Set<String> urlImageLinks = new HashSet<>();
        for(int i = 0; i < data.size(); i++) {
            urlImageLinks.add(data.get(i).getPath());
        }
        return urlImageLinks;
    }

    @Override
    public String toString() {
        return data.get(0).getPath();
    }
}