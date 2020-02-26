package com.factory;

/**
 * @author chen.wei
 * @date 2020/2/26 0026
 */
public class PaymentTest {

    public static void main(String[] args) {
        DomesticPayFactory domesticPayFactory = new DomesticPayFactory();
        domesticPayFactory.createAliPay().pay();
        domesticPayFactory.createUnionPay().pay();
        domesticPayFactory.createWechatPay().pay();

        ExternalPayFactory externalPayFactory = new ExternalPayFactory();
        externalPayFactory.createCrossBorderPay().pay();
    }
}
