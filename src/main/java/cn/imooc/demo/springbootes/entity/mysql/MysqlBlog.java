package cn.imooc.demo.springbootes.entity.mysql;


import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
public class MysqlBlog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String author;

    private String content;

    private Date createtime;

    private Date updatetime;


    public static void main(String[] args) {
        MysqlBlog mb = new MysqlBlog();
    }
}
