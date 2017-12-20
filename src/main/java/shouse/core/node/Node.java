package shouse.core.node;

/**
 * Created by maks on 20.12.17.
 */
public interface Node {

    void process(NodeRequest request);

    NodeResponse getState();

}
