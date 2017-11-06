package com.learn.test.entity;

import javax.persistence.Column;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author geweijian
 * @data 2017-10-24
 */
public class RepayPlanHistoryEntity implements Serializable {
    /**
     * 借款申请单编号
     */
    private String loanId;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 还款方式： 1-按月还款 2-灵活还款
     */
    private Integer repayType;

    /**
     * 还款总额（总本金+总利息），单位元，精确到分
     */
    private BigDecimal totalAmount;

    /**
     * 总本金，单位元，精确到分
     */
    private BigDecimal principalAmount;

    /**
     * 总利息，单位元，精确到分
     */
    private BigDecimal interestAmount;

    /**
     * 还款总期数
     */
    private Integer totalPeriods;

    /**
     * 还款起日期/起息日
     */
    private Date repayStartDate;

    /**
     * 还款止日期/截止日
     */
    private Date repayEndDate;

    /**
     * 剩余总额，单位元，精确到分（每次还款后更新）
     */
    private BigDecimal restTotal;

    /**
     * 剩余总本金，单位元，精确到分（每次还款后更新）
     */
    private BigDecimal restPrincipal;

    /**
     * 剩余总利息，单位元，精确到分（每次还款后更新）
     */
    private BigDecimal restInterest;

    /**
     * 变更原因
     */
    @Column(name = "reason", columnDefinition = "VARCHAR(128) COMMENT '变更原因'")
    private String reason;

    /**
     * 备注
     */
    @Column(name = "remark", columnDefinition = "VARCHAR(1024) COMMENT '备注'")
    private String remark;

    /**
     * 操作人
     */
    @Column(name = "operator", columnDefinition = "VARCHAR(128) COMMENT '变更原因'")
    private String operator;
}
