/*
 * Copyright (C), 2014-2014, 联创车盟汽车服务有限公司
 * FileName: RecordPage.java
 * Author:   wuhq
 * Date:     2014年11月23日 下午12:20:58
 * Description: //模块目的、功能描述      
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.suo.image.db;

import net.tsz.afinal.FinalDb;

/**
 * 〈一句话功能简述〉<br> 
 * 〈功能详细描述〉
 *
 * @author wuhq
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class RecordPage{

    private String id;
    private int type;
    private int page;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }

}
