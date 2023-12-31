package BinarySearch;

public class Find_Smallest_Letter_Greater_than_Target {
    public char nextGreatestLetter(char[] letters, char target) {
        boolean[] seen =new boolean[26];
        for (char c: letters){
            seen[c-'a']=true;
        }
        while (true){
            target++;
            if(target > 'z')
                target='a';
            if(seen[target-'a'])
                return target;
        }
    }
}
