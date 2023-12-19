/**
 * created by Anna
 * Date:16/12/2023
 * Time:16:37
 * ProjectName:project
 **/

package annaFinal.project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNoFoundException extends RuntimeException{
public  ResourceNoFoundException(String message){
    super(message);

}
}
