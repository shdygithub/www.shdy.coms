package www.shdy.entity;

/**
 * Created by Administrator on 2019/1/19 0019
 * <p>
 * Describe:
 */
public class EventPhoneWeixBean {

    public EventPhoneWeixBean(boolean on, boolean root) {
        this.on = on;
        this.root = root;
    }

    private boolean on;
  private boolean root;

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean isRoot() {
        return root;
    }

    public void setRoot(boolean root) {
        this.root = root;
    }
}
