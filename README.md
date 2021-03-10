# a workflow test demo

##1. /model/create
[创建模型](http://localhost:8081/model/create)

## 2. table

创建表的SQL语句位于  
 ～/.m2/repository/org/activiti/activiti-engine/6.0.0/activiti-engine-6.0.0.jar!/org/activiti/db/create/*.sql
 
+-----------------------+  

| Tables_in_db_activiti | Note | Category |    
| --- | --- | --- |   
| ACT_EVT_LOG           |                           | Event |   
| ACT_GE_BYTEARRAY      | 通用数据表：资源表           | General |  
| ACT_GE_PROPERTY       | 通用数据表：属性表           | General |  
| ACT_HI_ACTINST        | 历史数据表：流程明细表        | History |
| ACT_HI_ATTACHMENT     | 历史数据表：附件表           | History |  
| ACT_HI_COMMENT        | 历史数据表：评论表           | History |  
| ACT_HI_DETAIL         | 历史数据表：                | History |  
| ACT_HI_IDENTITYLINK   | 历史数据表：                | History |  
| ACT_HI_PROCINST       | 历史数据表：流程实例表        | History |  
| ACT_HI_TASKINST       | 历史数据表：                | History |  
| ACT_HI_VARINST        | 历史数据表：                | History |  
| ACT_ID_GROUP          | 身份数据表：用户组表         | Identity |  
| ACT_ID_INFO           | 身份数据表：用户账号（信息）表 | Identity |  
| ACT_ID_MEMBERSHIP     | 身份数据表：用户与组关系表     | Identity |  
| ACT_ID_USER           | 身份数据表：用户表            | Identity |  
| ACT_PROCDEF_INFO      |  流程定义信息                |         |  
| ACT_RE_DEPLOYMENT     | 流程存储表：流程部署表         | Repository |  
| ACT_RE_MODEL          | 流程存储表： 流程设计模型部署表  | Repository |  
| ACT_RE_PROCDEF        | 流程存储表：流程定义表         | Repository |  
| ACT_RU_DEADLETTER_JOB | 运行时数据表：无法执行工作表     | Runtime |  
| ACT_RU_EVENT_SUBSCR   | 运行时数据表： 事件描述表       | Runtime |  
| ACT_RU_EXECUTION      | 运行时数据表： 流程实例(执行流)表 | Runtime |  
| ACT_RU_IDENTITYLINK   | 运行时数据表： 流程与身份关系表 | Runtime |  
| ACT_RU_JOB            | 运行时数据表： 工作数据表      | Runtime |  
| ACT_RU_SUSPENDED_JOB  | 运行时数据表：暂停工作表       | Runtime |  
| ACT_RU_TASK           | 运行时数据表： 流程任务表      | Runtime |  
| ACT_RU_TIMER_JOB      | 运行时数据表：                | Runtime |  
| ACT_RU_VARIABLE       | 运行时数据表： 流程参数表      | Runtime |  
+-----------------------+

