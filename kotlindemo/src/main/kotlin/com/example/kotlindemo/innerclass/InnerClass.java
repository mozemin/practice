package com.example.kotlindemo.innerclass;

/**
 * create by mozemin on 2018/11/9
 * desc:
 */
public class InnerClass {
    private int a;

    public class Inner {
        public void hello() {
            System.out.println(InnerClass.this.a);
        }
    }

    public static void main(String... args) {
        InnerClass innerClass = new InnerClass();
        View view = new View();
        view.setOnClicklistener(new OnClicklistener() {
            public void onClick() {

            }
        });
    }
}
