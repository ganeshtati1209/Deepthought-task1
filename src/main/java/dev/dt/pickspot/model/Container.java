package dev.dt.pickspot.model;

public record Container(
    String id,
    String size,       // "small" or "big"
    boolean needsCold,
    int x,
    int y
) {}
