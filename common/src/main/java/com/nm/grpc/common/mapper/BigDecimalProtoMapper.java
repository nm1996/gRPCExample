package com.nm.grpc.common.mapper;

import com.javainuse.banking.BigDecimalProto;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.BigInteger;

@Component
public class BigDecimalProtoMapper {

    public BigDecimalProto toProto(BigDecimal dto) {
        long unscaled = dto.unscaledValue().longValue();
        int scaled = dto.scale();

        return BigDecimalProto.newBuilder()
                .setUnscaledValue(unscaled)
                .setScale(scaled)
                .build();
    }


    public BigDecimal toDto(BigDecimalProto proto) {
        long unscaled = proto.getUnscaledValue();
        int scaled = proto.getScale();

        return new BigDecimal(BigInteger.valueOf(unscaled), scaled);
    }
}
