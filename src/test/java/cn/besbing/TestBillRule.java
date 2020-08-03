package cn.besbing;

import cn.besbing.CommonUtils.Bill.BaseBillPrimary;
import org.junit.Test;

public class TestBillRule {

    @Test
    public void test(){
        BaseBillPrimary baseBillPrimary = new BaseBillPrimary();
        System.out.println(baseBillPrimary.getPrimaryWithoutModuleName(20));
    }


}
