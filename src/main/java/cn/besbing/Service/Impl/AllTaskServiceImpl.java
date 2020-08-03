package cn.besbing.Service.Impl;

import cn.besbing.CommonUtils.MaintainModel.PageDataResult;
import cn.besbing.CommonUtils.MaintainModel.SearchDTO;
import cn.besbing.Dao.AllTaskMapper;
import cn.besbing.Entities.TableTaskFields;
import cn.besbing.Service.IAllTaskService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class AllTaskServiceImpl implements IAllTaskService {

    @Autowired(required = false)
    AllTaskMapper allTaskMapper;


    public PageDataResult getTask(SearchDTO searchDTO){

        PageDataResult pdr = new PageDataResult();
        PageHelper.startPage(searchDTO.getPage(), searchDTO.getLimit(),true);
        List<TableTaskFields> list = new ArrayList<TableTaskFields>();
        //如果keyword不为null时再传有参的
        if(searchDTO.getKeyword() != null){
            list = allTaskMapper.selectForTable(searchDTO.getKeyword().toString());
        }else {
            list = allTaskMapper.selectForTable(null);
        }
        PageInfo<TableTaskFields> pageInfo = new PageInfo<>(list);
        pdr.setTotals(Long.valueOf(pageInfo.getTotal()).intValue());
        pdr.setList(list);
        return pdr;
    }
}
