package com.wones.blog.service;



import com.wones.blog.pojo.BlogTagCount;
import com.wones.blog.util.PageQueryUtil;
import com.wones.blog.util.PageResult;

import java.util.List;

public interface TagService {

    /**
     * 查询标签的分页数据
     *
     * @param pageUtil
     * @return
     */
    PageResult getBlogTagPage(PageQueryUtil pageUtil);

    int getTotalTags();

    Boolean saveTag(String tagName);

    Boolean deleteBatch(Integer[] ids);

    List<BlogTagCount> getBlogTagCountForIndex();
}
