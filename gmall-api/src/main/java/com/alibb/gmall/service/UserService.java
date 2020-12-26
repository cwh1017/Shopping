package com.alibb.gmall.service;



import com.alibb.gmall.bean.UmsMember;
import com.alibb.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;



public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getAllUserAdds();

    List<UmsMemberReceiveAddress> getAllUserAddsByMemberId(String memberId);
}
