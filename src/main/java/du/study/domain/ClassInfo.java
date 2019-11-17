package du.study.domain;




import du.study.common.error.ErrorType;
import du.study.validator.annotation.ClassInfoCheck;

import java.io.Serializable;

public class ClassInfo extends BaseDomain implements Serializable {
    private static final long serialVersionUID = -1559537238538697533L;

    @ClassInfoCheck(message = "error")
    private String name;

    private Integer classId;

    public ClassInfo(){
        super(ErrorType.SUCCESS);
    }
    public ClassInfo(String name, Integer classId) {
        super(0,"SUCCESS");
        this.name = name;
        this.classId = classId;
    }

    public ClassInfo(ErrorType errorType){
        super(errorType);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }
}
