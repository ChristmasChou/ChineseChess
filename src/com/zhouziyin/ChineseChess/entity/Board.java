package com.zhouziyin.ChineseChess.entity;

import java.awt.*;

/**
 * Created by zhouziyin on 2017/12/8.
 */
public class Board {

    /*
    *功能：画出象棋的棋盘
     */

    public void drawChess(Graphics g){
        //转成2D模式
        Graphics2D g2d = (Graphics2D) g;

        //得到当前的画刷
        Stroke stroke = g2d.getStroke();
        g2d.setColor(Color.BLACK);

        //设置新的画刷
        g2d.setStroke(new BasicStroke(4));
        g2d.drawRect(49,49,501,561);

        

    }
}
