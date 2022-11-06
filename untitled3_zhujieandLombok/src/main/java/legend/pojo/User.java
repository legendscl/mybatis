//2
package legend.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//lombok2
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private  Integer id;
    private String username;
    private String password;
    private String email;


}
