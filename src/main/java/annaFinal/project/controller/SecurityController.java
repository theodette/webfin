/**
 * created by Anna
 * Date:18/12/2023
 * Time:04:32
 * ProjectName:project
 **/

package annaFinal.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/auth")
public class SecurityController {

    @GetMapping("/process")
    public String process(){
        return "there";
    }
}
