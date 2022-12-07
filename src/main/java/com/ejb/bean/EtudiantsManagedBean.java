package com.ejb.bean;

import java.util.List;

import javax.ejb.EJB;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.ejb.entity.Etudiant;
import com.ejb.session.ManageEtudiantBeanRemote;


@ManagedBean(name = "etudiantManagedBean")
@RequestScoped
public class EtudiantsManagedBean {

	
	 private Etudiant etudiant; 
	 
	   @EJB
	    ManageEtudiantBeanRemote ejb ;
	   
	   
	  public String addetudiant() {
		  
		  
        String result = "Failure";
        boolean c = this.ejb.addEtudiant(this.etudiant);
        if (c ) {
        			System.out.println("noo add");        }
        result = "Success";
        return result;
}
	  @SuppressWarnings("unchecked")
		public List<Etudiant> listerEtudiants() {
			
			
			return ejb.AllEtudiants() ;
			
			
		}
}