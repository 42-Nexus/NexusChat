package com.venture.nexuschat.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import lombok.*;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author zhp
 * @since 2025-02-16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
@TableName("user")
public class UserEntity extends Model<UserEntity> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户昵称
     */
    private String name;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 性别 1为男性，2为女性
     */
    private Integer sex;

    /**
     * 微信openid用户标识
     */
    private String openId;

    /**
     * 在线状态 1在线 2离线
     */
    private Integer activeStatus;

    /**
     * 最后上下线时间
     */
    private Date lastOptTime;

    /**
     * ip信息
     */
    private String ipInfo;

    /**
     * 佩戴的徽章id
     */
    private Long itemId;

    /**
     * 使用状态 0.正常 1拉黑
     */
    private Integer status;

    /**
     * 创建时间
     */
      @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 修改时间
     */
      @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;


    public static final String ID = "id";

    public static final String NAME = "name";

    public static final String AVATAR = "avatar";

    public static final String SEX = "sex";

    public static final String OPEN_ID = "open_id";

    public static final String ACTIVE_STATUS = "active_status";

    public static final String LAST_OPT_TIME = "last_opt_time";

    public static final String IP_INFO = "ip_info";

    public static final String ITEM_ID = "item_id";

    public static final String STATUS = "status";

    public static final String CREATE_TIME = "create_time";

    public static final String UPDATE_TIME = "update_time";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
