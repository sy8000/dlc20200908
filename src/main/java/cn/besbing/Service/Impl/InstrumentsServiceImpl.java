package cn.besbing.Service.Impl;

import cn.besbing.CommonUtils.MaintainModel.PageDataResult;
import cn.besbing.CommonUtils.MaintainModel.SearchDTO;
import cn.besbing.Dao.InstrumentsMapper;
import cn.besbing.Entities.InstrumentsExample;
import cn.besbing.Entities.InstrumentsWithBLOBs;
import cn.besbing.Entities.TableTaskFields;
import cn.besbing.Service.IInstrumentsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InstrumentsServiceImpl implements IInstrumentsService {

    @Autowired(required = false)
    InstrumentsMapper instrumentsMapper;

    public PageDataResult allInstruments(SearchDTO searchDTO){
        PageDataResult pdr = new PageDataResult();
        PageHelper.startPage(searchDTO.getPage(), searchDTO.getLimit(),true);
        List<InstrumentsWithBLOBs> list = new ArrayList<InstrumentsWithBLOBs>();
        //如果keyword不为null时再传有参的
        if(searchDTO.getKeyword() != null){
            list = instrumentsMapper.selectAllInstruments(searchDTO.getKeyword().toString());
        }else {
            list = instrumentsMapper.selectAllInstruments(null);
        }
        PageInfo<InstrumentsWithBLOBs> pageInfo = new PageInfo<>(list);
        pdr.setTotals(Long.valueOf(pageInfo.getTotal()).intValue());
        pdr.setList(list);
        return pdr;
    }


    @Override
    public PageDataResult getPdrData(SearchDTO userSearch) {
        PageDataResult pdr = new PageDataResult();
        PageHelper.startPage(userSearch.getPage(), userSearch.getLimit(),true);
        List<InstrumentsWithBLOBs> urList = instrumentsMapper.getInstruments(userSearch.getKeyword());
        //logger.debug("urList:"+urList.size());

        // 获取分页查询后的数据
        PageInfo<InstrumentsWithBLOBs> pageInfo = new PageInfo<>(urList);
        // 设置获取到的总记录数total：
        //logger.debug("page:"+userSearch.getPage()+"limit:"+userSearch.getLimit()+"总行数:"+pageInfo.getTotal());
        pdr.setTotals(Long.valueOf(pageInfo.getTotal()).intValue());
        pdr.setList(urList);
        return pdr;
    }

    @Override
    public long countByExample(InstrumentsExample example) {
        return instrumentsMapper.countByExample(null);
    }
}
