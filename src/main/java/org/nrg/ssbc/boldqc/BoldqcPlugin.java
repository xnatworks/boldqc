package org.nrg.ssbc.boldqc;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;

@XnatPlugin(value = "boldqcPlugin", name = "BOLDQC Plugin",
            description = "Provides the BOLDQC (neuroinfo:boldqc) data type and report page.",
            dataModels = {@XnatDataModel(value = "neuroinfo:boldqc", singular = "BOLDQC", plural = "BOLDQCs")})
public class BoldqcPlugin {
}
