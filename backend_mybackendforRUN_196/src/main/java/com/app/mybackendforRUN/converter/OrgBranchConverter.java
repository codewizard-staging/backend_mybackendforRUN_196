package com.app.mybackendforRUN.converter;

import com.app.mybackendforRUN.enums.OrgBranch;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = false)
public class OrgBranchConverter implements AttributeConverter<OrgBranch, Integer> {

    @Override
    public Integer convertToDatabaseColumn(OrgBranch orgBranch) {
        return orgBranch != null ? orgBranch.ordinal() : null;
    }

    @Override
    public OrgBranch convertToEntityAttribute(Integer dbData) {
      if (dbData == null) {
        return null;
      }
		  return OrgBranch.getOrgBranch(dbData);
    }
}
