package pet.store.controller.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import pet.store.entity.PetStore;

@Data
@NoArgsConstructor
public class PetStoreEmployee {

  private Long employeeId;
  private String employeeFirstName;
  private String employeeLastName;
  private String employeePhone;
  private String employeeJobTitle;
  
  private PetStore petStore;
  
  public PetStoreEmployee(Object Employee){
    
  }
}
