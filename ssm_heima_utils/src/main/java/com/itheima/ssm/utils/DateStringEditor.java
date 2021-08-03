package com.itheima.ssm.utils;

import org.springframework.beans.propertyeditors.PropertiesEditor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * 功能描述：
 *
 * @author 陈铉锋
 * @date 2021/7/23
 */
public class DateStringEditor extends PropertiesEditor {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        try{
            Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(text);
            super.setValue(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
