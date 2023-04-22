package model;

public enum ElementalTypeEnum {

    UNKNOWN("unknown",0),
    GRASS("草",1),
    FIRE("火",2),
    WATER("水",3),
    LIGHTNING("雷",4),
    PSYCHIC("超",5),
    FIGHTING("斗",6),
    DARKNESS("恶",7),
    METAL("钢",8),
    FAIRY("妖",9),
    DRAGON("龙",10),
    COLORLESS("无色",11);


    private String name;
    private int value;

    ElementalTypeEnum(String name, int value) {
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
