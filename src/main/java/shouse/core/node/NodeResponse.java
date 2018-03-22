package shouse.core.node;

import shouse.core.node.management.NodeStates;

/**
 * Created by maks on 20.12.17.
 * Object, which describes data from node to server.
 */
public class NodeResponse {
    NodeStates nodeState;

    public NodeResponse(NodeStates nodeState) {
        this.nodeState = nodeState;
    }

    public NodeStates getNodeState() {
        return nodeState;
    }

    public void setNodeState(NodeStates nodeState) {
        this.nodeState = nodeState;
    }
}
