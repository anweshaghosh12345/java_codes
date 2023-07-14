package Matrix;

public class Flipping_an_Image {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        for (int i = 0; i < n ; i++) {
            int strt=0;
            int end=n-1;
            while (strt<end){
                int temp=image[i][strt];
                image[i][strt]=image[i][end];
                image[i][end]=temp;
                end--;
                strt++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(image[i][j]==1){
                    image[i][j]=0;
                }
                else {
                    image[i][j]=1;
                }
            }
        }
        return image;
    }
}