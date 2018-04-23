# Artifactory 使用示例
[查看文档](https://fqk.io/android-manage-modules/)

#### 运行前准备
1. 正确安装并配置 `Artifactory`
2. 根据实际配置修改 `gradle.properties`

#### 发布模块
```
cd KitExample
./gradlew assembleRelease
./gradlew artifactoryPublish
```

#### 运行 AppExample
未发生 `ClassNotFoundException` 异常即测试通过。