package com.vacation.a.Service;

import com.vacation.a.Model.Registrationusers;




import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.vacation.a.Repository.FirstRepo1;

@Service
public class RegistrationserviceIMLP  implements Registrationservice {

     @Autowired
     FirstRepo1 obj;

    @Override
    public void addUser(Registrationusers registerusers) {
        obj.save (registerusers);
    }

    



    @Override
    public Registrationusers getUserByid(int id) {
        return obj.findById(id).orElse(null);
       
    }



    
        
    


   
}
        
 

