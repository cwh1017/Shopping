package com.alibb.gmalluser.service.impl;

import com.alibb.gmall.service.UserService;
import com.alibb.gmall.bean.UmsMember;
import com.alibb.gmall.bean.UmsMemberReceiveAddress;
import com.alibb.gmalluser.mapper.UmsMemberReceiveAddressMapper;
import com.alibb.gmalluser.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;


    @Override
    public List<UmsMember>  getAllUser() {
        List<UmsMember> umsMemberList = userMapper.selectAll();//.selectAllUser();
        return umsMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getAllUserAdds() {
        return null;
    }

    @Override
    public List<UmsMemberReceiveAddress> getAllUserAddsByMemberId(String memberId) {
        // 通用mapper
        // Example example = new Example(UmsMemberReceiveAddress.class);
        // example.createCriteria().andEqualTo(memberId);
        //List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectByExample(example);

        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        // List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selAll(memberId);  //实现就只用传参数
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selAll(umsMemberReceiveAddress);

        return umsMemberReceiveAddresses;
    }


}
