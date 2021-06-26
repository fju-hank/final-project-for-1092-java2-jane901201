package com.fju.unitTest;

import com.fju.data.IConnectInterface;
import com.fju.data.Local;
import com.fju.data.SQL;

public class IConnectInterfaceTest {
    public static void main(String[] args) {
        IConnectInterface connectInterface = new SQL();
        System.out.println(connectInterface.bCheckConnectData());
        IConnectInterface localConnect = new Local();
        System.out.println(localConnect.bCheckConnectData());
    }
}
