package WallHaven;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Avatar{
    @JsonProperty("200px")
    public String _200px;
    @JsonProperty("128px")
    public String _128px;
    @JsonProperty("32px")
    public String _32px;
    @JsonProperty("20px")
    public String _20px;

    public Avatar(String _200px, String _128px, String _32px, String _20px) {
        this._200px = _200px;
        this._128px = _128px;
        this._32px = _32px;
        this._20px = _20px;
    }

    public Avatar() {

    }

    public String get_200px() {
        return _200px;
    }

    public void set_200px(String _200px) {
        this._200px = _200px;
    }

    public String get_128px() {
        return _128px;
    }

    public void set_128px(String _128px) {
        this._128px = _128px;
    }

    public String get_32px() {
        return _32px;
    }

    public void set_32px(String _32px) {
        this._32px = _32px;
    }

    public String get_20px() {
        return _20px;
    }

    public void set_20px(String _20px) {
        this._20px = _20px;
    }

    @Override
    public String toString() {
        return "Avatar{" +
                "_200px='" + _200px + '\'' +
                ", _128px='" + _128px + '\'' +
                ", _32px='" + _32px + '\'' +
                ", _20px='" + _20px + '\'' +
                '}';
    }
}
