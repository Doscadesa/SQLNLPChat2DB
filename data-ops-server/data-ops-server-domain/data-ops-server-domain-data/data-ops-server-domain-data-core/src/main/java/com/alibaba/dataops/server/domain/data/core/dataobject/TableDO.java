package com.alibaba.dataops.server.domain.data.core.dataobject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 表信息
 *
 * @author Jiaju Zhuang
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class TableDO {
    /**
     * 表名
     */
    private String name;

    /**
     * 描述
     */
    private String comment;

}

