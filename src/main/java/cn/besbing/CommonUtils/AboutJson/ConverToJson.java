package cn.besbing.CommonUtils.AboutJson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class ConverToJson {

    /**
     * 将list<object>数据转换成为符合layui格式的json
     * @param
     * @return
     */

    public JSONObject ListToJson(List<?> list){
        JSONObject jsonObject = new JSONObject();
        if (list.size() < 1){
            //错误
            jsonObject.put("code",-200);
            jsonObject.put("msg","error");
            jsonObject.put("count",0);
            jsonObject.put("data","");
        }else {
            jsonObject.put("code",0);
            jsonObject.put("msg","success");
            jsonObject.put("count",list.size());
            jsonObject.put("data",JSON.toJSON(list));
        }
        return jsonObject;
    }

}
