package com.jnu.example.db.admin.entity;

import java.time.LocalDateTime;
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
@ApiModel(value="RepairApplication对象", description="")
public class RepairApplication implements Serializable {

    private static final long serialVersionUID=1L;

    private String id;

    private String vehicleId;

    @ApiModelProperty(value = "任务名称")
    private String name;

    @ApiModelProperty(value = "期望完工时间")
    private LocalDateTime expectCompleteTime;

    @ApiModelProperty(value = "申请人")
    private String applicantId;

    @ApiModelProperty(value = "故障现象")
    private String troubles;

    @ApiModelProperty(value = "是否提交")
    private Integer isSubmitted;


}
