package com.company;

import java.util.ArrayList;
import java.util.List;

interface IOps{
    int exec(int a);
}
class Add implements  IOps{
    @Override
    public int exec(int a) {
        return a+1;
    }
}
class Sub implements IOps{
    @Override
    public int exec(int a) {
        return a-1;
    }
}

class Util{
    private ArrayList<IOps> list;
    public Util(ArrayList<IOps> list){
        this.list=list;
    }
    public  int ops(int val){
        for(IOps i:this.list){
           val=i.exec(val);
        }
        return val;
    }
    public void dis(){
        System.out.println(this.list);
    }
}
public class Main {
    public static void main(String[] args) {
        IOps p1=new Sub();
        IOps p2=new Add();
        IOps p3=new Sub();
        IOps p4=new Add();
        IOps p5=new Sub();
	// write your code here
        ArrayList<IOps> list=new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        int res=new Util(list).ops(1);
        System.out.println(res);
    }
}
