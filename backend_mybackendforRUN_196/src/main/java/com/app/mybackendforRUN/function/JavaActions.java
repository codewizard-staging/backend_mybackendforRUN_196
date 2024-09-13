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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  