package com.atguigu.java;

/**
 * @author shkstart
 * @date 2020-02-18 下午 11:27
 */
public class TemplatesTest {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("args = [" + args + "]");

        System.out.println("TemplatesTest.main");

        for (int i = 0; i < ; i++) {
            
        }
    }



    private static TemplatesTest ourInstance = new TemplatesTest();

    public static TemplatesTest getInstance() {
        return ourInstance;
    }

    private TemplatesTest() {
    }
}
