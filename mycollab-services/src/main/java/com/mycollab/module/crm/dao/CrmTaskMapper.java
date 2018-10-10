package com.mycollab.module.crm.dao;

import com.mycollab.db.persistence.ICrudGenericDAO;
import com.mycollab.module.crm.domain.CrmTask;
import com.mycollab.module.crm.domain.CrmTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface CrmTaskMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_task
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    long countByExample(CrmTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_task
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    int deleteByExample(CrmTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_task
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Delete({
        "delete from m_crm_task",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_task
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Insert({
        "insert into m_crm_task (id, subject, ",
        "startdate, duedate, ",
        "contactId, typeid, ",
        "createdTime, createdUser, ",
        "sAccountId, status, ",
        "assignUser, priority, ",
        "type, lastUpdatedTime, ",
        "isClosed, description)",
        "values (#{id,jdbcType=INTEGER}, #{subject,jdbcType=VARCHAR}, ",
        "#{startdate,jdbcType=TIMESTAMP}, #{duedate,jdbcType=TIMESTAMP}, ",
        "#{contactid,jdbcType=INTEGER}, #{typeid,jdbcType=INTEGER}, ",
        "#{createdtime,jdbcType=TIMESTAMP}, #{createduser,jdbcType=VARCHAR}, ",
        "#{saccountid,jdbcType=INTEGER}, #{status,jdbcType=VARCHAR}, ",
        "#{assignuser,jdbcType=VARCHAR}, #{priority,jdbcType=VARCHAR}, ",
        "#{type,jdbcType=VARCHAR}, #{lastupdatedtime,jdbcType=TIMESTAMP}, ",
        "#{isclosed,jdbcType=BIT}, #{description,jdbcType=LONGVARCHAR})"
    })
    int insert(CrmTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_task
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    int insertSelective(CrmTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_task
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    List<CrmTask> selectByExampleWithBLOBs(CrmTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_task
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    List<CrmTask> selectByExample(CrmTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_task
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Select({
        "select",
        "id, subject, startdate, duedate, contactId, typeid, createdTime, createdUser, ",
        "sAccountId, status, assignUser, priority, type, lastUpdatedTime, isClosed, description",
        "from m_crm_task",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.mycollab.module.crm.dao.CrmTaskMapper.ResultMapWithBLOBs")
    CrmTask selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_task
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    int updateByExampleSelective(@Param("record") CrmTask record, @Param("example") CrmTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_task
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    int updateByExampleWithBLOBs(@Param("record") CrmTask record, @Param("example") CrmTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_task
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    int updateByExample(@Param("record") CrmTask record, @Param("example") CrmTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_task
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    int updateByPrimaryKeySelective(CrmTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_task
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Update({
        "update m_crm_task",
        "set subject = #{subject,jdbcType=VARCHAR},",
          "startdate = #{startdate,jdbcType=TIMESTAMP},",
          "duedate = #{duedate,jdbcType=TIMESTAMP},",
          "contactId = #{contactid,jdbcType=INTEGER},",
          "typeid = #{typeid,jdbcType=INTEGER},",
          "createdTime = #{createdtime,jdbcType=TIMESTAMP},",
          "createdUser = #{createduser,jdbcType=VARCHAR},",
          "sAccountId = #{saccountid,jdbcType=INTEGER},",
          "status = #{status,jdbcType=VARCHAR},",
          "assignUser = #{assignuser,jdbcType=VARCHAR},",
          "priority = #{priority,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=VARCHAR},",
          "lastUpdatedTime = #{lastupdatedtime,jdbcType=TIMESTAMP},",
          "isClosed = #{isclosed,jdbcType=BIT},",
          "description = #{description,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(CrmTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_task
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Update({
        "update m_crm_task",
        "set subject = #{subject,jdbcType=VARCHAR},",
          "startdate = #{startdate,jdbcType=TIMESTAMP},",
          "duedate = #{duedate,jdbcType=TIMESTAMP},",
          "contactId = #{contactid,jdbcType=INTEGER},",
          "typeid = #{typeid,jdbcType=INTEGER},",
          "createdTime = #{createdtime,jdbcType=TIMESTAMP},",
          "createdUser = #{createduser,jdbcType=VARCHAR},",
          "sAccountId = #{saccountid,jdbcType=INTEGER},",
          "status = #{status,jdbcType=VARCHAR},",
          "assignUser = #{assignuser,jdbcType=VARCHAR},",
          "priority = #{priority,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=VARCHAR},",
          "lastUpdatedTime = #{lastupdatedtime,jdbcType=TIMESTAMP},",
          "isClosed = #{isclosed,jdbcType=BIT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CrmTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_task
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    Integer insertAndReturnKey(CrmTask value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_task
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_task
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    void massUpdateWithSession(@Param("record") CrmTask record, @Param("primaryKeys") List primaryKeys);
}