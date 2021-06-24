package com.fju.unitTest;

import com.fju.data.IDataInterface;
import com.fju.data.Question;

public class IDataInterfaceTest {
    IDataInterface iDataInterface = new Question();

    public static void main(String[] args) {
        IDataInterface iDataInterface = new Question();

        iDataInterface.printData();
    }
}
