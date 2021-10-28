package com.practice.pages;

import com.practice.utilities.BrowserUtil;
import com.practice.utilities.Driver;
import io.cucumber.java.it.Ma;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ChallengingDom {

    @FindBy(xpath = "//table/thead/tr/th")
    private List<WebElement> tHead;

    @FindBy(xpath = "(//table/tbody/tr/td)")
    private List<WebElement> firstRowCells;

    @FindBy(xpath = "(//table/tbody/tr[2]/td)")
    private List<WebElement> secondRowCells;

    public ChallengingDom(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public Map<String,String> getRowMapFromTable(){

        //(//table/tbody/tr[1]/td) to 10

        Map<String,String> rowMap = new LinkedHashMap<>();
        List<String> allHeaders = BrowserUtil.getAllText(tHead);
        List<String> allFirstRow =  BrowserUtil.getAllText(  firstRowCells   ) ;
        List<String> allSecondRow = BrowserUtil.getAllText(secondRowCells);



        for (int i= 0; i < allHeaders.size(); i++) {
            //go through each column and add column header as key and value a cell value
            rowMap.put(allHeaders.get(i),allFirstRow.get(i));
            rowMap.put(allHeaders.get(i),allSecondRow.get(i));
        }

//        for (int i = 0; i < allHeaders.size(); i++) {
//            rowMap.put(allHeaders.get(i),allSecondRow.get(i));
//
//        }

        System.out.println(rowMap);
        return rowMap;


    }

}
