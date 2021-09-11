package example.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DepartmentDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.786+08:00", comments="Source Table: demo_department")
    public static final Department department = new Department();

    /**
     * Database Column Remarks:
     *   部门id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.786+08:00", comments="Source field: demo_department.id")
    public static final SqlColumn<String> id = department.id;

    /**
     * Database Column Remarks:
     *   部门编码
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.787+08:00", comments="Source field: demo_department.no")
    public static final SqlColumn<String> no = department.no;

    /**
     * Database Column Remarks:
     *   上级部门id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.787+08:00", comments="Source field: demo_department.parent_id")
    public static final SqlColumn<String> parentId = department.parentId;

    /**
     * Database Column Remarks:
     *   部门名称
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.787+08:00", comments="Source field: demo_department.name")
    public static final SqlColumn<String> name = department.name;

    /**
     * Database Column Remarks:
     *   部门类型 department部门，group小组
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.787+08:00", comments="Source field: demo_department.type")
    public static final SqlColumn<String> type = department.type;

    /**
     * Database Column Remarks:
     *   记录是否删除
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.787+08:00", comments="Source field: demo_department.deleted")
    public static final SqlColumn<Boolean> deleted = department.deleted;

    /**
     * Database Column Remarks:
     *   记录创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.787+08:00", comments="Source field: demo_department.gmt_create")
    public static final SqlColumn<Date> gmtCreate = department.gmtCreate;

    /**
     * Database Column Remarks:
     *   记录更新时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.787+08:00", comments="Source field: demo_department.gmt_modified")
    public static final SqlColumn<Date> gmtModified = department.gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.786+08:00", comments="Source Table: demo_department")
    public static final class Department extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> no = column("no", JDBCType.VARCHAR);

        public final SqlColumn<String> parentId = column("parent_id", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> type = column("type", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> deleted = column("deleted", JDBCType.BIT);

        public final SqlColumn<Date> gmtCreate = column("gmt_create", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> gmtModified = column("gmt_modified", JDBCType.TIMESTAMP);

        public Department() {
            super("demo_department");
        }
    }
}