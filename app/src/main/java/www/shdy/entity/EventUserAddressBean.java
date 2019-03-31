package www.shdy.entity;

/**
 * Created by Administrator on 2018/12/25 0025
 * <p>
 * Describe:
 */
public class EventUserAddressBean {


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public EventUserAddressBean(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    private String name;
    private String address;
    private String phone;
}
