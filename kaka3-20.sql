/*
Navicat MySQL Data Transfer

Source Server         : 咔咔星球
Source Server Version : 50647
Source Host           : 118.31.4.146:3306
Source Database       : kaka

Target Server Type    : MYSQL
Target Server Version : 50647
File Encoding         : 65001

Date: 2020-03-20 17:42:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for chat_information
-- ----------------------------
DROP TABLE IF EXISTS `chat_information`;
CREATE TABLE `chat_information` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sender_id` int(11) NOT NULL,
  `receiver_id` int(11) NOT NULL,
  `content` varchar(255) NOT NULL,
  `is_read` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chat_information
-- ----------------------------

-- ----------------------------
-- Table structure for prefer_list
-- ----------------------------
DROP TABLE IF EXISTS `prefer_list`;
CREATE TABLE `prefer_list` (
  `user_wx_id` varchar(255) NOT NULL,
  `prefer_user_wx_id` varchar(255) NOT NULL,
  PRIMARY KEY (`user_wx_id`,`prefer_user_wx_id`),
  KEY `perfer_wx_user_ID` (`prefer_user_wx_id`),
  CONSTRAINT `prefer_list_ibfk_1` FOREIGN KEY (`user_wx_id`) REFERENCES `user_info` (`user_wx_id`),
  CONSTRAINT `prefer_list_ibfk_2` FOREIGN KEY (`prefer_user_wx_id`) REFERENCES `user_info` (`user_wx_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of prefer_list
-- ----------------------------
INSERT INTO `prefer_list` VALUES ('oIMDy5NDBX-Kbz_cVDQK9YBGynAw', 'hw');
INSERT INTO `prefer_list` VALUES ('oS1Z55LSNKB6JRV5RkdCeMtoyFfI', 'hw');
INSERT INTO `prefer_list` VALUES ('oIMDy5NDBX-Kbz_cVDQK9YBGynAw', 'Kbz_cVDQK9YBGynAw1');
INSERT INTO `prefer_list` VALUES ('oIMDy5NDBX-Kbz_cVDQK9YBGynAw', 'oIMDy5NDBX-Kbz_cVDQK9YBGynAw');
INSERT INTO `prefer_list` VALUES ('oS1Z55LSNKB6JRV5RkdCeMtoyFfI', 'oIMDy5NDBX-Kbz_cVDQK9YBGynAw');
INSERT INTO `prefer_list` VALUES ('oS1Z55LSNKB6JRV5RkdCeMtoyFfI', 'oS1Z55LSNKB6JRV5RkdCeMtoyFfI');
INSERT INTO `prefer_list` VALUES ('oS1Z55MUe_n04EPMyCBEbwVdgUeg', 'oS1Z55LSNKB6JRV5RkdCeMtoyFfI');
INSERT INTO `prefer_list` VALUES ('oS1Z55LSNKB6JRV5RkdCeMtoyFfI', 'oS1Z55MUe_n04EPMyCBEbwVdgUeg');

-- ----------------------------
-- Table structure for record
-- ----------------------------
DROP TABLE IF EXISTS `record`;
CREATE TABLE `record` (
  `user_wx_id` varchar(255) NOT NULL,
  `record_time` varchar(255) DEFAULT NULL,
  `record_id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) DEFAULT NULL,
  `good_num_count` int(10) unsigned zerofill NOT NULL DEFAULT '0000000000',
  `complain_num_count` int(10) unsigned NOT NULL DEFAULT '0',
  `type1` int(10) NOT NULL DEFAULT '0',
  `type2` int(10) NOT NULL,
  PRIMARY KEY (`record_id`),
  KEY `user_wx_ID` (`user_wx_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of record
-- ----------------------------
INSERT INTO `record` VALUES ('oIMDy5NDBX-Kbz_cVDQK9YBGynAw', '2019/07/05 18:37:06', '1', '我真的好饿', '0000000002', '1', '0', '0');
INSERT INTO `record` VALUES ('oIMDy5NDBX-Kbz_cVDQK9YBGynAw', '2019/07/03 22:11:19', '2', '我也好饿啊', '0000000003', '0', '0', '1');
INSERT INTO `record` VALUES ('oIMDy5NDBX-Kbz_cVDQK9YBGynAw', '2019/07/09 14:44:27', '4', 'incredible', '0000000002', '1', '0', '2');
INSERT INTO `record` VALUES ('Kbz_cVDQK9YBGynAw1', '2019/07/09 17:40:25', '16', '醉后不知天在水，满船清梦压星河', '0000000001', '0', '0', '5');
INSERT INTO `record` VALUES ('oIMDy5NDBX-Kbz_cVDQK9YBGynAw', '2019/07/10 14:40:18', '17', 'aaa', '0000000001', '0', '0', '0');
INSERT INTO `record` VALUES ('oIMDy5NDBX-Kbz_cVDQK9YBGynAw', '2019/07/10 23:53:08', '18', 'hahahha', '0000000000', '0', '0', '1');
INSERT INTO `record` VALUES ('oIMDy5NDBX-Kbz_cVDQK9YBGynAw', '2019/07/11 13:23:51', '27', '啊啊', '0000000000', '0', '0', '2');
INSERT INTO `record` VALUES ('oIMDy5NDBX-Kbz_cVDQK9YBGynAw', '2019/07/12 01:39:51', '28', 'kkk', '0000000000', '1', '0', '3');
INSERT INTO `record` VALUES ('oS1Z55LSNKB6JRV5RkdCeMtoyFfI', '2020/03/15 16:04:33', '37', 'hahahh', '0000000000', '0', '0', '0');
INSERT INTO `record` VALUES ('oS1Z55LSNKB6JRV5RkdCeMtoyFfI', '2020/03/15 16:04:33', '38', 'hjahahahha', '0000000000', '0', '1', '4');
INSERT INTO `record` VALUES ('oS1Z55LSNKB6JRV5RkdCeMtoyFfI', '2020/03/15 17:01:32', '39', '123', '0000000001', '0', '1', '0');
INSERT INTO `record` VALUES ('oS1Z55LSNKB6JRV5RkdCeMtoyFfI', '2020/03/15 18:14:11', '40', 'hahahhahh', '0000000000', '0', '1', '2');
INSERT INTO `record` VALUES ('oS1Z55LSNKB6JRV5RkdCeMtoyFfI', '2020/03/16 00:58:33', '41', 'hhhhhhh', '0000000000', '0', '0', '0');
INSERT INTO `record` VALUES ('oS1Z55LSNKB6JRV5RkdCeMtoyFfI', '2020/03/16 03:34:17', '49', '不对劲啊', '0000000000', '0', '1', '2');
INSERT INTO `record` VALUES ('oS1Z55LSNKB6JRV5RkdCeMtoyFfI', '2020/03/16 03:58:35', '54', '。。。。。怎么还有bug啊', '0000000000', '0', '1', '5');
INSERT INTO `record` VALUES ('oS1Z55LSNKB6JRV5RkdCeMtoyFfI', '2020/03/16 11:29:22', '55', '。。。。', '0000000000', '0', '1', '0');
INSERT INTO `record` VALUES ('oS1Z55MUe_n04EPMyCBEbwVdgUeg', '2020/03/16 11:39:26', '63', '哈喽 大家好', '0000000000', '1', '0', '0');
INSERT INTO `record` VALUES ('oS1Z55MUe_n04EPMyCBEbwVdgUeg', '2020/03/20 17:19:16', '66', '今天写完毕设了吗', '0000000000', '0', '1', '4');
INSERT INTO `record` VALUES ('oS1Z55MUe_n04EPMyCBEbwVdgUeg', '2020/03/20 17:19:16', '67', '今天也很开心，因为又写了1k字', '0000000000', '0', '1', '4');
INSERT INTO `record` VALUES ('oS1Z55LSNKB6JRV5RkdCeMtoyFfI', '2020/03/20 17:39:49', '68', '醉后不知天在水，满船清梦压星河', '0000000000', '0', '0', '0');

-- ----------------------------
-- Table structure for record_complain
-- ----------------------------
DROP TABLE IF EXISTS `record_complain`;
CREATE TABLE `record_complain` (
  `record_id` int(11) NOT NULL,
  `user_wx_id` varchar(255) NOT NULL,
  PRIMARY KEY (`record_id`,`user_wx_id`),
  KEY `record_complain_ibfk_2` (`user_wx_id`),
  CONSTRAINT `record_complain_ibfk_1` FOREIGN KEY (`record_id`) REFERENCES `record` (`record_id`) ON UPDATE CASCADE,
  CONSTRAINT `record_complain_ibfk_2` FOREIGN KEY (`user_wx_id`) REFERENCES `user_info` (`user_wx_id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of record_complain
-- ----------------------------
INSERT INTO `record_complain` VALUES ('1', 'hw');
INSERT INTO `record_complain` VALUES ('4', 'oIMDy5NDBX-Kbz_cVDQK9YBGynAw');
INSERT INTO `record_complain` VALUES ('28', 'oS1Z55LSNKB6JRV5RkdCeMtoyFfI');
INSERT INTO `record_complain` VALUES ('63', 'oS1Z55LSNKB6JRV5RkdCeMtoyFfI');

-- ----------------------------
-- Table structure for record_good
-- ----------------------------
DROP TABLE IF EXISTS `record_good`;
CREATE TABLE `record_good` (
  `record_id` int(11) NOT NULL,
  `user_wx_id` varchar(255) NOT NULL,
  PRIMARY KEY (`record_id`,`user_wx_id`),
  KEY `fk1` (`user_wx_id`),
  CONSTRAINT `fk1` FOREIGN KEY (`user_wx_id`) REFERENCES `user_info` (`user_wx_id`) ON UPDATE CASCADE,
  CONSTRAINT `fk2` FOREIGN KEY (`record_id`) REFERENCES `record` (`record_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of record_good
-- ----------------------------
INSERT INTO `record_good` VALUES ('1', 'hw');
INSERT INTO `record_good` VALUES ('2', 'Kbz_cVDQK9YBGynAw1');
INSERT INTO `record_good` VALUES ('1', 'oIMDy5NDBX-Kbz_cVDQK9YBGynAw');
INSERT INTO `record_good` VALUES ('2', 'oIMDy5NDBX-Kbz_cVDQK9YBGynAw');
INSERT INTO `record_good` VALUES ('4', 'oIMDy5NDBX-Kbz_cVDQK9YBGynAw');
INSERT INTO `record_good` VALUES ('16', 'oIMDy5NDBX-Kbz_cVDQK9YBGynAw');
INSERT INTO `record_good` VALUES ('17', 'oIMDy5NDBX-Kbz_cVDQK9YBGynAw');
INSERT INTO `record_good` VALUES ('2', 'oS1Z55LSNKB6JRV5RkdCeMtoyFfI');
INSERT INTO `record_good` VALUES ('4', 'oS1Z55LSNKB6JRV5RkdCeMtoyFfI');
INSERT INTO `record_good` VALUES ('39', 'oS1Z55LSNKB6JRV5RkdCeMtoyFfI');

-- ----------------------------
-- Table structure for record_term
-- ----------------------------
DROP TABLE IF EXISTS `record_term`;
CREATE TABLE `record_term` (
  `term_id` int(255) NOT NULL AUTO_INCREMENT,
  `user_wx_id` varchar(255) NOT NULL,
  `record_term` int(10) NOT NULL,
  `record_time` varchar(255) NOT NULL,
  `record_day` int(10) NOT NULL,
  `help_count` int(10) DEFAULT '0',
  PRIMARY KEY (`term_id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of record_term
-- ----------------------------
INSERT INTO `record_term` VALUES ('13', 'oIMDy5NDBX-Kbz_cVDQK9YBGynAw', '1', '2019/07/05 17:25:01', '1', '0');
INSERT INTO `record_term` VALUES ('27', 'oIMDy5NDBX-Kbz_cVDQK9YBGynAw', '1', '2019/07/11 23:43:44', '1', '0');
INSERT INTO `record_term` VALUES ('28', 'oIMDy5NDBX-Kbz_cVDQK9YBGynAw', '1', '2019/07/12 01:40:02', '6', '0');
INSERT INTO `record_term` VALUES ('29', 'oIMDy5NDBX-Kbz_cVDQK9YBGynAw', '1', '2019/07/12 01:46:45', '1', '0');
INSERT INTO `record_term` VALUES ('38', 'oS1Z55LSNKB6JRV5RkdCeMtoyFfI', '1', '2020/03/15 16:04:41', '0', '0');
INSERT INTO `record_term` VALUES ('39', 'oS1Z55LSNKB6JRV5RkdCeMtoyFfI', '1', '2020/03/16 00:58:51', '1', '0');
INSERT INTO `record_term` VALUES ('40', 'oS1Z55MUe_n04EPMyCBEbwVdgUeg', '1', '2020/03/16 11:42:32', '0', '0');
INSERT INTO `record_term` VALUES ('44', 'oS1Z55MUe_n04EPMyCBEbwVdgUeg', '1', '2020/03/20 17:20:04', '1', '0');
INSERT INTO `record_term` VALUES ('45', 'oS1Z55LSNKB6JRV5RkdCeMtoyFfI', '1', '2020/3/20/ 16:20', '2', '0');
INSERT INTO `record_term` VALUES ('46', 'oS1Z55LSNKB6JRV5RkdCeMtoyFfI', '1', '2020/03/20 17:18:24', '1', '0');
INSERT INTO `record_term` VALUES ('47', 'oS1Z55LSNKB6JRV5RkdCeMtoyFfI', '1', '2020/03/20 17:18:24', '1', '0');
INSERT INTO `record_term` VALUES ('48', 'oS1Z55LSNKB6JRV5RkdCeMtoyFfI', '1', '2020/03/20 17:40:35', '2', '0');

-- ----------------------------
-- Table structure for together
-- ----------------------------
DROP TABLE IF EXISTS `together`;
CREATE TABLE `together` (
  `user_wx_id` varchar(255) NOT NULL,
  `content` varchar(255) NOT NULL,
  `time` varchar(255) NOT NULL,
  `target_user_wx_id` varchar(255) NOT NULL,
  `together_id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`together_id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of together
-- ----------------------------
INSERT INTO `together` VALUES ('oIMDy5NDBX-Kbz_cVDQK9YBGynAw', 'aaa', '2019/07/09 20:41:47', 'Kbz_cVDQK9YBGynAw1', '12');
INSERT INTO `together` VALUES ('oIMDy5NDBX-Kbz_cVDQK9YBGynAw', '', '2019/07/09 20:41:47', 'oIMDy5NDBX-Kbz_cVDQK9YBGynAw', '13');
INSERT INTO `together` VALUES ('oIMDy5NDBX-Kbz_cVDQK9YBGynAw', 'aaa', '2019/07/09 20:41:47', 'oIMDy5NDBX-Kbz_cVDQK9YBGynAw', '14');
INSERT INTO `together` VALUES ('oIMDy5NDBX-Kbz_cVDQK9YBGynAw', 'aaa', '2019/07/09 22:19:49', 'oIMDy5NDBX-Kbz_cVDQK9YBGynAw', '15');
INSERT INTO `together` VALUES ('oIMDy5NDBX-Kbz_cVDQK9YBGynAw', 'I am a hero\n', '2019/07/10 21:24:55', 'Kbz_cVDQK9YBGynAw1', '16');
INSERT INTO `together` VALUES ('oIMDy5NDBX-Kbz_cVDQK9YBGynAw', 'aa', '2019/07/10 23:57:46', 'hw', '17');
INSERT INTO `together` VALUES ('oS1Z55LSNKB6JRV5RkdCeMtoyFfI', '1231', '2020/03/16 00:56:26', 'hw', '18');
INSERT INTO `together` VALUES ('oS1Z55LSNKB6JRV5RkdCeMtoyFfI', '123213213', '2020/03/16 00:56:26', 'hw', '19');
INSERT INTO `together` VALUES ('oS1Z55LSNKB6JRV5RkdCeMtoyFfI', '1231', '2020/03/16 01:08:19', 'hw', '20');
INSERT INTO `together` VALUES ('oS1Z55LSNKB6JRV5RkdCeMtoyFfI', '123', '2020/03/16 01:08:19', 'hw', '21');
INSERT INTO `together` VALUES ('oS1Z55LSNKB6JRV5RkdCeMtoyFfI', '哈哈哈', '2020/03/16 03:20:50', 'oIMDy5NDBX-Kbz_cVDQK9YBGynAw', '22');
INSERT INTO `together` VALUES ('oS1Z55LSNKB6JRV5RkdCeMtoyFfI', 'dasdsad', '2020/03/16 03:55:05', 'hw', '23');
INSERT INTO `together` VALUES ('oS1Z55MUe_n04EPMyCBEbwVdgUeg', '弟弟', '2020/03/16 11:39:26', 'oS1Z55LSNKB6JRV5RkdCeMtoyFfI', '24');
INSERT INTO `together` VALUES ('oS1Z55MUe_n04EPMyCBEbwVdgUeg', '弟弟是一个平平无奇的代码小天才', '2020/03/20 17:19:16', 'oS1Z55LSNKB6JRV5RkdCeMtoyFfI', '25');

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `user_wx_id` varchar(255) NOT NULL,
  `user_image_url` varchar(255) NOT NULL,
  `user_name` varchar(255) NOT NULL,
  `estate` int(11) NOT NULL DEFAULT '1400',
  PRIMARY KEY (`user_wx_id`),
  KEY `user_wx_ID` (`user_wx_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('', 'https://wx.qlogo.cn/mmopen/vi_32/DYAIOgq83equAFDGkuwqUwUgtp2xWWzCdliatAzDNYMYlZqF92YDXicibnIa1rKVFllLDB5h2vurDZGY96RfU32TQ/132', 'lianlian', '1400');
INSERT INTO `user_info` VALUES ('hw', 'https://imgsrc.baidu.com/baike/pic/item/6c224f4a20a44623dd05c9039622720e0df3d780.jpg', 'hw', '1400');
INSERT INTO `user_info` VALUES ('Kbz_cVDQK9YBGynAw1', 'https://bkimg.cdn.bcebos.com/pic/7dd98d1001e93901cb02303771ec54e736d196b3?x-bce-process=image/watermark,g_7,image_d2F0ZXIvYmFpa2U5Mg==,xp_5,yp_5', 'lianlian1', '1400');
INSERT INTO `user_info` VALUES ('oIMDy5NDBX-Kbz_cVDQK9YBGynAw', 'https://wx.qlogo.cn/mmopen/vi_32/DYAIOgq83eoAxnKBukIYibdNT2loVR17GvMvYaTf8Aqxp6sUI8qLiaJPNhcibrUDhCK8ChWx2dBYKxFia6j9TLibJiaA/132', 'lianlian2', '1300');
INSERT INTO `user_info` VALUES ('oS1Z55LSNKB6JRV5RkdCeMtoyFfI', 'https://wx.qlogo.cn/mmopen/vi_32/DYAIOgq83equAFDGkuwqUwUgtp2xWWzCdliatAzDNYMYlZqF92YDXicibnIa1rKVFllLDB5h2vurDZGY96RfU32TQ/132', 'lianlian', '1500');
INSERT INTO `user_info` VALUES ('oS1Z55MUe_n04EPMyCBEbwVdgUeg', 'https://wx.qlogo.cn/mmopen/vi_32/MxNbUow3z8Qq6DU4b7BleWkf3cLVmvJWwgXRrHxCgt2K3mWsFP7lq4RH8EUarujMNjNjiaCRsZxsqNTLt7ATuYQ/132', 'γ', '1000');
INSERT INTO `user_info` VALUES ('sdadasd', 'https://imgsrc.baidu.com/baike/pic/item/6c224f4a20a44623dd05c9039622720e0df3d780.jpg', 'VectorBall', '1400');
DROP TRIGGER IF EXISTS `record_estate`;
DELIMITER ;;
CREATE TRIGGER `record_estate` AFTER INSERT ON `record` FOR EACH ROW Begin

set @day1=(
select DATEDIFF( MAX(c.t),MIN(c.t))
from  
(select str_to_date(record_time,'%Y/%m/%d %H:%i:%s') t ,record_id
from record r
WHERE r.user_wx_id=new.user_wx_id and r.type1=0
)c);

update user_info set estate = (1000+@day1*100)-500*(@day1-(select Count(*) 
from record_term r
WHERE r.user_wx_id=new.user_wx_id
))
WHERE user_wx_id=new.user_wx_id;
end
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `tg1`;
DELIMITER ;;
CREATE TRIGGER `tg1` AFTER INSERT ON `record_complain` FOR EACH ROW BEGIN 
 update record set record.complain_num_count = record.complain_num_count+1 where record.record_ID=new.record_ID ;
end
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `tg2`;
DELIMITER ;;
CREATE TRIGGER `tg2` AFTER DELETE ON `record_complain` FOR EACH ROW BEGIN 
 update record set record.complain_num_count = record.complain_num_count-1 where record.record_ID=old.record_ID ;
end
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `trigger1`;
DELIMITER ;;
CREATE TRIGGER `trigger1` AFTER INSERT ON `record_good` FOR EACH ROW BEGIN 
 update record set record.good_num_count = record.good_num_count+1 where record.record_ID=new.record_ID ;
end
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `trigger2`;
DELIMITER ;;
CREATE TRIGGER `trigger2` AFTER DELETE ON `record_good` FOR EACH ROW BEGIN 
 update record set record.good_num_count = record.good_num_count-1 where record.record_ID=old.record_ID ;
end
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `estate_change`;
DELIMITER ;;
CREATE TRIGGER `estate_change` AFTER INSERT ON `record_term` FOR EACH ROW Begin

set @day1=(
select DATEDIFF( MAX(c.t),MIN(c.t))
from  
(select str_to_date(record_time,'%Y/%m/%d %H:%i:%s') t ,record_id
from record r
WHERE r.user_wx_id=new.user_wx_id and r.type1=0
)c);

update user_info set estate = (1000+@day1*100)-500*(@day1-(select Count(*) 
from record_term r
WHERE r.user_wx_id=new.user_wx_id
))
WHERE user_wx_id=new.user_wx_id;
end
;;
DELIMITER ;
