package Greedy_Algo;
import java.util.*;
class meeting{
    int start;
    int end;
    int pos;
    meeting(int start,int end,int pos ){
        this.start=start;
        this.end=end;
        this.pos=pos;
    }
}
class meetingCompator implements Comparator<meeting>{
        public int compare(meeting o1, meeting o2)
        {
            if(o1.end<o2.end){
                return -1;
            }
            else if(o1.end >o2.end)
                return 1;
            else if(o1.pos<o2.pos)
                return -1;
            return 1;
    }
}
public class Max_meeting {

    public static List<Integer> maximumMeetings(int[] start, int[] end) {
        //Write your code here
        List<Integer> ans=new ArrayList<>();
        ArrayList<meeting> meet=new ArrayList<>();
        for (int i = 0; i < start.length; i++) {
            meet.add(new meeting(start[i],end[i],i+1));
        }
        meetingCompator mc=new meetingCompator();
        Collections.sort(meet, mc);
        ans.add(meet.get(0).pos);
        int lim=meet.get(0).end;
        for (int i = 1; i < start.length ; i++) {
            if(meet.get(i).start>lim){
                lim=meet.get(i).end;
                ans.add(meet.get(i).pos);
            }
        }

        return  ans;
    }
}
