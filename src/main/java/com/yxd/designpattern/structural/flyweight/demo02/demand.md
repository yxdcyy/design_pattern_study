### 使用享元模式实现资源共享池
> &ensp;&ensp;&ensp;&ensp;每年春节为了买到一张回家的火车票，大家都要大费周章。为了解决这一问题，12306 网站提供了自动查票的功能。如果开启自动查票
> 功能，则系统会将我们填写的信息缓存起来，然后定时查询余票信息。在买票的时候，我们肯定要查询一下有没有我们需要的车票，假设一张火车票包含出发站、目的站、
> 价格、座位类别等信息。现在要求编写火车票查询模拟代码，可以通过出发站、目的站查到相关票的信息。