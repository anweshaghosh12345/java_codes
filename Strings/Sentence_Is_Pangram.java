package Strings;

public class Sentence_Is_Pangram {
    public boolean checkIfPangram(String sentence) {
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            if(sentence.indexOf(ch)==-1)
                return false;
        }
        return true;
    }
}
