package com.wones.blog.controller.blog;

import com.wones.blog.pojo.Blog;
import com.wones.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class BlogController {
    @Resource
    private BlogService blogService;

    @GetMapping({"/", "/index", "index.html"})
    public String index(HttpServletRequest request) {
        return "hello";
    }
    @GetMapping("/blog/{id}")
    public Blog getBlogById(@PathVariable("id") Long id){
        Blog blog = blogService.getBlogById(id);
        return blog;
    }

}
