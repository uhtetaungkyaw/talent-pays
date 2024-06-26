package org.talent.talentpay.service;

import org.talent.talentpay.domain.NewUserRequest;
import org.talent.talentpay.domain.UserInfo;
import org.talent.talentpay.domain.UserResponse;
import org.talent.talentpay.domain.UserValidateRequest;

public interface UserService {

    UserInfo validateUser(UserValidateRequest request);
    UserResponse registerUser(NewUserRequest request);

}