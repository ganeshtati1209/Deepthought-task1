package dev.dt.pickspot.model;

public record Slot(
    int x,
    int y,
    String sizeCap,       // "small" or "big"
    boolean hasColdUnit,
    boolean occupied
) {}
