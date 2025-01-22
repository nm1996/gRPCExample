package com.nm.grpc.common.mapper;

import com.nm.grpc.common.dto.UserCreationRequestDto;
import org.springframework.stereotype.Component;

import static banking.UserCreation.UserCreationRequest;

@Component
public class UserMapper {


    public UserCreationRequestDto toDto(UserCreationRequest proto){
        return new UserCreationRequestDto(
                proto.getName(),
                proto.getLastname(),
                proto.getAge()
        );
    }


    public UserCreationRequest toProto(UserCreationRequestDto dto){
        return UserCreationRequest.newBuilder()
                .setName(dto.name())
                .setLastname(dto.lastName())
                .setAge(dto.age())
                .build();
    }

}
