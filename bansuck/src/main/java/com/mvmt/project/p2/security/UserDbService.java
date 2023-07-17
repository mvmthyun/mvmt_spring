package com.mvmt.project.p2.security;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mvmt.project.p2.security.dto.UserEntity;
import com.mvmt.project.p2.security.dto.UserRoleEntity;

public interface UserDbService {
    
    public UserEntity getUser(String userId);

    public List<UserRoleEntity> getUserRoles(String loginUserId);

}
