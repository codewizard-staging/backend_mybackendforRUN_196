package com.app.mybackendforRUN.function;

import com.app.mybackendforRUN.model.Organization;
import com.app.mybackendforRUN.model.EmployeePersonalInfo;
import com.app.mybackendforRUN.model.EmlpoyeeProfile;
import com.app.mybackendforRUN.enums.EmploymentType;
import com.app.mybackendforRUN.enums.OrgDept;
import com.app.mybackendforRUN.enums.OrgBranch;
import com.app.mybackendforRUN.converter.OrgBranchConverter;
import com.app.mybackendforRUN.converter.EmploymentTypeConverter;
import com.app.mybackendforRUN.converter.OrgDeptConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.mybackendforRUN.repository.OrganizationRepository;
import com.app.mybackendforRUN.repository.EmployeePersonalInfoRepository;
import com.app.mybackendforRUN.repository.EmlpoyeeProfileRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
