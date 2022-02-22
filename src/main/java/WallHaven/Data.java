package WallHaven;

import java.util.ArrayList;

public class Data{
    public String id;
    public String url;
    public String short_url;
    public Uploader uploader;
    public int views;
    public int favorites;
    public String source;
    public String purity;
    public String category;
    public int dimension_x;
    public int dimension_y;
    public String resolution;
    public String ratio;
    public int file_size;
    public String file_type;
    public String created_at;
    public ArrayList<String> colors;
    public String path;
    public Thumbs thumbs;
    public ArrayList<Tag> tags;



    public Data(String id, String url, String short_url, Uploader uploader, int views, int favorites, String source, String purity, String category, int dimension_x, int dimension_y, String resolution, String ratio, int file_size, String file_type, String created_at, ArrayList<String> colors, String path, Thumbs thumbs, ArrayList<Tag> tags) {
        this.id = id;
        this.url = url;
        this.short_url = short_url;
        this.uploader = uploader;
        this.views = views;
        this.favorites = favorites;
        this.source = source;
        this.purity = purity;
        this.category = category;
        this.dimension_x = dimension_x;
        this.dimension_y = dimension_y;
        this.resolution = resolution;
        this.ratio = ratio;
        this.file_size = file_size;
        this.file_type = file_type;
        this.created_at = created_at;
        this.colors = colors;
        this.path = path;
        this.thumbs = thumbs;
        this.tags = tags;
    }

    public Data() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getShort_url() {
        return short_url;
    }

    public void setShort_url(String short_url) {
        this.short_url = short_url;
    }

    public Uploader getUploader() {
        return uploader;
    }

    public void setUploader(Uploader uploader) {
        this.uploader = uploader;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getFavorites() {
        return favorites;
    }

    public void setFavorites(int favorites) {
        this.favorites = favorites;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getPurity() {
        return purity;
    }

    public void setPurity(String purity) {
        this.purity = purity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getDimension_x() {
        return dimension_x;
    }

    public void setDimension_x(int dimension_x) {
        this.dimension_x = dimension_x;
    }

    public int getDimension_y() {
        return dimension_y;
    }

    public void setDimension_y(int dimension_y) {
        this.dimension_y = dimension_y;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getRatio() {
        return ratio;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio;
    }

    public int getFile_size() {
        return file_size;
    }

    public void setFile_size(int file_size) {
        this.file_size = file_size;
    }

    public String getFile_type() {
        return file_type;
    }

    public void setFile_type(String file_type) {
        this.file_type = file_type;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Thumbs getThumbs() {
        return thumbs;
    }

    public void setThumbs(Thumbs thumbs) {
        this.thumbs = thumbs;
    }

    public ArrayList<Tag> getTags() {
        return tags;
    }

    public void setTags(ArrayList<Tag> tags) {
        this.tags = tags;
    }


    @Override
    public String toString() {
        return "Data{" +
                "id='" + id + '\'' +
                ", url='" + url + '\'' +
                ", short_url='" + short_url + '\'' +
                ", uploader=" + uploader +
                ", views=" + views +
                ", favorites=" + favorites +
                ", source='" + source + '\'' +
                ", purity='" + purity + '\'' +
                ", category='" + category + '\'' +
                ", dimension_x=" + dimension_x +
                ", dimension_y=" + dimension_y +
                ", resolution='" + resolution + '\'' +
                ", ratio='" + ratio + '\'' +
                ", file_size=" + file_size +
                ", file_type='" + file_type + '\'' +
                ", created_at='" + created_at + '\'' +
                ", colors=" + colors +
                ", path='" + path + '\'' +
                ", thumbs=" + thumbs +
                ", tags=" + tags +
                '}';
    }
}