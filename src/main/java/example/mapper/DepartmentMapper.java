package example.mapper;

import static example.mapper.DepartmentDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import example.model.Department;
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
public interface DepartmentMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.795+08:00", comments="Source Table: demo_department")
    BasicColumn[] selectList = BasicColumn.columnList(id, no, parentId, name, type, deleted, gmtCreate, gmtModified);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.788+08:00", comments="Source Table: demo_department")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.789+08:00", comments="Source Table: demo_department")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.789+08:00", comments="Source Table: demo_department")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Department> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.789+08:00", comments="Source Table: demo_department")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Department> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.79+08:00", comments="Source Table: demo_department")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DepartmentResult")
    Optional<Department> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.79+08:00", comments="Source Table: demo_department")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DepartmentResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="no", property="no", jdbcType=JdbcType.VARCHAR),
        @Result(column="parent_id", property="parentId", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.BIT),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Department> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.791+08:00", comments="Source Table: demo_department")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.791+08:00", comments="Source Table: demo_department")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, department, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.792+08:00", comments="Source Table: demo_department")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, department, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.792+08:00", comments="Source Table: demo_department")
    default int deleteByPrimaryKey(String id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.792+08:00", comments="Source Table: demo_department")
    default int insert(Department record) {
        return MyBatis3Utils.insert(this::insert, record, department, c ->
            c.map(id).toProperty("id")
            .map(no).toProperty("no")
            .map(parentId).toProperty("parentId")
            .map(name).toProperty("name")
            .map(type).toProperty("type")
            .map(deleted).toProperty("deleted")
            .map(gmtCreate).toProperty("gmtCreate")
            .map(gmtModified).toProperty("gmtModified")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.793+08:00", comments="Source Table: demo_department")
    default int insertMultiple(Collection<Department> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, department, c ->
            c.map(id).toProperty("id")
            .map(no).toProperty("no")
            .map(parentId).toProperty("parentId")
            .map(name).toProperty("name")
            .map(type).toProperty("type")
            .map(deleted).toProperty("deleted")
            .map(gmtCreate).toProperty("gmtCreate")
            .map(gmtModified).toProperty("gmtModified")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.794+08:00", comments="Source Table: demo_department")
    default int insertSelective(Department record) {
        return MyBatis3Utils.insert(this::insert, record, department, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(no).toPropertyWhenPresent("no", record::getNo)
            .map(parentId).toPropertyWhenPresent("parentId", record::getParentId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(type).toPropertyWhenPresent("type", record::getType)
            .map(deleted).toPropertyWhenPresent("deleted", record::getDeleted)
            .map(gmtCreate).toPropertyWhenPresent("gmtCreate", record::getGmtCreate)
            .map(gmtModified).toPropertyWhenPresent("gmtModified", record::getGmtModified)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.795+08:00", comments="Source Table: demo_department")
    default Optional<Department> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, department, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.795+08:00", comments="Source Table: demo_department")
    default List<Department> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, department, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.796+08:00", comments="Source Table: demo_department")
    default List<Department> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, department, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.796+08:00", comments="Source Table: demo_department")
    default Optional<Department> selectByPrimaryKey(String id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.796+08:00", comments="Source Table: demo_department")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, department, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.797+08:00", comments="Source Table: demo_department")
    static UpdateDSL<UpdateModel> updateAllColumns(Department record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(no).equalTo(record::getNo)
                .set(parentId).equalTo(record::getParentId)
                .set(name).equalTo(record::getName)
                .set(type).equalTo(record::getType)
                .set(deleted).equalTo(record::getDeleted)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.797+08:00", comments="Source Table: demo_department")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Department record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(no).equalToWhenPresent(record::getNo)
                .set(parentId).equalToWhenPresent(record::getParentId)
                .set(name).equalToWhenPresent(record::getName)
                .set(type).equalToWhenPresent(record::getType)
                .set(deleted).equalToWhenPresent(record::getDeleted)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.798+08:00", comments="Source Table: demo_department")
    default int updateByPrimaryKey(Department record) {
        return update(c ->
            c.set(no).equalTo(record::getNo)
            .set(parentId).equalTo(record::getParentId)
            .set(name).equalTo(record::getName)
            .set(type).equalTo(record::getType)
            .set(deleted).equalTo(record::getDeleted)
            .set(gmtCreate).equalTo(record::getGmtCreate)
            .set(gmtModified).equalTo(record::getGmtModified)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-11T15:24:03.798+08:00", comments="Source Table: demo_department")
    default int updateByPrimaryKeySelective(Department record) {
        return update(c ->
            c.set(no).equalToWhenPresent(record::getNo)
            .set(parentId).equalToWhenPresent(record::getParentId)
            .set(name).equalToWhenPresent(record::getName)
            .set(type).equalToWhenPresent(record::getType)
            .set(deleted).equalToWhenPresent(record::getDeleted)
            .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
            .set(gmtModified).equalToWhenPresent(record::getGmtModified)
            .where(id, isEqualTo(record::getId))
        );
    }
}