package example.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EmployeeRoleDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.812+08:00", comments="Source Table: demo_employee_role")
    public static final EmployeeRole employeeRole = new EmployeeRole();

    /**
     * Database Column Remarks:
     *   主键
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.812+08:00", comments="Source field: demo_employee_role.id")
    public static final SqlColumn<String> id = employeeRole.id;

    /**
     * Database Column Remarks:
     *   用户id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.812+08:00", comments="Source field: demo_employee_role.employee_id")
    public static final SqlColumn<String> employeeId = employeeRole.employeeId;

    /**
     * Database Column Remarks:
     *   角色id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.812+08:00", comments="Source field: demo_employee_role.role_id")
    public static final SqlColumn<String> roleId = employeeRole.roleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.812+08:00", comments="Source Table: demo_employee_role")
    public static final class EmployeeRole extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> employeeId = column("employee_id", JDBCType.VARCHAR);

        public final SqlColumn<String> roleId = column("role_id", JDBCType.VARCHAR);

        public EmployeeRole() {
            super("demo_employee_role");
        }
    }
}