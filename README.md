# Genshin_id_inquiry
查询原神游戏账号信息（国服和B服）

这是一个查看对方是否拿网图P过的图忽悠你的小程序，也可以用来查看游戏中来自己世界的对方信息。

使用的是java语言编写，使用Eclipse中WindowBuilder插件完成可视化过程，所以JFrame中写的挺乱。
主要使用如下两个米游社API:
API1:https://api-takumi.mihoyo.com/game_record/genshin/api/spiralAbyss?schedule_type=1&server=(所在服,如cn_gf01或cn_qd01)&role_id=(游戏ID)
可获取到该id全部角色和活跃天数宝箱等信息
API2:https://api-takumi.mihoyo.com/game_record/genshin/api/character
发送时附带json{"character_ids":[角色id,角色id,角色id,..........],"role_id":"游戏ID","server":"所在服"}

在访问以上API时，协议头需要加入一些细节，除了Cookies，另一个就是DS,可以参考Github中米游社签到类的项目中的DS制作方法
在访问API2时，使用java的HttpPost会报peer not authenticated，所以使用wrapClient()方法跳过验证
