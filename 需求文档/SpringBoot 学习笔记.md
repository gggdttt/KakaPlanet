# SpringBoot 学习笔记

## 1. 主要注释

* @springBootApplication:声明主程序
* @ controller ：声明控制器
* @RequestMapping：请求映射
* @ ResponseBody：将返回的数据直接写给浏览器，（如果返回的是对象则以json的形式写回）
* @RestController: 等于@ResponseBody+@Controller的结合体

  



## 2.部署

不用打war包，可以直接打包成jar包



## 3.配置文件

使用一个全局的配置文件，配置文件名是固定的：`application.properties`或者`application.yml`

