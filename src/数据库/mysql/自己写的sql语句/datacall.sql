


CREATE TABLE `data_call` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '当前操作人',
  `apply_org_id` varchar(255) DEFAULT NULL COMMENT '申请（涉及）部门',
  `apply_time` datetime DEFAULT NULL COMMENT '申请时间',
  `apply_user_id` bigint(20) DEFAULT NULL COMMENT '申请人',
  `data_call_name` varchar(255) DEFAULT NULL COMMENT '数据调用名称',
  `data_property_id` varchar(255) DEFAULT NULL COMMENT '数据资产id',
  `data_requirement_type` varchar(10) DEFAULT NULL COMMENT '数据需求类型（1、按需申请；2、备案申请；3、备案使用 ）',
  `record_validity` datetime DEFAULT NULL COMMENT '备案有效期',
  `data_call_frequency` varchar(10) DEFAULT NULL COMMENT '数据调用频率（1、不定期；2、每小时；3、每天；4、每周；5、每月 ）',
  `business_use_description` varchar(255) DEFAULT NULL COMMENT '业务用途说明',
  `data_range` varchar(10) DEFAULT NULL COMMENT '数据范围(1、项目级；2、事业部级；3、公司级)',
  `grade` varchar(10) DEFAULT NULL COMMENT '所属分级(1、商密级；2、受限级；3、内部公开级；4、外部公开级)',
  `data_call_scenes` varchar(10) DEFAULT NULL COMMENT '数据调用场景（1、公司内部使用；2、公司外部使用）',
  `data_finally_receiver` varchar(255) DEFAULT NULL COMMENT '数据最终接收方',
  `data_finally_user` varchar(255) DEFAULT NULL COMMENT '数据最终使用人',
  `data_belong_org_id` varchar(255) DEFAULT NULL COMMENT '所属部门',
  `fields` varchar(255) DEFAULT NULL COMMENT '涵盖字段(字典)',
  `data_content_description` varchar(255) DEFAULT NULL COMMENT '数据内容描述',
  `notes` varchar(255) DEFAULT NULL COMMENT '说明',
  `create_by` varchar(255) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(255) DEFAULT NULL COMMENT '最后更新人',
  `update_time` datetime DEFAULT NULL COMMENT '最后更新时间',
  `enable_flag` varchar(20) DEFAULT NULL COMMENT '是否可用，逻辑删除（Y-可用，N-不可用）',
  `processid` varchar(20) DEFAULT NULL COMMENT '流程定义的实例id',
  `state` varchar(255) DEFAULT NULL COMMENT '调用的状态,0未处理  1已完成,',
  `pid` varchar(255) DEFAULT NULL COMMENT '驳回处理人',
  `processkey` varchar(255) DEFAULT NULL COMMENT '流程定义的key',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=160 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT COMMENT='数据调用';






CREATE TABLE `data_call_workorder` (
  `id` int(255) NOT NULL AUTO_INCREMENT COMMENT '工单编号（自动编号）',
  `job_name` varchar(255) DEFAULT NULL COMMENT '工单名称',
  `send_dept` varchar(255) DEFAULT NULL COMMENT '发送部门',
  `send_user` varchar(255) DEFAULT NULL COMMENT '发起人',
  `send_time` datetime DEFAULT NULL COMMENT '发起时间',
  `status` varchar(255) DEFAULT NULL COMMENT '状态',
  `job_type` varchar(10) DEFAULT NULL COMMENT '工单类型：1、按需申请，2、备案申请，3备案使用',
  `dataCall_template` varchar(255) DEFAULT NULL COMMENT '数据调用模版id',
  `data_call_property` varchar(4000) DEFAULT NULL COMMENT '数据资产id',
  `notes` varchar(4000) DEFAULT NULL COMMENT '其他描述',
  `create_by` varchar(255) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(255) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '最后更新人',
  `update_time` datetime DEFAULT NULL COMMENT '最后更新时间',
  `enable_flag` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '是否可用，逻辑删除（Y-可用，N-不可用）',
  `pid` varchar(255) DEFAULT NULL COMMENT '流程定义id',
  `pKey` varchar(255) DEFAULT NULL COMMENT '流程模型id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=182 DEFAULT CHARSET=utf8 COMMENT='数据调用工单';



CREATE TABLE `data_call_template` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `template_name` varchar(255) DEFAULT NULL COMMENT '模版名称',
  `record_validity` datetime DEFAULT NULL COMMENT '备案有效期',
  `data_call_frequency` varchar(10) DEFAULT NULL COMMENT '数据调用频率（1、不定期；2、每小时；3、每天；4、每周；5、每月 ）',
  `business_use_description` varchar(255) DEFAULT NULL COMMENT '业务用途说明',
  `grade` varchar(10) DEFAULT NULL COMMENT '所属分级(1、商密级；2、受限级；3、内部公开级；4、外部公开级)',
  `data_call_scenes` varchar(10) DEFAULT NULL COMMENT '数据调用场景（1、公司内部使用；2、公司外部使用）',
  `data_finally_receiver` varchar(255) DEFAULT NULL COMMENT '数据最终接收方',
  `data_finally_user` varchar(255) DEFAULT NULL COMMENT '数据最终使用人',
  `data_belong_org_id` varchar(255) DEFAULT NULL COMMENT '所属部门',
  `fields` varchar(255) DEFAULT NULL COMMENT '涵盖字段(字典)',
  `data_content_description` varchar(255) DEFAULT NULL COMMENT '数据内容描述',
  `notes` varchar(255) DEFAULT NULL COMMENT '说明',
  `create_by` varchar(255) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(255) DEFAULT NULL COMMENT '最后更新人',
  `update_time` datetime DEFAULT NULL COMMENT '最后更新时间',
  `enable_flag` varchar(20) DEFAULT NULL COMMENT '是否可用，逻辑删除（Y-可用，N-不可用）',
  `data_call_property` varchar(20) DEFAULT NULL COMMENT '数据调用资产表Id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=160 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT COMMENT='数据调用备案模板';





CREATE TABLE `data_call_property` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `data_call_frequency` varchar(10) DEFAULT NULL COMMENT '数据调用频率（1、不定期；2、每小时；3、每天；4、每周；5、每月 ）',
  `business_use_description` varchar(255) DEFAULT NULL COMMENT '业务用途说明',
  `grade` varchar(10) DEFAULT NULL COMMENT '所属分级(1、商密级；2、受限级；3、内部公开级；4、外部公开级)',
  `data_call_scenes` varchar(10) DEFAULT NULL COMMENT '数据调用场景（1、公司内部使用；2、公司外部使用）',
  `data_finally_receiver` varchar(255) DEFAULT NULL COMMENT '数据最终接收方',
  `data_finally_user` varchar(255) DEFAULT NULL COMMENT '数据最终使用人',
  `data_belong_org_id` varchar(255) DEFAULT NULL COMMENT '所属部门',
  `fields` varchar(255) DEFAULT NULL COMMENT '涵盖字段(字典)',
  `data_content_description` varchar(255) DEFAULT NULL COMMENT '数据内容描述',
  `notes` varchar(255) DEFAULT NULL COMMENT '说明',
  `create_by` varchar(255) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(255) DEFAULT NULL COMMENT '最后更新人',
  `update_time` datetime DEFAULT NULL COMMENT '最后更新时间',
  `enable_flag` varchar(20) DEFAULT NULL COMMENT '是否可用，逻辑删除（Y-可用，N-不可用）',
  `data_call_property` varchar(20) DEFAULT NULL COMMENT '数据调用资产表Id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=160 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT COMMENT='数据调用按需申请';



