package fr.isen.naze.models;

import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1e7b3194-d9d4-4c51-aae2-4c22a9dfb201")
public class Project {
    @mdl.prop
    @objid ("da49365b-04ba-4c20-a33d-c3284144dd50")
    private int id_project;

    @mdl.prop
    @objid ("eba803d9-eaed-42b5-97ac-b6d26c4e957e")
    private String name;

    @mdl.prop
    @objid ("899fdfb5-0101-4038-a44d-51149278f7d3")
    private Folder folder_project;

}
