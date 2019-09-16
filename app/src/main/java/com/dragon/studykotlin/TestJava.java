package com.dragon.studykotlin;

import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author guoyongping
 * @date 2019-09-15 10:14
 */
public class TestJava {

    public static void main(String[] args) {

        List<Button> buttons = new ArrayList<>();
        // 上界通配符
        List<? extends TextView> textViews = buttons;

        List<? extends TextView> textViews1 = new ArrayList<Button>();
        List<? extends TextView> textViews2 = new ArrayList<RadioButton>();

        TextView textView = textViews2.get(0);
//        textViews.add(textView);// ? extends  只读不写

        //只写不读
        List<? super Button> lists = new ArrayList<>();
        Object object = lists.get(0);
        Button button = null;
        lists.add(button);


    }

}
