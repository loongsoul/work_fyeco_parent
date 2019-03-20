/*
 Navicat Premium Data Transfer

 Source Server         : dev-172.16.0.79-npc
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : 172.16.0.79:3306
 Source Schema         : npc

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 08/03/2019 15:21:08
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '资源路径',
  `type` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '资源类型',
  `url` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '点击后前往的地址',
  `parent_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '父编号',
  `parent_ids` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '父编号列表',
  `permission` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限字符串',
  `isshow` tinyint(1) NULL DEFAULT 0 COMMENT '是否显示',
  `sort` int(5) NULL DEFAULT NULL COMMENT '排序',
  `menu_icon` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图标',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '摘要',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_date` datetime(0) NULL DEFAULT NULL,
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `update_date` datetime(0) NULL DEFAULT NULL,
  `del_flag` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_sys_resource_parent_id`(`parent_id`) USING BTREE,
  INDEX `idx_sys_resource_parent_ids`(`parent_ids`(255)) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '菜单表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('01a54e7dd3914f87a2ce4bbbdf997d05', '岭南通&amp;TSM平台', NULL, 'view/accounttsm', 'ff15b194aa2f4cb7ae966b2b0c4701b1', 'd5405c4ade964c4b8b0fe965a2f921fe/ff15b194aa2f4cb7ae966b2b0c4701b1/', 'view:accounttsm', 1, 1, 'fa-chrome', '岭南通&amp;TSM平台', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-09-12 16:41:46', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-11-16 14:58:22', '0');
INSERT INTO `sys_menu` VALUES ('055662f18bc24a239a003aa8349cc0ee', '支付卡券-卡券平台-订单卡券', NULL, 'view/paycouponorder', 'eb51027836494fc794be9a9e69e74b16', 'd5405c4ade964c4b8b0fe965a2f921fe/eb51027836494fc794be9a9e69e74b16/', 'view:paycouponorder', 1, 2, '', '支付卡券-卡券平台-订单卡券', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-11-16 14:53:35', NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('06403a6ef78d4cd7a7c6dcfedf72f058', '内部对账汇总', NULL, 'gather/accgatherinnerresult', 'bb33277c6c81434383b702cac1cc9bd2', 'bb33277c6c81434383b702cac1cc9bd2/', 'gather', 1, 1, 'fa-calendar-check-o', '', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-03-23 14:23:23', '4028ea815a3d2a8c015a3d2f8d2a0002', '2019-01-09 20:17:12', '0');
INSERT INTO `sys_menu` VALUES ('0f9a859cb54045338c9219b515ee59b3', 'TSM系统-订单', NULL, 'account/acctsm', 'ee384a649a2e4161b0104e8923b34fff', 'ee384a649a2e4161b0104e8923b34fff/', 'account:acctsm', 1, 4, 'fa-hourglass-end', 'TSM系统-订单', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-03-26 15:03:06', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-12-27 10:00:51', '0');
INSERT INTO `sys_menu` VALUES ('11111', '处理更新绑定问题updateSunTreeParentIds', NULL, NULL, '11111', '150100', NULL, 0, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_menu` VALUES ('1932895b3eb84438b94d09a4bd27a28e', '对账差错', NULL, '', '79657ad047a640769a84a75ac1f094d8', '79657ad047a640769a84a75ac1f094d8/', '', 1, 7, '', '对账差错', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-10-19 10:30:26', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-10-26 10:24:06', '0');
INSERT INTO `sys_menu` VALUES ('1b2d723088434ceb8317d42309d5cc75', 'TSM.通卡', NULL, 'account/acctsmlingnanpasserror', '1932895b3eb84438b94d09a4bd27a28e', '79657ad047a640769a84a75ac1f094d8/1932895b3eb84438b94d09a4bd27a28e/', 'account:acctsmlingnanpasserror', 1, 5, '', 'TSM.通卡.差错', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-10-19 11:52:40', NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('1b3b0377131f498d952aa9b50eca210b', '岭南通结算', NULL, 'view/viewinstlingnanpasstsm', '55266f7aead2471a9166cf31daa6630a', 'd5405c4ade964c4b8b0fe965a2f921fe/55266f7aead2471a9166cf31daa6630a/', 'view:viewinstlingnanpasstsm', 1, 2, '', '岭南通结算', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-09-12 10:18:14', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-11-16 14:36:55', '0');
INSERT INTO `sys_menu` VALUES ('27e433c8d0be41d9912a6a1780664685', '支付订单', NULL, 'account/accorderpay', '3a9c31ee7307407796baeba5233d5885', 'ee384a649a2e4161b0104e8923b34fff/3a9c31ee7307407796baeba5233d5885/', 'account:accorderpay', 1, 2, 'fa-hourglass-end', '支付订单', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-03-26 14:48:33', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-12-27 10:01:57', '0');
INSERT INTO `sys_menu` VALUES ('2a0399450a7e420d9f873ae4e3ee64da', '卡券.支付', NULL, 'account/acccouponpayerror', '1932895b3eb84438b94d09a4bd27a28e', '79657ad047a640769a84a75ac1f094d8/1932895b3eb84438b94d09a4bd27a28e/', 'account:acccouponpayerror', 1, 1, '', '卡券.支付.差错', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-10-19 11:08:19', NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('2df133fed4cf45bda23f4d893f7aa0ad', '总订单', NULL, 'account/accorderinfo', '3a9c31ee7307407796baeba5233d5885', 'ee384a649a2e4161b0104e8923b34fff/3a9c31ee7307407796baeba5233d5885/', 'account:accorderinfo', 1, 1, 'fa-hourglass', '总订单', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-03-26 14:48:13', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-12-27 10:01:45', '0');
INSERT INTO `sys_menu` VALUES ('31811ebfb6064ee8b882e52d88e2c552', 'MCC管理', NULL, 'mccmanager/mcc', 'dac28aa045b843649f642fbdb165f40b', 'dac28aa045b843649f642fbdb165f40b/', 'mccmanager:list', 1, 1, 'fa-optin-monster', '', '4028ea815a3d2a8c015a3d2f8d2a0002', '2017-12-05 15:06:34', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-03-15 14:19:27', '0');
INSERT INTO `sys_menu` VALUES ('36caab41a4894ef896c967f6b45d9e6a', '文件管理', NULL, 'filemanager/filedealinfo', '6ea5789de7d54f38a794ce6c90af90d8', '6ea5789de7d54f38a794ce6c90af90d8/', 'filemanager:filedealinfo', 1, 1, 'fa-file-text', '文件管理', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-03-26 15:39:40', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-08-17 17:06:46', '0');
INSERT INTO `sys_menu` VALUES ('36ed50e6c8e54af8825fda6caa3c1bac', '清算汇总', NULL, '', '4a0681c0707946b6a4d8eb84cbd4a51e', '4a0681c0707946b6a4d8eb84cbd4a51e/', '', 1, NULL, 'fa-bar-chart', '', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-03-26 15:26:17', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-03-26 15:27:02', '0');
INSERT INTO `sys_menu` VALUES ('3a9c31ee7307407796baeba5233d5885', '订单系统', NULL, '', 'ee384a649a2e4161b0104e8923b34fff', 'ee384a649a2e4161b0104e8923b34fff/', 'justgo-order', 1, 1, 'fa-chrome', '订单系统', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-07-30 19:02:53', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-12-27 09:59:48', '0');
INSERT INTO `sys_menu` VALUES ('3ff3e623ebef45c8ae9b608b37d1a022', '卡劵.支付', NULL, 'account/acccouponpayresult', '79657ad047a640769a84a75ac1f094d8', '79657ad047a640769a84a75ac1f094d8/', 'account:acccouponpayresult', 1, 1, '', '', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-03-26 14:54:07', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-08-01 17:03:37', '0');
INSERT INTO `sys_menu` VALUES ('40281e815beda90f015bedcf7102000f', '定时任务', NULL, 'task/schedulejob', '40288ab85cf8276b015cf82debcb005b', '40288ab85cf8276b015cf82debcb005b/', 'task:schedulejob:list', 1, 4, '', '', NULL, NULL, '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-03-26 14:12:47', '0');
INSERT INTO `sys_menu` VALUES ('40281e815c097acf015c097bcaea0000', '用户最后在线情况', NULL, 'sys/lastOnline', '4028ea815a701416015a7075b4f9001f', '4028ea815a701416015a7075b4f9001f/', 'sys:userlastonline', 1, 2, '', '用户最后在线情况', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40281e815c547c32015c54a21e260038', '生成案列', NULL, '', '4028ea815a78e9e6015a78f1dc9d0000', '4028ea815a78e9e6015a78f1dc9d0000/', '', 1, 3, '', '生成案列', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40281e815c54d147015c54daf16c0001', '系统日志', NULL, 'sys/log', '4028ea815a701416015a7075b4f9001f', '4028ea815a701416015a7075b4f9001f/', 'sys:log', 1, 6, 'fa-book', '系统日志', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40281e815c580ea3015c58c8635d0037', '测试单表', NULL, 'test/singletable', '40281e815c547c32015c54a21e260038', '4028ea815a78e9e6015a78f1dc9d0000/40281e815c547c32015c54a21e260038/', 'test:singletable', 1, 1, '', '', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40281e815c880c25015c880d29870001', '短信发送', NULL, 'sms/send/sms', '40288ab85c8593cd015c859f47960016', '40288ab85c8593cd015c859f47960016/', 'sms:send', 1, 3, '', '短信发送', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40281e815c8f3512015c8f41cea7001b', '发送日志', NULL, 'email/emailsendlog', '40288ab85bea9452015beaa7f25a0000', '40288ab85bea9452015beaa7f25a0000/', 'email:emailsendlog', 1, 4, '', '发送日志', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40281e815c8f3512015c8f4233fc001c', '邮件模版', NULL, 'email/emailtemplate', '40288ab85bea9452015beaa7f25a0000', '40288ab85bea9452015beaa7f25a0000/', 'email:emailtemplate', 1, 3, '', '模板配置', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40281e815c8f3512015c8f5cc7220040', '邮件发送', NULL, 'email/send/email', '40288ab85bea9452015beaa7f25a0000', '40288ab85bea9452015beaa7f25a0000/', 'email:send', 1, 2, '', '', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40281e815c912406015c9149f7b80044', '通知公告', NULL, '', '40281e815c912406015c914a1bc30045', '40281e815c912406015c9149f7b80044/40281e815c912406015c914a1bc30045/40281e815c912406015c9149f7b80044/40281e815c912406015c914a1bc30045/', '', 1, 5, 'fa-television', '', NULL, NULL, '4028ea815a3d2a8c015a3d2f8d2a0002', '2017-09-20 10:20:14', '0');
INSERT INTO `sys_menu` VALUES ('40281e815c912406015c914a1bc30045', '通知公告', NULL, 'oa/oanotification', '40281e815c912406015c9149f7b80044', '40281e815c912406015c9149f7b80044/40281e815c912406015c914a1bc30045/40281e815c912406015c9149f7b80044/', 'oa:oanotification', 1, 1, '', '', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40281e815cef1f76015cef268ff0000e', '测试树', NULL, 'test/testtree', '40281e815c547c32015c54a21e260038', '4028ea815a78e9e6015a78f1dc9d0000/40281e815c547c32015c54a21e260038/', 'test:testtree', 1, 1, '', '测试树', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40288ab85a5eecc6015a5ef22ad80001', '系统设置', NULL, '', NULL, NULL, '', 1, 8, 'fa-gear', '', NULL, NULL, '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-07-30 18:55:39', '0');
INSERT INTO `sys_menu` VALUES ('40288ab85a5eecc6015a5ef6ce870002', '用户管理', NULL, 'sys/user', '40288ab85a5eecc6015a5ef22ad80001', '40288ab85a5eecc6015a5ef22ad80001/', 'sys:user:list', 1, 1, 'fa-tv', 'sdfdsfsdfsdfsdfsdfsf', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40288ab85a5eecc6015a5ef8f2890003', '部门管理', NULL, 'sys/organization', '40288ab85a5eecc6015a5ef22ad80001', '40288ab85a5eecc6015a5ef22ad80001/', 'sys:organization:list', 1, 2, 'fa-balance-scale', '', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40288ab85a5eecc6015a5ef95c700004', '角色管理', NULL, 'sys/role', '40288ab85a5eecc6015a5ef22ad80001', '40288ab85a5eecc6015a5ef22ad80001/', 'sys:role:list', 1, 3, 'fa-amazon', '', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40288ab85a5eecc6015a5ef9f6160005', '菜单管理', NULL, 'sys/menu', '40288ab85a5eecc6015a5ef22ad80001', '40288ab85a5eecc6015a5ef22ad80001/', 'sys:menu:list', 1, 4, 'fa-balance-scale', '', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40288ab85a5eecc6015a5efaa75d0006', '数据字典', NULL, 'sys/dict/group', '40288ab85a5eecc6015a5ef22ad80001', '40288ab85a5eecc6015a5ef22ad80001/', 'sys:dict:list', 1, 5, 'fa-amazon', '', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40288ab85b604adf015b605023a70000', '在线用户', NULL, 'sys/online', '4028ea815a701416015a7075b4f9001f', '4028ea815a701416015a7075b4f9001f/', 'sys:online:list', 1, 1, '', '在线用户', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40288ab85bea9452015beaa7f25a0000', '邮箱设置', NULL, '', NULL, NULL, '', 0, 12, 'fa-envelope', '', NULL, NULL, '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-07-30 18:56:41', '0');
INSERT INTO `sys_menu` VALUES ('40288ab85bea9452015beaa846180001', '参数设置', NULL, 'sys/setting/email', '40288ab85bea9452015beaa7f25a0000', '40288ab85bea9452015beaa7f25a0000/', 'sys:setting:email', 1, NULL, '', '', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40288ab85bea9452015beaa9e7a70002', '参数配置', NULL, 'sys/setting/sms', '40288ab85c8593cd015c859f47960016', '40288ab85c8593cd015c859f47960016/', 'sys:setting:sms', 1, 1, '', '', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40288ab85befd65a015bf088333a0015', '多数据源管理', NULL, 'sys/datasource', '40288ab85cf8276b015cf82debcb005b', '40288ab85cf8276b015cf82debcb005b/', 'sys:datasource:list', 1, 5, '', '动态数据源', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40288ab85c1ae76c015c1b12b68a0000', '代码案例', NULL, '', NULL, NULL, '', 1, 13, 'fa-code', '', NULL, NULL, '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-07-30 18:56:54', '0');
INSERT INTO `sys_menu` VALUES ('40288ab85c1ae76c015c1b1316680001', '编辑器', NULL, 'demo/form/editor', '40288ab85c1ae76c015c1b12b68a0000', '40288ab85c1ae76c015c1b12b68a0000/', '', 1, 1, '', '', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40288ab85c1e2442015c1e3246b70000', '文件上传', NULL, 'demo/form/upload', '40288ab85c1ae76c015c1b12b68a0000', '40288ab85c1ae76c015c1b12b68a0000/', '', 1, 2, '', '', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40288ab85c33548d015c33cdc5a600f3', '附件信息', NULL, 'sys/attachment', '4028ea815a701416015a7075b4f9001f', '4028ea815a701416015a7075b4f9001f/', 'sys:attachment:list', 1, 5, '', '', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40288ab85c3df6b7015c3e3d1e770000', '搜索自动补全', NULL, 'demo/form/combox', '40288ab85c1ae76c015c1b12b68a0000', '40288ab85c1ae76c015c1b12b68a0000/', '', 1, 3, 'fa-500px', '测试菜单', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40288ab85c8593cd015c859fa3240017', '短信模版', NULL, 'sms/smstemplate', '40288ab85c8593cd015c859f47960016', '40288ab85c8593cd015c859f47960016/', 'sms:smstemplate', 1, 3, '', '短信模版', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40288ab85c85fa54015c860cee2e0023', '发送日志', NULL, 'sms/smssendlog', '40288ab85c8593cd015c859f47960016', '40288ab85c8593cd015c859f47960016/', 'sms:smssendlog', 1, 4, '', '短信发送日志', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40288ab85c9eeb5c015c9f4d1f8e0000', '统计报表', NULL, '', NULL, NULL, '', 1, 10, 'fa-bar-chart', '', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40288ab85c9eeb5c015c9f4e1cd00001', '折线图', NULL, '/charts/echarts/chart/line', '40288ab85c9eeb5c015c9f4d1f8e0000', '40288ab85c9eeb5c015c9f4d1f8e0000/', '', 1, 1, '', '', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40288ab85c9eeb5c015c9f5fa02e002a', '柱状图', NULL, '/charts/echarts/chart/bar', '40288ab85c9eeb5c015c9f4d1f8e0000', '40288ab85c9eeb5c015c9f4d1f8e0000/', '', 1, 2, '', '', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40288ab85c9eeb5c015c9f626f58002d', '漏斗图', NULL, '/charts/echarts/chart/funnel', '40288ab85c9eeb5c015c9f4d1f8e0000', '40288ab85c9eeb5c015c9f4d1f8e0000/', '', 1, 5, '', '', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40288ab85c9eeb5c015c9f62e726002e', '仪表盘', NULL, '/charts/echarts/chart/gauge', '40288ab85c9eeb5c015c9f4d1f8e0000', '40288ab85c9eeb5c015c9f4d1f8e0000/', '', 1, 6, '', '', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40288ab85c9eeb5c015c9f6390fd002f', 'K线图', NULL, '/charts/echarts/chart/k', '40288ab85c9eeb5c015c9f4d1f8e0000', '40288ab85c9eeb5c015c9f4d1f8e0000/', '', 1, 7, '', '', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40288ab85c9eeb5c015c9f6572630030', '饼状图', NULL, '/charts/echarts/chart/pie', '40288ab85c9eeb5c015c9f4d1f8e0000', '40288ab85c9eeb5c015c9f4d1f8e0000/', '', 1, 7, '', '', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40288ab85c9eeb5c015c9f65e3a50031', '雷达图', NULL, '/charts/echarts/chart/radar', '40288ab85c9eeb5c015c9f4d1f8e0000', '40288ab85c9eeb5c015c9f4d1f8e0000/', '', 1, 9, '', '', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40288ab85c9eeb5c015c9f672f2e0032', '散点图', NULL, '/charts/echarts/chart/scatter', '40288ab85c9eeb5c015c9f4d1f8e0000', '40288ab85c9eeb5c015c9f4d1f8e0000/', '', 1, 9, '', '', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40288ab85c9eeb5c015c9f9694480064', '关系图', NULL, '/charts/echarts/chart/circular', '40288ab85c9eeb5c015c9f4d1f8e0000', '40288ab85c9eeb5c015c9f4d1f8e0000/', '', 1, 11, '', '', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40288ab85cf81b04015cf8213da10002', '一对多', NULL, 'test/testordermain', '40281e815c547c32015c54a21e260038', '4028ea815a78e9e6015a78f1dc9d0000/40281e815c547c32015c54a21e260038/', 'test:testordermain', 1, 1, '', '', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('40288ab85cf8276b015cf82debcb005b', '任务管理', NULL, '', NULL, NULL, '', 1, 9, 'fa-binoculars', '', NULL, NULL, '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-07-30 18:56:01', '0');
INSERT INTO `sys_menu` VALUES ('4028ea815a701416015a7075b4f9001f', '系统监控', NULL, '', NULL, NULL, '', 1, 10, 'fa-video-camera', '', NULL, NULL, '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-07-30 18:56:18', '0');
INSERT INTO `sys_menu` VALUES ('4028ea815a701416015a70766a7a0020', '数据库监控', NULL, 'monitor/druid', '4028ea815a701416015a7075b4f9001f', '4028ea815a701416015a7075b4f9001f/', 'monitor:druid:index', 1, 3, '', '', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('4028ea815a78e9e6015a78f1dc9d0000', '代码生成器', NULL, '', NULL, NULL, '', 1, 11, 'fa-file-code-o', '', NULL, NULL, '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-07-30 18:56:28', '0');
INSERT INTO `sys_menu` VALUES ('4028ea815a78e9e6015a78f35cbe0001', '表单配置', NULL, 'codegen/table', '4028ea815a78e9e6015a78f1dc9d0000', '4028ea815a78e9e6015a78f1dc9d0000/', 'codegen:table:list', 1, 1, '', '', NULL, NULL, NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('43f3a01e53a448d6b2e6f76224ff856a', '资金划拨', NULL, '', '4a0681c0707946b6a4d8eb84cbd4a51e', '4a0681c0707946b6a4d8eb84cbd4a51e/', '', 0, NULL, 'fa-chrome', '', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-03-26 15:28:22', NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('48fd83e1fcf1470ab253a096ecf441c6', '通卡订单', NULL, 'account/publicaccesscardori', 'ee384a649a2e4161b0104e8923b34fff', 'ee384a649a2e4161b0104e8923b34fff/', 'account:publicaccesscardori', 1, 7, '', '通卡订单', '4028ea815a3d2a8c015a3d2f8d2a0002', '2019-01-09 15:09:06', NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('4a0681c0707946b6a4d8eb84cbd4a51e', '清算管理', NULL, '', NULL, NULL, '', 1, 6, 'fa-calculator', '', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-03-26 15:24:59', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-07-30 18:54:18', '0');
INSERT INTO `sys_menu` VALUES ('4b3bdb0513654b389f8b8ec1837bd4a1', '订单.支付', NULL, 'account/accorderpayresult', '79657ad047a640769a84a75ac1f094d8', '79657ad047a640769a84a75ac1f094d8/', 'account:accorderpayresult', 1, 2, 'fa-calendar-check-o', '', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-03-26 14:52:26', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-08-01 17:03:49', '0');
INSERT INTO `sys_menu` VALUES ('4e03ad23e9c144f5af0e02454d1d15f9', '内部汇总差错', NULL, 'account/accgatherinnererror', 'bb33277c6c81434383b702cac1cc9bd2', 'bb33277c6c81434383b702cac1cc9bd2/', 'account:accgatherinnererror', 1, 4, '', '内部汇总差错', '4028ea815a3d2a8c015a3d2f8d2a0002', '2019-01-09 16:04:30', '4028ea815a3d2a8c015a3d2f8d2a0002', '2019-01-09 20:15:12', '0');
INSERT INTO `sys_menu` VALUES ('55266f7aead2471a9166cf31daa6630a', '入网机构结算', NULL, '', 'd5405c4ade964c4b8b0fe965a2f921fe', 'd5405c4ade964c4b8b0fe965a2f921fe/', '', 1, 2, '', '入网机构结算', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-11-16 14:27:22', NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('61080096bbd4442484d70d423b35fc73', '汇总差错', NULL, 'account/accgathererror', 'bb33277c6c81434383b702cac1cc9bd2', 'bb33277c6c81434383b702cac1cc9bd2/', 'account:accgathererror', 1, 3, '', '汇总差错', '4028ea815a3d2a8c015a3d2f8d2a0002', '2019-01-09 16:01:51', NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('63aa6b26bf8d45ed85c44ba813d13207', 'TSM.通卡', NULL, 'account/acctsmjstresult', '79657ad047a640769a84a75ac1f094d8', '79657ad047a640769a84a75ac1f094d8/', 'account:acctsmjstresult', 1, 5, 'fa-calendar-check-o', '', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-03-26 14:53:49', '4028ea815a3d2a8c015a3d2f8d2a0002', '2019-01-09 20:45:10', '0');
INSERT INTO `sys_menu` VALUES ('66f8742d88c24ef3b696b4a277d20c1f', '资金渠道入款', NULL, 'view/channelamt', 'c48cf56c8d87469e91f3b526e0ea4d9c', 'd5405c4ade964c4b8b0fe965a2f921fe/c48cf56c8d87469e91f3b526e0ea4d9c/', 'view:channelamt', 1, 1, '', '资金渠道入款', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-11-16 14:26:34', NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('69036d93cf994f518c22b7a2e1856cd1', '对账汇总', NULL, 'account/accgatherresult', 'bb33277c6c81434383b702cac1cc9bd2', 'bb33277c6c81434383b702cac1cc9bd2/', 'account:accgatherresult', 1, 2, '', '', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-04-25 16:21:18', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-08-01 20:12:15', '0');
INSERT INTO `sys_menu` VALUES ('6ea5789de7d54f38a794ce6c90af90d8', '文件管理', NULL, '', NULL, NULL, '', 1, 1, 'fa-file-zip-o', '', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-03-26 15:37:36', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-07-30 18:53:45', '0');
INSERT INTO `sys_menu` VALUES ('7945798d5358440b990c0ef5614e232a', '清算明细', NULL, '', '4a0681c0707946b6a4d8eb84cbd4a51e', '4a0681c0707946b6a4d8eb84cbd4a51e/', '', 1, NULL, 'fa-bars', '', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-03-26 15:26:43', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-03-26 15:27:14', '0');
INSERT INTO `sys_menu` VALUES ('79657ad047a640769a84a75ac1f094d8', '对账结果', NULL, '', NULL, NULL, '', 1, 3, 'fa-map-o', '报表管理', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-03-23 14:20:21', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-04-08 16:29:19', '0');
INSERT INTO `sys_menu` VALUES ('9216b84cbefa4fd9b4fa7951d07a0a3c', '订单.卡劵', NULL, 'account/accordercouponresult', '79657ad047a640769a84a75ac1f094d8', '79657ad047a640769a84a75ac1f094d8/', 'account:accordercouponresult', 1, 3, 'fa-gg', '订单系统卡劵订单与卡劵系统订单对账', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-03-26 14:37:41', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-08-01 17:04:01', '0');
INSERT INTO `sys_menu` VALUES ('9847535033424e30bb202178d5d8652a', '卡劵订单', NULL, 'account/accordercoupon', '3a9c31ee7307407796baeba5233d5885', 'ee384a649a2e4161b0104e8923b34fff/3a9c31ee7307407796baeba5233d5885/', 'account:accordercoupon', 1, 4, 'fa-hourglass-3', '卡劵订单', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-03-26 14:49:38', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-12-27 10:03:38', '0');
INSERT INTO `sys_menu` VALUES ('a7b539fc84f44e81a85b4cc8c260bb2d', '订单TSM&amp;TSM', NULL, 'view/ordertsmpayment', 'ff15b194aa2f4cb7ae966b2b0c4701b1', 'd5405c4ade964c4b8b0fe965a2f921fe/ff15b194aa2f4cb7ae966b2b0c4701b1/', 'view:ordertsmpayment', 1, 3, 'fa-gg', '统计TSM与订单TSM出款', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-09-20 18:03:27', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-11-16 15:11:00', '0');
INSERT INTO `sys_menu` VALUES ('ac42264dfbf14cb9b83e5769339be518', '订单.卡券', NULL, 'account/accordercouponerror', '1932895b3eb84438b94d09a4bd27a28e', '79657ad047a640769a84a75ac1f094d8/1932895b3eb84438b94d09a4bd27a28e/', 'account:accordercouponerror', 1, 2, '', '订单.卡券.差错', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-10-19 11:19:11', NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('bb33277c6c81434383b702cac1cc9bd2', '结果汇总', NULL, '', NULL, NULL, '', 1, 4, 'fa-area-chart', '', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-04-25 16:18:50', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-04-25 16:19:10', '0');
INSERT INTO `sys_menu` VALUES ('bd2c172d7cf74f2192c8691bc8ef822b', '结算汇总', NULL, 'view/viewinstitutionstatistic', '55266f7aead2471a9166cf31daa6630a', 'd5405c4ade964c4b8b0fe965a2f921fe/55266f7aead2471a9166cf31daa6630a/', 'view:viewinstitutionstatistic', 1, 1, '', '结算汇总', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-11-16 14:28:33', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-11-16 14:29:13', '0');
INSERT INTO `sys_menu` VALUES ('c43cc6d226424353b85022741aa022fe', '渠道-订单支付', NULL, 'view/channelorderpay', 'eb51027836494fc794be9a9e69e74b16', 'd5405c4ade964c4b8b0fe965a2f921fe/eb51027836494fc794be9a9e69e74b16/', 'view:channelorderpay', 0, 1, '', '渠道-订单支付', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-11-16 14:49:16', NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('c48cf56c8d87469e91f3b526e0ea4d9c', '资金渠道入款', NULL, '', 'd5405c4ade964c4b8b0fe965a2f921fe', 'd5405c4ade964c4b8b0fe965a2f921fe/', '', 1, 1, '', '资金渠道入款', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-09-12 10:16:56', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-11-16 14:25:03', '0');
INSERT INTO `sys_menu` VALUES ('c4bc708e0b7d47a7ae315efc9ec3fba8', '订单.支付', NULL, 'account/accorderpayerror', '1932895b3eb84438b94d09a4bd27a28e', '79657ad047a640769a84a75ac1f094d8/1932895b3eb84438b94d09a4bd27a28e/', 'account:accorderpayerror', 1, 3, '', '订单.支付.差错', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-10-19 11:20:44', NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('d0f2e57b745f4e55b64e9ee750e45505', '卡劵系统-订单', NULL, 'account/acccoupon', 'ee384a649a2e4161b0104e8923b34fff', 'ee384a649a2e4161b0104e8923b34fff/', 'account:acccoupon', 1, 5, 'fa-hourglass-end', '', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-03-26 14:47:40', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-12-27 10:01:20', '0');
INSERT INTO `sys_menu` VALUES ('d13ceb22425c47e09f6bdc2bc09c01ba', '江苏通结算', NULL, 'view/viewinstitutionjst', '55266f7aead2471a9166cf31daa6630a', 'd5405c4ade964c4b8b0fe965a2f921fe/55266f7aead2471a9166cf31daa6630a/', 'view:viewinstitutionjst', 1, 3, '', '江苏通结算', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-11-16 14:38:02', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-11-16 15:16:13', '0');
INSERT INTO `sys_menu` VALUES ('d3508a6b7c65474da349d175eda97b99', '支付平台订单', NULL, 'account/accpay', 'ee384a649a2e4161b0104e8923b34fff', 'ee384a649a2e4161b0104e8923b34fff/', 'account:accpay', 1, 2, '', '', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-07-26 21:44:42', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-12-27 09:59:59', '0');
INSERT INTO `sys_menu` VALUES ('d5405c4ade964c4b8b0fe965a2f921fe', '清算报表', NULL, '', NULL, NULL, '', 1, 10, 'fa-cc-diners-club', '', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-09-03 04:03:44', NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('d580e39129dd4bc793f97fa3c0ea86f3', '入网机构管理', NULL, 'institution/gonetinstitution', 'dac28aa045b843649f642fbdb165f40b', 'dac28aa045b843649f642fbdb165f40b/', 'institution:gonetinstitution:list', 1, 2, 'fa-object-group', '', '4028ea815a3d2a8c015a3d2f8d2a0002', '2017-12-05 10:56:08', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-01-16 15:37:05', '0');
INSERT INTO `sys_menu` VALUES ('dac28aa045b843649f642fbdb165f40b', '机构管理', NULL, '', NULL, NULL, '', 1, 7, 'fa-creative-commons', '机构管理', '4028ea815a3d2a8c015a3d2f8d2a0002', '2017-12-05 10:21:42', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-07-30 18:54:42', '0');
INSERT INTO `sys_menu` VALUES ('e007fbb066fe4c3495188ac948074016', '订单支付@订单卡券@订单TSM', NULL, 'view/orderpaycoupontsm', 'ff15b194aa2f4cb7ae966b2b0c4701b1', 'd5405c4ade964c4b8b0fe965a2f921fe/ff15b194aa2f4cb7ae966b2b0c4701b1/', 'view:orderpaycoupontsm', 1, 2, 'fa-firefox', '订单支付@订单卡券@订单TSM', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-09-20 10:06:33', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-11-16 15:10:09', '0');
INSERT INTO `sys_menu` VALUES ('e08f9b50ffc541aaa2a28e3ea929d946', '订单.TSM', NULL, 'account/accordertsmresult', '79657ad047a640769a84a75ac1f094d8', '79657ad047a640769a84a75ac1f094d8/', 'account:accordertsmresult', 1, 4, 'fa-calendar-check-o', '', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-03-26 14:52:49', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-08-01 17:04:12', '0');
INSERT INTO `sys_menu` VALUES ('e67782f99a4b4d548f18a230e4e9a689', '订单.TSM', NULL, 'account/accordertsmerror', '1932895b3eb84438b94d09a4bd27a28e', '79657ad047a640769a84a75ac1f094d8/1932895b3eb84438b94d09a4bd27a28e/', 'account:accordertsmerror', 1, 4, '', '订单.TSM.差错', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-10-19 11:51:02', NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('eb51027836494fc794be9a9e69e74b16', '顺路入款对账', NULL, '', 'd5405c4ade964c4b8b0fe965a2f921fe', 'd5405c4ade964c4b8b0fe965a2f921fe/', '', 0, 3, '', '顺路入款对账', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-11-16 14:47:48', NULL, NULL, '0');
INSERT INTO `sys_menu` VALUES ('edf145797f7b4865b5c5c63a8871bea0', '空发', NULL, 'account/accinstlingnanpasstsm', 'fd64f0ed24424287a53d21bad7f90dfa', 'ee384a649a2e4161b0104e8923b34fff/fd64f0ed24424287a53d21bad7f90dfa/', 'account:accinstlingnanpasstsm', 1, 2, 'fa-hourglass-o', '', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-03-26 15:04:44', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-07-30 19:00:46', '0');
INSERT INTO `sys_menu` VALUES ('ee384a649a2e4161b0104e8923b34fff', '订单中心', NULL, '', NULL, NULL, '', 1, 2, 'fa-file-excel-o', '', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-03-26 14:42:23', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-07-30 18:53:52', '0');
INSERT INTO `sys_menu` VALUES ('f0bf1cdfffcb48c18505d9c351a8dbf3', '江苏通订单', NULL, 'account/justaccjst', 'ee384a649a2e4161b0104e8923b34fff', 'ee384a649a2e4161b0104e8923b34fff/', 'account:justaccjst', 1, 3, '', '江苏通对账订单', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-10-10 18:53:46', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-12-27 10:00:14', '0');
INSERT INTO `sys_menu` VALUES ('f7963d69ae6442b9930bfe7ac4e439da', 'TSM订单', NULL, 'account/accordertsm', '3a9c31ee7307407796baeba5233d5885', 'ee384a649a2e4161b0104e8923b34fff/3a9c31ee7307407796baeba5233d5885/', 'account:accordertsm', 1, 3, 'fa-hourglass-end', '', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-03-26 14:48:50', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-12-27 10:03:23', '0');
INSERT INTO `sys_menu` VALUES ('fd64f0ed24424287a53d21bad7f90dfa', '通卡-岭南通', NULL, '', 'ee384a649a2e4161b0104e8923b34fff', 'ee384a649a2e4161b0104e8923b34fff/', '', 1, 6, 'fa-gg-circle', '通卡-岭南通', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-03-26 15:03:54', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-12-27 10:01:33', '0');
INSERT INTO `sys_menu` VALUES ('fe16db9a3e274884957a8b6a3ebc158c', '空充', NULL, 'account/accinstitutionlingnanpassjy', 'fd64f0ed24424287a53d21bad7f90dfa', 'ee384a649a2e4161b0104e8923b34fff/fd64f0ed24424287a53d21bad7f90dfa/', 'account:accinstitutionlingnanpassjy', 1, 1, 'fa-hourglass-o', '', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-03-26 15:04:31', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-07-30 19:00:36', '0');
INSERT INTO `sys_menu` VALUES ('ff15b194aa2f4cb7ae966b2b0c4701b1', '顺路出款对账', NULL, '', 'd5405c4ade964c4b8b0fe965a2f921fe', 'd5405c4ade964c4b8b0fe965a2f921fe/', '', 1, 4, '', '顺路出款对账', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-11-16 14:57:19', NULL, NULL, '0');

-- ----------------------------
-- Table structure for sys_organization
-- ----------------------------
DROP TABLE IF EXISTS `sys_organization`;
CREATE TABLE `sys_organization`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '机构名称',
  `parent_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '父节点',
  `parent_ids` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '父节点路径',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_date` datetime(0) NULL DEFAULT NULL,
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `update_date` datetime(0) NULL DEFAULT NULL,
  `del_flag` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '删除标记',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_sys_organization_parent_id`(`parent_id`) USING BTREE,
  INDEX `idx_sys_organization_parent_ids`(`parent_ids`(255)) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '部门表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_organization
-- ----------------------------
INSERT INTO `sys_organization` VALUES ('3dd3e539f86043028a83c8848578eaa3', '运营部', '40288ab85b6080e1015b60996d690005', '40288ab85b6080e1015b60996d690005/', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-07-30 18:48:58', NULL, NULL, '0', '');
INSERT INTO `sys_organization` VALUES ('40288ab85b6080e1015b60996d690005', 'weconex', NULL, NULL, NULL, NULL, '4028ea815a3d2a8c015a3d2f8d2a0002', '2017-11-24 10:12:19', '0', '');
INSERT INTO `sys_organization` VALUES ('4028ea815a452f69015a45346f7b0001', '研发部', '40288ab85b6080e1015b60996d690005', '40288ab85b6080e1015b60996d690005/', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_organization` VALUES ('66bd53ac0ab04d7898f90889e4587c38', '运维部', '40288ab85b6080e1015b60996d690005', '40288ab85b6080e1015b60996d690005/', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-07-30 18:49:30', NULL, NULL, '0', '');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role`  (
  `id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '编号',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色名称',
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '英文名称',
  `is_sys` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否系统数据',
  `usable` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否可用',
  `create_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建者',
  `create_date` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新者',
  `update_date` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  `del_flag` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0' COMMENT '删除标记',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `sys_role_del_flag`(`del_flag`) USING BTREE,
  INDEX `sys_role_enname`(`code`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('315a2712ed7048b790f821f5aa2c99ee', '运营人员', '1003', '1', '1', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-07-30 18:49:55', NULL, NULL, '', '0');
INSERT INTO `sys_role` VALUES ('402880e45b5d7636015b5d8baca60000', '普通用户', 'normal', '1', '1', NULL, '2017-04-11 23:04:46', '4028ea815a3d2a8c015a3d2f8d2a0002', '2017-07-06 08:20:00', '', '0');
INSERT INTO `sys_role` VALUES ('40288ab85a362150015a3675ca950006', '系统管理员', 'admin', '1', '1', NULL, '2017-02-13 15:52:53', NULL, '2017-02-15 14:31:15', '系统管理员', '0');
INSERT INTO `sys_role` VALUES ('d620d10364d84422828da3bdf847e9c0', '运维人员', '1002', '1', '1', '4028ea815a3d2a8c015a3d2f8d2a0002', '2018-07-30 18:45:46', NULL, NULL, '', '0');

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '编号',
  `menu_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '菜单编号',
  `role_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色编号',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `sys_role_menu_menuid`(`menu_id`) USING BTREE,
  INDEX `sys_role_menu_roleid`(`role_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色-菜单' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------
INSERT INTO `sys_role_menu` VALUES ('05d2976c826e4ccdbdb0003dae045ab2', '40281e815beda90f015bedcf7102000f', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('06f0f3c485054d969f668322cf92d40d', 'f7963d69ae6442b9930bfe7ac4e439da', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('0763b73e3fe64ded9ad72d1d204b6db1', '61080096bbd4442484d70d423b35fc73', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('0feec08070b7446e93f9b5266d5699f5', '3a9c31ee7307407796baeba5233d5885', '315a2712ed7048b790f821f5aa2c99ee');
INSERT INTO `sys_role_menu` VALUES ('127791db769d41a5b6114192c4a3204c', '40288ab85a5eecc6015a5ef6ce870002', 'd620d10364d84422828da3bdf847e9c0');
INSERT INTO `sys_role_menu` VALUES ('13fbad3eb56e419fa69b8c823d074973', 'fd64f0ed24424287a53d21bad7f90dfa', '315a2712ed7048b790f821f5aa2c99ee');
INSERT INTO `sys_role_menu` VALUES ('1454360c780241af89b885dde11d8da5', '40288ab85a5eecc6015a5ef6ce870002', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('1528fcfd8cef4b099ac98e7bae32a9dc', 'ee384a649a2e4161b0104e8923b34fff', '315a2712ed7048b790f821f5aa2c99ee');
INSERT INTO `sys_role_menu` VALUES ('190e1e03148e49a9b1dbf411ebd19e52', '06403a6ef78d4cd7a7c6dcfedf72f058', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('1bbcb9bf4e834add9fef4de1f323297e', '4e03ad23e9c144f5af0e02454d1d15f9', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('1c7324fe6d9247619efa7c353f4025bb', '40288ab85c8593cd015c859fa3240017', '402880e45b5d7636015b5d8baca60000');
INSERT INTO `sys_role_menu` VALUES ('1e71d049bbfe4b31835c61c0d04a72a5', '63aa6b26bf8d45ed85c44ba813d13207', 'd620d10364d84422828da3bdf847e9c0');
INSERT INTO `sys_role_menu` VALUES ('1f409919304c4e429533cff131872106', '40288ab85c8593cd015c859f47960016', '402880e45b5d7636015b5d8baca60000');
INSERT INTO `sys_role_menu` VALUES ('2203768790a24b868463c39d520fb4ca', '1932895b3eb84438b94d09a4bd27a28e', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('2511f229edb94e9fb4111fbd374909dd', 'd580e39129dd4bc793f97fa3c0ea86f3', '315a2712ed7048b790f821f5aa2c99ee');
INSERT INTO `sys_role_menu` VALUES ('2878eb3d462e4ab3b385e249140e0151', 'bd2c172d7cf74f2192c8691bc8ef822b', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('2c26b1530a0a4d09aff1352ce0ac9ba6', 'd580e39129dd4bc793f97fa3c0ea86f3', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('2c471e16a5b2429d86600cbc106c9516', '4028ea815a78e9e6015a78f1dc9d0000', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('2f9017308d1d41358e0f2d7af9dd70d1', 'd0f2e57b745f4e55b64e9ee750e45505', 'd620d10364d84422828da3bdf847e9c0');
INSERT INTO `sys_role_menu` VALUES ('31c38b1ccdc648f2a5119072eb3483e9', 'e67782f99a4b4d548f18a230e4e9a689', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('31cbbad993e74162b049f3f60bb43412', 'e007fbb066fe4c3495188ac948074016', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('332fb287abc94935b3ae8ec7de023a43', '055662f18bc24a239a003aa8349cc0ee', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('34ecfabd079a40a3992cc997ea839bcc', 'e08f9b50ffc541aaa2a28e3ea929d946', '315a2712ed7048b790f821f5aa2c99ee');
INSERT INTO `sys_role_menu` VALUES ('36a3c771a14347e3b182462d5055e7f2', '69036d93cf994f518c22b7a2e1856cd1', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('37d97471d10045bfa9350ff5fc89a0e9', 'ac42264dfbf14cb9b83e5769339be518', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('38ea573c9b4a49f3a398e82123ff2a84', '31811ebfb6064ee8b882e52d88e2c552', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('3900a34c02fd4dd19d0bd1766af5cc17', '40281e815c912406015c9149f7b80044', '402880e45b5d7636015b5d8baca60000');
INSERT INTO `sys_role_menu` VALUES ('3a190313a12240c4b06a0f8ad6cc8b75', '40288ab85a5eecc6015a5ef95c700004', '315a2712ed7048b790f821f5aa2c99ee');
INSERT INTO `sys_role_menu` VALUES ('3abc215ae4474050bf745783b4b9a336', '40288ab85a5eecc6015a5ef22ad80001', '315a2712ed7048b790f821f5aa2c99ee');
INSERT INTO `sys_role_menu` VALUES ('3ba6485862db4050b425732ba56fdd9d', '3ff3e623ebef45c8ae9b608b37d1a022', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('3c0512b2c8b74737a6a6efcfa2ceb4ad', '40281e815c912406015c914a1bc30045', '402880e45b5d7636015b5d8baca60000');
INSERT INTO `sys_role_menu` VALUES ('3c3e6b02a567440c8c6267a4367da14b', 'fd64f0ed24424287a53d21bad7f90dfa', 'd620d10364d84422828da3bdf847e9c0');
INSERT INTO `sys_role_menu` VALUES ('3cde1a258f3a4d1192e7b31ca52d1aaf', 'e08f9b50ffc541aaa2a28e3ea929d946', 'd620d10364d84422828da3bdf847e9c0');
INSERT INTO `sys_role_menu` VALUES ('4028ea815a701416015a7080f45b0030', '40288ab85a5eecc6015a5ef22ad80001', '40288ab85a406a03015a40781a6e0000');
INSERT INTO `sys_role_menu` VALUES ('4028ea815a701416015a7080f45d0031', '40288ab85a5eecc6015a5ef8f2890003', '40288ab85a406a03015a40781a6e0000');
INSERT INTO `sys_role_menu` VALUES ('4028ea815a701416015a7080f45d0032', '40288ab85a5eecc6015a5ef95c700004', '40288ab85a406a03015a40781a6e0000');
INSERT INTO `sys_role_menu` VALUES ('4028ea815a701416015a7080f45d0033', '40288ab85a5eecc6015a5ef9f6160005', '40288ab85a406a03015a40781a6e0000');
INSERT INTO `sys_role_menu` VALUES ('4028ea815a701416015a7080f45d0034', '40288ab85a5eecc6015a5efaa75d0006', '40288ab85a406a03015a40781a6e0000');
INSERT INTO `sys_role_menu` VALUES ('4028ea815a701416015a7080f45d0035', '4028ea815a701416015a7075b4f9001f', '40288ab85a406a03015a40781a6e0000');
INSERT INTO `sys_role_menu` VALUES ('4028ea815a701416015a7080f45e0036', '4028ea815a701416015a70766a7a0020', '40288ab85a406a03015a40781a6e0000');
INSERT INTO `sys_role_menu` VALUES ('410b3d9101d944f59fdabbc8964233ab', 'dac28aa045b843649f642fbdb165f40b', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('4192821023ec4ea2ab0b317367a12dae', '2df133fed4cf45bda23f4d893f7aa0ad', '315a2712ed7048b790f821f5aa2c99ee');
INSERT INTO `sys_role_menu` VALUES ('44371728c3e44df0827ab9099310c8bc', '40288ab85a5eecc6015a5ef6ce870002', '315a2712ed7048b790f821f5aa2c99ee');
INSERT INTO `sys_role_menu` VALUES ('48fd0df8b102445787a9f437e00df4d3', '1b2d723088434ceb8317d42309d5cc75', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('4c02ad0ca9c74748a2b49c0371ee14f2', '40281e815c880c25015c880d29870001', '402880e45b5d7636015b5d8baca60000');
INSERT INTO `sys_role_menu` VALUES ('4f7d297d030246ccb5632c91b0bb2dcc', '9847535033424e30bb202178d5d8652a', '315a2712ed7048b790f821f5aa2c99ee');
INSERT INTO `sys_role_menu` VALUES ('52cf579cb513472eb9316ddfb504080f', '40288ab85c85fa54015c860cee2e0023', '402880e45b5d7636015b5d8baca60000');
INSERT INTO `sys_role_menu` VALUES ('54038fc5a47342ef968067bf7fe2563e', 'c43cc6d226424353b85022741aa022fe', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('5913308d3b5048cbb6ca50214b75b911', '40288ab85a5eecc6015a5ef95c700004', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('596d7715c65e486aa86d7fa97bb600be', '40288ab85a5eecc6015a5ef22ad80001', '402880e45b5d7636015b5d8baca60000');
INSERT INTO `sys_role_menu` VALUES ('59d573a64f4b42a695b5bb60b98b4ccb', '63aa6b26bf8d45ed85c44ba813d13207', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('5ac2366b8d2e4d8bb0ad7c26605a2942', '40281e815c54d147015c54daf16c0001', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('5c26436746994ab1bbbf78318f6408a8', '4b3bdb0513654b389f8b8ec1837bd4a1', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('5c55a85fcff442c7b86c8bd189fd649d', '40288ab85a5eecc6015a5ef9f6160005', '402880e45b5d7636015b5d8baca60000');
INSERT INTO `sys_role_menu` VALUES ('5fe5cf03f3eb45ffb7fdad20fe873532', 'e08f9b50ffc541aaa2a28e3ea929d946', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('62e49873040b4038a340ffa73d0aa825', '40288ab85a5eecc6015a5ef8f2890003', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('64386edd1a6f45f69f1d3f474a0e81f3', '9216b84cbefa4fd9b4fa7951d07a0a3c', 'd620d10364d84422828da3bdf847e9c0');
INSERT INTO `sys_role_menu` VALUES ('65d5f3f2734b4ca6acb2f7012df278a1', 'fd64f0ed24424287a53d21bad7f90dfa', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('6d27dd29da584dbaa97414d3ed41ea59', '27e433c8d0be41d9912a6a1780664685', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('70a0456c9c1f4364bb2d40cc28abad63', 'edf145797f7b4865b5c5c63a8871bea0', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('74cc0ea300ea47bdb5aef6b2f5bc695b', '40288ab85a5eecc6015a5ef22ad80001', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('752ee45e02c74b839e66b6d4317511bc', 'd0f2e57b745f4e55b64e9ee750e45505', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('756eeda8f8644d30839b5270ce1d9b7c', '2a0399450a7e420d9f873ae4e3ee64da', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('7625eeea439540cd875785d2c3da6f6d', '40288ab85a5eecc6015a5ef95c700004', 'd620d10364d84422828da3bdf847e9c0');
INSERT INTO `sys_role_menu` VALUES ('7c42ccb1fa1a4c4190e65a8727efda0c', '3ff3e623ebef45c8ae9b608b37d1a022', 'd620d10364d84422828da3bdf847e9c0');
INSERT INTO `sys_role_menu` VALUES ('7d27d9a0d700464188dbd0b725345ba5', 'fe16db9a3e274884957a8b6a3ebc158c', 'd620d10364d84422828da3bdf847e9c0');
INSERT INTO `sys_role_menu` VALUES ('7dae353de9734967ab5715153838145d', '40288ab85a5eecc6015a5ef22ad80001', 'd620d10364d84422828da3bdf847e9c0');
INSERT INTO `sys_role_menu` VALUES ('7db933e20f8a4e659a1576d311f797f5', '06403a6ef78d4cd7a7c6dcfedf72f058', '315a2712ed7048b790f821f5aa2c99ee');
INSERT INTO `sys_role_menu` VALUES ('7ddee8838c03439ba1ec79c6da2c527c', '79657ad047a640769a84a75ac1f094d8', '315a2712ed7048b790f821f5aa2c99ee');
INSERT INTO `sys_role_menu` VALUES ('7f7df96ee67a4f82b5b0f0731e65721c', '27e433c8d0be41d9912a6a1780664685', 'd620d10364d84422828da3bdf847e9c0');
INSERT INTO `sys_role_menu` VALUES ('85ac77579ace43bd80de07c28d921645', '40288ab85a5eecc6015a5efaa75d0006', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('8e323883c2c04d0c855212ccd434d2f7', '40288ab85a5eecc6015a5ef9f6160005', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('8e8fa9287be041dbbc09706765ff4b58', 'c48cf56c8d87469e91f3b526e0ea4d9c', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('8e8fab3615ae46b6916c9a629049b07a', 'd13ceb22425c47e09f6bdc2bc09c01ba', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('8e9af4ef505f4085be43fb54f744eb02', '31811ebfb6064ee8b882e52d88e2c552', 'd620d10364d84422828da3bdf847e9c0');
INSERT INTO `sys_role_menu` VALUES ('8fbc0343e1a44b139beaa6b2767e89ac', 'a7b539fc84f44e81a85b4cc8c260bb2d', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('92fb40ceefd94a46b9439da6ffa5f746', '3a9c31ee7307407796baeba5233d5885', 'd620d10364d84422828da3bdf847e9c0');
INSERT INTO `sys_role_menu` VALUES ('936fe806f91648c3878a6ff22d886a51', '7945798d5358440b990c0ef5614e232a', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('937959ab687245afb12cce02fc1353db', '40288ab85a5eecc6015a5ef8f2890003', 'd620d10364d84422828da3bdf847e9c0');
INSERT INTO `sys_role_menu` VALUES ('9583c265dfa1480d9d4a4db19312f1d5', '55266f7aead2471a9166cf31daa6630a', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('9749197bef654b5a92f86ae872b8e0c2', '4028ea815a78e9e6015a78f35cbe0001', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('9a8a4a1857fa483e8b4a4ffef59f092b', '27e433c8d0be41d9912a6a1780664685', '315a2712ed7048b790f821f5aa2c99ee');
INSERT INTO `sys_role_menu` VALUES ('9ad8f1def29e4c8ba1c65924fea9d473', '40288ab85cf8276b015cf82debcb005b', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('9b86e781c5a945d9b492648e08f6be27', '63aa6b26bf8d45ed85c44ba813d13207', '315a2712ed7048b790f821f5aa2c99ee');
INSERT INTO `sys_role_menu` VALUES ('9c5970caa51e47f38699eb060ff7e599', '6ea5789de7d54f38a794ce6c90af90d8', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('9d4ca8f226394d4aacfa83a13cd39702', 'edf145797f7b4865b5c5c63a8871bea0', '315a2712ed7048b790f821f5aa2c99ee');
INSERT INTO `sys_role_menu` VALUES ('9ee8181f29124e01a2e8fcc1d6c3a637', '3a9c31ee7307407796baeba5233d5885', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('a0c36516c07242318b36a7e186804b38', 'd3508a6b7c65474da349d175eda97b99', 'd620d10364d84422828da3bdf847e9c0');
INSERT INTO `sys_role_menu` VALUES ('a27354cdc3914cc5a3170344da16d218', '66f8742d88c24ef3b696b4a277d20c1f', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('ab96608faae1467dba8bcb825640792e', '4028ea815a701416015a7075b4f9001f', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('ac93496d3abb4b8fb1fd72e0da71ae09', 'f7963d69ae6442b9930bfe7ac4e439da', '315a2712ed7048b790f821f5aa2c99ee');
INSERT INTO `sys_role_menu` VALUES ('ae7644193f014cc08de61fbd389720e7', '1b3b0377131f498d952aa9b50eca210b', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('b0b869a8af2447c5980c0317c7be9ee9', '3ff3e623ebef45c8ae9b608b37d1a022', '315a2712ed7048b790f821f5aa2c99ee');
INSERT INTO `sys_role_menu` VALUES ('b2a65711737b4dbbbdaf1b1fc9dc8705', 'f0bf1cdfffcb48c18505d9c351a8dbf3', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('b2aa2acd2c8047a289cdfa995e758cde', 'd5405c4ade964c4b8b0fe965a2f921fe', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('b651aeee59be414b947aa76f351f3723', 'dac28aa045b843649f642fbdb165f40b', 'd620d10364d84422828da3bdf847e9c0');
INSERT INTO `sys_role_menu` VALUES ('bf20efeb2b72469b9c13684f23f853c4', 'fe16db9a3e274884957a8b6a3ebc158c', '315a2712ed7048b790f821f5aa2c99ee');
INSERT INTO `sys_role_menu` VALUES ('c09befbcc9b64aa78a42a47316301e11', 'edf145797f7b4865b5c5c63a8871bea0', 'd620d10364d84422828da3bdf847e9c0');
INSERT INTO `sys_role_menu` VALUES ('c254b86916f944e98e5795114e3aab7e', 'ee384a649a2e4161b0104e8923b34fff', 'd620d10364d84422828da3bdf847e9c0');
INSERT INTO `sys_role_menu` VALUES ('c30f05caf78f4ff8bfb165f6a6fcf1b1', '40288ab85bea9452015beaa9e7a70002', '402880e45b5d7636015b5d8baca60000');
INSERT INTO `sys_role_menu` VALUES ('c74cfc2ac02240ff8a1c722d5b6befe9', 'bb33277c6c81434383b702cac1cc9bd2', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('c7fac0552aa345249140c8203e7bdf2e', '4b3bdb0513654b389f8b8ec1837bd4a1', '315a2712ed7048b790f821f5aa2c99ee');
INSERT INTO `sys_role_menu` VALUES ('caf014ba2fcd4e8f83d831d44db2e99a', '9216b84cbefa4fd9b4fa7951d07a0a3c', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('cf4d8db97822422fb4e5aa15aa3c873c', '4a0681c0707946b6a4d8eb84cbd4a51e', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('d1c76532fa64492fbc30203fd9398f7c', 'c4bc708e0b7d47a7ae315efc9ec3fba8', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('d23abca6112d4e9d9117202132e45874', '43f3a01e53a448d6b2e6f76224ff856a', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('d40bba73aedd491e89f0d1cc625f9423', '40288ab85a5eecc6015a5efaa75d0006', '402880e45b5d7636015b5d8baca60000');
INSERT INTO `sys_role_menu` VALUES ('d43149fc060d4cf6bd9b8bd48445aa82', '4028ea815a701416015a70766a7a0020', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('d55257416e5649cd9eb23da2915f2465', 'ee384a649a2e4161b0104e8923b34fff', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('d6fd3b2ab2064575b6d5ceba7bd8bc69', '79657ad047a640769a84a75ac1f094d8', 'd620d10364d84422828da3bdf847e9c0');
INSERT INTO `sys_role_menu` VALUES ('d76fd00c9f7042ac98df5d5c9493a21c', '01a54e7dd3914f87a2ce4bbbdf997d05', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('dab5a7c9de4e4253a6088acbef6ac390', 'eb51027836494fc794be9a9e69e74b16', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('db4ce2547af14afea5a62d5486cf71dd', 'd3508a6b7c65474da349d175eda97b99', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('db5d10a693424e96a0092c0f3d74a4e6', 'd0f2e57b745f4e55b64e9ee750e45505', '315a2712ed7048b790f821f5aa2c99ee');
INSERT INTO `sys_role_menu` VALUES ('de804c1619da4d54ae445f5f53677b83', 'd580e39129dd4bc793f97fa3c0ea86f3', 'd620d10364d84422828da3bdf847e9c0');
INSERT INTO `sys_role_menu` VALUES ('e0278cf115534a75bca51fe2da872be8', '0f9a859cb54045338c9219b515ee59b3', 'd620d10364d84422828da3bdf847e9c0');
INSERT INTO `sys_role_menu` VALUES ('e090ed7a7932436db9330ba975c298e8', '2df133fed4cf45bda23f4d893f7aa0ad', 'd620d10364d84422828da3bdf847e9c0');
INSERT INTO `sys_role_menu` VALUES ('e0d13f1b14b64a66a03e9a587f3438e7', 'ff15b194aa2f4cb7ae966b2b0c4701b1', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('e32820dc37bc4f8a921f68f0db8d2544', '9847535033424e30bb202178d5d8652a', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('e8d3c469d3ee4482aefc2c6d54fd0420', '79657ad047a640769a84a75ac1f094d8', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('eabcbbbea4ed46aeb4f4420759aa82ba', '36ed50e6c8e54af8825fda6caa3c1bac', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('eaeeab3517b74279bc97e7f0ef309392', '0f9a859cb54045338c9219b515ee59b3', '315a2712ed7048b790f821f5aa2c99ee');
INSERT INTO `sys_role_menu` VALUES ('ec211e8a9d1d4deebe235550367e3f1b', '2df133fed4cf45bda23f4d893f7aa0ad', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('ee0c2f837d1a4ea5800df39759e9390a', 'dac28aa045b843649f642fbdb165f40b', '315a2712ed7048b790f821f5aa2c99ee');
INSERT INTO `sys_role_menu` VALUES ('f0b6cc056d46479f80a80e4d7a8ee8da', '0f9a859cb54045338c9219b515ee59b3', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('f2cfa5f5530449c0a9f260624f7cb266', '06403a6ef78d4cd7a7c6dcfedf72f058', 'd620d10364d84422828da3bdf847e9c0');
INSERT INTO `sys_role_menu` VALUES ('f4a50b5d271d4b458c74abbfba386787', '36caab41a4894ef896c967f6b45d9e6a', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('f562c1acecfa4ceeaf18dfb6e875ae99', '48fd83e1fcf1470ab253a096ecf441c6', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('f7bb95de5439472fb949a93b3dbfb96e', '9216b84cbefa4fd9b4fa7951d07a0a3c', '315a2712ed7048b790f821f5aa2c99ee');
INSERT INTO `sys_role_menu` VALUES ('f84bdd5a29f040ceba90b9f3e8174809', 'fe16db9a3e274884957a8b6a3ebc158c', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_role_menu` VALUES ('fbb6c8ab9c37438a9fc61d27cf256567', 'f7963d69ae6442b9930bfe7ac4e439da', 'd620d10364d84422828da3bdf847e9c0');
INSERT INTO `sys_role_menu` VALUES ('fc036259904b45609d4f115946131f61', 'd3508a6b7c65474da349d175eda97b99', '315a2712ed7048b790f821f5aa2c99ee');
INSERT INTO `sys_role_menu` VALUES ('feb9559d00444e7e95bb392701dc0964', '4b3bdb0513654b389f8b8ec1837bd4a1', 'd620d10364d84422828da3bdf847e9c0');
INSERT INTO `sys_role_menu` VALUES ('fee1cbe1f98044c19d3d63c2421d361a', '9847535033424e30bb202178d5d8652a', 'd620d10364d84422828da3bdf847e9c0');

-- ----------------------------
-- Table structure for sys_sessions
-- ----------------------------
DROP TABLE IF EXISTS `sys_sessions`;
CREATE TABLE `sys_sessions`  (
  `id` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `session` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_user_organization
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_organization`;
CREATE TABLE `sys_user_organization`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '编号',
  `user_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户主键',
  `organization_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '部门主键',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `sys_user_role_userid`(`user_id`) USING BTREE,
  INDEX `sys_user_role_roleid`(`organization_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户-部门' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user_organization
-- ----------------------------
INSERT INTO `sys_user_organization` VALUES ('9f6b019be9274070bf494e0e2e6d7db6', 'b245f354f5bd4236b1d74e4c4cec94a4', '40288ab85b6080e1015b60996d690005');
INSERT INTO `sys_user_organization` VALUES ('a3d1bfd4d47745379adf11f9e0cb7161', '4331fd7d2b21426f8db163cc411c5718', '66bd53ac0ab04d7898f90889e4587c38');
INSERT INTO `sys_user_organization` VALUES ('f9eaeb7067d344e7b50fac1ac8f07aa4', 'b245f354f5bd4236b1d74e4c4cec94a4', '3dd3e539f86043028a83c8848578eaa3');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '编号',
  `user_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户编号',
  `role_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色编号',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `sys_user_role_userid`(`user_id`) USING BTREE,
  INDEX `sys_user_role_roleid`(`role_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户-角色' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES ('07fa904d9dc941eda2e1aaa898972437', '40288ab85ce3c20a015ce3ca6df60000', '402880e45b5d7636015b5d8baca60000');
INSERT INTO `sys_user_role` VALUES ('33167408e47e4776850d3466f33af60f', 'b245f354f5bd4236b1d74e4c4cec94a4', '315a2712ed7048b790f821f5aa2c99ee');
INSERT INTO `sys_user_role` VALUES ('40288ab85d159689015d159aa13d0002', '4028ea815a3d2a8c015a3d2f8d2a0002', '402880e45b5d7636015b5d8baca60000');
INSERT INTO `sys_user_role` VALUES ('40288ab85d159689015d159aa1400003', '4028ea815a3d2a8c015a3d2f8d2a0002', '40288ab85a362150015a3675ca950006');
INSERT INTO `sys_user_role` VALUES ('cf3e72e9b5b5407fbdbc54ee86a7326a', '4331fd7d2b21426f8db163cc411c5718', 'd620d10364d84422828da3bdf847e9c0');

SET FOREIGN_KEY_CHECKS = 1;
