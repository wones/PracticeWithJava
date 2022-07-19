package com.wones.blog.service.impl;

import com.wones.blog.dao.BlogMapper;
import com.wones.blog.pojo.Blog;
import com.wones.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogMapper blogMapper;
    @Override
    public Blog getBlogById(Long blogId) {
        return blogMapper.selectByPrimaryKey(blogId);
    }
}
