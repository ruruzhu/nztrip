package com.fitibo.aotearoa.service.impl;

import com.fitibo.aotearoa.mapper.CategoryMapper;
import com.fitibo.aotearoa.model.Category;
import com.fitibo.aotearoa.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by qianhao.zhou on 8/1/16.
 */
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public Category findById(int id) {
        return categoryMapper.findById(id);
    }

    @Override
    public Map<Integer, Category> findByIds(List<Integer> ids) {
        return ServiceHelper.convert(categoryMapper.findByIds(ids));
    }

    @Override
    public List<Category> findAll() {
        return categoryMapper.findAll();
    }

}
