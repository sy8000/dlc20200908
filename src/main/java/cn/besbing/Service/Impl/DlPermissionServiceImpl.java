package cn.besbing.Service.Impl;

import cn.besbing.Dao.DlPermissionMapper;
import cn.besbing.Entities.DlPermission;
import cn.besbing.Service.DlPermissionService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DlPermissionServiceImpl implements DlPermissionService {

    @Autowired(required = false)
    DlPermissionMapper dlPermissionMapper;

    public List<DlPermission> findPermissionByRoleId(@Param("roleid") String roleid){
        return dlPermissionMapper.findPermissionByRoleId(roleid);
    }

}
