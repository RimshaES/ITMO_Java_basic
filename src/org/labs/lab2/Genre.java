package org.labs.lab2;

public enum Genre {
    DETECTIVE("Детектив"),
    SCIENTIFIC_LITERATURE("Научная литература"),
    KIDS_LITERATURE("Детская литература"),
    PSYCHOLOGICAL_LITERATURE("Психология"),
    OTHER("Разное");

    private final String description;

    Genre(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
