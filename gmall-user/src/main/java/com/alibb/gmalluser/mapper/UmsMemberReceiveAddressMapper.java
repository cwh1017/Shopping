package com.alibb.gmalluser.mapper;

import com.alibb.gmall.bean.UmsMemberReceiveAddress;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


public interface UmsMemberReceiveAddressMapper extends Mapper<UmsMemberReceiveAddress> {
    //可以只用传参数  不用对象
    List<UmsMemberReceiveAddress> selAll(UmsMemberReceiveAddress umsMemberReceiveAddress);
}
