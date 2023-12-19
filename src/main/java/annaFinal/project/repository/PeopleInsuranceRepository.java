package annaFinal.project.repository;

import annaFinal.project.model.PeopleInsurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeopleInsuranceRepository extends JpaRepository<PeopleInsurance,Integer> {


}
