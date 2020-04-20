package com.fuadrafid.methods;

public class Methods {
  //|  access  | optional | return | method |  parameters    |          Exception             |
  //| modifier | modifier |  type  |  name  | including type |         (optional)             |
       public     final      void     nap      (int minutes)     throws InterruptedException  {
        return;
    }

    public void walk1() {}
    //default void walk2() {} -- DOES NOT COMPILE
    //void public walk3() {} -- DOES NOT COMPILE
    void walk4() {}
}
