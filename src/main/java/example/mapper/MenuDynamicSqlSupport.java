package example.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MenuDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.801+08:00", comments="Source Table: demo_menu")
    public static final Menu menu = new Menu();

    /**
     * Database Column Remarks:
     *   菜单id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.802+08:00", comments="Source field: demo_menu.id")
    public static final SqlColumn<String> id = menu.id;

    /**
     * Database Column Remarks:
     *   父菜单id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.802+08:00", comments="Source field: demo_menu.parent_id")
    public static final SqlColumn<String> parentId = menu.parentId;

    /**
     * Database Column Remarks:
     *   菜单名
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.802+08:00", comments="Source field: demo_menu.name")
    public static final SqlColumn<String> name = menu.name;

    /**
     * Database Column Remarks:
     *   菜单先后
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.802+08:00", comments="Source field: demo_menu.order")
    public static final SqlColumn<Byte> order = menu.order;

    /**
     * Database Column Remarks:
     *   菜单url
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.802+08:00", comments="Source field: demo_menu.url")
    public static final SqlColumn<String> url = menu.url;

    /**
     * Database Column Remarks:
     *   是否父菜单
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.802+08:00", comments="Source field: demo_menu.is_parent")
    public static final SqlColumn<Boolean> isParent = menu.isParent;

    /**
     * Database Column Remarks:
     *   记录是否已删除
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.802+08:00", comments="Source field: demo_menu.deleted")
    public static final SqlColumn<Boolean> deleted = menu.deleted;

    /**
     * Database Column Remarks:
     *   记录创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.802+08:00", comments="Source field: demo_menu.gmt_create")
    public static final SqlColumn<Date> gmtCreate = menu.gmtCreate;

    /**
     * Database Column Remarks:
     *   记录更新时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.802+08:00", comments="Source field: demo_menu.gmt_modified")
    public static final SqlColumn<Date> gmtModified = menu.gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.802+08:00", comments="Source Table: demo_menu")
    public static final class Menu extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> parentId = column("parent_id", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Byte> order = column("order", JDBCType.TINYINT);

        public final SqlColumn<String> url = column("url", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> isParent = column("is_parent", JDBCType.BIT);

        public final SqlColumn<Boolean> deleted = column("deleted", JDBCType.BIT);

        public final SqlColumn<Date> gmtCreate = column("gmt_create", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> gmtModified = column("gmt_modified", JDBCType.TIMESTAMP);

        public Menu() {
            super("demo_menu");
        }
    }
}