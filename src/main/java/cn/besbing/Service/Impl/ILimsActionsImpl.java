package cn.besbing.Service.Impl;

import cn.besbing.Conctrollers.LimsFlagController;
import cn.besbing.Service.ILimsActions;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ILimsActionsImpl implements ILimsActions {

    Logger logger = LoggerFactory.getLogger(ILimsActionsImpl.class);


    /**
     * By the first , select project info from nc to lims . Y: let the bill to quote; N:show exception dialog and return;
     * @param jsonStr :include project no. , oprator code
     * @return
     */
    public String approvalByTechManager(String jsonStr){
        String returnFlag = "F";
        logger.info("开始技术主管审核..........." );



        logger.info("结束技术主管审核..........." );
        return returnFlag;
    }

}
