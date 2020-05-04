package com.enjoycode.kotlinbbl;

@Demonstration(why = "When kotlin")
public enum DepartmentType {
    DAIRY, BAKERY, VEGETABLES, DRINKS;

    public static DepartmentType fromString(String string) {
        String upper = string.toUpperCase();
        switch (upper) {
            case "DAIRY":
                return DAIRY;
            case "BAKERY":
                return BAKERY;
            case "VEGETABLES":
                return VEGETABLES;
            case "DRINKS":
                return DRINKS;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static String vegan(DepartmentType departmentType) {
        switch (departmentType) {
            case DAIRY:
                return "Pas vegan";
            case BAKERY:
                return "vegan";
            case VEGETABLES:
                return "vegan";
            case DRINKS:
                return "vegan";
            default:
                throw new IllegalArgumentException();
        }
    }
}
