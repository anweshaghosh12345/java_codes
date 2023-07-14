package Stack_and_Queue;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class LFUCache {

    LinkNode head=new LinkNode(0,0);
    LinkNode tail=new LinkNode(0,0);

    public LFUCache(int capacity) {

    }

    public int get(int key) {
return 0;
    }

    public void put(int key, int value) {

    }
    class  LinkNode{
        LinkNode prev;
        LinkNode next;
        int key,value;
        LinkNode(int _key,int _val){
            key=_key;
            value=_val;
        }
    }
}