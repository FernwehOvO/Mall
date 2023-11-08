package com.xiatian.mallware.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiatian.mallware.entity.Purchase;
import com.xiatian.mallware.service.PurchaseService;
import com.xiatian.mallware.mapper.PurchaseMapper;
import org.springframework.stereotype.Service;

/**
* @author XT189
* @description 针对表【wms_purchase(采购信息)】的数据库操作Service实现
* @createDate 2023-11-08 12:32:54
*/
@Service
public class PurchaseServiceImpl extends ServiceImpl<PurchaseMapper, Purchase>
    implements PurchaseService{

}




