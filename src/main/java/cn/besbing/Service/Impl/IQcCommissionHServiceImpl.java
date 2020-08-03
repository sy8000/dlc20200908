package cn.besbing.Service.Impl;

import cn.besbing.CommonUtils.MaintainModel.PageDataResult;
import cn.besbing.CommonUtils.MaintainModel.SearchDTO;
import cn.besbing.Dao.QcCommissionHMapper;
import cn.besbing.Entities.QcCommissionH;
import cn.besbing.Entities.TableTaskFields;
import cn.besbing.Entities.TechManagerEntity;
import cn.besbing.Service.IQcCommissionHService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IQcCommissionHServiceImpl implements IQcCommissionHService {

    @Autowired(required = false)
    QcCommissionHMapper qcCommissionHMapper;

    public PageDataResult getProject(SearchDTO searchDTO){

        PageDataResult pdr = new PageDataResult();
        PageHelper.startPage(searchDTO.getPage(), searchDTO.getLimit(),true);
        List<TechManagerEntity> list = new ArrayList<TechManagerEntity>();
        //如果keyword不为null时再传有参的
        if(searchDTO.getKeyword() != null){
            list = qcCommissionHMapper.selectForTechManager(searchDTO.getKeyword().toString());
        }else {
            list = qcCommissionHMapper.selectForTechManager(null);
        }
        PageInfo<TechManagerEntity> pageInfo = new PageInfo<>(list);
        pdr.setTotals(Long.valueOf(pageInfo.getTotal()).intValue());
        pdr.setList(list);
        return pdr;
    }


    public QcCommissionH selectQMHByPrimary(String pk_commission_h){
        return qcCommissionHMapper.selectByPrimaryKey(pk_commission_h);
    }

}
