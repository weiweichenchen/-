package com.factory;

import com.factory.pay.*;

/**
 * @author chen.wei
 * @date 2020/2/26 0026
 */
public class ExternalPayFactory extends IPayFactory {

    @Override
    public void init() {
        System.out.println("国外支付初始化数据");
    }


    public IPay createCrossBorderPay() {
        init();
        return new CrossBorderPay();
    }





}
