// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package kz.buronahodok.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import kz.buronahodok.domain.LostAndFound;

privileged aspect LostAndFound_Roo_Jpa_Entity {
    
    declare @type: LostAndFound: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long LostAndFound.id;
    
    @Version
    @Column(name = "version")
    private Integer LostAndFound.version;
    
    public Long LostAndFound.getId() {
        return this.id;
    }
    
    public void LostAndFound.setId(Long id) {
        this.id = id;
    }
    
    public Integer LostAndFound.getVersion() {
        return this.version;
    }
    
    public void LostAndFound.setVersion(Integer version) {
        this.version = version;
    }
    
}
