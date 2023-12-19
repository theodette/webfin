/**
 * created by Anna
 * Date:16/12/2023
 * Time:16:42
 * ProjectName:project
 **/

package annaFinal.project.controller;

import annaFinal.project.model.PeopleInsurance;
import annaFinal.project.repository.PeopleInsuranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@CrossOrigin( origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/")
public class PeopleInsuranceController {
    @Autowired
    private PeopleInsuranceRepository peopleInsuranceRepository;

    @GetMapping("/allPeople")
    public List<PeopleInsurance> getAllPeople(){

        return peopleInsuranceRepository.findAll();
    }


    @PostMapping("/save")
    public PeopleInsurance addPeople(@RequestBody PeopleInsurance people){
        return peopleInsuranceRepository.save(people);
    }

    @PutMapping("/update/{id}")
    public PeopleInsurance updatepeople (@PathVariable int id, @RequestBody PeopleInsurance peopleInsurance){

        PeopleInsurance peopleInsurance1 = (PeopleInsurance) peopleInsuranceRepository.findAllById(Collections.singleton(id));
peopleInsurance1.setName(peopleInsurance.getName());
peopleInsurance1.setInsurance(peopleInsurance.getInsurance());
peopleInsurance1.setNumberOfPeople(peopleInsurance.getNumberOfPeople());

PeopleInsurance updated = peopleInsuranceRepository.save(peopleInsurance1);
return updated;

    }

}

