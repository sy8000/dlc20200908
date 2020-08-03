package cn.besbing.Service.Impl;

import cn.besbing.Dao.QcCommissionRMapper;
import cn.besbing.Entities.QcCommissionR;
import cn.besbing.Service.IQcCommissionRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IQcCommissionRServiceImpl implements IQcCommissionRService {

    @Autowired(required = false)
    QcCommissionRMapper qcCommissionRMapper;

    public List<QcCommissionR> getCommissionRList(List<String> commissionRPkList){
        List<QcCommissionR> qcCommissionRList = new ArrayList<>();
        for (String commissionRPk : commissionRPkList){
            qcCommissionRList.add(qcCommissionRMapper.selectByPrimaryKey(commissionRPk));
        }
        return qcCommissionRList;
    }

}
