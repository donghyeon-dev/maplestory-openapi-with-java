package com.autocat.maplestory.openapi.nexon.dto.enums;

public enum CharacterSkillGrade {
    ZERO("0"),
    ONE("1"),
    ONE_POINT_FIVE("1.5"),
    TWO("2"),
    TWO_POINT_FIVE("2.5"),
    THREE("3"),
    FOUR("4"),
    HYPERPASSIVE("hyperpassive"),
    HYPERACTIVE("hyperactive"),
    FIVE("5"),
    SIX("6");

    private String grade;

    CharacterSkillGrade(String grade) {
        this.grade = grade;
    }

    public static CharacterSkillGrade fromString(String grade) {
        for (CharacterSkillGrade skillGrade : CharacterSkillGrade.values()) {
            if (skillGrade.grade.equalsIgnoreCase(grade)) {
                return skillGrade;
            }
        }
        throw new IllegalArgumentException("Unknown enum type " + grade + ", Allowed values are 0, 1, 1.5, 2, 2.5, 3, 4, hyperpassive, hyperactive, 5, 6");
    }

    public String getGrade() {
        return this.grade;
    }
}
