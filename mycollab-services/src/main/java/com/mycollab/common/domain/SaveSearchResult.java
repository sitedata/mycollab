/*Domain class of table s_save_search_result*/
package com.mycollab.common.domain;

import com.mycollab.core.arguments.ValuedBean;
import com.mycollab.db.metadata.Column;
import com.mycollab.db.metadata.Table;
import java.util.Date;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.ibatis.type.Alias;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("s_save_search_result")
@Alias("SaveSearchResult")
public class SaveSearchResult extends ValuedBean {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_save_search_result.id
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    @Column("id")
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_save_search_result.saveUser
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    @Length(max=45, message="Field value is too long")
    @Column("saveUser")
    private String saveuser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_save_search_result.sAccountId
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    @Column("sAccountId")
    private Integer saccountid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_save_search_result.type
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    @Length(max=45, message="Field value is too long")
    @Column("type")
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_save_search_result.createdTime
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    @Column("createdTime")
    private Date createdtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_save_search_result.lastUpdatedTime
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    @Column("lastUpdatedTime")
    private Date lastupdatedtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_save_search_result.queryName
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    @Length(max=400, message="Field value is too long")
    @Column("queryName")
    private String queryname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_save_search_result.isShared
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    @Column("isShared")
    private Boolean isshared;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_save_search_result.queryText
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    @Length(max=65535, message="Field value is too long")
    @Column("queryText")
    private String querytext;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (!obj.getClass().isAssignableFrom(getClass())) { return false;}
        SaveSearchResult item = (SaveSearchResult)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(1247, 1515).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_save_search_result.id
     *
     * @return the value of s_save_search_result.id
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_save_search_result.id
     *
     * @param id the value for s_save_search_result.id
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_save_search_result.saveUser
     *
     * @return the value of s_save_search_result.saveUser
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public String getSaveuser() {
        return saveuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_save_search_result.saveUser
     *
     * @param saveuser the value for s_save_search_result.saveUser
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public void setSaveuser(String saveuser) {
        this.saveuser = saveuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_save_search_result.sAccountId
     *
     * @return the value of s_save_search_result.sAccountId
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_save_search_result.sAccountId
     *
     * @param saccountid the value for s_save_search_result.sAccountId
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_save_search_result.type
     *
     * @return the value of s_save_search_result.type
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_save_search_result.type
     *
     * @param type the value for s_save_search_result.type
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_save_search_result.createdTime
     *
     * @return the value of s_save_search_result.createdTime
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_save_search_result.createdTime
     *
     * @param createdtime the value for s_save_search_result.createdTime
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_save_search_result.lastUpdatedTime
     *
     * @return the value of s_save_search_result.lastUpdatedTime
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public Date getLastupdatedtime() {
        return lastupdatedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_save_search_result.lastUpdatedTime
     *
     * @param lastupdatedtime the value for s_save_search_result.lastUpdatedTime
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public void setLastupdatedtime(Date lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_save_search_result.queryName
     *
     * @return the value of s_save_search_result.queryName
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public String getQueryname() {
        return queryname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_save_search_result.queryName
     *
     * @param queryname the value for s_save_search_result.queryName
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public void setQueryname(String queryname) {
        this.queryname = queryname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_save_search_result.isShared
     *
     * @return the value of s_save_search_result.isShared
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public Boolean getIsshared() {
        return isshared;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_save_search_result.isShared
     *
     * @param isshared the value for s_save_search_result.isShared
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public void setIsshared(Boolean isshared) {
        this.isshared = isshared;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_save_search_result.queryText
     *
     * @return the value of s_save_search_result.queryText
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public String getQuerytext() {
        return querytext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_save_search_result.queryText
     *
     * @param querytext the value for s_save_search_result.queryText
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public void setQuerytext(String querytext) {
        this.querytext = querytext;
    }

    public enum Field {
        id,
        saveuser,
        saccountid,
        type,
        createdtime,
        lastupdatedtime,
        queryname,
        isshared,
        querytext;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}