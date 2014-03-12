package com.aimluck.eip.cayenne.om.portlet.auto;

/** Class _EipTProjectTaskMember was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipTProjectTaskMember extends org.apache.cayenne.CayenneDataObject {

    public static final String TASK_ID_PROPERTY = "taskId";
    public static final String USER_ID_PROPERTY = "userId";
    public static final String WORKLOAD_PROPERTY = "workload";
    public static final String EIP_TPROJECT_TASK_PROPERTY = "eipTProjectTask";

    public static final String ID_PK_COLUMN = "ID";

    public void setTaskId(Integer taskId) {
        writeProperty("taskId", taskId);
    }
    public Integer getTaskId() {
        return (Integer)readProperty("taskId");
    }
    
    
    public void setUserId(Integer userId) {
        writeProperty("userId", userId);
    }
    public Integer getUserId() {
        return (Integer)readProperty("userId");
    }
    
    
    public void setWorkload(java.math.BigDecimal workload) {
        writeProperty("workload", workload);
    }
    public java.math.BigDecimal getWorkload() {
        return (java.math.BigDecimal)readProperty("workload");
    }
    
    
    public void setEipTProjectTask(com.aimluck.eip.cayenne.om.portlet.EipTProjectTask eipTProjectTask) {
        setToOneTarget("eipTProjectTask", eipTProjectTask, true);
    }

    public com.aimluck.eip.cayenne.om.portlet.EipTProjectTask getEipTProjectTask() {
        return (com.aimluck.eip.cayenne.om.portlet.EipTProjectTask)readProperty("eipTProjectTask");
    } 
    
    
}
