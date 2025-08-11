class Solution {
    public double angleClock(int hour, int minutes) {
        // in 1 hour how many angle made by hourhand= 360/12 totalAngle/totalHours=>30
        // when hour hand move by one minute then how many angle = 30/60=0.5 
        // minute angle in 1 hour kitna angle banata hoga = same place pe aa jayega na phir se=0 degree
        // minute angle if move karta hoga by 1 minute then=> 360/60=2; // 6*minutes
        double hour_angle=(hour*30)+(0.5*minutes);
        double minut_angle=(minutes*6);
        double angle=Math.abs(hour_angle-minut_angle);
        if(angle<=180.0){
            return angle;
        }
        return 360.0-angle;
    }
}
