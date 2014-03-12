package com.aimluck.eip.cayenne.om.portlet.auto;

/** Class _EipMProjectKubunValue was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipMProjectKubunValue extends org.apache.cayenne.CayenneDataObject {

    public static final String CREATE_DATE_PROPERTY = "createDate";
    public static final String ORDER_NO_PROPERTY = "orderNo";
    public static final String PROJECT_KUBUN_VALUE_PROPERTY = "projectKubunValue";
    public static final String PROJECT_KUBUN_VALUE_CD_PROPERTY = "projectKubunValueCd";
    public static final String UPDATE_DATE_PROPERTY = "updateDate";
    public static final String PROJECT_KUBUN_PROPERTY = "projectKubun";

    public static final String PROJECT_KUBUN_VALUE_ID_PK_COLUMN = "PROJECT_KUBUN_VALUE_ID";

    public void setCreateDate(java.util.Date createDate) {
        writeProperty("createDate", createDate);
    }
    public java.util.Date getCreateDate() {
        return (java.util.Date)readProperty("createDate");
    }
    
    
    public void setOrderNo(Integer orderNo) {
        writeProperty("orderNo", orderNo);
    }
    public Integer getOrderNo() {
        return (Integer)readProperty("orderNo");
    }
    
    
    public void setProjectKubunValue(String projectKubunValue) {
        writeProperty("projectKubunValue", projectKubunValue);
    }
    public String getProjectKubunValue() {
        return (String)readProperty("projectKubunValue");
    }
    
    
    public void setProjectKubunValueCd(String projectKubunValueCd) {
        writeProperty("projectKubunValueCd", projectKubunValueCd);
    }
    public String getProjectKubunValueCd() {
        return (String)readProperty("projectKubunValueCd");
    }
    
    
    public void setUpdateDate(java.util.Date updateDate) {
        writeProperty("updateDate", updateDate);
    }
    public java.util.Date getUpdateDate() {
        return (java.util.Date)readProperty("updateDate");
    }
    
    
    public void setProjectKubun(com.aimluck.eip.cayenne.om.portlet.EipMProjectKubun projectKubun) {
        setToOneTarget("projectKubun", projectKubun, true);
    }

    public com.aimluck.eip.cayenne.om.portlet.EipMProjectKubun getProjectKubun() {
        return (com.aimluck.eip.cayenne.om.portlet.EipMProjectKubun)readProperty("projectKubun");
    } 
    
    
}
