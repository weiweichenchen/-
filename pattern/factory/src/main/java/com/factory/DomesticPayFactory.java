package com.factory;

import com.factory.pay.AliPay;
import com.factory.pay.IPay;
import com.factory.pay.UnionPay;
import com.factory.pay.WechatPay;

/**
 * @author chen.wei
 * @date 2020/2/26 0026
 */
public class DomesticPayFactory extends IPayFactory {

    @Override
    public void init() {
        System.out.println("国内支付初始化数据");
    }


    public IPay createWechatPay() {
        init();
        return new WechatPay();
    }
    public IPay createAliPay() {
        init();
        return new AliPay();
    }
    public IPay createUnionPay() {
        init();
        return new UnionPay();
    }




}
