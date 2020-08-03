package cn.besbing.Service.Impl;

import cn.besbing.Dao.QcCommissionBMapper;
import cn.besbing.Entities.QcCommissionB;
import cn.besbing.Service.ICommissionBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ICommissionBServiceImpl implements ICommissionBService {

    @Autowired(required = false)
    QcCommissionBMapper qcCommissionBMapper;


    public List<QcCommissionB> getCommissionBodyList(List<String> commissionBodyPrimaryList){
        List<QcCommissionB> qcCommissionBList= new ArrayList<>();
        for (String bodyPrimary : commissionBodyPrimaryList){
            qcCommissionBList.add(qcCommissionBMapper.selectByPrimaryKey(bodyPrimary));
        }
        return qcCommissionBList;
    }


    public List<QcCommissionB> getCommissionBodyListByProject(String pkCommissionH){
        return qcCommissionBMapper.selectByProjectNumber(pkCommissionH);
    }

}
