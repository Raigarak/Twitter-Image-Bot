package WallHaven;

public class Tag{
    public int id;
    public String name;
    public String alias;
    public int category_id;
    public String category;
    public String purity;
    public String created_at;

    public Tag(int id, String name, String alias, int category_id, String category, String purity, String created_at) {
        this.id = id;
        this.name = name;
        this.alias = alias;
        this.category_id = category_id;
        this.category = category;
        this.purity = purity;
        this.created_at = created_at;
    }

    public Tag() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPurity() {
        return purity;
    }

    public void setPurity(String purity) {
        this.purity = purity;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}