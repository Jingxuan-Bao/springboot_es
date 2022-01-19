package cn.imooc.demo.springbootes;

import cn.imooc.demo.springbootes.entity.es.EsBlog;
import cn.imooc.demo.springbootes.repository.es.EsBlogRepository;
//import org.elasticsearch.search.aggregations.metrics.InternalHDRPercentiles;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Iterator;

@SpringBootTest
class SpringbootEsApplicationTests {

    @Autowired
    EsBlogRepository esBlogRepository;

    @Test
    public void testEs() {
        Iterable<EsBlog> all = esBlogRepository.findAll();
        Iterator<EsBlog> esBlogIterator = all.iterator();
        EsBlog next = esBlogIterator.next();
        System.out.println(next.getTitle());
    }
}
