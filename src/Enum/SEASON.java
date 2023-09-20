package Enum;

public enum SEASON {
    Winter(10,12),
    Spring(1,3),
    Summer(4,6),
    Fall(7,9);

    private int start;
    private int end;

    SEASON(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public String getDuration() {
        return this + " from " + this.start + " to " + this.end;
    }
}
