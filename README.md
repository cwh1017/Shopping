# Shopping

gmall-user 用户服务端口 8080 根据用户 查找用户地址

练习 springboot 使用

创建 gmall-parent 模块  
 统一管理依赖版本模块 (父依赖的创建/用maven创建) 
 新建其他项目需要继承 gmall-parent
 父依赖使用 springboot 版本是 2.3.5
 定义项目技术框架版本

创建 gamll-api (maven 创建)
 抽取 管理 bean service 
 
抽取 util 工程
 基于soa架构理念，项目分为web前端controller、jsp、thymeleaf、cookie等工具类
                       web后端service、mybatis、mysql、redis               
  controllerUtil  --> parent  api  webUtil
  serviceUtil  -->    parent  api  serviceUtil
 
 

