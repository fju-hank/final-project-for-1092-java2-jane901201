package com.fju.main;

/*
當發現SQl連不上時，用本地資料
這邊呼叫DataInterface主要功用是確認SQL狀況
 */

import com.fju.data.*;
import com.fju.gui.IScreenSystem;
import com.fju.gui.IUIInterface;

public class IHikingSystem {

    IScreenSystem screenSystem;
    IConnectInterface sqlConnectTest;
    IConnectInterface localConnectTest;
    IUIInterface mainMenu;

    public IHikingSystem() {
        inital();
        setMainMenu(screenSystem.getUI());
        connectData();
    }

    public void inital() {
        screenSystem = new IScreenSystem();
        sqlConnectTest = new SQL();
        localConnectTest = new Local();
    }

    public void connectData() {
        if(sqlConnectTest.bCheckConnectData()) {
            mainMenu.setConnectTest("SQL連結成功");
        }
        else if(localConnectTest.bCheckConnectData()){
            mainMenu.setConnectTest("SQL連結失敗，重新連結為Local");
        }
        else {
            mainMenu.setConnectTest("資料庫連結失敗");
        }
        mainMenu.uiUpdate();
    }

    private void setMainMenu(IUIInterface mainMenu) {
        this.mainMenu = mainMenu;
    }

}
