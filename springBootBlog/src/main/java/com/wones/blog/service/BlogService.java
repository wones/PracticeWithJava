package com.wones.blog.service;

import com.wones.blog.pojo.Blog;

public interface BlogService {
    /**
     * 根据id获取详情
     *
     * @param blogId
     * @return
     */
    Blog getBlogById(Long blogId);
}
