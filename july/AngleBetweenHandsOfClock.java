class Solution {
    public double angleClock(int hour, int minutes) {
        double minOnClk = minutes / 5.0;
        double hourOnClk = hour + (minutes / 60.0);
        double diffOnClk = Math.abs(hourOnClk-minOnClk);
        return diffOnClk * (360.0 / 12.0) <= 180 ? diffOnClk * (360.0 / 12.0) : 360.0 - (diffOnClk * (360.0 / 12.0));
    }
}
