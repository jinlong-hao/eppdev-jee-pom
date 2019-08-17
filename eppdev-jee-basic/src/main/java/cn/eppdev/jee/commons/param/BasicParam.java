/* FileName: BasicParam.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.commons.param;

import cn.eppdev.jee.commons.entity.ColumnEntity;
import cn.eppdev.jee.utils.JSONUtils;
import cn.eppdev.jee.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinlong.hao
 */
public class BasicParam {
    static Logger logger = LoggerFactory.getLogger(BasicParam.class);

    private String _orderBy;

    private String _customWhere;

    private Integer _pageNum;

    private Integer _pageSize;

    private List<ColumnEntity> groupByList;

    public String get_orderBy() {
        return _orderBy;
    }

    public void set_orderBy(String _orderBy) {
        this._orderBy = _orderBy;
    }

    public String get_customWhere() {
        return _customWhere;
    }

    public void set_customWhere(String _customWhere) {
        this._customWhere = _customWhere;
    }

    public Integer get_pageNum() {
        return _pageNum;
    }

    public void set_pageNum(Integer _pageNum) {
        this._pageNum = _pageNum;
    }

    public Integer get_pageSize() {
        return _pageSize;
    }

    public void set_pageSize(Integer _pageSize) {
        this._pageSize = _pageSize;
    }


    public List<ColumnEntity> getGroupByList() {
        return groupByList;
    }

    public void setGroupByList(List<ColumnEntity> groupByList) {
        this.groupByList = groupByList;
    }


    public void buildBroupBy(ColumnEntity... columnEntities) {
        if (groupByList == null) {
            groupByList = new ArrayList<>();
        }
        for (ColumnEntity entity: columnEntities) {
            groupByList.add(entity);
        }
    }

    public void buildOrderBy(String... orderbyStrs) {
        StringBuilder sb = new StringBuilder();
        for (String str : orderbyStrs) {
            if(str.contains(".")) {
                sb.append(str + ", ");
            }
            else {
                sb.append("a." + str + ", ");
            }
        }
        this._orderBy = StringUtils.removeEnd(sb.toString().trim(), ",");
    }

    @Override
    public String toString() {
        return JSONUtils.toJson(this);
    }

}