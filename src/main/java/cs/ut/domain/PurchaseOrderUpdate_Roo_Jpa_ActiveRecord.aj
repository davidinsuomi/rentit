// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package cs.ut.domain;

import cs.ut.domain.PurchaseOrderUpdate;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect PurchaseOrderUpdate_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager PurchaseOrderUpdate.entityManager;
    
    public static final EntityManager PurchaseOrderUpdate.entityManager() {
        EntityManager em = new PurchaseOrderUpdate().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long PurchaseOrderUpdate.countPurchaseOrderUpdates() {
        return entityManager().createQuery("SELECT COUNT(o) FROM PurchaseOrderUpdate o", Long.class).getSingleResult();
    }
    
    public static List<PurchaseOrderUpdate> PurchaseOrderUpdate.findAllPurchaseOrderUpdates() {
        return entityManager().createQuery("SELECT o FROM PurchaseOrderUpdate o", PurchaseOrderUpdate.class).getResultList();
    }
    
    public static PurchaseOrderUpdate PurchaseOrderUpdate.findPurchaseOrderUpdate(Long id) {
        if (id == null) return null;
        return entityManager().find(PurchaseOrderUpdate.class, id);
    }
    
    public static List<PurchaseOrderUpdate> PurchaseOrderUpdate.findPurchaseOrderUpdateEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM PurchaseOrderUpdate o", PurchaseOrderUpdate.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void PurchaseOrderUpdate.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void PurchaseOrderUpdate.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            PurchaseOrderUpdate attached = PurchaseOrderUpdate.findPurchaseOrderUpdate(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void PurchaseOrderUpdate.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void PurchaseOrderUpdate.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public PurchaseOrderUpdate PurchaseOrderUpdate.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        PurchaseOrderUpdate merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
