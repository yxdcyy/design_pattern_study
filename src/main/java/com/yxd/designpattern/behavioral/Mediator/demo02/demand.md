### 使用中介者模式设计群聊场景
> 假设我们要构建一个聊天室系统，用户可以向聊天室发送消息，聊天室向所有用户显示消息。实际上就是用户发信息与聊天室显示的通信过程，不过用户无法直接将信息
> 发给聊天室，而是需要将信息发到服务器上，然后服务器再将该消息发给聊天室进行显示。