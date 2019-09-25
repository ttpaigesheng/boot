package com.abupdate.gesheng.es.repositry;

import com.abupdate.gesheng.es.domain.City;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: sheng ge
 * @Date: 2019/9/25 16:54
 */
@Repository
public interface CityRepositry extends ElasticsearchRepository<City,Long> {

}
