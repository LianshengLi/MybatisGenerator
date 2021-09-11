package example.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EmployeeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.809+08:00", comments="Source Table: demo_employee")
    public static final Employee employee = new Employee();

    /**
     * Database Column Remarks:
     *   员工id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.809+08:00", comments="Source field: demo_employee.id")
    public static final SqlColumn<String> id = employee.id;

    /**
     * Database Column Remarks:
     *   员工姓名
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.809+08:00", comments="Source field: demo_employee.name")
    public static final SqlColumn<String> name = employee.name;

    /**
     * Database Column Remarks:
     *   员工性别 0表示女，1表示男
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.809+08:00", comments="Source field: demo_employee.gender")
    public static final SqlColumn<Boolean> gender = employee.gender;

    /**
     * Database Column Remarks:
     *   员工工号
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.809+08:00", comments="Source field: demo_employee.no")
    public static final SqlColumn<String> no = employee.no;

    /**
     * Database Column Remarks:
     *   员工密码
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.809+08:00", comments="Source field: demo_employee.password")
    public static final SqlColumn<String> password = employee.password;

    /**
     * Database Column Remarks:
     *   员工手机电话
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.809+08:00", comments="Source field: demo_employee.phone")
    public static final SqlColumn<String> phone = employee.phone;

    /**
     * Database Column Remarks:
     *   员工住址
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.81+08:00", comments="Source field: demo_employee.address")
    public static final SqlColumn<String> address = employee.address;

    /**
     * Database Column Remarks:
     *   员工状态 0为禁用,1为启用,2为冻结
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.81+08:00", comments="Source field: demo_employee.status")
    public static final SqlColumn<Byte> status = employee.status;

    /**
     * Database Column Remarks:
     *   记录是否已删除
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.81+08:00", comments="Source field: demo_employee.deleted")
    public static final SqlColumn<Boolean> deleted = employee.deleted;

    /**
     * Database Column Remarks:
     *   员工所属部门id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.81+08:00", comments="Source field: demo_employee.department_id")
    public static final SqlColumn<String> departmentId = employee.departmentId;

    /**
     * Database Column Remarks:
     *   记录创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.81+08:00", comments="Source field: demo_employee.gmt_create")
    public static final SqlColumn<Date> gmtCreate = employee.gmtCreate;

    /**
     * Database Column Remarks:
     *   记录更新时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.81+08:00", comments="Source field: demo_employee.gmt_modified")
    public static final SqlColumn<Date> gmtModified = employee.gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.809+08:00", comments="Source Table: demo_employee")
    public static final class Employee extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> gender = column("gender", JDBCType.BIT);

        public final SqlColumn<String> no = column("no", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<String> phone = column("phone", JDBCType.VARCHAR);

        public final SqlColumn<String> address = column("address", JDBCType.VARCHAR);

        public final SqlColumn<Byte> status = column("status", JDBCType.TINYINT);

        public final SqlColumn<Boolean> deleted = column("deleted", JDBCType.BIT);

        public final SqlColumn<String> departmentId = column("department_id", JDBCType.VARCHAR);

        public final SqlColumn<Date> gmtCreate = column("gmt_create", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> gmtModified = column("gmt_modified", JDBCType.TIMESTAMP);

        public Employee() {
            super("demo_employee");
        }
    }
}