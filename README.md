# intellij-plugin

适用于 intellij platform 的一言插件，主要功能为在项目启动后获取一句一言并弹出通知

## 功能
- [x] 右下角弹出
- [x] Tools 一言 Action
- [x] 快捷键支持
- [ ] 适配低版本 intellij sdk
- [ ] 增加更多功能

## 功能预览

![](https://alextech-1252251443.cos.ap-guangzhou.myqcloud.com/20201127102533.gif)

因使用了 java 11 的API，故 intellij sdk 版本最低要求 intellij idea 2020，后期将会适配低版本

## 安装

- [在插件市场中安装（稳定版）](https://plugins.jetbrains.com/plugin/15464-yiyan)

- 在IDE中使用 Settings Plugins 进行搜索（一言）安装（效果等同插件市场）

- [在开源仓库中下载 jar|zip 包（预览版）](https://github.com/hitokoto-osc/intellij-plugin/releases)，直接拖动到 intellij IDE中即可自动安装。（可能会要求重启）

![](https://alextech-1252251443.cos.ap-guangzhou.myqcloud.com/20201113100336.png)


## 使用

- 项目打开时将会自动获取一言并展示在IDE右下角。打开 EventLog 可以再次查看之前弹出的一言

- 使用菜单栏的 Tools -> 一言 功能，可以手动调用 

- 使用组合键 Command + Y 

## 编译

本项目依赖 intellij sdk，因此必须使用 idea 自带的 gradle 进行编译。

打开顶部菜单栏中的 Navigate -> Search EveryWhere，输入 gradle，选择 Actions 下的 Gradle 回车即可。
