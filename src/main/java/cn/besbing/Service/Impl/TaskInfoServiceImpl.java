package cn.besbing.Service.Impl;

import cn.besbing.CommonUtils.MaintainModel.SearchDTO;
import cn.besbing.CommonUtils.MaintainModel.PageDataResult;
import cn.besbing.Dao.CProjTaskMapper;
import cn.besbing.Entities.CProjTask;
import cn.besbing.Entities.TableTaskFields;
import cn.besbing.Entities.TechEngineerTable;
import cn.besbing.Service.ITaskInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskInfoServiceImpl implements ITaskInfoService {

    @Autowired(required = false)
    private CProjTaskMapper cProjTaskMapper;

    public PageDataResult getTask(SearchDTO searchDTO){

        PageDataResult pdr = new PageDataResult();
        PageHelper.startPage(searchDTO.getPage(), searchDTO.getLimit(),true);
        List<TableTaskFields> list = new ArrayList<TableTaskFields>();
        //如果keyword不为null时再传有参的
        if(searchDTO.getKeyword() != null){
            list = cProjTaskMapper.selectForTable(searchDTO.getKeyword().toString());
        }else {
            list = cProjTaskMapper.selectForTable(null);
        }
        PageInfo<TableTaskFields> pageInfo = new PageInfo<>(list);
        pdr.setTotals(Long.valueOf(pageInfo.getTotal()).intValue());
        pdr.setList(list);
        return pdr;
    }

    public CProjTask getTaskEntityById(String taskId){
        return cProjTaskMapper.selectByTaskId(taskId);
    }

    public int setTaskStatusById(CProjTask cProjTask){
        return cProjTaskMapper.updateByTaskId(cProjTask);
    }

    /**
     * 技术工程师分页表格
     * @param searchDTO
     * @return
     */
    public PageDataResult getTechEngineerTask(SearchDTO searchDTO){

        PageDataResult pdr = new PageDataResult();
        PageHelper.startPage(searchDTO.getPage(), searchDTO.getLimit(),true);
        List<TechEngineerTable> list = new ArrayList<TechEngineerTable>();
        //如果keyword不为null时再传有参的
        if(searchDTO.getKeyword() != null){
            list = cProjTaskMapper.selectForTechEngineer(searchDTO.getKeyword().toString());
        }else {
            list = cProjTaskMapper.selectForTechEngineer(null);
        }
        PageInfo<TechEngineerTable> pageInfo = new PageInfo<>(list);
        pdr.setTotals(Long.valueOf(pageInfo.getTotal()).intValue());
        pdr.setList(list);
        return pdr;
    }

}
