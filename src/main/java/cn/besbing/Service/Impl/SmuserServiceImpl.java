package cn.besbing.Service.Impl;

import cn.besbing.Dao.SmUserMapper;
import cn.besbing.Entities.SmUser;
import cn.besbing.Service.ISmuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmuserServiceImpl implements ISmuserService {

    @Autowired(required = false)
    SmUserMapper smUserMapper ;


    @Override
    public SmUser selectUserPasswordByUserCode(String usercode) {
        SmUser smUser = smUserMapper.selectUserPasswordByUserCode(usercode);
        return smUser;
    }
}
