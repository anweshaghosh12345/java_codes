package Array;

public class Two_Furthest_Houses {
    public int maxDistance(int[] colors) {
        int max=1;
        for (int i = 0; i < colors.length; i++) {
            if(colors[i] != colors[colors.length-1-i]){
                max= Math.max(max,colors.length-1-i);
                break;
            }
        }
        for (int i = colors.length-1; i >=1 ; i--) {
            if(colors[0] != colors[i]){
                max= Math.max(max,i);
                break;
            }
        }
        return max;
    }
}

/**
 * for (int i = 0; i < colors.length-1; i++) {
 *             for (int j = i+1; j < colors.length ; j++) {
 *                 if(colors[i]!=colors[j]){
 *                     max = Math.max(Math.abs(j-i),max);
 *                 }
 *             }
 *         }
 */