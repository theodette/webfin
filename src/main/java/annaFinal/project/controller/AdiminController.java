/**
 * created by Anna
 * Date:18/12/2023
 * Time:04:10
 * ProjectName:project
 **/

package annaFinal.project.controller;

import annaFinal.project.model.Admin;
import annaFinal.project.repository.AdminRepository;
import org.springframework.beans.factory.ListableBeanFactoryExtensionsKt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin( origins = "http://localhost:3000")
@RequestMapping("/admin")
public class AdiminController {

    @Autowired
    private AdminRepository adminRepository;

    @GetMapping("/known")
    public List<Admin> getAdmin(){
        return adminRepository.findAll();
    }
}
