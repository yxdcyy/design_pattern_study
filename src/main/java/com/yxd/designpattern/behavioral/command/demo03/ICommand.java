package com.yxd.designpattern.behavioral.command.demo03;

/**
 * 命令接口
 */
public interface ICommand {
    // 执行操作
    void execute();
    // 撤销操作
    void undo();
}
