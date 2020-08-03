package cn.besbing.Service.Impl;

import cn.besbing.Dao.LimsUsersMapper;
import cn.besbing.Entities.LimsUsers;
import cn.besbing.Entities.LimsUsersExample;
import cn.besbing.Service.ILimsUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ILimsUsersServiceImpl implements ILimsUsersService {

    @Autowired(required = false)
    LimsUsersMapper limsUsersMapper;

    public List<LimsUsers> getAllUserFromLims(){
        return limsUsersMapper.selectByExample(null);
    }


}
