package WallHaven;

public class Meta{
    public int current_page;
    public int last_page;
    public int per_page;
    public int total;
    public String query;
    public Object seed;

    public Meta(int current_page, int last_page, int per_page, int total, String query, Object seed) {
        this.current_page = current_page;
        this.last_page = last_page;
        this.per_page = per_page;
        this.total = total;
        this.query = query;
        this.seed = seed;
    }

    public Meta() {

    }

    public int getCurrent_page() {
        return current_page;
    }

    public void setCurrent_page(int current_page) {
        this.current_page = current_page;
    }

    public int getLast_page() {
        return last_page;
    }

    public void setLast_page(int last_page) {
        this.last_page = last_page;
    }

    public int getPer_page() {
        return per_page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Object getSeed() {
        return seed;
    }

    public void setSeed(Object seed) {
        this.seed = seed;
    }
}