package shouse.core.node.management;

import java.util.Arrays;

public enum  NodeStates {
    SWITCHED_OFF (2000, "switched off"),
    WORKING (2001, "working"),
    AWAITING (2002, "awaiting");

    private int stateCode;
    private String description;

    NodeStates(int stateCode, String description){
        this.stateCode = stateCode;
        this.description = description;
    }

    public NodeStates getNodeStateByCode(int stateCode){
        return Arrays.stream(NodeStates.values()).filter(nodeState -> nodeState.stateCode == stateCode).findFirst().get();
    }
}
