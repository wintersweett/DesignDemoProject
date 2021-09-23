package com.newtrip.designdemoproject.commandpattern.businessuse;

public abstract class Command {
    protected RequirementGroup requirementGroup = new RequirementGroup();
    protected PageGroup pageGroup = new PageGroup() ;
    protected CodeGroup codeGroup = new CodeGroup();
    public abstract void execute();
}
