package cn.besbing.Service;

import cn.besbing.Entities.SmUser;
import org.springframework.stereotype.Service;

@Service
public interface ISmuserService {
    SmUser selectUserPasswordByUserCode(String usercode);
}
