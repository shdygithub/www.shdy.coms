package www.shdy.entity;

/**
 * Created by Administrator on 2019/2/17 0017
 * <p>
 * Describe:
 */
public class WXPayOnSucceedBean {

    public boolean isOnsucceed() {
        return onsucceed;
    }

    public void setOnsucceed(boolean onsucceed) {
        this.onsucceed = onsucceed;
    }

    public WXPayOnSucceedBean(boolean onsucceed) {
        this.onsucceed = onsucceed;
    }

    private boolean onsucceed;
}
