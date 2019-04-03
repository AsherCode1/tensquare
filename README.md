# Tensquare

一个基于SpringCloud全家桶的微服务轮子，以下是用到的技术点：

- Docker：封装服务到Docker容器中，利于后期构建，维护，发布及部署应用程序。

- SpringDataJPA：提供常用Repository层的实现，减少大量业务逻辑代码。

- SpringDataRedis:用于文章模块查询，减少高并发请求数据的阻塞。

- SpringCache：用于活动模块缓存查询，无法设置过期时间。

- SpringDataMongoDB：用于吐槽评论模块的点赞等频繁操作，数据量大，价值低的业务。

- ElasticSearch：用于文章模块模糊多关键字段查询。

- Logstash：用于将mysql数据库定时导入ES中，保证数据检索一致性。

- RabbitMQ：用于注册账户时验证码的生产与消费，以消息队列形式应对高并发保证数据一致性。

- JWT：结合BCrypt加解密实现token鉴权，通过HandlerInterceptor拦截器，无状态，性能高。

- Eureka：类似Zookeeper作为SpringCloud的微服务注册中心，定时发送心跳到Eureka以检测各服务节点的可用性。

- Feign：结合Eureka实现RPC远程服务调用，具备负载均衡特性，用于好友系统调用用户微服务。

- Hystrix：用于问答模块远程调用base微服务，预防服务调用失败，快速从异常中恢复，熔断器阻止雪崩效应发生。

- Zuul：配置了前后台网关进行请求转发，集中处理权限，减少跨域问题，降低因多次请求不同微服务而增加客户端的复杂性，统一端口利于后期运维对容器的扩缩容。

- Config：集中配置中心，通过服务去调用中心的对应的配置文件。

- Bus：消息总线，实现不启动微服务的情况下，利用rabbitmq监听配置以自动更新。

- registry：docker的私有库。

- gogs：比Gitlab更轻量级的git私有管理仓库。

- jenkins：与gogs整合达到代码打包持续集成，docker容器自动启动部署。

- Rancher：全栈化的容器部署及管理平台，图形化docker命令，并结合influxDB,cAdvisor,Grafana实现容器内存预警自动扩/缩容。

  ### 项目的开发实现及部署运维将于后期在[个人博客](https://codewj.github.io)中填坑，欢迎友链。

  # 坚持用最前沿的技术选型，实现最简单的功能。

  

  

  