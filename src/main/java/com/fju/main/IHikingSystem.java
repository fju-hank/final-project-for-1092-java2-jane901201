package com.fju.main;

/*
當發現SQl連不上時，用本地資料
這邊呼叫DataInterface主要功用是確認SQL狀況
 */

import com.fju.data.IDataInterface;
import com.fju.gui.IScreenSystem;

public class IHikingSystem {

    IScreenSystem screenSystem;
    IDataInterface dataInterface;

    public void inital() {

    }

    public void connectData() {

        //通知連線失敗
    }
}
