package example.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class RoleMenuDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.815+08:00", comments="Source Table: demo_role_menu")
    public static final RoleMenu roleMenu = new RoleMenu();

    /**
     * Database Column Remarks:
     *   主键
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.815+08:00", comments="Source field: demo_role_menu.id")
    public static final SqlColumn<String> id = roleMenu.id;

    /**
     * Database Column Remarks:
     *   角色id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.815+08:00", comments="Source field: demo_role_menu.role_id")
    public static final SqlColumn<String> roleId = roleMenu.roleId;

    /**
     * Database Column Remarks:
     *   菜单id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.815+08:00", comments="Source field: demo_role_menu.menu_id")
    public static final SqlColumn<String> menuId = roleMenu.menuId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.815+08:00", comments="Source Table: demo_role_menu")
    public static final class RoleMenu extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> roleId = column("role_id", JDBCType.VARCHAR);

        public final SqlColumn<String> menuId = column("menu_id", JDBCType.VARCHAR);

        public RoleMenu() {
            super("demo_role_menu");
        }
    }
}