package com.enjoycode.kotlinbbl;

import com.enjoycode.kotlinbbl.documentation.Demonstration;

@Demonstration(why = "When kotlin")
public enum DepartmentType {
    DAIRY, BAKERY, VEGETABLES, DRINKS;

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
