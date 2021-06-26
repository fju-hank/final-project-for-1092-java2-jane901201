package com.fju.unitTest;

import com.fju.data.DataInternet;
import com.fju.data.IDataInterface;
import com.fju.data.DataQuestion;

public class IDataInterfaceTest {
    IDataInterface iDataInterface = new DataQuestion();

    public static void main(String[] args) {
        IDataInterface iDataInterface = new DataQuestion();
        IDataInterface localData = new DataQuestion();
        IDataInterface sqlInternetData = new DataInternet();
        iDataInterface.printData();
        localData.printData();
        sqlInternetData.printData();
    }
}
