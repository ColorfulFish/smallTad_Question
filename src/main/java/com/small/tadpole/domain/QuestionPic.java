package com.small.tadpole.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table question_pic
 */
@ApiModel(value="com.small.tadpole.domain.QuestionPic")
public class QuestionPic {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table question_pic
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    public static final Integer IS_DELETED = IsDel.IS_DELETED.value();

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table question_pic
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    public static final Integer NOT_DELETED = IsDel.NOT_DELETED.value();

    /**
     * Database Column Remarks:
     *   问题ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_pic.id
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    @ApiModelProperty(value="id问题ID")
    private Integer id;

    /**
     * Database Column Remarks:
     *   图片名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_pic.pic
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    @ApiModelProperty(value="pic图片名称")
    private String pic;

    /**
     * Database Column Remarks:
     *   是否删除
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_pic.is_del
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    @ApiModelProperty(value="isDel是否删除")
    private Integer isDel;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_pic.id
     *
     * @return the value of question_pic.id
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_pic.id
     *
     * @param id the value for question_pic.id
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    public QuestionPic setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_pic.pic
     *
     * @return the value of question_pic.pic
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_pic.pic
     *
     * @param pic the value for question_pic.pic
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    public QuestionPic setPic(String pic) {
        this.pic = pic;
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_pic
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    public void andLogicalDeleted(boolean deleted) {
        setIsDel(deleted ? IsDel.IS_DELETED.value() : IsDel.NOT_DELETED.value());
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_pic.is_del
     *
     * @return the value of question_pic.is_del
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    public Integer getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_pic.is_del
     *
     * @param isDel the value for question_pic.is_del
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    public QuestionPic setIsDel(Integer isDel) {
        this.isDel = isDel;
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_pic
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
        sb.append(", pic=").append(pic);
        sb.append(", isDel=").append(isDel);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_pic
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
        QuestionPic other = (QuestionPic) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPic() == null ? other.getPic() == null : this.getPic().equals(other.getPic()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_pic
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPic() == null) ? 0 : getPic().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table question_pic
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    public enum IsDel {
        NOT_DELETED(new Integer("0"), "未删除"),
        IS_DELETED(new Integer("1"), "已删除");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table question_pic
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        private final Integer value;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table question_pic
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        private final String name;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table question_pic
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        IsDel(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table question_pic
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        public Integer getValue() {
            return this.value;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table question_pic
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        public Integer value() {
            return this.value;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table question_pic
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        public String getName() {
            return this.name;
        }
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table question_pic
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        pic("pic", "pic", "VARCHAR", false),
        isDel("is_del", "isDel", "INTEGER", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table question_pic
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table question_pic
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table question_pic
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table question_pic
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table question_pic
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table question_pic
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table question_pic
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table question_pic
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table question_pic
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table question_pic
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table question_pic
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
         * This method corresponds to the database table question_pic
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table question_pic
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table question_pic
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
         * This method corresponds to the database table question_pic
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
         * This method corresponds to the database table question_pic
         *
         * @mbg.generated Sat Mar 14 16:08:31 CST 2020
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}