package Stack_and_Queue;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    Node head=new Node(0,0);
    Node tail=new Node(0,0);

    Map<Integer, Node> hashMap=new HashMap<Integer, Node>();

    int capacity;

    public LRUCache(int _capacity) {
        capacity=_capacity;
        head.nxt=tail;
        tail.prev=head;
    }

    public int get(int key) {
        if(hashMap.containsKey(key)){
            Node node=hashMap.get(key);
            remove(node);
            insert(node);
            return node.value;
        }else
            return -1;
    }

    public void put(int key, int value) {
        if(hashMap.containsKey(key)){
            remove(hashMap.get(key));
        }
        if(hashMap.size()==capacity){
            remove(tail.prev);
        }
        insert(new Node(key,value));
    }
    private void remove(Node node){
        hashMap.remove(node.key);
        node.prev.nxt=node.nxt;
        node.nxt.prev=node.prev;
    }

    private  void insert(Node node){
        hashMap.put(node.key,node);
        Node headnext=head.nxt;
        head.nxt=node;
        node.prev=head;
        headnext.prev=node;
        node.nxt=headnext;
    }
    class Node{
        Node prev;
        Node nxt;
        int key,value;
        Node(int _key, int _value ){
            key=_key;
            value=_value;
        }
    }
}
