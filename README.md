# Genshin_id_Serach
查询原神游戏账号信息（国服和B服）   附加米游社的几条常用API

这是一个查看对方是否拿网图P过的图忽悠你的小程序，也可以用来查看游戏中来自己世界的对方信息。

使用的是java语言编写，使用Eclipse中WindowBuilder插件完成可视化过程，所以JFrame中写的挺乱。
主要使用如下两个米游社API:

API1:https://api-takumi.mihoyo.com/game_record/genshin/api/spiralAbyss?schedule_type=1&server=(所在服,如cn_gf01或cn_qd01)&role_id=(游戏ID)
可获取到该id全部角色和活跃天数宝箱等信息

API2:https://api-takumi.mihoyo.com/game_record/genshin/api/character
发送时附带json{"character_ids":[角色id,角色id,角色id,..........],"role_id":"游戏ID","server":"所在服"}

在访问以上API时，协议头需要加入一些细节，除了Cookies，另一个就是DS,可以参考Github中米游社签到类的项目中的DS制作方法
在访问API2时，使用java的HttpPost会报peer not authenticated，所以使用wrapClient()方法跳过验证

API3:https://api-takumi.mihoyo.com/game_record/genshin/api/spiralAbyss?schedule_type=(1为本期深渊，2为上期深渊)&server=(所在服)&role_id=(游戏ID)
//深渊信息，其中包含所打的深渊层基本信息，和一些排名数据(如使用角色次数、角色元素爆发数、角色抗伤等排名数据)

API4:https://hk4e-api.mihoyo.com/event/ys_ledger/monthDetail?page=(页数)&month=(月份，仅支持查询近三个月)&limit=(一次的返回信息数量)&type=(1为原石,2为摩拉)&bind_uid=(游戏ID)&bind_region=(所在服)&bbs_presentation_style=fullscreen&bbs_auth_required=true&utm_source=bbs&utm_medium=mys&utm_campaign=icon
其中参数bbs_auth_required、utm_source、utm_medium、utm_campaign应该可省略
//原神账号摩拉原石获取记录(近三个月),仅限Cookie本身账号，其他账号会提示Invalid schedule type

API5:https://api-takumi.mihoyo.com/game_record/card/wapi/getGameRecordCard?uid=(米游社ID)
可通过该接口，通过米游社UID获得对应原神UID和基本信息，若对方在米游社设置隐藏，则返回结果List为空

