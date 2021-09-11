package example.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class RoleDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.805+08:00", comments="Source Table: demo_role")
    public static final Role role = new Role();

    /**
     * Database Column Remarks:
     *   角色id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.805+08:00", comments="Source field: demo_role.id")
    public static final SqlColumn<String> id = role.id;

    /**
     * Database Column Remarks:
     *   角色名称
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.805+08:00", comments="Source field: demo_role.name")
    public static final SqlColumn<String> name = role.name;

    /**
     * Database Column Remarks:
     *   是否通用
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.805+08:00", comments="Source field: demo_role.is_general")
    public static final SqlColumn<Boolean> isGeneral = role.isGeneral;

    /**
     * Database Column Remarks:
     *   记录是否已删除
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.805+08:00", comments="Source field: demo_role.deleted")
    public static final SqlColumn<Boolean> deleted = role.deleted;

    /**
     * Database Column Remarks:
     *   记录创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.806+08:00", comments="Source field: demo_role.gmt_create")
    public static final SqlColumn<Date> gmtCreate = role.gmtCreate;

    /**
     * Database Column Remarks:
     *   记录更新时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.806+08:00", comments="Source field: demo_role.gmt_modified")
    public static final SqlColumn<Date> gmtModified = role.gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.805+08:00", comments="Source Table: demo_role")
    public static final class Role extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> isGeneral = column("is_general", JDBCType.BIT);

        public final SqlColumn<Boolean> deleted = column("deleted", JDBCType.BIT);

        public final SqlColumn<Date> gmtCreate = column("gmt_create", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> gmtModified = column("gmt_modified", JDBCType.TIMESTAMP);

        public Role() {
            super("demo_role");
        }
    }
}