package shouse.core.node;

import shouse.core.node.management.NodeCommands;

/**
 * Created by maks on 20.12.17.
 * Object, which describes data from server to node.
 */
public class NodeRequest {

    private NodeCommands action;

    public NodeRequest(NodeCommands action) {
        this.action = action;
    }

    public NodeCommands getAction() {
        return action;
    }

    public void setAction(NodeCommands action) {
        this.action = action;
    }
}
