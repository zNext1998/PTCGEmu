package model;

public enum CardTypeEnum{

    UNKNOWN("unknown",0),
    POKEMON("pokemon",1),
    ENERGY("energy",2),
    TRAINER("trainer",3);

    private String name;
    private int value;

    CardTypeEnum(String name, int value) {
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
