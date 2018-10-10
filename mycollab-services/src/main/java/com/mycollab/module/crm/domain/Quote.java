/*Domain class of table m_crm_quote*/
package com.mycollab.module.crm.domain;

import com.mycollab.core.arguments.ValuedBean;
import com.mycollab.db.metadata.Column;
import com.mycollab.db.metadata.Table;
import java.util.Date;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.ibatis.type.Alias;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("m_crm_quote")
@Alias("Quote")
public class Quote extends ValuedBean {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_quote.id
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Column("id")
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_quote.subject
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Length(max=255, message="Field value is too long")
    @Column("subject")
    private String subject;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_quote.quotestage
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Length(max=45, message="Field value is too long")
    @Column("quotestage")
    private String quotestage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_quote.opportunityid
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Column("opportunityid")
    private Integer opportunityid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_quote.validuntil
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Column("validuntil")
    private Date validuntil;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_quote.shipping
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Length(max=255, message="Field value is too long")
    @Column("shipping")
    private String shipping;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_quote.billaccount
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Column("billaccount")
    private Integer billaccount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_quote.billcontact
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Column("billcontact")
    private Integer billcontact;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_quote.shipaccount
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Column("shipaccount")
    private Integer shipaccount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_quote.shipcontact
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Column("shipcontact")
    private Integer shipcontact;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_quote.billingaddress
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Length(max=255, message="Field value is too long")
    @Column("billingaddress")
    private String billingaddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_quote.billingcity
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Length(max=255, message="Field value is too long")
    @Column("billingcity")
    private String billingcity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_quote.billingstate
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Length(max=45, message="Field value is too long")
    @Column("billingstate")
    private String billingstate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_quote.billingpostalcode
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Length(max=45, message="Field value is too long")
    @Column("billingpostalcode")
    private String billingpostalcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_quote.billingcountry
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Length(max=45, message="Field value is too long")
    @Column("billingcountry")
    private String billingcountry;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_quote.shippingaddress
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Length(max=255, message="Field value is too long")
    @Column("shippingaddress")
    private String shippingaddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_quote.shippingcity
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Length(max=255, message="Field value is too long")
    @Column("shippingcity")
    private String shippingcity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_quote.shippingstate
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Length(max=45, message="Field value is too long")
    @Column("shippingstate")
    private String shippingstate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_quote.shippingpostalcode
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Length(max=45, message="Field value is too long")
    @Column("shippingpostalcode")
    private String shippingpostalcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_quote.shippingcountry
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Length(max=45, message="Field value is too long")
    @Column("shippingcountry")
    private String shippingcountry;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_quote.description
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Length(max=4000, message="Field value is too long")
    @Column("description")
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_quote.paymentterm
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Length(max=45, message="Field value is too long")
    @Column("paymentterm")
    private String paymentterm;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_quote.originalpodate
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Column("originalpodate")
    private Date originalpodate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_quote.purchaseordernum
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Length(max=45, message="Field value is too long")
    @Column("purchaseordernum")
    private String purchaseordernum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_quote.createdTime
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Column("createdTime")
    private Date createdtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_quote.createdUser
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Length(max=45, message="Field value is too long")
    @Column("createdUser")
    private String createduser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_quote.sAccountId
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Column("sAccountId")
    private Integer saccountid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_quote.assignUser
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Length(max=45, message="Field value is too long")
    @Column("assignUser")
    private String assignuser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_quote.lastUpdatedTime
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Column("lastUpdatedTime")
    private Date lastupdatedtime;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (!obj.getClass().isAssignableFrom(getClass())) { return false;}
        Quote item = (Quote)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(1815, 1715).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_quote.id
     *
     * @return the value of m_crm_quote.id
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_quote.id
     *
     * @param id the value for m_crm_quote.id
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_quote.subject
     *
     * @return the value of m_crm_quote.subject
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public String getSubject() {
        return subject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_quote.subject
     *
     * @param subject the value for m_crm_quote.subject
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_quote.quotestage
     *
     * @return the value of m_crm_quote.quotestage
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public String getQuotestage() {
        return quotestage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_quote.quotestage
     *
     * @param quotestage the value for m_crm_quote.quotestage
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public void setQuotestage(String quotestage) {
        this.quotestage = quotestage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_quote.opportunityid
     *
     * @return the value of m_crm_quote.opportunityid
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public Integer getOpportunityid() {
        return opportunityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_quote.opportunityid
     *
     * @param opportunityid the value for m_crm_quote.opportunityid
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public void setOpportunityid(Integer opportunityid) {
        this.opportunityid = opportunityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_quote.validuntil
     *
     * @return the value of m_crm_quote.validuntil
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public Date getValiduntil() {
        return validuntil;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_quote.validuntil
     *
     * @param validuntil the value for m_crm_quote.validuntil
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public void setValiduntil(Date validuntil) {
        this.validuntil = validuntil;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_quote.shipping
     *
     * @return the value of m_crm_quote.shipping
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public String getShipping() {
        return shipping;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_quote.shipping
     *
     * @param shipping the value for m_crm_quote.shipping
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public void setShipping(String shipping) {
        this.shipping = shipping;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_quote.billaccount
     *
     * @return the value of m_crm_quote.billaccount
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public Integer getBillaccount() {
        return billaccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_quote.billaccount
     *
     * @param billaccount the value for m_crm_quote.billaccount
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public void setBillaccount(Integer billaccount) {
        this.billaccount = billaccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_quote.billcontact
     *
     * @return the value of m_crm_quote.billcontact
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public Integer getBillcontact() {
        return billcontact;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_quote.billcontact
     *
     * @param billcontact the value for m_crm_quote.billcontact
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public void setBillcontact(Integer billcontact) {
        this.billcontact = billcontact;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_quote.shipaccount
     *
     * @return the value of m_crm_quote.shipaccount
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public Integer getShipaccount() {
        return shipaccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_quote.shipaccount
     *
     * @param shipaccount the value for m_crm_quote.shipaccount
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public void setShipaccount(Integer shipaccount) {
        this.shipaccount = shipaccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_quote.shipcontact
     *
     * @return the value of m_crm_quote.shipcontact
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public Integer getShipcontact() {
        return shipcontact;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_quote.shipcontact
     *
     * @param shipcontact the value for m_crm_quote.shipcontact
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public void setShipcontact(Integer shipcontact) {
        this.shipcontact = shipcontact;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_quote.billingaddress
     *
     * @return the value of m_crm_quote.billingaddress
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public String getBillingaddress() {
        return billingaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_quote.billingaddress
     *
     * @param billingaddress the value for m_crm_quote.billingaddress
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public void setBillingaddress(String billingaddress) {
        this.billingaddress = billingaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_quote.billingcity
     *
     * @return the value of m_crm_quote.billingcity
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public String getBillingcity() {
        return billingcity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_quote.billingcity
     *
     * @param billingcity the value for m_crm_quote.billingcity
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public void setBillingcity(String billingcity) {
        this.billingcity = billingcity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_quote.billingstate
     *
     * @return the value of m_crm_quote.billingstate
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public String getBillingstate() {
        return billingstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_quote.billingstate
     *
     * @param billingstate the value for m_crm_quote.billingstate
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public void setBillingstate(String billingstate) {
        this.billingstate = billingstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_quote.billingpostalcode
     *
     * @return the value of m_crm_quote.billingpostalcode
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public String getBillingpostalcode() {
        return billingpostalcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_quote.billingpostalcode
     *
     * @param billingpostalcode the value for m_crm_quote.billingpostalcode
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public void setBillingpostalcode(String billingpostalcode) {
        this.billingpostalcode = billingpostalcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_quote.billingcountry
     *
     * @return the value of m_crm_quote.billingcountry
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public String getBillingcountry() {
        return billingcountry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_quote.billingcountry
     *
     * @param billingcountry the value for m_crm_quote.billingcountry
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public void setBillingcountry(String billingcountry) {
        this.billingcountry = billingcountry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_quote.shippingaddress
     *
     * @return the value of m_crm_quote.shippingaddress
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public String getShippingaddress() {
        return shippingaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_quote.shippingaddress
     *
     * @param shippingaddress the value for m_crm_quote.shippingaddress
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public void setShippingaddress(String shippingaddress) {
        this.shippingaddress = shippingaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_quote.shippingcity
     *
     * @return the value of m_crm_quote.shippingcity
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public String getShippingcity() {
        return shippingcity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_quote.shippingcity
     *
     * @param shippingcity the value for m_crm_quote.shippingcity
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public void setShippingcity(String shippingcity) {
        this.shippingcity = shippingcity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_quote.shippingstate
     *
     * @return the value of m_crm_quote.shippingstate
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public String getShippingstate() {
        return shippingstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_quote.shippingstate
     *
     * @param shippingstate the value for m_crm_quote.shippingstate
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public void setShippingstate(String shippingstate) {
        this.shippingstate = shippingstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_quote.shippingpostalcode
     *
     * @return the value of m_crm_quote.shippingpostalcode
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public String getShippingpostalcode() {
        return shippingpostalcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_quote.shippingpostalcode
     *
     * @param shippingpostalcode the value for m_crm_quote.shippingpostalcode
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public void setShippingpostalcode(String shippingpostalcode) {
        this.shippingpostalcode = shippingpostalcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_quote.shippingcountry
     *
     * @return the value of m_crm_quote.shippingcountry
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public String getShippingcountry() {
        return shippingcountry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_quote.shippingcountry
     *
     * @param shippingcountry the value for m_crm_quote.shippingcountry
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public void setShippingcountry(String shippingcountry) {
        this.shippingcountry = shippingcountry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_quote.description
     *
     * @return the value of m_crm_quote.description
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_quote.description
     *
     * @param description the value for m_crm_quote.description
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_quote.paymentterm
     *
     * @return the value of m_crm_quote.paymentterm
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public String getPaymentterm() {
        return paymentterm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_quote.paymentterm
     *
     * @param paymentterm the value for m_crm_quote.paymentterm
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public void setPaymentterm(String paymentterm) {
        this.paymentterm = paymentterm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_quote.originalpodate
     *
     * @return the value of m_crm_quote.originalpodate
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public Date getOriginalpodate() {
        return originalpodate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_quote.originalpodate
     *
     * @param originalpodate the value for m_crm_quote.originalpodate
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public void setOriginalpodate(Date originalpodate) {
        this.originalpodate = originalpodate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_quote.purchaseordernum
     *
     * @return the value of m_crm_quote.purchaseordernum
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public String getPurchaseordernum() {
        return purchaseordernum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_quote.purchaseordernum
     *
     * @param purchaseordernum the value for m_crm_quote.purchaseordernum
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public void setPurchaseordernum(String purchaseordernum) {
        this.purchaseordernum = purchaseordernum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_quote.createdTime
     *
     * @return the value of m_crm_quote.createdTime
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_quote.createdTime
     *
     * @param createdtime the value for m_crm_quote.createdTime
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_quote.createdUser
     *
     * @return the value of m_crm_quote.createdUser
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public String getCreateduser() {
        return createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_quote.createdUser
     *
     * @param createduser the value for m_crm_quote.createdUser
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public void setCreateduser(String createduser) {
        this.createduser = createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_quote.sAccountId
     *
     * @return the value of m_crm_quote.sAccountId
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_quote.sAccountId
     *
     * @param saccountid the value for m_crm_quote.sAccountId
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_quote.assignUser
     *
     * @return the value of m_crm_quote.assignUser
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public String getAssignuser() {
        return assignuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_quote.assignUser
     *
     * @param assignuser the value for m_crm_quote.assignUser
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public void setAssignuser(String assignuser) {
        this.assignuser = assignuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_quote.lastUpdatedTime
     *
     * @return the value of m_crm_quote.lastUpdatedTime
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public Date getLastupdatedtime() {
        return lastupdatedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_quote.lastUpdatedTime
     *
     * @param lastupdatedtime the value for m_crm_quote.lastUpdatedTime
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public void setLastupdatedtime(Date lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    public enum Field {
        id,
        subject,
        quotestage,
        opportunityid,
        validuntil,
        shipping,
        billaccount,
        billcontact,
        shipaccount,
        shipcontact,
        billingaddress,
        billingcity,
        billingstate,
        billingpostalcode,
        billingcountry,
        shippingaddress,
        shippingcity,
        shippingstate,
        shippingpostalcode,
        shippingcountry,
        description,
        paymentterm,
        originalpodate,
        purchaseordernum,
        createdtime,
        createduser,
        saccountid,
        assignuser,
        lastupdatedtime;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}