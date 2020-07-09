package com.example.demo.testDemo;

import org.junit.jupiter.api.Test;
import com.example.demo.Controller.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestRestFulController {

    @Test
    public void test1(){
        restFulController restFulController = new restFulController();
        restFulController.test1("jf_test_Demo");
        List<Object> list = new ArrayList<>();
        //Object不能自动转换为String，因为大的类型不能自动转换为小的类型。
        //List<String> list1 = new ArrayList<Object>();
        Map<String,Object> map = new HashMap<String,Object>();
    }

}
