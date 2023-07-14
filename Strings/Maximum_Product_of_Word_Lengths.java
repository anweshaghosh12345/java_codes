package Strings;

public class Maximum_Product_of_Word_Lengths {
    public int maxProduct(String[] words) {
        int[] state=new int[words.length];
        for (int i = 0; i < words.length; i++) {
            state[i]=getStateFromString(words[i]);
        }
        int max=0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length ; j++) {
                if((state[i]& state[j])==0)
                    max=Math.max(max,words[i].length()*words[j].length());
            }
        }
        return max;
    }
    private  int getStateFromString(String s){
        int state=0;
        for (char c:s.toCharArray()){
            int indx = c-'a';
            state |=1<<(indx);
        }
        return state;
    }
}
