package com.jnu.example.db.admin.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zy
 * @since 2020-08-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="RolePrivilege对象", description="")
public class RolePrivilege implements Serializable {

    private static final long serialVersionUID=1L;

    private String id;

    private String roleId;

    private String privilegeId;


}
