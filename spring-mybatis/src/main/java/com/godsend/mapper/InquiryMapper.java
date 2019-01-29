package com.godsend.mapper;

import com.godsend.entity.InquiryEntity;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface InquiryMapper {

    @SelectProvider(type = InquiryMapperProvider.class, method = "list")
    List<InquiryEntity> list();
}
