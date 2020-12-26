package com.alibb.gmalluser.mapper;


import com.alibb.gmall.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


public interface UserMapper  extends Mapper<UmsMember>{

    List<UmsMember> selectAllUser();

    //List<UmsMemberReceiveAddress> selectAllUserAddsByMemberId(String memberId);



}
