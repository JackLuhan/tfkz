/*
 *    Copyright (c) 2018-2025, tfkz All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the tfkz4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: tfkz (wangiegie@gmail.com)
 */

package com.yunsuo.tfkz.admin.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.yunsuo.tfkz.admin.model.dto.DeptTree;
import com.yunsuo.tfkz.admin.model.entity.SysDept;
import com.yunsuo.tfkz.admin.service.SysDeptService;
import com.yunsuo.tfkz.common.constant.CommonConstant;
import com.yunsuo.tfkz.common.web.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 部门管理 前端控制器
 * </p>
 *
 * @author houyi
 * @since 2018-01-20
 */
@RestController
@RequestMapping("/dept")
public class DeptController extends BaseController {
    @Autowired
    private SysDeptService sysDeptService;

    /**
     * 通过ID查询
     *
     * @param id ID
     * @return SysDept
     */
    @GetMapping("/{id}")
    public SysDept get(@PathVariable Integer id) {
        return sysDeptService.selectById(id);
    }


    /**
     * 返回树形菜单集合
     *
     * @return 树形菜单
     */
    @GetMapping(value = "/tree")
    public List<DeptTree> getTree() {
        SysDept condition = new SysDept();
        condition.setDelFlag(CommonConstant.STATUS_NORMAL);
        return sysDeptService.selectListTree(new EntityWrapper<>(condition));
    }

    /**
     * 添加
     *
     * @param sysDept 实体
     * @return success/false
     */
    @PostMapping
    public Boolean add(@RequestBody SysDept  sysDept) {
        return sysDeptService.insertDept(sysDept);
    }

    /**
     * 删除
     *
     * @param id ID
     * @return success/false
     */
    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id) {
        return sysDeptService.deleteDeptById(id);
    }

    /**
     * 编辑
     *
     * @param sysDept 实体
     * @return success/false
     */
    @PutMapping
    public Boolean edit(@RequestBody SysDept sysDept) {
        sysDept.setUpdateTime(new Date());
        return sysDeptService.updateDeptById(sysDept);
    }
}
