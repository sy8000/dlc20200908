package cn.besbing.Service.Impl;

import cn.besbing.Dao.ProductMapper;
import cn.besbing.Entities.Product;
import cn.besbing.Service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IProductServiceImpl implements IProductService {

    @Autowired(required = false)
    private ProductMapper productMapper;

    public List<Product> getAllProduct(){
        return productMapper.selectByNoThing();
    }

}
