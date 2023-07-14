package Array;

public class Watering_Plants {
    public int wateringPlants(int[] plants, int capacity) {
        int sum =0;
        int temp=capacity;
        for (int i = 0; i < plants.length; i++) {
            if(plants[i]>temp){
                sum+=2*i;
                temp=capacity;
            }
            sum+=1;
            temp-=plants[i];
        }
        return sum;
    }
}
