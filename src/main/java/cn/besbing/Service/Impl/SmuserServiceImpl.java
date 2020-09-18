package cn.besbing.Service.Impl;

import cn.besbing.Dao.SmUserMapper;
import cn.besbing.Entities.SmUser;
import cn.besbing.Entities.SmUserExample;
import cn.besbing.Service.ISmuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmuserServiceImpl implements ISmuserService {

    @Autowired(required = false)
    SmUserMapper smUserMapper ;


    @Override
    public SmUser selectUserPasswordByUserCode(String usercode) {
        usercode = usercode.replace("\"","");
        SmUser smUser = smUserMapper.selectUserPasswordByUserCode(usercode);
        return smUser;
    }

    public int updateUserByCuserid(SmUser smUser){
        return smUserMapper.updateByPrimaryKey(smUser);
    }

    public List<SmUser> selectByExample(SmUserExample example){return smUserMapper.selectByExample(example);}


}
