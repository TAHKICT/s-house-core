package shouse.core.node;

/**
 * Created by maks on 20.12.17.
 */
public abstract class Node {
    private Long id;
    private String address;

    abstract void process(NodeRequest request);

    abstract NodeResponse getState();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
