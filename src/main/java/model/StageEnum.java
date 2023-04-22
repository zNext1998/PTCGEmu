package model;

public enum StageEnum {
    BASIC("basic",0),
    STAGE_ONE("stage_1",1),
    STAGE_TWO("stage_2",2);

    private String name;
    private int value;

    StageEnum(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
