# Kaka星球后端说明

## 1. 数据库说明

数据库内容：

> 数据中的所有命名方式都是使用“_”来实现，列名、表名中没有大写字符
>
> 尤其注意，数据库中的所有“ID”都应该写为小写，如:**user_wx_id**,不能写成user_wx_Id或者wx_user_ID

<img src="\picture_md\1583988898029.png" alt="1583988898029" style="zoom:80%;" />

* chat_information:这个表保留，未使用到（聊天功能）
* prefer_list：关注用户
* record_complain：用户举报，新增一条complain数据
* record_good：用户点赞的记录
* record_term：打卡的周期
* together：（一起打卡的记录）
* user_info：个人信息

## 2. 具体后台需求

### 2.1 index界面：

* 请求1：微信小程序请求服务端“superadmin/getIndexShowRecord”，服务端返回json形式数据

  ```js
  wx.request({
        url: wx.getStorageSync('server_url') +'/getIndexShowRecord',
        method:'get',
        data:{
          browser: wx.getStorageSync('openid'),
        }
  ```

  * 数据描述：

    将userInfo表和record表联合查询后Select*返回前端

* 请求2：“superadmin/addUserInfo”，完成服务器中对新用户的添加

```js
wx.request({
      url: wx.getStorageSync('server_url') + '/addUserInfo',
      method: 'post',
      data: {
        userWxId: wx.getStorageSync('openid'),
        userImageUrl: wx.getStorageSync('user_head_image'),
        userName: wx.getStorageSync('user_name'),
        estate: 1400,
      }
```

