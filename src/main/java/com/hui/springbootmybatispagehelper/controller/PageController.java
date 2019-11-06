package com.hui.springbootmybatispagehelper.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hui.springbootmybatispagehelper.bean.Emp;
import com.hui.springbootmybatispagehelper.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/11/6
 */
@RestController
public class PageController {
    @Autowired
    private EmpMapper empMapper;

    @GetMapping("/page")
    public Object page(@RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum) {

        PageHelper.startPage(pageNum, 5);
        List<Emp> emps = empMapper.selectByExample(null);
        PageInfo<Emp> pageInfo = new PageInfo<Emp>(emps);
        return pageInfo;
    }




}
