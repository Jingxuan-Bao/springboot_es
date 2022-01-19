package cn.imooc.demo.springbootes.repository.es;

import cn.imooc.demo.springbootes.entity.es.EsBlog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EsBlogRepository extends ElasticsearchRepository<EsBlog, Integer> {
}
