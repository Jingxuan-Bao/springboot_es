package cn.imooc.demo.springbootes.repository.mysql;

import cn.imooc.demo.springbootes.entity.mysql.MysqlBlog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MysqlBlogRepository extends JpaRepository<MysqlBlog, Integer> {
}
