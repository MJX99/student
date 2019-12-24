package com.briup.student.web.controller;

import com.briup.student.util.Message;
import com.briup.student.util.MessageUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
       @PostMapping("/add")
       public Message add(  ){
              return MessageUtil.success("添加学生成功");
       }
       @GetMapping("/delete")
       @ApiOperation(value = "删除学生")
       @ApiImplicitParams({
               @ApiImplicitParam(name = "stuID",value = "学号",paramType = "query",dataType = "int"),
               @ApiImplicitParam(name = "name",value = "姓名",paramType = "query",dataType = "string")
       })
       public Message delete(int stuID, String name){
              return MessageUtil.success("删除学生成功");
       }
}
