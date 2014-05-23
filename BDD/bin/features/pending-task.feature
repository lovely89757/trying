Feature:通知未完成任务
描述
In order to 保证项目的进度
As a Scrum Master
I want to 查询未完成任务

Scenario:有未完成任务的查询
Given 团队有任务“TaskABC”
Given 团队有任务“TaskDEF”
When 团队完成“TaskABC”
Then 团队的未完成任务是“TaskDEF”

Scenario:没有完成的任务
