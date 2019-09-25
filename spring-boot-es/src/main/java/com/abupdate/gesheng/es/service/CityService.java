package com.abupdate.gesheng.es.service;

import com.abupdate.gesheng.es.domain.City;

import java.util.List;

/**
 * @Author: sheng ge
 * @Date: 2019/9/25 16:57
 */
public interface CityService {

    /**
     * 新增城市信息
     *
     * @param city
     * @return
     */
    Long saveCity(City city);

    /**
     * 根据关键词，function score query 权重分分页查询
     *
     * @param pageNumber
     * @param pageSize
     * @param searchContent
     * @return
     */
    List<City> searchCity(Integer pageNumber, Integer pageSize, String searchContent);
}
