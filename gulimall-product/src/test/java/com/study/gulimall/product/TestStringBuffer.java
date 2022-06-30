package com.study.gulimall.product;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class TestStringBuffer {

    @Test
    public void test() {
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("d");
        stringList.add("k");
        System.out.println(String.join(",", stringList));

    }
}


