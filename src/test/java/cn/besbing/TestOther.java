package cn.besbing;

import cn.besbing.CommonUtils.MaintainModel.LimsAnalysisUtil;
import org.junit.Test;

public class TestOther {

    @Test
    public void testAnalysis(){
        LimsAnalysisUtil limsAnalysisUtil = new LimsAnalysisUtil();
        limsAnalysisUtil.insertAnalysis("a","b","c");
    }

}
