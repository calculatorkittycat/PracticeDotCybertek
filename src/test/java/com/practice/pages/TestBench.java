package com.practice.pages;

import com.practice.utilities.Driver;
import org.junit.Test;

public class TestBench {

    @Test
    public void test0 (){
        Driver.getDriver().get("http://practice.cybertekschool.com/");
    }
}
