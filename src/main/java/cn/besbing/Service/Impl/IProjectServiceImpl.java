package cn.besbing.Service.Impl;

import cn.besbing.Dao.ProjectMapper;
import cn.besbing.Entities.Project;
import cn.besbing.Service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IProjectServiceImpl implements IProjectService {

    @Autowired(required = false)
    ProjectMapper projectMapper;


    public Project getLimsExampleProject(){
        return projectMapper.selectByPrimaryKey("A-200618-0091");
    }

    public int deleteProjectByPrimary(String billno){
        return projectMapper.deleteByPrimaryKey(billno);
    }

    public Project getProjectByPrimaryKey(String billno){
        return projectMapper.selectByPrimaryKey(billno);
    }

    public int updateProject(Project record){
        return projectMapper.updateByPrimaryKey(record);
    }

}
