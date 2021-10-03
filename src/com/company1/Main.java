package com.company1;

import java.util.ArrayList;
import java.util.Iterator;

interface IOps{
    boolean exec(int a,int b);
}

//class Add implements  IOps{
//    @Override
//    public int exec(int a) {
//        return a+1;
//    }
//}
//class Sub implements IOps{
//    @Override
//    public int exec(int a) {
//        return a-1;
//    }
//}
class Gt implements IOps{
    @Override
    public boolean exec(int a, int b) {
        return a > b;
    }
}

class Util{
    private ArrayList<Integer> list;
    public Util(ArrayList<Integer> list){
        this.list=list;
    }
    public  Util filter(IOps iOps,int val){
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            int i = iterator.next();
            if (iOps.exec(val,i)){
                iterator.remove();
            }
        }
        return new Util(list);
    }
    public void dis(){
        System.out.println(this.list);
    }
}

public class Main {
    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Util res=new Util(list).filter(new Gt(),2).filter(new Gt(),3).filter(new Gt(),4);
        res.dis();
    }
}
