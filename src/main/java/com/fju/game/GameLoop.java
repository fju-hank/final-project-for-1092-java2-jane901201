package com.fju.game;
/*
遊戲更新處
接收IGameSystem的各種資料
確認點擊
接收IUIInterface的資料
 */

import com.fju.gui.IUIInterface;

import javax.swing.*;

public class GameLoop {

    public void switchUIPanel(IUIInterface ui, JFrame frame) {
        frame.setContentPane(ui.getUIPanel());
    }

}
