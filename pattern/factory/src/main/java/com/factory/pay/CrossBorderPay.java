package com.factory.pay;

/**
 * @author chen.wei
 * @date 2020/2/26 0026
 */
public class CrossBorderPay implements IPay {
    @Override
    public void pay() {
        System.out.println("我是跨境支付");
    }
}
