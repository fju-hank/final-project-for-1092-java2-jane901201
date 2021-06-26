package com.fju.unitTest;

import com.fju.data.IConnectInterface;
import com.fju.data.Local;

public class IConnectInterfaceTest {
    public static void main(String[] args) {
        IConnectInterface connectInterface = new Local();
        connectInterface.connectData();
    }
}
