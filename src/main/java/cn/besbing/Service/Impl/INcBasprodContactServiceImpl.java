package cn.besbing.Service.Impl;

import cn.besbing.Dao.NcBasprodContactMapper;
import cn.besbing.Entities.NcBasprodContact;
import cn.besbing.Service.INcBasprodContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class INcBasprodContactServiceImpl implements INcBasprodContactService {

    @Autowired(required = false)
    NcBasprodContactMapper ncBasprodContactMapper;

    public int insert(NcBasprodContact ncBasprodContact){
        return ncBasprodContactMapper.insert(ncBasprodContact);
    }

}
