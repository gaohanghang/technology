CREATE TABLE `website` (
  `id` bigint(255) NOT NULL AUTO_INCREMENT,
  `dept_id` varchar(255) DEFAULT NULL COMMENT '部门id',
  `dept_name` varchar(255) DEFAULT NULL COMMENT '部门名称',
  `apply_service` varchar(255) DEFAULT NULL COMMENT '申请服务选项',
  `company_name` varchar(255) DEFAULT NULL COMMENT '单位名称',
  `province` varchar(255) DEFAULT NULL COMMENT '省',
  `city` varchar(255) DEFAULT NULL COMMENT '市',
  `address` varchar(255) DEFAULT NULL COMMENT '通信地址',
  `unit_property` varchar(255) DEFAULT NULL COMMENT '单位性质',
  `unit_id_type` varchar(255) DEFAULT NULL COMMENT '单位证件类型',
  `unit_id_num` varchar(255) DEFAULT NULL COMMENT '单位证件号码',
  `user_name` varchar(255) DEFAULT NULL COMMENT '负责人姓名',
  `user_phone` varchar(255) DEFAULT NULL COMMENT '负责人电话',
  `user_id_type` varchar(255) DEFAULT NULL COMMENT '负责人证件类型',
  `user_id_num` int(11) DEFAULT NULL COMMENT '负责人证件号码',
  `email` varchar(255) DEFAULT NULL COMMENT 'email',
  `parent_unit` varchar(255) DEFAULT NULL COMMENT '上级单位',
  `website_property` varchar(255) DEFAULT NULL COMMENT '网站属性',
  `website_name` varchar(255) DEFAULT NULL COMMENT '网站名称',
  `website_address` varchar(255) DEFAULT NULL COMMENT '网站地址',
  `website_domain` varchar(255) DEFAULT NULL COMMENT '网站域名',
  `service_contents` varchar(255) DEFAULT NULL COMMENT '服务内容',
  `approve_options` varchar(255) DEFAULT NULL COMMENT '审批选项',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `creator_id` varchar(255) DEFAULT NULL COMMENT '创建人id',
  `creator_name` varchar(255) DEFAULT NULL COMMENT '创建人姓名',
  `creator_dept_id` varchar(255) DEFAULT NULL COMMENT '创建人部门id',
  `creator_dept_name` varchar(255) DEFAULT NULL COMMENT '创建人部门名称',
  `status` varchar(255) DEFAULT NULL COMMENT '状态',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `end_time` datetime DEFAULT NULL COMMENT '结束时间',
  `del` varchar(255) DEFAULT NULL COMMENT '删除标志（1未删除 0已删除）',
  `org_code_certificate_file` varchar(255) DEFAULT NULL COMMENT '主体组织机构代码证',
  `business_license_file` varchar(255) DEFAULT NULL COMMENT '工商营业执照',
  `user_idcard_file` varchar(255) DEFAULT NULL COMMENT '网站负责人身份证',
  `record_photo_file` varchar(255) DEFAULT NULL COMMENT '备案标准照',
  `pre_approval_file` varchar(255) DEFAULT NULL COMMENT '前置审批文件',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

