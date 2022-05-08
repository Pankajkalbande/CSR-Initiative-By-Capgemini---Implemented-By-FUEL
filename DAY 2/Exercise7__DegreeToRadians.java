/* 
Exercise 7 
It is sometimes hard to think in terms of radians; we would rather use degrees. Remember (from those dark days of trigonometry class) that there are PI radians per 180 degrees. So to convert an angle given in degrees to radians do this:  
rad = degrees * Math.PI/180 
 
Math.PI gives you an accurate value of PI.  Edit the previous program so that it does the same things, but the angle is 30 degrees (which you will convert into radians.)  
*/



public class Exercise7__DegreeToRadians {
    public static void main(String[] args) {
        // double degrees = 30;
        // double rad = degrees * Math.PI / 180;

        // float degrees = 30;
        float degrees = 100;
        float rad = (float) (degrees * Math.PI / 180);

        System.out.println("The radians is: "+ rad);
    }
    
}
