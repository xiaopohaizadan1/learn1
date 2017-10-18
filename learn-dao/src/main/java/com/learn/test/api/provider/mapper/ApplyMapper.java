package com.learn.test.api.provider.mapper;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author geweijian
 * @data 2017-08-26
 */
@Repository
public interface ApplyMapper {
    List queryApply();
}
