/* FileName: _EppdevUserDao.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_user
    - 修改字段:login_name
    - 修改字段:update_by
    - 修改字段:update_by
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.dao.auto;

import cn.eppdev.jee.commons.dao.BasicDao;
import cn.eppdev.jee.conf.entity.EppdevUser;
import cn.eppdev.jee.conf.param.EppdevUserParam;
import org.apache.ibatis.annotations.Param;

/**
 * _eppdev_user对应的基础Dao，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public interface _EppdevUserDao extends BasicDao<EppdevUser, EppdevUserParam> {
    public int realDelete(@Param("id") String id);

}
