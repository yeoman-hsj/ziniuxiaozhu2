package com.ziniuxiaozhu.test;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by yeoman on 2017/9/15.
 */
public class JasyptTest extends TestCase {

    public void test1(){
        String []datas = new String[] {"peng","zhao","li"};
        Arrays.sort(datas);
        Stream.of(datas).forEach(param -> System.out.println(param));
    }

}
