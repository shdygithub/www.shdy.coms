package www.shdy.entity;

/**
 * Created by Administrator on 2019/1/9 0009
 * <p>
 * Describe:
 */
public class LiveUrlBean {


    public LiveUrlBean(String liveurl) {
        Liveurl = liveurl;
    }

    public String getLiveurl() {
        return Liveurl;
    }

    public void setLiveurl(String liveurl) {
        Liveurl = liveurl;
    }

    private String Liveurl;
}
