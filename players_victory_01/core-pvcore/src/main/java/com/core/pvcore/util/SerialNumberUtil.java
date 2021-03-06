package com.core.pvcore.util;


import org.apache.commons.lang.RandomStringUtils;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 产生序列号的工具
 *
 * @author Administrator
 */
public class SerialNumberUtil {

    private static int totalCount = 0;

    private int serialNumberID;

    public SerialNumberUtil() {
        ++totalCount;
        serialNumberID = totalCount;
        System.out.println("add one......");
    }

    public String getSerialNumberID() {
        DecimalFormat decimalFormat = new DecimalFormat("00");
        return new SimpleDateFormat("yyyyMMdd").format(new Date()) + decimalFormat.format(serialNumberID)
                + RandomStringUtils.randomNumeric(2);
    }

    /**
     * create ref_order_no
     */
    public String getOrderNO() {
        DecimalFormat decimalFormat = new DecimalFormat("0000");
        String orderNo = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())
                + decimalFormat.format(serialNumberID);
        orderNo = orderNo.substring(2);
        return orderNo;
    }

    /**
     * ref_order_no
     */
    public String autoGeneratedKey(int bNo, int incNo) {

        String strIncNo = String.format("%07d", incNo);
        String strBNo = String.format("%03d", bNo);

        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyyMM");
        String first = "MM";
        String second = ft.format(dNow);
        System.out.println(first + "-" + second + "-" + strIncNo);
        return first + "-" + second + "-" + strBNo + "-" + strIncNo;

    }

    /**
     * 退货单号
     *
     * @return
     * @Description
     * @author chen
     */
    public String getOrderReturnNO() {
        DecimalFormat decimalFormat = new DecimalFormat("0000");
        String orderNo = new SimpleDateFormat("yyyyMMdd").format(new Date()) + decimalFormat.format(serialNumberID);
        orderNo = orderNo.substring(2);
        return orderNo;
    }

}
