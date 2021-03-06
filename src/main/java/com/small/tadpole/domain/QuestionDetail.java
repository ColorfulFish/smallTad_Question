package com.small.tadpole.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table question_detail
 */
@ApiModel(value="com.small.tadpole.domain.QuestionDetail")
public class QuestionDetail {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table question_detail
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    public static final Integer IS_DELETED = IsDel.IS_DELETED.value();

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table question_detail
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    public static final Integer NOT_DELETED = IsDel.NOT_DELETED.value();

    /**
     * Database Column Remarks:
     *   问题ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_detail.id
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    @ApiModelProperty(value="id问题ID")
    private Integer id;

    /**
     * Database Column Remarks:
     *   性别
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_detail.gender
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    @ApiModelProperty(value="gender性别")
    private Integer gender;

    /**
     * Database Column Remarks:
     *   手机号码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_detail.phone_num
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    @ApiModelProperty(value="phoneNum手机号码")
    private String phoneNum;

    /**
     * Database Column Remarks:
     *   描述
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_detail.desc_detail
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    @ApiModelProperty(value="descDetail描述")
    private String descDetail;

    /**
     * Database Column Remarks:
     *   维修地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_detail.address
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    @ApiModelProperty(value="address维修地址")
    private String address;

    /**
     * Database Column Remarks:
     *   是否删除
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_detail.is_del
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    @ApiModelProperty(value="isDel是否删除")
    private Integer isDel;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_detail.id
     *
     * @return the value of question_detail.id
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_detail.id
     *
     * @param id the value for question_detail.id
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    public QuestionDetail setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_detail.gender
     *
     * @return the value of question_detail.gender
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_detail.gender
     *
     * @param gender the value for question_detail.gender
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    public QuestionDetail setGender(Integer gender) {
        this.gender = gender;
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_detail.phone_num
     *
     * @return the value of question_detail.phone_num
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_detail.phone_num
     *
     * @param phoneNum the value for question_detail.phone_num
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    public QuestionDetail setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_detail.desc_detail
     *
     * @return the value of question_detail.desc_detail
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    public String getDescDetail() {
        return descDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_detail.desc_detail
     *
     * @param descDetail the value for question_detail.desc_detail
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    public QuestionDetail setDescDetail(String descDetail) {
        this.descDetail = descDetail;
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_detail.address
     *
     * @return the value of question_detail.address
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_detail.address
     *
     * @param address the value for question_detail.address
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    public QuestionDetail setAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_detail
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    public void andLogicalDeleted(boolean deleted) {
        setIsDel(deleted ? IsDel.IS_DELETED.value() : IsDel.NOT_DELETED.value());
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_detail.is_del
     *
     * @return the value of question_detail.is_del
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    public Integer getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_detail.is_del
     *
     * @param isDel the value for question_detail.is_del
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    public QuestionDetail setIsDel(Integer isDel) {
        this.isDel = isDel;
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_detail
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", IS_DELETED=").append(IS_DELETED);
        sb.append(", NOT_DELETED=").append(NOT_DELETED);
        sb.append(", id=").append(id);
        sb.append(", gender=").append(gender);
        sb.append(", phoneNum=").append(phoneNum);
        sb.append(", descDetail=").append(descDetail);
        sb.append(", address=").append(address);
        sb.append(", isDel=").append(isDel);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_detail
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        QuestionDetail other = (QuestionDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getPhoneNum() == null ? other.getPhoneNum() == null : this.getPhoneNum().equals(other.getPhoneNum()))
            && (this.getDescDetail() == null ? other.getDescDetail() == null : this.getDescDetail().equals(other.getDescDetail()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_detail
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getPhoneNum() == null) ? 0 : getPhoneNum().hashCode());
        result = prime * result + ((getDescDetail() == null) ? 0 : getDescDetail().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table question_detail
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    public enum IsDel {
        NOT_DELETED(new Integer("0"), "未删除"),
        IS_DELETED(new Integer("1"), "已删除");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table question_detail
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        private final Integer value;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table question_detail
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        private final String name;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table question_detail
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        IsDel(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table question_detail
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        public Integer getValue() {
            return this.value;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table question_detail
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        public Integer value() {
            return this.value;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table question_detail
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        public String getName() {
            return this.name;
        }
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table question_detail
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        gender("gender", "gender", "INTEGER", false),
        phoneNum("phone_num", "phoneNum", "VARCHAR", false),
        descDetail("desc_detail", "descDetail", "VARCHAR", false),
        address("address", "address", "VARCHAR", false),
        isDel("is_del", "isDel", "INTEGER", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table question_detail
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table question_detail
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table question_detail
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table question_detail
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table question_detail
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table question_detail
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table question_detail
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table question_detail
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table question_detail
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table question_detail
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table question_detail
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table question_detail
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table question_detail
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table question_detail
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table question_detail
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table question_detail
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}