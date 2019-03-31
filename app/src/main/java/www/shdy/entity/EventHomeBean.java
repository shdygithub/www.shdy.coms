package www.shdy.entity;

/**
 * Created by Administrator on 2019/1/19 0019
 * <p>
 * Describe:
 */
public class EventHomeBean {
    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public EventHomeBean(String images, String url) {
        this.images = images;
        Url = url;
    }

    private String images;

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    private String Url;
}
