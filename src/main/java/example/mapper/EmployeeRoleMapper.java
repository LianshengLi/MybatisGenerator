package example.mapper;

import static example.mapper.EmployeeRoleDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import example.model.EmployeeRole;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface EmployeeRoleMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.813+08:00", comments="Source Table: demo_employee_role")
    BasicColumn[] selectList = BasicColumn.columnList(id, employeeId, roleId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.812+08:00", comments="Source Table: demo_employee_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.813+08:00", comments="Source Table: demo_employee_role")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.813+08:00", comments="Source Table: demo_employee_role")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<EmployeeRole> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.813+08:00", comments="Source Table: demo_employee_role")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<EmployeeRole> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.813+08:00", comments="Source Table: demo_employee_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("EmployeeRoleResult")
    Optional<EmployeeRole> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.813+08:00", comments="Source Table: demo_employee_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="EmployeeRoleResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="employee_id", property="employeeId", jdbcType=JdbcType.VARCHAR),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.VARCHAR)
    })
    List<EmployeeRole> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.813+08:00", comments="Source Table: demo_employee_role")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.813+08:00", comments="Source Table: demo_employee_role")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, employeeRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.813+08:00", comments="Source Table: demo_employee_role")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, employeeRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.813+08:00", comments="Source Table: demo_employee_role")
    default int deleteByPrimaryKey(String id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.813+08:00", comments="Source Table: demo_employee_role")
    default int insert(EmployeeRole record) {
        return MyBatis3Utils.insert(this::insert, record, employeeRole, c ->
            c.map(id).toProperty("id")
            .map(employeeId).toProperty("employeeId")
            .map(roleId).toProperty("roleId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.813+08:00", comments="Source Table: demo_employee_role")
    default int insertMultiple(Collection<EmployeeRole> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, employeeRole, c ->
            c.map(id).toProperty("id")
            .map(employeeId).toProperty("employeeId")
            .map(roleId).toProperty("roleId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.813+08:00", comments="Source Table: demo_employee_role")
    default int insertSelective(EmployeeRole record) {
        return MyBatis3Utils.insert(this::insert, record, employeeRole, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(employeeId).toPropertyWhenPresent("employeeId", record::getEmployeeId)
            .map(roleId).toPropertyWhenPresent("roleId", record::getRoleId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.813+08:00", comments="Source Table: demo_employee_role")
    default Optional<EmployeeRole> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, employeeRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.813+08:00", comments="Source Table: demo_employee_role")
    default List<EmployeeRole> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, employeeRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.813+08:00", comments="Source Table: demo_employee_role")
    default List<EmployeeRole> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, employeeRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.813+08:00", comments="Source Table: demo_employee_role")
    default Optional<EmployeeRole> selectByPrimaryKey(String id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.813+08:00", comments="Source Table: demo_employee_role")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, employeeRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.813+08:00", comments="Source Table: demo_employee_role")
    static UpdateDSL<UpdateModel> updateAllColumns(EmployeeRole record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(employeeId).equalTo(record::getEmployeeId)
                .set(roleId).equalTo(record::getRoleId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.813+08:00", comments="Source Table: demo_employee_role")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(EmployeeRole record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(employeeId).equalToWhenPresent(record::getEmployeeId)
                .set(roleId).equalToWhenPresent(record::getRoleId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.813+08:00", comments="Source Table: demo_employee_role")
    default int updateByPrimaryKey(EmployeeRole record) {
        return update(c ->
            c.set(employeeId).equalTo(record::getEmployeeId)
            .set(roleId).equalTo(record::getRoleId)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.813+08:00", comments="Source Table: demo_employee_role")
    default int updateByPrimaryKeySelective(EmployeeRole record) {
        return update(c ->
            c.set(employeeId).equalToWhenPresent(record::getEmployeeId)
            .set(roleId).equalToWhenPresent(record::getRoleId)
            .where(id, isEqualTo(record::getId))
        );
    }
}