package cn.besbing.Service.Impl;

import cn.besbing.Dao.DlRoleMapper;
import cn.besbing.Entities.DlRole;
import cn.besbing.Service.DlRoleService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DlRoleServiceImpl implements DlRoleService {

    @Autowired(required = false)
    DlRoleMapper dlRoleMapper;

    public List<DlRole> findRoleByUsername(@Param("usercode") String usercode){
        return dlRoleMapper.findRoleByUsername(usercode);
    }


}
