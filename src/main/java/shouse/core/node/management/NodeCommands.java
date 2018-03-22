package shouse.core.node.management;

import java.util.Arrays;

public enum NodeCommands {
    TURN_OFF(1000,"turn off"),
    TURN_ON(1001,"trun on");

    private long code;
    private String description;

    NodeCommands(int code, String description){
        this.code = code;
        this.description = description;
    }

    public NodeCommands getCommandByCode(Long code){
        return Arrays.stream(NodeCommands.values()).filter(command -> command.code == code).findFirst().get();
    }
}
