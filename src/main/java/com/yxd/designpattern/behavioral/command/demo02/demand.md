### 需求：使用命令模式重构播放器控制条
> 假如我们开发一个播放器，播放器有播放功能、拖动进度条功能、停止播放功能、暂停功能，我们在操作播放器的时候并不是直接调用播放器的方法，而是通过一个控制
> 条去传达指令给播放器内核，具体传达什么指令，会被封装为一个个按钮。那么每个按钮就相当于对一条命令的封装。用控制条实现了用户发送指令与播放器内核接收指令
> 的解耦。
